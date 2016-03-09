package colima.ruta.com.rutascolima;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.ShareActionProvider;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import colima.ruta.com.rutascolima.db.DBContract;
import colima.ruta.com.rutascolima.db.DBHelper;
import colima.ruta.com.rutascolima.utils.ExpandableListAdapter;
import colima.ruta.com.rutascolima.utils.Utils;



public class Principal extends ActionBarActivity {

    private CharSequence itemTitle;
    private DrawerLayout drawerLayout;
    private CharSequence activityTitle;
    private ActionBarDrawerToggle drawerToggle;
    private static DBHelper mydb;
    public static ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    private ShareActionProvider mShareActionProvider;
    private Intent mShareIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        mShareIntent = new Intent();
        mShareIntent.setAction(Intent.ACTION_SEND);
        mShareIntent.setType("text/plain");
        mShareIntent.putExtra(Intent.EXTRA_TEXT, "Ve las rutas principales de colima. https://goo.gl/EBWDua");

        //  Declare a new thread to do a preference check
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //  Initialize SharedPreferences
                SharedPreferences getPrefs = PreferenceManager
                        .getDefaultSharedPreferences(getBaseContext());

                //  Create a new boolean and preference and set it to true
                boolean isFirstStart = getPrefs.getBoolean("firstStart", true);

                //  If the activity has never started before...
                if (isFirstStart) {

                    //  Launch app intro
                    Intent i = new Intent(Principal.this, Intro.class);
                    startActivity(i);

                    //  Make a new preferences editor
                    SharedPreferences.Editor e = getPrefs.edit();

                    //  Edit preference to make it false because we don't want this to run again
                    e.putBoolean("firstStart", false);

                    //  Apply changes
                    e.apply();
                }
            }
        });

        // Start the thread
        t.start();

        mydb = new DBHelper(this);
        itemTitle = activityTitle = getTitle();
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        // Setear una sombra sobre el contenido principal cuando el drawer se despliegue
        drawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);

        // Habilitar el icono de la app por si hay algún estilo que lo deshabilitó
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_drawer);

        // Crear ActionBarDrawerToggle para la apertura y cierre
        drawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                R.drawable.ic_drawer,
                R.string.drawer_open,
                R.string.drawer_close
        ) {
            public void onDrawerClosed(View view) {
                getSupportActionBar().setTitle(itemTitle);

                /*Usa este método si vas a modificar la action bar
                con cada fragmento
                 */
                //invalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                getSupportActionBar().setTitle(activityTitle);

                /*Usa este método si vas a modificar la action bar
                con cada fragmento
                 */
                //invalidateOptionsMenu();
            }
        };
        //Seteamos la escucha
        drawerLayout.setDrawerListener(drawerToggle);
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
        // preparing list data
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        expListView.setAdapter(listAdapter);
        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {


            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                selectItem(groupPosition, childPosition, true);

                return false;
            }
        });

        if (savedInstanceState == null) {
            selectItem(0, 0, false);
        }

        LocationManager service = (LocationManager) getSystemService(LOCATION_SERVICE);
        boolean enabled = service
                .isProviderEnabled(LocationManager.GPS_PROVIDER);

        // check if enabled and if not send user to the GSP settings
        // Better solution would be to display a dialog and suggesting to
        // go to the settings
        if (!enabled) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("¿Habilitar GPS para ver tu ubicación actual?");

            alertDialogBuilder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(intent);
                }
            });

            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        // Find the MenuItem that we know has the ShareActionProvider
        MenuItem item = menu.findItem(R.id.share);

        mShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(item);
        // Connect the dots: give the ShareActionProvider its Share Intent
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(mShareIntent);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item)) {
            // Toma los eventos de selección del toggle aquí
            return true;
        }
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_settings:
                intent = new Intent(getBaseContext(), Preferences.class);
                startActivity(intent);
                break;
            case R.id.pasos:
                intent = new Intent(getBaseContext(), Intro.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    private void selectItem(int groupposition, int childposition, boolean Autollamado) {
        // Reemplazar el contenido del layout principal por un fragmento
        MapFragment fragment = new MapFragment();
        Bundle args = new Bundle();
        args.putString(Utils.CAMION, listDataChild.get(listDataHeader.get(groupposition)).get(childposition));
        args.putString(Utils.MUNICIPIO, listDataHeader.get(groupposition));
        args.putBoolean("Autollamado", Autollamado);
        fragment.setArguments(args);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
        // Se actualiza el item seleccionado y el título, después de cerrar el drawer
        setTitle(listDataChild.get(
                listDataHeader.get(groupposition)).get(
                childposition));
        drawerLayout.closeDrawer(expListView);
    }


    /* Método auxiliar para setear el titulo de la action bar */
    @Override
    public void setTitle(CharSequence title) {
        itemTitle = title;
        getSupportActionBar().setTitle(itemTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sincronizar el estado del drawer
        drawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Cambiar las configuraciones del drawer si hubo modificaciones
        drawerToggle.onConfigurationChanged(newConfig);
    }

    /*
         * Preparing the list data
         */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        listDataHeader = mydb.Municipios();
        for (int i = 0; i < listDataHeader.size(); i++) {
            listDataChild.put(listDataHeader.get(i), mydb.Camiones(listDataHeader.get(i)));
        }
    }

    // este metodo va en background
    public void prepareListData(Location punto) {

        if (punto != null) {
            int ninguno = 0;
            boolean existe = false;
            List<String> copylistDataHeader = new ArrayList<String>(listDataHeader);
            HashMap<String, List<String>> copylistDataChild = new HashMap<String, List<String>>(listDataChild);

            List<String> copylistDataHeader2 = new ArrayList<String>(listDataHeader);
            HashMap<String, List<String>> copylistDataChild2 = new HashMap<String, List<String>>(listDataChild);

            copylistDataHeader.clear();
            copylistDataChild.clear();
            copylistDataHeader = mydb.Municipios();
            for (int i = 0; i < copylistDataHeader.size(); i++) {
                copylistDataChild.put(copylistDataHeader.get(i), mydb.Camiones(copylistDataHeader.get(i)));
                ninguno = 0;
                for (int j = 0; j < copylistDataChild.get(copylistDataHeader.get(i)).size(); j++) {

                    ArrayList<HashMap<String, Double>> Trazos = mydb.TrazosRuta(copylistDataChild.get(copylistDataHeader.get(i)).get(j),
                            copylistDataHeader.get(i));

                    existe = false;

                    for (int k = 0; k < Trazos.size(); k++) {

                        Location PuntoFinal = new Location("");
                        PuntoFinal.setLatitude(Trazos.get(k).get(DBContract.Ruta.COLUMN_LATITUD));
                        PuntoFinal.setLongitude(Trazos.get(k).get(DBContract.Ruta.COLUMN_LONGITUD));
                        if (Math.abs(punto.distanceTo(PuntoFinal)) <= Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("distancia", "250"))) {
                            existe = true;
                            ninguno++;
                            break;
                        }
                    }
                    if (!existe) {
                        copylistDataChild.get(copylistDataHeader.get(i)).remove(j);
                        j--;
                    }
                }
                if (ninguno == 0) {
                    copylistDataHeader.remove(i);
                    i--;
                }
            }

            //comparar listas para ver si no cambian las rutas seleccionadas
            if ((copylistDataHeader2.size() == copylistDataHeader.size() && copylistDataHeader2.containsAll(copylistDataHeader)) &&
                (copylistDataChild2.equals(copylistDataChild)))
            {
                return;
            } else {
                listDataHeader = new ArrayList<String>(copylistDataHeader);
                listDataChild = new HashMap<String, List<String>>(copylistDataChild);

                listAdapter = new ExpandableListAdapter(getBaseContext(), listDataHeader, listDataChild);
                // setting list adapter
                expListView.setAdapter(listAdapter);
                selectItem(0, 0, true);
            }
        }
        else
        {
            prepareListData();
            selectItem(0, 0, false);
        }
    }


}

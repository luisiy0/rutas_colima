package colima.ruta.com.rutascolima;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import android.graphics.Matrix;
import android.location.Location;

import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.HashMap;

import colima.ruta.com.rutascolima.db.DBContract;
import colima.ruta.com.rutascolima.db.DBHelper;
import colima.ruta.com.rutascolima.utils.Utils;

/**
 * Created by luisfer on 23/12/2015.
 */
public class MapFragment extends Fragment  implements OnMapReadyCallback,
        LocationListener,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener {

    private GoogleMap mMap;
    private MapView m;
    private DBHelper mydb ;

    private LocationRequest mLocationRequest;
    private Location mLastLocation;
    private GoogleApiClient mGoogleApiClient;
    private Marker singleMarker;
    private Circle circle;
    private AdView mAdView;
    public Location PuntoAnterior;
    private boolean mover;
    private boolean Autollamado;
    //private long mLastLocationMillis;


    public MapFragment() {
        // Constructor vacío
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
        mAdView = (AdView)  rootView.findViewById(R.id.ad_view);
        mover = false;
        // Create an ad request. Check your logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.
        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        // Start loading the ad in the background.
        mAdView.loadAd(adRequest);

        mydb = new DBHelper(getContext());
        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(getContext())
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }
        getActivity().setTitle(getArguments().getString(Utils.CAMION));
        Autollamado = getArguments().getBoolean("Autollamado");
        m = (MapView) rootView.findViewById(R.id.map);
        m.onCreate(savedInstanceState);
        m.getMapAsync(this);
        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        HashMap<String, Double> Punto = mydb.MunicipioPunto(getArguments().getString(Utils.MUNICIPIO));
        //move the camera
        LatLng sydney = new LatLng(Punto.get(DBContract.Municipio.COLUMN_LATITUD),Punto.get(DBContract.Municipio.COLUMN_LONGITUD));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));
        PolylineOptions rectOptions = new PolylineOptions();
        //flecha
        //http://stackoverflow.com/questions/18274920/arrow-mark-over-polyline-in-android-google-route-map

        ArrayList<HashMap<String, Double>> Trazos = mydb.TrazosRuta(getArguments().getString(Utils.CAMION),
                getArguments().getString(Utils.MUNICIPIO));
        for(int j=0;j < Trazos.size();j++){
                rectOptions.add(new LatLng( Trazos.get(j).get(DBContract.Ruta.COLUMN_LATITUD) , Trazos.get(j).get(DBContract.Ruta.COLUMN_LONGITUD))).width(5).color(getResources().getColor(R.color.verde));

           /* if(j % 3 == 0 && j > 0 )
            {
                // First you need rotate the bitmap of the arrowhead somewhere in your code
                Matrix matrix = new Matrix();
                matrix.postRotate((float) Math.toDegrees(Math.atan2(Trazos.get(j - 1).get(DBContract.Ruta.COLUMN_LATITUD) - Trazos.get(j).get(DBContract.Ruta.COLUMN_LATITUD), Trazos.get(j - 1).get(DBContract.Ruta.COLUMN_LONGITUD) - Trazos.get(j).get(DBContract.Ruta.COLUMN_LONGITUD))));
                // Create the rotated arrowhead bitmap



                Bitmap arrowheadBitmap = Bitmap.createBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arrowup), 0, 0,  BitmapFactory.decodeResource(getResources(), R.drawable.arrowup).getWidth(), BitmapFactory.decodeResource(getResources(), R.drawable.arrowup).getHeight(), matrix, true);

                BitmapDescriptor iconBitmap = BitmapDescriptorFactory
                        .fromBitmap(arrowheadBitmap);

                // Now we are gonna to add a marker
                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(Trazos.get(j).get(DBContract.Ruta.COLUMN_LATITUD), Trazos.get(j).get(DBContract.Ruta.COLUMN_LONGITUD)))
                        .icon(iconBitmap)
                        .anchor(0.5f, 0.5f));
            }
*/
        }

        /*

        // First you need rotate the bitmap of the arrowhead somewhere in your code
        Matrix matrix = new Matrix();
        matrix.postRotate((float) Math.toDegrees(Math.atan2(19.231446 - 19.231993, -103.705569 -  -103.706629)));
        // Create the rotated arrowhead bitmap



        Bitmap arrowheadBitmap = Bitmap.createBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arrowup), 0, 0,  BitmapFactory.decodeResource(getResources(), R.drawable.arrowup).getWidth(), BitmapFactory.decodeResource(getResources(), R.drawable.arrowup).getHeight(), matrix, true);

        BitmapDescriptor iconBitmap = BitmapDescriptorFactory
                .fromBitmap(arrowheadBitmap);

        // Now we are gonna to add a marker
        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(19.231446, -103.705569))
                .icon(iconBitmap)
                .anchor(0.5f, 0.5f));
*/
        // Get back the mutable Polyline
        Polyline polyline = mMap.addPolyline(rectOptions);

        //puntos principales
        ArrayList<HashMap<String, String>> Puntos = mydb.PuntosRuta(getArguments().getString(Utils.CAMION),
                getArguments().getString(Utils.MUNICIPIO));

        for(int j=0; j < Puntos.size(); j++){
            LatLng punto = new LatLng( Double.parseDouble(Puntos.get(j).get(DBContract.Punto.COLUMN_LATITUD)) , Double.parseDouble(Puntos.get(j).get(DBContract.Punto.COLUMN_LONGITUD)));
            mMap.addMarker(new MarkerOptions().position(punto).title(Puntos.get(j).get(DBContract.Punto.COLUMN_NOMBRE)));
        }

        // flechas
        //puntos principales
        ArrayList<HashMap<String, Double>> Flechas = mydb.FlechasRuta(getArguments().getString(Utils.CAMION),
                getArguments().getString(Utils.MUNICIPIO));

        for(int j=0; j < Flechas.size(); j++){

            // First you need rotate the bitmap of the arrowhead somewhere in your code
            Matrix matrix = new Matrix();
            matrix.postRotate((float) Math.toDegrees(Math.atan2(Flechas.get(j).get(DBContract.Flecha.COLUMN_LATITUD_INICIO) - Flechas.get(j).get(DBContract.Flecha.COLUMN_LATITUD_FIN), Flechas.get(j).get(DBContract.Flecha.COLUMN_LONGITUD_INICIO) - Flechas.get(j).get(DBContract.Flecha.COLUMN_LONGITUD_FIN))));
            // Create the rotated arrowhead bitmap




            Bitmap arrowheadBitmap;
            if(Flechas.get(j).get(DBContract.Flecha.COLUMN_SENTIDO) == 1  ){
                 arrowheadBitmap = Bitmap.createBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arrowup), 0, 0,  BitmapFactory.decodeResource(getResources(), R.drawable.arrowup).getWidth(), BitmapFactory.decodeResource(getResources(), R.drawable.arrowup).getHeight(), matrix, true);
            }else{
                arrowheadBitmap = Bitmap.createBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arrowdouble), 0, 0,  BitmapFactory.decodeResource(getResources(), R.drawable.arrowdouble).getWidth(), BitmapFactory.decodeResource(getResources(), R.drawable.arrowdouble).getHeight(), matrix, true);
            }



            BitmapDescriptor iconBitmap = BitmapDescriptorFactory
                    .fromBitmap(arrowheadBitmap);

            // Now we are gonna to add a marker
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(Flechas.get(j).get(DBContract.Flecha.COLUMN_LATITUD_INICIO), Flechas.get(j).get(DBContract.Flecha.COLUMN_LONGITUD_INICIO)))
                    .icon(iconBitmap)
                    .anchor(0.5f, 0.5f));

        }




        if (mLastLocation != null) {
            LatLng punto = new LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
            singleMarker = mMap.addMarker(new MarkerOptions().position(punto).title("Ubicación Atual").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            if(!mover) {
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(punto, 13));
                mover = true;
            }
            circle = mMap.addCircle(new CircleOptions()
                            .center(punto)
                            .radius(Double.parseDouble(PreferenceManager.getDefaultSharedPreferences(getContext()).getString("distancia", "250")))
                            .strokeColor(Color.RED)
                            .strokeWidth(5)
                            .visible(false)
            );

            Location PuntoInicio = new Location("");
            PuntoInicio.setLatitude(punto.latitude);
            PuntoInicio.setLongitude(punto.longitude);

            if(PuntoAnterior == null){
                PuntoAnterior = new Location("");
                PuntoAnterior.setLatitude(punto.latitude);
                PuntoAnterior.setLongitude(punto.longitude);
                if(!Autollamado) {
                    ((Principal) getActivity()).prepareListData(PuntoAnterior);
                }else{
                    Autollamado = false;
                }
            }else {
                if (Math.abs(PuntoAnterior.distanceTo(PuntoInicio)) > 30) { // actualizr cada 30 metros
                    PuntoAnterior.setLatitude(punto.latitude);
                    PuntoAnterior.setLongitude(punto.longitude);
                    if(!Autollamado) {
                        ((Principal) getActivity()).prepareListData(PuntoAnterior);
                    }else{
                        Autollamado = false;
                    }
                }
            }
        }
        createLocationRequest();
    }

    @Override
    public void onStart() {
        mGoogleApiClient.connect();
        super.onStart();
    }

    @Override
    public void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
        m.onResume();
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
        m.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        m.onDestroy();
        if (mAdView != null) {
            mAdView.destroy();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        m.onLowMemory();
    }

    protected void createLocationRequest() {
        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(10000);
        mLocationRequest.setFastestInterval(5000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    }

    @Override
    public void onLocationChanged(Location location) {
        //saber cuando el gps esta prendido o apagado
        //mLastLocationMillis = SystemClock.elapsedRealtime();

        LatLng punto = new LatLng(location.getLatitude(), location.getLongitude());

        Location PuntoInicio = new Location("");
        PuntoInicio.setLatitude(punto.latitude);
        PuntoInicio.setLongitude(punto.longitude);

        if(PuntoAnterior == null){
            PuntoAnterior = new Location("");
            PuntoAnterior.setLatitude(punto.latitude);
            PuntoAnterior.setLongitude(punto.longitude);
            DibujarUbicacionActual(punto,PuntoInicio);
        }else {

            if (Math.abs(PuntoAnterior.distanceTo(PuntoInicio)) > 30) { // actualizr cada 30 metros
                PuntoAnterior.setLatitude(punto.latitude);
                PuntoAnterior.setLongitude(punto.longitude);
                DibujarUbicacionActual(punto, PuntoInicio);
            }
        }
    }

    private void DibujarUbicacionActual(LatLng punto, Location PuntoInicio){
        if(singleMarker != null)
            singleMarker.remove();

        singleMarker = mMap.addMarker(new MarkerOptions().position(punto).title("Ubicación Atual").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
        if(!mover) { // solo moverlo una vez
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(punto, 13));
            mover = true;
        }

        if(circle != null)
            circle.remove();

        circle = mMap.addCircle(new CircleOptions()
                .center(punto)
                .radius(Double.parseDouble(PreferenceManager.getDefaultSharedPreferences(getContext()).getString("distancia", "250")))
                .strokeColor(Color.RED)
                .strokeWidth(5)
                .visible(false));

        if(!Autollamado) {
            ((Principal) getActivity()).prepareListData(PuntoInicio);
        }else{
            Autollamado = false;
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(
                mGoogleApiClient);

        createLocationRequest();
        startLocationUpdates();
    }

    @Override
    public void onConnectionSuspended(int i) {
        stopLocationUpdates();
    }

    @Override
    public void onConnectionFailed(ConnectionResult result) {
        // This callback is important for handling errors that
        // may occur while attempting to connect with Google.
        //
        // More about this in the 'Handle Connection Failures' section.
        stopLocationUpdates();
    }

    protected void startLocationUpdates() {

        LocationServices.FusedLocationApi.requestLocationUpdates(
                mGoogleApiClient, mLocationRequest, this);


    }

    protected void stopLocationUpdates() {
        LocationServices.FusedLocationApi.removeLocationUpdates(
                mGoogleApiClient, (com.google.android.gms.location.LocationListener) this);

        ((Principal) getActivity()).prepareListData(null);
    }

}

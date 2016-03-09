package colima.ruta.com.rutascolima;

import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceActivity;


public class Preferences extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);

        getListView().setBackgroundColor(Color.TRANSPARENT);
        getListView().setCacheColorHint(Color.TRANSPARENT);
        getListView().setBackgroundColor( getResources().getColor(R.color.colorBlueGray));

    }

}

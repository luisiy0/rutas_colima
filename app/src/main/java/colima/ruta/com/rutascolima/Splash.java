package colima.ruta.com.rutascolima;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

import colima.ruta.com.rutascolima.db.DBHelper;

public class Splash extends AppCompatActivity {

    // Set the duration of the splash screen
    private DBHelper mydb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Hide title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //  Declare a new thread to do a preference check
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                mydb = new DBHelper(getBaseContext());
                finish();
            }
        });

        super.onCreate(savedInstanceState);
        // Set portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Start the next activity
                Intent mainIntent = new Intent().setClass(
                        Splash.this, Principal.class);
                startActivity(mainIntent);
                // Close the activity so the user won't able to go back this
                // activity pressing Back button
                finish();
            }
        };

        // Simulate a long loading process on application startup.
        Timer timer = new Timer();
        SharedPreferences getPrefs = PreferenceManager
                .getDefaultSharedPreferences(getBaseContext());
        //  Create a new boolean and preference and set it to true
        boolean isFirstStart = getPrefs.getBoolean("firstStart",false);
        //  If the activity has never started before...
        if (isFirstStart) {
            // Start the thread
            t.start();
        }else {
            timer.schedule(task, 1000); // 1 segundo
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}

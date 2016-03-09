package colima.ruta.com.rutascolima;

import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Intro extends AppIntro2 {

    // Please DO NOT override onCreate. Use init.
    @Override
    public void init(Bundle savedInstanceState) {
        // Hide title bar
       // requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance("Lugares", "Puedes ver los lugares importantes por donde pasa el camión", R.drawable.parte1, getResources().getColor(R.color.colorBlueGray)));
        addSlide(AppIntroFragment.newInstance("Camiones", "Selecciona el camión del municipio que deseas ver", R.drawable.parte2, getResources().getColor(R.color.colorBlueGray)));
        addSlide(AppIntroFragment.newInstance("Ubicación", "Puedes habilitar tu gps para ver tu ubicación actual", R.drawable.parte3, getResources().getColor(R.color.colorBlueGray)));
        addSlide(AppIntroFragment.newInstance("Ubicación", "Configura la distancia para ver las rutas a tu alrededor", R.drawable.parte4, getResources().getColor(R.color.colorBlueGray)));

        // OPTIONAL METHODS
        // Override bar/separator color.
        //setBarColor(Color.parseColor("#3F51B5"));
       // setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button.
        //showSkipButton(false);
        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permisssion in Manifest.
       // setVibrate(true);
       // setVibrateIntensity(30);
    }

   /* @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
    }*/

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        super.finish();
    }

    @Override
    public void onSlideChanged() {
        // Do something when the slide changes.
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }
}

package com.example.usuario.inventory;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Clase que muestras la imagen del proyecto y que se conectará al repositorio de los datos.
 */


public class SplashActivity extends AppCompatActivity {

    private final long TIEMPODEESPERA = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();

        final Handler uiHandler = new Handler();

        /**
         * Este objeto se ejecutará en el hilo de la UI
         */
        final Runnable onUi = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        };

        uiHandler.postDelayed(onUi,TIEMPODEESPERA);

        /**
         * Este proceso se ejecuta en un hilo diferente de la IU
         * y manda un mensaje al manejador (Handler)
         * esta comentado por que no es demasiado efectivo
         */
//        Runnable background = new Runnable() {
//            @Override
//            public void run() {

//                Esta es la implementación un poco más tosca que la que hacemos más abajo.
//                try {
//                    Thread.sleep(TIEMPODEESPERA);
//                    uiHandler.post(onUi);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                uiHandler.postDelayed(onUi,TIEMPODEESPERA);
//            }
//        };
//        new Thread(background).start();
    }
}

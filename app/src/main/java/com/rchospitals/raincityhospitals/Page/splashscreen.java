package com.rchospitals.raincityhospitals.Page;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.rchospitals.raincityhospitals.R;

public class splashscreen extends AppCompatActivity {

    private static int progrees = 0;
    private int status = 0;
    ProgressBar progressBar;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        progressBar = (ProgressBar) findViewById(R.id.progressbar2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (status < 100) {
                    status = loading();
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(status);
                        }
                    });
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent pindah = new Intent(splashscreen.this, menu.class);
                        startActivity(pindah);
                        finish();
                    }
                });
            }

            public int loading() {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return ++progrees;
            }
        }).start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashscreen.this, menu.class);
                startActivity(i);
                finish();
            }
        }, 30000);
    }
}

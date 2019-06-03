package com.example.graduationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toolbar;

import java.util.Timer;
import java.util.TimerTask;

public class progressbarActivity extends AppCompatActivity {

    private ProgressBar pb;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        Toolbar myToolbar =findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);

        pb = findViewById(R.id.Bar);

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run()
            {
                counter++;
                pb.setProgress(counter);

                if(counter == 100)
                    t.cancel();
            }
        };

        t.schedule(tt,0,100);
    }
}

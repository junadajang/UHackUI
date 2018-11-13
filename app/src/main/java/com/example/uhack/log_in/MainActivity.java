package com.example.uhack.log_in;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout rl1, rl2;
    Button btn;

    Handler handler = new Handler();
    Runnable run = new Runnable() {
        @Override
        public void run() {

            rl1.setVisibility(View.VISIBLE);
            rl2.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rl1 = (RelativeLayout) findViewById(R.id.rl1);
        rl2 = (RelativeLayout) findViewById(R.id.rl2);

        handler.postDelayed(run, 3000);

        btn = (Button) findViewById(R.id.btnContinue);
        btn.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View view) {
        Intent in = new Intent(this, Dashboard.class);
        startActivity(in);

    }
}

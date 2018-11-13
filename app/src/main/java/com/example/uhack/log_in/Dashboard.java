package com.example.uhack.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn1 = (Button) findViewById(R.id.btnSwitch);
        btn1.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick(View view) {
        Intent in = new Intent(this, Switch.class);
        startActivity(in);

    }
}

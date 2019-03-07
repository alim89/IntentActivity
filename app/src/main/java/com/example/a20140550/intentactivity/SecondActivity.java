package com.example.a20140550.intentactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt= (TextView) findViewById(R.id.txtSecond);
        Bundle bndl=getIntent().getExtras();
        if(bndl!=null)
        {

       String v= bndl.getString("PassValue");
            txt.setText(v);
        }

    }
}

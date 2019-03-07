package com.example.a20140550.intentactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn= (Button) findViewById(R.id.FbtnID);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inta=new Intent(FirstActivity.this,SecondActivity.class);
                inta.putExtra("PassValue","Wellcome To Bangladesh Second Intent");
                startActivity(inta);
            }
        });
    }
}

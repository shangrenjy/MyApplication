package com.example.hdliu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 //       Button bt1 = (Button) findViewById(R.id.bt1);
 //       bt1.setOnClickListener(new View.OnClickListener() {
  //          @Override

 //       });
    }
    public void ch(View v) {
        TextView t = (TextView) findViewById(R.id.tv2);
        t.setText("hahaha");
    }
}

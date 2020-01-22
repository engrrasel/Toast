package com.example.toastsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button lgnbtn,lgoutbtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lgnbtn = findViewById(R.id.lgnbtnid);
        lgoutbtn = findViewById(R.id.lgoutbtnid);
        textView = findViewById(R.id.txtviewid);

        Handler handler = new Handler();
        lgnbtn.setOnClickListener(handler);
        lgoutbtn.setOnClickListener(handler);

    }
    class Handler implements View.OnClickListener{


        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.lgnbtnid){
                Toast.makeText(MainActivity.this,"Log in Button Clicked",Toast.LENGTH_SHORT).show();
            }
            else if (v.getId()==R.id.lgoutbtnid){
                Toast.makeText(MainActivity.this,"Log Out Button Clicked",Toast.LENGTH_SHORT).show();
            }
        }
    }
}

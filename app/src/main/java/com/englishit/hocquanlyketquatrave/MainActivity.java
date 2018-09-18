package com.englishit.hocquanlyketquatrave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    Button btn2;
    Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // addContros();
      //  addEvent();
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });

        btn3.setOnClickListener(this);

    }

//    private void addEvent() {
//        ucln.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                XuLyManHinh();
//            }
//
//            private void XuLyManHinh() {
//                Intent intent = new Intent();
//                intent.putExtra("a",Integer.parseInt(nhapa.toString()));
//                intent.putExtra("b",Integer.parseInt(nhapb.toString()));
//                startActivityForResult(intent,99);
//
//            }
//        });
//    }
//
//    private void addContros() {
//        ucln = (Button) findViewById(R.id.ucln);
//        nhapa = (EditText) findViewById(R.id.nhapa);
//        nhapb = (EditText) findViewById(R.id.nhapb);
//        kq = (EditText) findViewById(R.id.kq);
//    }

    public void Xuly(View view) {



    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn3){
           finish();
        }

    }



}

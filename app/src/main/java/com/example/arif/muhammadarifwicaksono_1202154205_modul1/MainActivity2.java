package com.example.arif.muhammadarifwicaksono_1202154205_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView restauran, makanan, banyaknya, bayar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        restauran = (TextView) findViewById(R.id.restaurant);
       makanan = (TextView) findViewById(R.id.makanan);
        banyaknya = (TextView) findViewById(R.id.banyaknya);
        bayar = (TextView) findViewById(R.id.bayar);

        Intent intent = getIntent();

        String resto = intent.getStringExtra("Restoran");
        String makanan = intent.getStringExtra("Menu");
        int porsi = intent.getIntExtra("Porsi",0);
        int harga = intent.getIntExtra("Harga",0);

        restauran.setText(resto);

        banyaknya.setText(""+porsi);
        bayar.setText(""+harga);


        if(harga > 70000){
            Toast toast = Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this,"Disini aja makan malamnya",Toast.LENGTH_LONG);
            toast.show();
        }

    }
}

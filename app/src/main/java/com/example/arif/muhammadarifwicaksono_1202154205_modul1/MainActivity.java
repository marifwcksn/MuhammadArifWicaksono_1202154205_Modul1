package com.example.arif.muhammadarifwicaksono_1202154205_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;






public class MainActivity extends AppCompatActivity {
      EditText daftarmenu, jumlahpesanan ;
      String Restoran,Menu;
      int Porsi;
      Button eatbus,abnormal;


     int uang = 65500;
     int jumlahuang,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        daftarmenu = (EditText) findViewById(R.id.menu1);
        jumlahpesanan = (EditText) findViewById(R.id.menu2);

        eatbus = (Button) findViewById(R.id.eatbus);
        abnormal = (Button) findViewById(R.id.abnormal);



    }
    public void ABNORMAL(View view) {
        Restoran = "ABNORMAL";
        Menu = daftarmenu.getText().toString();
        Porsi = Integer.parseInt(jumlahpesanan.getText().toString());
        int Harga = 30000*Porsi;
        Log.d("harga makan","Rp."+Harga);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("Restoran",Restoran);//ngepos ke second activity
        intent.putExtra("Menu", Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);
    }

    public void EATBUS(View view) {
        String Restoran = "EATBUS";
        String Menu = daftarmenu.getText().toString();
        Porsi = Integer.parseInt(jumlahpesanan.getText().toString());
        int Harga = 50000*Porsi;
        Log.d("harga makan","Rp."+Harga);
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("Restoran",Restoran);//ngepos ke second activity
        intent.putExtra("Menu", Menu);
        intent.putExtra("Porsi",Porsi);
        intent.putExtra("Harga",Harga);
        startActivity(intent);
        }
    }

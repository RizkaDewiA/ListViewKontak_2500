package com.pam.listviewkontak_2500;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] kontak = {"Rizka","Ade Ambyar","Fia Amara",
            "ZulZulnaen","Iron Man","Hulk Ijo", "Pak Sulaiman",
            "Akang Bakso","Kakak Kembar","Toko Aqua","Ipeh","Kampus",
            "Ibu Kos"};

    private ListView lv_kontak;
    private ArrayAdapter<String> kontakAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kontakAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,kontak);

        lv_kontak = findViewById(R.id.lv_kontak);
        lv_kontak.setAdapter(kontakAdapter);
    }
}
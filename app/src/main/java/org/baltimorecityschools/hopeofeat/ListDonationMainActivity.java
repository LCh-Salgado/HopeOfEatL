package org.baltimorecityschools.hopeofeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ListDonationMainActivity extends AppCompatActivity {

    Button seeLocationDBTN;
    Button listPlacesBTN;

    Intent nextScreenMap;
    Intent nextScreenListPlaces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_donation_main);

        seeLocationDBTN = (Button)findViewById(R.id.SeeLoBTN);
        listPlacesBTN = (Button)findViewById(R.id.listPlacesBTN);

        seeLocationDBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextScreenMap = new Intent(ListDonationMainActivity.this, MapsActivity.class);
                startActivity(nextScreenMap);
            }
        });
        listPlacesBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextScreenListPlaces = new Intent(ListDonationMainActivity.this,
                        ListDonationMainActivity.class);
                startActivity(nextScreenListPlaces);
            }
        });
    }
}
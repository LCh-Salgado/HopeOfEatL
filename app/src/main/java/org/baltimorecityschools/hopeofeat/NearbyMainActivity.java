package org.baltimorecityschools.hopeofeat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NearbyMainActivity extends AppCompatActivity {

    EditText typeZipcET;
    Button findLBTN;
    String zipcode;
    String address ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_main);
        typeZipcET = (EditText)findViewById(R.id.zipcodeET);
        findLBTN = (Button)findViewById(R.id.locationBTN);

        findLBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zipcode = typeZipcET.getText().toString();
                address = "geo:0,0?q=" + Uri.encode(zipcode + " Food Pantry");
                showMap(Uri.parse(address));
            }
        });

    }
    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Log.d("Mess", "Inside showmap");
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            Log.d("View", "Inside resolveActivity");
        }

    }
}
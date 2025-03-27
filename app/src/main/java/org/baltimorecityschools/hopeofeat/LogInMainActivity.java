package org.baltimorecityschools.hopeofeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogInMainActivity extends AppCompatActivity {

    EditText NameET;
    EditText LastNET;
    EditText EmailEt;
    EditText PasswordET;

    Button FinishWithYourInBTN;
    Button MakeYourDBTN;

    Intent makeYourDIntent;

    ListView donationListView;
    String[] donations = {"Donation 1", "Donation 2", "Donation 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_main);

        NameET = (EditText)findViewById(R.id.NameET);
        LastNET = (EditText)findViewById(R.id.LastNET);
        EmailEt = (EditText)findViewById(R.id.EmailET);
        PasswordET = (EditText)findViewById(R.id.PasswordBTN);

        FinishWithYourInBTN = (Button)findViewById(R.id.FinishWithInBTN);
        MakeYourDBTN = (Button)findViewById(R.id.MakeYDBTN);

        donationListView = (ListView)findViewById(R.id.listitem);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, donations);
        donationListView.setAdapter(adapter);


        MakeYourDBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MakeYourDBTN.setVisibility(View.GONE);
                makeYourDIntent = new Intent(LogInMainActivity.this, ListDonationMainActivity.class);
                startActivity(makeYourDIntent);
            }

        });


    }
}
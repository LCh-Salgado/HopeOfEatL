package org.baltimorecityschools.hopeofeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
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
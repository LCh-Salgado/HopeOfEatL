package org.baltimorecityschools.hopeofeat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogInMainActivity extends AppCompatActivity {

    EditText email;
    EditText passw;
    Button loginB;
    Button makeYourLB;

   ImageView iconLogI;

    Intent makeYourDIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_main);

        email = (EditText)findViewById(R.id.emailET);
        passw = (EditText)findViewById(R.id.passwET);

        iconLogI = (ImageView)findViewById(R.id.iconI);


        loginB = (Button)findViewById(R.id.loginBTN);
        makeYourLB = (Button)findViewById(R.id.MakeYDBTN);


        makeYourLB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeYourDIntent = new Intent(LogInMainActivity.this, ListDonationMainActivity.class);
                startActivity(makeYourDIntent);
            }

        });
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iconLogI.setVisibility(View.GONE);
                email.setVisibility(View.GONE);
                passw.setVisibility(View.GONE);
                loginB.setVisibility(View.GONE);

            }
        });
        


    }
}
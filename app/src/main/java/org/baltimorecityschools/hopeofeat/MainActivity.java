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

public class MainActivity extends AppCompatActivity {

    Button welcomeSBTN;
    Intent nextScreenIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcomeSBTN = (Button)findViewById(R.id.WelcomeBTN);

        welcomeSBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            nextScreenIntent = new Intent(MainActivity.this, LogInMainActivity.class);
            startActivity(nextScreenIntent);
            }
        });

        
    }
}
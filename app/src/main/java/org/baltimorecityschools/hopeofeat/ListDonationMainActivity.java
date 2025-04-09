package org.baltimorecityschools.hopeofeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;


public class ListDonationMainActivity extends AppCompatActivity {


    ArrayList<String> listItems=new ArrayList<String>();
    ArrayAdapter<String> adapter;

    private ListView mListV;




//    Button seeLocationDBTN;
//    Button listPlacesBTN;

//    Intent nextScreenMap;
//    Intent nextScreenListPlaces;

//    ListView donationListView;
//    String[] donations = {" ", " ", " "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_donation_main);

        if(mListV == null) {
            mListV = (ListView)findViewById(R.id.listitem);
        }
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        setListAdapter(adapter);

    }
    protected ListView getListView() {
        if (mListV == null) {
            mListV = (ListView) findViewById(R.id.listitem);
        }
        return mListV;
    }
    protected void setListAdapter(ListAdapter adapter) {
        getListView().setAdapter(adapter);
    }
    protected ListAdapter getListAdapter() {
        ListAdapter adapter = getListView().getAdapter();
        if(adapter instanceof HeaderViewListAdapter) {
            return ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }else {
            return adapter;
        }
    }

}
//        seeLocationDBTN = (Button)findViewById(R.id.SeeLoBTN);
//        listPlacesBTN = (Button)findViewById(R.id.listPlacesBTN);

//        donationListView = (ListView)findViewById(R.id.listitem);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, donations);
//        donationListView.setAdapter(adapter);

//        seeLocationDBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nextScreenMap = new Intent(ListDonationMainActivity.this, MapsActivity.class);
//                startActivity(nextScreenMap);
//            }
//        });
//        listPlacesBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                nextScreenListPlaces = new Intent(ListDonationMainActivity.this,
//                        ListDonationMainActivity.class);
//                startActivity(nextScreenListPlaces);
//            }
//        });
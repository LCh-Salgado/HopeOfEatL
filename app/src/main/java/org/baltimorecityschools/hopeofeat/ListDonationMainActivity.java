package org.baltimorecityschools.hopeofeat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;


public class ListDonationMainActivity extends AppCompatActivity {

    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;

    ListView mListV;
    EditText yourFoodEt;
    Button addBTN;
    Button removeBTN;
    Button locationN;
    String items;
    Intent locationInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_donation_main);
        mListV = (ListView)findViewById(R.id.listitem);
//       listV = (ListView)findViewById(R.id.listItem2);
        yourFoodEt = (EditText)findViewById(R.id.yourF);
        addBTN = (Button)findViewById(R.id.addB);
        removeBTN = (Button)findViewById(R.id.removeB);
        locationN = (Button)findViewById(R.id.LocationNBTN);

        listItems = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, listItems);
        mListV.setAdapter(adapter);

        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            items = yourFoodEt.getText().toString();

            listItems.add(items);
            mListV.setAdapter(adapter);
            adapter.notifyDataSetChanged();

            }
        });
        removeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<listItems.size(); i++) {
                    String addItem = yourFoodEt.getText().toString();
                    if (listItems.get(i).equals(addItem)) {
                        listItems.remove(i);
                        adapter.notifyDataSetChanged();
                        break;
                    }
                }
            }
        });
        locationN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                locationInt = new Intent(ListDonationMainActivity.this, Gmail.class);
                startActivity(locationInt);
            }
        });

    }

}









//        if(mListV == null) {
//            mListV = (ListView)findViewById(R.id.listitem);
//        }
//        adapter=new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                listItems);
//        setListAdapter(adapter);


//    protected ListView getListView() {
//        if (mListV == null) {
//            mListV = (ListView) findViewById(R.id.listitem);
//        }
//        return mListV;
//    }
//    protected void setListAdapter(ListAdapter adapter) {
//        getListView().setAdapter(adapter);
//    }
//    protected ListAdapter getListAdapter() {
//        ListAdapter adapter = getListView().getAdapter();
//        if(adapter instanceof HeaderViewListAdapter) {
//            return ((HeaderViewListAdapter) adapter).getWrappedAdapter();
//        }else {
//            return adapter;
//        }
//    }


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
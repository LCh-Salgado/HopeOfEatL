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
    String items;

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
        mListV = (ListView)findViewById(R.id.listitem);
        yourFoodEt = (EditText)findViewById(R.id.yourF);
        addBTN = (Button)findViewById(R.id.addB);
        removeBTN = (Button)findViewById(R.id.removeB);

        listItems = new ArrayList<String>();

//        listItems.add("Oranges");
//        listItems.add("Rice");
//        listItems.add("Milk");
//        listItems.add("Coffe");
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
                    } else {
                        Toast.makeText(ListDonationMainActivity.this, "no items matched",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });











//        if(mListV == null) {
//            mListV = (ListView)findViewById(R.id.listitem);
//        }
//        adapter=new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                listItems);
//        setListAdapter(adapter);

    }
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
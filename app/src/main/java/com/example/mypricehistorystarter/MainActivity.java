package com.example.mypricehistorystarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference ref;
    private ListView lv;
    private Button btn;
    private List<Item> itemList;
    private ArrayAdapter<Item> aD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Test to see if connected with Firebase
        Toast.makeText(MainActivity.this, "Firebase connection success", Toast.LENGTH_LONG).show();

        btn = (Button)findViewById(R.id.btnGetData);
        lv = (ListView)findViewById(R.id.lvData);

        itemList = new ArrayList<Item>();
        aD = new ArrayAdapter<Item>(this, android.R.layout.simple_list_item_1, itemList);

        // Read from the database on button press
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 1; i < 3; i++) {
                    ref = FirebaseDatabase.getInstance().getReference().child("Data").child(String.valueOf(i));
                    ref.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String name = dataSnapshot.child("Name").getValue().toString();
                            Double price = Double.parseDouble(dataSnapshot.child("Price").getValue().toString());
                            itemList.add(new Item(name, price));
                            lv.setAdapter(aD);
                        }

                        @Override
                        public void onCancelled(DatabaseError error) {
                        }
                    });
                }


            }
        });

    }
}
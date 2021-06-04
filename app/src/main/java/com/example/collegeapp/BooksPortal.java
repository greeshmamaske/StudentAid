package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class BooksPortal extends AppCompatActivity {

    ListView list;
    Button btnAddNew;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        setContentView(R.layout.activity_booksportal);

        list = findViewById(R.id.list);
        btnAddNew = findViewById(R.id.button7);



        ArrayList<String> book=new ArrayList<>();
        book.add("Let Us C - Yashwant");
        book.add("Operating Systems Notes");
        book.add("STLD notes");
        book.add("Data Structures - Horowitz Sahni");
        book.add("ACD classnotes");
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,book);
        list.setAdapter(adapter);

        btnAddNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intToAddNew = new Intent(BooksPortal.this, addNew.class);
                startActivity(intToAddNew);
            }
        });

        String bname = getIntent().getStringExtra("bname");
        String sname = getIntent().getStringExtra("sname");
        book.add(bname+" - "+sname);





    }
}

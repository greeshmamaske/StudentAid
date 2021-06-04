package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addNew extends AppCompatActivity {
    Button btnSubmit;
    EditText Bname, Sname;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        setContentView(R.layout.activity_add_new);

        btnSubmit=findViewById(R.id.button);
        Bname=findViewById(R.id.editText4);
        Sname=findViewById(R.id.editText);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bname = Bname.getText().toString();
                String sname = Sname.getText().toString();
                Intent intToAddNew = new Intent(addNew.this, BooksPortal.class);
                intToAddNew.putExtra("bname", bname);
                intToAddNew.putExtra("sname", sname);
                startActivity(intToAddNew);
            }
        });

    }
}

package com.firebace_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText newrecordenter;
    Button enterRecord;
    TextView viewRecord;

    //firebase variables
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference Refer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseDatabase=FirebaseDatabase.getInstance();
        Refer=firebaseDatabase.getReference();
    }
}
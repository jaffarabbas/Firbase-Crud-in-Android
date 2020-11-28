package com.firebace_crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.core.view.View;


public class MainActivity extends AppCompatActivity {
    EditText newrecordenter;
    Button enterRecord;
    TextView viewRecord;
    FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    DatabaseReference mRef= mDatabase.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initcode();
        //firebase variables
        this.enterRecord.setOnClickListener(this::runCode);
    }

    //store data
    private void runCode(View v){
        String data = newrecordenter.getText().toString();
        mRef.setValue(data);
        Toast.makeText(this,"Data Inserted",Toast.LENGTH_LONG).show();
    }

    private void initcode(){
        enterRecord = (Button) findViewById(R.id.enterrcord);
        newrecordenter = (EditText) findViewById(R.id.entername);
    }
}
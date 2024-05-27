package com.example.internalstorage_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class details extends AppCompatActivity {

    TextView tv;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tv=findViewById(R.id.tvUser);
        sp=getSharedPreferences("user_details",MODE_PRIVATE);
        tv.setText("And Hello : "+sp.getString("username",null));

    }

    public void back(View view){
        Intent i=new Intent(details.this,MainActivity.class);
        startActivity(i);
    }
}
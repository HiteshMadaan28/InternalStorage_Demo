package com.example.internalstorage_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    SharedPreferences sp;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        sp=getSharedPreferences("user_details",MODE_PRIVATE);
        intent = new Intent(this,details.class);

    }

    public void next(View view){
        String username=e1.getText().toString();
        String password=e2.getText().toString();
        if(username.equals("hitesh")&&password.equals("123")){
            SharedPreferences.Editor editor=sp.edit();
            editor.putString("username",username);
            editor.putString("password",password);
            editor.commit();
            Toast.makeText(this,"Login Succefull",Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        else{
            Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show();
        }

    }
}
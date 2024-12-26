package com.mastercoding.fragmentsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new FirstFragment());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SecondFragment());
            }
        });
    }

    public void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        // responsible for mangegment the fragments within an activity
        // keeps track of all fragments and their stats allowing us to interact with them

        FragmentTransaction ft = fm.beginTransaction() ;
        // a transaction is a set of interactions for removing fragments or changing them

        ft.replace(R.id.frameLayout, fragment);
        ft.commit();



    }
}
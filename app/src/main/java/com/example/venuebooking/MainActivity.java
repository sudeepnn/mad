package com.example.venuebooking;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.venuebooking.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void getstarted(View view){
        setContentView(R.layout.loginpage);
    }
    public void loigin(View view){
        setContentView(R.layout.signuppage);
    }
    public void onclick(View view){
            Intent intent=new Intent(this,homeuser.class);
            startActivity(intent);
    }


}
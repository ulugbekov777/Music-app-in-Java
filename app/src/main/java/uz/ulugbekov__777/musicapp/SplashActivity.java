package uz.ulugbekov__777.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import uz.ulugbekov__777.musicapp.data.MySharePref;
import uz.ulugbekov__777.musicapp.utils.Constants;

public class SplashActivity extends AppCompatActivity {

    MySharePref mySharePref = new MySharePref();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mySharePref.getInstance(this);

        new Handler().postDelayed(() -> {

            if (mySharePref.getIsLogin()){
                Intent intent = new Intent(SplashActivity.this,WelcomeActivity.class);
            }else{
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
            }


           Intent intent = new Intent(SplashActivity.this, MainActivity.class);
           startActivity(intent);
           finish();
        },2000);

        }
    }

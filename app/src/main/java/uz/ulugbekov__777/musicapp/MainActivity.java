package uz.ulugbekov__777.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.service.autofill.FieldClassification;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.ref.PhantomReference;

import uz.ulugbekov__777.musicapp.data.MySharePref;
import uz.ulugbekov__777.musicapp.utils.Constants;

public class MainActivity extends AppCompatActivity {

    EditText login,register,forgotPassword;
    Button access;


    String  mLogin = "ulugbekov";
    String  mRegister = "777";
    MySharePref mySharePref = new MySharePref();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        access = findViewById(R.id.access);
        forgotPassword = findViewById(R.id.forgotPassword);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        mySharePref.getInstance(this);

        access.setOnClickListener(view -> {
            String l = login.getText().toString();
            String r = register.getText().toString();

            if (l.equals(mLogin) && r.equals(mRegister)){
                Intent intent = new Intent(this, WelcomeActivity.class);
                startActivity(intent);
                mySharePref.setIsLogin(true);
            }else {
                Toast.makeText(this, "Error!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
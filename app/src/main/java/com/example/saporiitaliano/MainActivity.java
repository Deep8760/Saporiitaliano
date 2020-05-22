package com.example.saporiitaliano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2,deep;
    Button Login,forgetpass,signup;
    private FirebaseAuth firebaseAuth;
    public void deep(View abc){
        startActivity(new Intent(getApplicationContext(),Forgetpass.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText)findViewById(R.id.email);
        text2=(EditText)findViewById(R.id.pass);
        signup=(Button) findViewById(R.id.button5);
forgetpass=(Button)findViewById(R.id.button4);
        Login=(Button)findViewById(R.id.login) ;

        firebaseAuth=firebaseAuth.getInstance();

signup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(),Registeruser.class));
    }
});
            }

    }


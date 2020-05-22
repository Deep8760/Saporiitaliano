package com.example.saporiitaliano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2,deep;
    Button Login,signup;
    TextView forgetpass;
    private FirebaseAuth firebaseAuth;
    public void deep(View abc){
        startActivity(new Intent(getApplicationContext(),Forgetpass.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText)findViewById(R.id.edittext1);
        text2=(EditText)findViewById(R.id.pass1);
        signup=(Button) findViewById(R.id.textView4);
forgetpass=(TextView) findViewById(R.id.textView4);
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


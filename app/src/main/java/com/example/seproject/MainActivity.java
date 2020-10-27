package com.example.seproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputUsername;
    private EditText inputPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUsername = (EditText)findViewById(R.id.inputUsername);
        inputPass = (EditText)findViewById(R.id.inputPass);

    }

    public void test(View view){
        Button testBtn = findViewById(R.id.btnLogin);
        Toast toast = Toast.makeText(this, inputUsername.getText(),Toast.LENGTH_SHORT);
            toast.show();
            System.out.println(inputUsername.getText());
            System.out.println(inputPass.getText());
    }
}

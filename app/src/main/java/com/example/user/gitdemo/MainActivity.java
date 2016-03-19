package com.example.user.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mGreeting;
    private Button mGoodbyeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGoodbyeButton = (Button)findViewById(R.id.goodbye_button);
        mGreeting = (TextView)findViewById(R.id.greeting);
        mGoodbyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mGreeting.setVisibility(View.INVISIBLE);
                mGoodbyeButton.setVisibility(View.INVISIBLE);
            }
        });
    }
}

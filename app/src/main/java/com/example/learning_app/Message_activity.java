package com.example.learning_app;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Message_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_activity);
    }

    public void openFinalActivity(View view) {
        startActivity(new Intent(this,FinalActivity.class));
    }
}

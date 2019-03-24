package com.example.learning_app;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void sendPost(View view)
    {
        Intent intent = new Intent(this,Message_activity.class);
        startActivity(intent);

    }
}

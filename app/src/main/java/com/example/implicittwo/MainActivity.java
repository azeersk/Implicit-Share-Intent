package com.example.implicittwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name;
    Button ButtonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.UrlText);
        ButtonShare = (Button) findViewById(R.id.LinkButton);
        ButtonShare.setOnClickListener(new View.OnClickListener() {
            String ShareText = name.getText().toString();
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plan");
                intent.putExtra(Intent.EXTRA_TEXT,ShareText);
                startActivity(intent);
            }
        });

    }
    }
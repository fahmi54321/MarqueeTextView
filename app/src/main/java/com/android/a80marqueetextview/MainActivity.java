package com.android.a80marqueetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.sunfusheng.marqueeview.MarqueeView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarqueeView marqueeView = (MarqueeView) findViewById(R.id.marqueeView);
        List<String>listText = new ArrayList<>();
        listText.add("1. Bahasa Pemograman");
        listText.add("2. Kotlin");
        listText.add("3. Java");
        listText.add("4. C");
        listText.add("5. C++");

        marqueeView.startWithList(listText);
        marqueeView.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(MainActivity.this, ""+textView.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
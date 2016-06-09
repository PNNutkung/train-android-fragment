package com.example.nut.samplefragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_add;
    private Button btn_remove;
    private Button btn_replace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BlankFragment blankFragment = BlankFragment.newInstance("1");

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.fragment_container, blankFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        btn_replace = (Button) findViewById(R.id.btn_replace);
        btn_replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplaceFragment replaceFragment = ReplaceFragment.newInstance("1","2");

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, replaceFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


    }
}

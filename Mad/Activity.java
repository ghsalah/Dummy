





package com.example.activitylifecycle;



import android.app.Activity;

import android.os.Bundle;

import android.util.Log;

import android.widget.Toast;



public class MainActivity extends Activity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"onCreate invoked",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onStart() {

        super.onStart();

        Toast.makeText(getApplicationContext(),"onStart invoked",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onResume() {

        super.onResume();

        Toast.makeText(getApplicationContext(),"onResume invoked",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onPause() {

        super.onPause();

        Toast.makeText(getApplicationContext(),"onPause invoked",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onStop() {

        super.onStop();

        Toast.makeText(getApplicationContext(),"onStop invoked",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onRestart() {

        super.onRestart();

        Toast.makeText(getApplicationContext(),"onRestart invoked",Toast.LENGTH_SHORT).show();

    }

    @Override

    protected void onDestroy() {

        super.onDestroy();

        Toast.makeText(getApplicationContext(),"onDestroy invoked",Toast.LENGTH_SHORT).show();

    }

          }

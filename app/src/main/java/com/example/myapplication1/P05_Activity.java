package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.*;

import com.example.mapp_sam.R;

public class P05_Activity extends AppCompatActivity {
    String msg = "P05_Activity Sam";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p05_);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    public	void	launchSecondActivity(View view)	{
        Log.d("MainActivity",	"Button clicked!");
    }

}

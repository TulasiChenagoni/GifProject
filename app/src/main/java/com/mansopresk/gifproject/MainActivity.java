package com.mansopresk.gifproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et);
    }

    public void click(View view)
    {
       String name = et.getText().toString().trim();

       if(name.isEmpty())
       {
           Toast.makeText(this, " Please enter the name", Toast.LENGTH_SHORT).show();
       }
       else
       {
           Toast.makeText(this, name+" is a Mahesh fan", Toast.LENGTH_SHORT).show();
       }

    }
}

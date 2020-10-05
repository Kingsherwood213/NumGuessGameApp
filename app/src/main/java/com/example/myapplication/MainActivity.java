package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //this code generates the number in a random order with a max of 100 and min of 1 (declared later on)
    static int getRandomNumber(int max, int min)
    {
        return (int)((Math.random() * (max - min)) + min);
    }
    //After heavy research, I have found a widget from Android Studio that displays a message which I am utilising
    //for the higher and lower messages as well as the Game Over message
    public void makeToast(String string)
    {
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    public void clickFunction(View v)
    {
        int number;
        EditText variable
                = (EditText)findViewById(
                R.id.editId);
        number
                = Integer.parseInt(
                variable
                        .getText()
                        .toString());
        if (number < result) {

            makeToast(" Think of Higher Number");
        }
        else if (number > result) {
            makeToast(" Think of Lower Number");
        }
        else {
            makeToast(
                    "Congratulations,"
                            +" You Got the Number");
        }

    }

    @Override
    protected void onCreate(
            Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int min = 1;
        int max = 100;
        result = getRandomNumber(min, max);
    }
    int result;
}

// make it maximum 5 times
// change code to stop playgarism


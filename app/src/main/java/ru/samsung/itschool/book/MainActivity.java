package ru.samsung.itschool.book;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void run(View view) {
        // ax*x+bx+c=0
        double a = Double.parseDouble( ((EditText)
                findViewById(R.id.a)).getText().toString());
        double b = Double.parseDouble( ((EditText)
                findViewById(R.id.b)).getText().toString());
        double c = Double.parseDouble( ((EditText)
                findViewById(R.id.c)).getText().toString());
        TextView result = (TextView) findViewById(R.id.res);
        double D = b*b - 4 * a * c;
        if(a==0 && b==0 && c == 0){
            result.setText("any");
        }
        else if(a==0){
            result.setText("this is not a quadratic equation");
        }
        else if(D<0){
            result.setText("none");
        }
        else if(D==0){
            result.setText("" + String.valueOf((-b)/(2*a)) + " " + String.valueOf((-b)/(2*a)));
        }
        else
        {
        result.setText("" + String.valueOf((-b+D)/(2*a)) + " " + String.valueOf((-b-D)/(2*a)));
    }
    }

}

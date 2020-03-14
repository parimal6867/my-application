package com.codewithparimal.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

//import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
//import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.*;

public class MainActivity extends AppCompatActivity {

    private MainActivity context;
    private String text;


    public void clickFunction(View view)
    {
        Log.i("info","Button Clicked 1");

        EditText edittext =findViewById(R.id.editText);
        TextView textview=findViewById(R.id.textView);
        ImageView image=findViewById(R.id.imageView);
        //Drawable dr=getResources().getDrawable(R.id.);
        //edittext.getText().toString();
        double a=Double.parseDouble(edittext.getText().toString());

        double b=a*1.3;

        String S=Double.toString(b);

        //Toast.makeText(context=this,text="€ "+edittext.getText().toString()+" is "+S+" $",Toast.LENGTH_LONG).show();

        image.setImageResource(R.drawable.dollars);
        textview.setText("The amount in Dollars is:");
        edittext.setText(S);

        Log.i("Amount in Dollars",S);
    }
    public void clickFunc(View v)
    {
        TextView textview=findViewById(R.id.textView);
        EditText edittext =findViewById(R.id.editText);
        ImageView image=findViewById(R.id.imageView);
        image.setImageResource(R.drawable.pounds2);
        textview.setText("Enter the amount in Pounds");
        edittext.setText("");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

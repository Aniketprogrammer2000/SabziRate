package com.example.negotiate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText gm,rate,want;
private TextView GM,RATE,WANT,show;
private Button display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gm=findViewById(R.id.editTextTextPersonName);
        rate=findViewById(R.id.editTextTextPersonName2);
        want=findViewById(R.id.editTextTextPersonName3);
        GM=findViewById(R.id.textView);
        RATE=findViewById(R.id.textView2);
        WANT=findViewById(R.id.textView3);
        show=findViewById(R.id.textView4);

        //gram=1000 rate 52 vant 250


    }

    @SuppressLint("SetTextI18n")
    public void display(View view) {
        String gram=gm.getText().toString();
        String ret=rate.getText().toString();
        String vant=want.getText().toString();
        float Gram=Float.parseFloat(gram);
        float Rate=Float.parseFloat(ret);
        float Vant=Float.parseFloat(vant);
       /* int Gram1=0;
        for(int i=0;i<gram.length();i++){

            int c1 = Character.getNumericValue(gram.charAt(i));
            if(c1>-1&&c1<10){
                Gram1+=c1;
            }
        }*/
        if(Gram<1001){
            Gram=Gram/Vant;
            Rate=Rate/Gram;
            show.setText(Vant+"Correspond Rate:"+Rate);
        }
        else
            show.setText("not processed");
    }
}
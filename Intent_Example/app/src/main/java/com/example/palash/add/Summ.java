package com.example.palash.add;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Summ extends AppCompatActivity {
  Button ADD,MINUS;
    EditText num1,num2;
    TextView head;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
        num1=(EditText)findViewById(R.id.num1);
        num2=(EditText)findViewById(R.id.num2);
        head=(TextView)findViewById(R.id.heading);
        ADD=(Button)findViewById(R.id.sum);
        MINUS=(Button)findViewById(R.id.minus);
        // using anonymous class performing addition
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*int a,b,c;
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());
                c=a+b;
                head.setText(Integer.toString(c));
                */
                Intent forward=new Intent(Summ.this,Test.class);
                  startActivity(forward);
            }
        });

        // using non-anonymous class performing substraction
        MINUS.setOnClickListener(new Substraction());
    }
    class Substraction implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int a,b,c;
            a=Integer.parseInt(num1.getText().toString());
            b=Integer.parseInt(num2.getText().toString());
            c=a-b;
            head.setText(Integer.toString(c));


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_summ, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

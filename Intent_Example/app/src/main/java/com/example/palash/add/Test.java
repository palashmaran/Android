package com.example.palash.add;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Palash on 20-Sep-15.
 */
public class Test extends AppCompatActivity {

    Button back;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new testing());
    }
    class  testing implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {

            finish();
        }
    }
}

package com.example.webcubic.bsteltromat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewCall3 extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_call3);
        getSupportActionBar().setTitle("New  Call");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().trim().length()==0)
                {
                    e1.setError("Please fill the details");
                    e1.requestFocus();
                }

                else if(e2.getText().toString().trim().length()==0)
                {
                    e2.setError("Please fill the details");
                    e2.requestFocus();
                }


                else if(e3.getText().toString().trim().length()==0)
                {
                    e3.setError("Please fill the details");
                    e3.requestFocus();
                }


                else{
                    Intent i=new Intent(NewCall3.this,NewCall3.class);
                    startActivity(i);

                }
            }
        });


    }
}

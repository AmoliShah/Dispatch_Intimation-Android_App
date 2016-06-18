package com.example.android.dispatchintimation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    public void MailTo(View v)
    {
        EditText et1 = (EditText)findViewById(R.id.et1);
        EditText et2 = (EditText)findViewById(R.id.et2);
        EditText et3 = (EditText)findViewById(R.id.et3);
        EditText et4 = (EditText)findViewById(R.id.et4);
        EditText et5 = (EditText)findViewById(R.id.et5);
        EditText et6 = (EditText)findViewById(R.id.et6);
        EditText et7 = (EditText)findViewById(R.id.et7);
        EditText et8 = (EditText)findViewById(R.id.et8);
        EditText et9 = (EditText)findViewById(R.id.et9);
        EditText et10 = (EditText)findViewById(R.id.et10);
        EditText et11 = (EditText)findViewById(R.id.et11);
        EditText et12 = (EditText)findViewById(R.id.et12);
        EditText et13 = (EditText)findViewById(R.id.et13);
        EditText et14 = (EditText)findViewById(R.id.et14);
        EditText et15 = (EditText)findViewById(R.id.et15);
        EditText et16 = (EditText)findViewById(R.id.et16);
        EditText et17 = (EditText)findViewById(R.id.et17);
        EditText et18 = (EditText)findViewById(R.id.et18);
        EditText invoice = (EditText)findViewById(R.id.et19);
        EditText et20 = (EditText)findViewById(R.id.et20);
        EditText et21 = (EditText)findViewById(R.id.et21);

        String quantity="";
        int q0,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18;
        q0 = Integer.parseInt(et1.getText().toString());
        if(q0 != 0)
            quantity = quantity + "20 161 10     : " + q0 +" Nos\n";
        q1 = Integer.parseInt(et2.getText().toString());
        if(q1 != 0)
            quantity = quantity + "20 161 15     : " + q1 +" Nos\n";
        q2 = Integer.parseInt(et3.getText().toString());
        if(q2 != 0)
            quantity = quantity + "20 161 20     : " + q2 +" Nos\n";
        q3 = Integer.parseInt(et4.getText().toString());
        if(q3 != 0)
            quantity = quantity + "20 161 25     : " + q3 +" Nos\n";
        q4 = Integer.parseInt(et5.getText().toString());
        if(q4 != 0)
            quantity = quantity + "20 161 30     : " + q4 +" Nos\n";
        q5 = Integer.parseInt(et6.getText().toString());
        if(q5 != 0)
            quantity = quantity + "20 161 34     : " + q5 +" Nos\n";
        q6 = Integer.parseInt(et7.getText().toString());
        if(q6 != 0)
            quantity = quantity + "20 161 35     : " + q6 +" Nos\n";
        q7 = Integer.parseInt(et8.getText().toString());
        if(q7 != 0)
            quantity = quantity + "20 162 25     : " + q7 +" Nos\n";
        q8 = Integer.parseInt(et9.getText().toString());
        if(q8 != 0)
            quantity = quantity + "20 162 30     : " + q8 +" Nos\n";
        q9 = Integer.parseInt(et10.getText().toString());
        if(q9 != 0)
            quantity = quantity + "20 162 35     : " + q9 +" Nos\n";
        q10 = Integer.parseInt(et11.getText().toString());
        if(q10 != 0)
            quantity = quantity + "20 181 18     : " + q10 +" Nos\n";
        q11 = Integer.parseInt(et12.getText().toString());
        if(q11 != 0)
            quantity = quantity + "20 181 20     : " + q11 +" Nos\n";
        q12 = Integer.parseInt(et13.getText().toString());
        if(q12 != 0)
            quantity = quantity + "20 181 22     : " + q12 +" Nos\n";
        q13 = Integer.parseInt(et14.getText().toString());
        if(q13 != 0)
            quantity = quantity + "20 181 24     : " + q13 +" Nos\n";
        q14 = Integer.parseInt(et15.getText().toString());
        if(q14 != 0)
            quantity = quantity + "SDF 180S 18 : " + q14 +" Nos\n";
        q15 = Integer.parseInt(et16.getText().toString());
        if(q15 != 0)
            quantity = quantity + "SDF 180S 20 : " + q15 +" Nos\n";
        q16 = Integer.parseInt(et17.getText().toString());
        if(q16 != 0)
            quantity = quantity + "SDF 180S 22 : " + q16 +" Nos\n";
        q17 = Integer.parseInt(et18.getText().toString());
        if(q17 != 0)
            quantity = quantity + "SDF 180S 24 : " + q17 +" Nos\n";
       /* q18 = Integer.parseInt(et21.getText().toString());
        if(q18 != 0)
            quantity = quantity + " " + et20.getText().toString() + " : " + q18 +" Nos\n";*/
        int q19 = Integer.parseInt(invoice.getText().toString());
        int total=q0+q1+q2+q3+q4+q5+q6+q7+q8+q9+q10+q11+q12+q13+q14+q15+q16+q17;




        String[] To = {"revathi@titan.co.in"};
        String[] cc = {"bharath@titan.co.in"};
        String Subject = "Spring Bars Dispatch Intimation";
        String Body = "Dear Mam,\n\nWe confirm have dispatched under noted spring bars through TCI XPS Courier vide Invoice No " + q19 + ".\n\nSpring Bars:\n"+quantity+"\nTotal Quantity : "+total+"\n\n"+"This is for your kind information please.\n\nThanking you.\n\nFor Pioneer Engineering Company,\n\nRajesh Shah";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setData(Uri.parse("mail to:"));
        email.setType("text/plain");
        email.putExtra(Intent.EXTRA_EMAIL,To);
        email.putExtra(Intent.EXTRA_CC,cc);
        email.putExtra(Intent.EXTRA_SUBJECT, Subject);
        email.putExtra(Intent.EXTRA_TEXT,Body);

        try {
            startActivity(Intent.createChooser(email, "Send mail..."));
            finish();
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }
}



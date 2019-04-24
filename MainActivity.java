package com.androstock.myweatherapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    Button button;Button button2;Button button3;Button button4;Button button5;Button button6;Button button7;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, DangerZones.class);
                startActivity(intent);

            }

        } );
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new OnClickListener() {

                                      @Override
                                      public void onClick(View arg0) {

                                          Intent intent = new Intent(context, Instructions.class);
                                          startActivity(intent);

                                      }

                                  }


        ); button3 = (Button) findViewById(R.id.button2);

        button3.setOnClickListener(new OnClickListener() {

                                       @Override
                                       public void onClick(View arg0) {

                                           Intent intent = new Intent(context, GoogleMap.class);
                                           startActivity(intent);

                                       }

                                   }


        ); button4 = (Button) findViewById(R.id.button2);

        button4.setOnClickListener(new OnClickListener() {

                                       @Override
                                       public void onClick(View arg0) {

                                           Intent intent = new Intent(context, SendSms.class);
                                           startActivity(intent);

                                       }

                                   }


        ); button5 = (Button) findViewById(R.id.button2);

        button5.setOnClickListener(new OnClickListener() {

                                       @Override
                                       public void onClick(View arg0) {

                                           Intent intent = new Intent(context, Notes.class);
                                           startActivity(intent);

                                       }

                                   }


        ); button6 = (Button) findViewById(R.id.button2);

        button6.setOnClickListener(new OnClickListener() {

                                       @Override
                                       public void onClick(View arg0) {

                                           Intent intent = new Intent(context, Weather.class);
                                           startActivity(intent);

                                       }

                                   }


        ); button7 = (Button) findViewById(R.id.button2);

        button7.setOnClickListener(new OnClickListener() {

                                       @Override
                                       public void onClick(View arg0) {

                                           Intent intent = new Intent(context, HelpLineNumbers.class);
                                           startActivity(intent);

                                       }

                                   }


        );

    }

}
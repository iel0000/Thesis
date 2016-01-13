package com.crescent.thesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clark = (Button) findViewById(R.id.button);
        Button sf = (Button) findViewById(R.id.button2);

        clark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                    String coord1 = "15.1680832";
                    String coord2 = "120.5795193";
                    String marker ="SM Clark";
                    Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                    i.putExtra("coordX",coord1);
                    i.putExtra("coordY",coord2);
                    i.putExtra("marker",marker);
                    startActivity(i);
            }
        });

        sf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String coord1 = "15.0527682";
                String coord2 = "120.6961653";
                String marker ="SM Clark";
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("coordX",coord1);
                i.putExtra("coordY",coord2);
                i.putExtra("marker",marker);
                startActivity(i);
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
}

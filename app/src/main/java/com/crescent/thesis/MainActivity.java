package com.crescent.thesis;

import android.content.Intent;
import android.graphics.Typeface;
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
        Typeface font = Typeface.createFromAsset(getAssets(), "namo.ttf");

        Button touristAtt = (Button) findViewById(R.id.touristAtt);
        touristAtt.setTypeface(font);

        Button about = (Button) findViewById(R.id.aboutPampanga);
        about.setTypeface(font);

        Button credits = (Button) findViewById(R.id.credits);
        credits.setTypeface(font);

        Button map = (Button) findViewById(R.id.map);
        map.setTypeface(font);

        Button quit = (Button) findViewById(R.id.quit);
        quit.setTypeface(font);

        touristAtt.setOnClickListener(new View.OnClickListener() {
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

        about.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String coord1 = "15.0527682";
                String coord2 = "120.6961653";
                String marker = "SM Clark";
                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                i.putExtra("coordX", coord1);
                i.putExtra("coordY", coord2);
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


        return super.onOptionsItemSelected(item);
    }
}

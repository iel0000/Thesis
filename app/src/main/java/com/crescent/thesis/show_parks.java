package com.crescent.thesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class show_parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_parks);

        Bundle extras = getIntent().getExtras();
        if(extras!=null)

        {
            String imgbg = extras.getString("img");
            String title = extras.getString("title");
            String description = extras.getString("text");
            String address = extras.getString("address");
            TextView t, add, desc;
            ImageView img;
            String coord1 = "";
            String coord2 = "";
            String marker = "";
            switch (imgbg) {
                case "airForce":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.air_force);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.180407";
                    coord2 = "120.533688";
                    marker = "Air Force City Aircraft Park";

                    break;
                case "angIndustrial":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.angeles_industrial_park);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1128106";
                    coord2 = "120.5985566";
                    marker = "Angeles Industrial Park";
                    break;
                case "bayanihan":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.bayanihan);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.168533";
                    coord2 = "120.586776";
                    marker = "Bayanihan Park";
                    break;
                case "bicentennial":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.bicentenial);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.18015348";
                    coord2 = "120.51460415";
                    marker = "Bicentennial Park";
                    break;
                case "clarkParade":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.clark_parade_ground);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1802672";
                    coord2 = "120.5225122";
                    marker = "Clark Parade Ground";
                    break;
                case "arayatPark":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.arayat_national_park);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1959299";
                    coord2 = "120.744301";
                    marker = "Mt. Arayat National Park";
                    break;
                default:
                    break;
            }
            ImageButton btn = (ImageButton)findViewById(R.id.image);
                /*Show on maps on image click*/
            final String finalCoord = coord2;
            final String finalCoord1 = coord1;
            final String finalMarker = marker;
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                    i.putExtra("coordX", finalCoord1);
                    i.putExtra("coordY", finalCoord);
                    i.putExtra("marker", finalMarker);
                    startActivity(i);
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_parks, menu);
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

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

import com.crescent.thesis.R;

public class show_lmarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lmarks);

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
                case "archdiocesan":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.archdiocesan_chancery);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.0343278";
                    coord2 = "120.6939018";
                    marker = "Archdiocesan Chancery";

                    break;
                case "buluyut":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.buluyut_bridge);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.027343";
                    coord2 = "120.693754";
                    marker = "Buluyut Bridge";

                    break;
                case "crissot":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.crissot_monument);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "14.998626";
                    coord2 = "120.652829";
                    marker = "Crissot Monument";

                    break;
                case "kabayo":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.el_kabayo);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.200892";
                    coord2 = "120.541573";
                    marker = "El Kabayo";

                    break;
                case "macario":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.macario_arnedo_park);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.0246954";
                    coord2 = "120.687029";
                    marker = "Macario Arnedo Park";

                    break;case "salakot":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.bayanihan);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.16849143";
                    coord2 = "120.58660939";
                    marker = "Salakot Arch";

                    break;case "sfRail":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.san_fernando_railway_station);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.1449611";
                    coord2 = "120.5909658";
                    marker = "San Fernando railway station";

                    break;case "roxas":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.president_roxas_marker);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.186921";
                    coord2 = "120.560656";
                    marker = "President Roxas Marker";

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
        getMenuInflater().inflate(R.menu.menu_show_lmarks, menu);
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

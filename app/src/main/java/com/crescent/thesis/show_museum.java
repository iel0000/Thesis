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

public class show_museum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_museum);

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
                case "clark_museum":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.clark_museum);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.182173";
                    coord2 = "120.526864";
                    marker = "Clark Museum and Museong Kapampangan";

                    break;
                case "hau":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.hau_center);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.133113";
                    coord2 = "120.5898535";
                    marker = "Holy Angel University Center for Kapampangan Studies";

                    break;
                case "museoAngeles":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.museo_ning_angeles);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.1347381";
                    coord2 = "120.590997";
                    marker = "Museo ning Angeles";

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
        getMenuInflater().inflate(R.menu.menu_show_museum, menu);
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

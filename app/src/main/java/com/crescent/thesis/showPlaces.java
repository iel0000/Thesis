package com.crescent.thesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class showPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_places);

            Bundle extras = getIntent().getExtras();
            if(extras!=null)

            {
                String imgbg = extras.getString("img");
                String title = extras.getString("title");
                String description = extras.getString("text");
                String address = extras.getString("address");
                TextView t, add, desc;
                ImageView img;
                ImageButton btn;
                btn  = (ImageButton)findViewById(R.id.image);

                switch (imgbg) {
                    case "gabaldon":
                        img = (ImageView) findViewById(R.id.image);
                        img.setImageResource(R.drawable.gabaldon);
                        t = (TextView) findViewById(R.id.title);
                        add = (TextView) findViewById(R.id.address);
                        desc = (TextView) findViewById(R.id.description);
                        t.setText(title);
                        add.setText(address);
                        desc.setText(description);
                        /*Show on maps on image click*/
                        btn.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                String coord1 = "15.0277176";
                                String coord2 = "120.6815017";
                                String marker = "Gabaldon Schoolhouse";
                                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                                i.putExtra("coordX", coord1);
                                i.putExtra("coordY", coord2);
                                i.putExtra("marker", marker);
                                startActivity(i);
                            }
                        });

                        break;
                    case "nayong_pilipino":
                        img = (ImageView) findViewById(R.id.image);
                        img.setImageResource(R.drawable.nayong_pilipino);
                        t = (TextView) findViewById(R.id.title);
                        add = (TextView) findViewById(R.id.address);
                        desc = (TextView) findViewById(R.id.description);
                        t.setText(title);
                        add.setText(address);
                        desc.setText(description);
                        btn.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                String coord1 = "15.2044178";
                                String coord2 = "120.5281023";
                                String marker = "Nayong Pilipino sa Clark";
                                Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                                i.putExtra("coordX", coord1);
                                i.putExtra("coordY", coord2);
                                i.putExtra("marker", marker);
                                startActivity(i);
                            }
                        });
                        break;
                    default:
                        break;
                }

            }

        }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_places, menu);
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

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

public class show_lwonders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lwonders);

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
                case "abesfarm":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.abesfarm);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.227107";
                    coord2 = "120.705893";
                    marker = "Abe's Farm";

                    break;
                case "baleDutung":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.bale_dutung);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1291729";
                    coord2 = "120.5945881";
                    marker = "Bale Dutung";
                    break;
                case "candabaHangingBridge":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.candaba_hanging_bridge);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.0936517";
                    coord2 = "120.8246962";
                    marker = "Candaba Hanging Bridge";
                    break;
                case "clarkEduc":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.clark_education);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.20404509";
                    coord2 = "120.52671969";
                    marker = "Clark Education City ";
                    break;
                case "clarkExpo":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.clark_expo);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.203948";
                    coord2 = "120.528105";
                    marker = "Clark Expo";
                    break;
                case "clarkFreeport":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.clark_freeport);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1789517";
                    coord2 = "120.5183007";
                    marker = "Clark Freeport Zone";
                    break;
                case "daraFalls":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.dara_falls);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1182505";
                    coord2 = "15.1182505";
                    marker = "Dara Falls";
                    break;
                case "delMarcoMarble":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.del_marco_marble);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1309";
                    coord2 = "120.573";
                    marker = "Del-Marco Marble Marble Products";
                    break;
                case "dinoIsland":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.dinosaurs_island);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.2080546";
                    coord2 = "120.5449998";
                    marker = "Dinosaurs Island at Clarkland";
                    break;
                case "diosMac":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.diosdado_macapagal);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.18796";
                    coord2 = "120.549462";
                    marker = "Diosdado Macapagal Intl Airport";
                    break;
                case "evCafe":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.ev_cafe);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1355029";
                    coord2 = "120.5877344";
                    marker = "Everybody's Cafe";
                    break;
                case "hilCultVil":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.hilaga_cultural_village);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.0494099";
                    coord2 = "120.6942123";
                    marker = "Hilaga Cultural Village";
                    break;
                case "pampBest":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.pampangas_best);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.0380787";
                    coord2 = "120.6806302";
                    marker = "Pampanga's Best";
                    break;
                case "psau":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.pampanga_agricultural_college);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.2189844";
                    coord2 = "120.6949317";
                    marker = "Pampanga Agricultural College";
                    break;
                case "sisig":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.sisig);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "15.1475674";
                    coord2 = "120.5897851";
                    marker = "Sisig sa Pampanga";
                    break;
                case "basaAir":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.basa_air_base);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    coord1 = "14.986389";
                    coord2 = "120.4925";
                    marker = "Basa Air Base";
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
        getMenuInflater().inflate(R.menu.menu_show_lwonders, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}

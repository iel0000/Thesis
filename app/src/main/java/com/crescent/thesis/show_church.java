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

public class show_church extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_church);

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
                case "holy_rosary":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.holy_rosary_parish_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.1342225";
                    coord2 = "120.5887984";
                    marker = "Holy Rosary Parish Church";
                    break;
                case "immaculate":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.immaculate);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.1587186";
                    coord2 = "120.5915326";
                    marker = "Immaculate Conception Parish Church";
                    break;
                case "metropolitan":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.metropolitan_catherdral_sf);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.0593937";
                    coord2 = "120.6567054";
                    marker = "Metropolitan Catherdral of San Fernando";
                    break;
                case "nuestra":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.nuestra);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.0355222";
                    coord2 = "120.6940263";
                    marker = "Nuestra senyora del pila parish church";
                    break;
                case "lady_of_divine":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.ourlady);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.224404";
                    coord2 = "120.572740";
                    marker = "Our Lady of Divine Grace Parish Church";
                    break;
                case "guillermo":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.san_guillermo_parish_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.000325";
                    coord2 = "120.648271";
                    marker = "San Guillermo Parish Church";
                    break;
                case "san_luis":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.san_luis_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.039046";
                    coord2 = "120.790181";
                    marker = "San Luis Church";
                    break;
                case "apalit":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.apalit_parochial_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "14.9536994";
                    coord2 = "120.7724905";
                    marker = "Apalit Parochial Church";
                    break;
                case "andrew":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.st_andrew_parish_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.0917703";
                    coord2 = "120.8277756";
                    marker = "St. Andrew Parish Church";
                    break;
                case "anne":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.st_anne_parish_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.0946595";
                    coord2 = "120.7654274";
                    marker = "St. Anne Parish Church";
                    break;
                case "agustin":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.san_agustin_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.0190639";
                    coord2 = "120.7019417";
                    marker = "San Agustin Church";
                    break;
                case "bartolome":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.san_bartolome_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.214533";
                    coord2 = "120.660009";
                    marker = "San Bartolome Church";
                    break;
                case "cath":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.st_catherine_alexandra_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.1512833";
                    coord2 = "120.7726997";
                    marker = "St. Catherine Alexandra Church";
                    break;
                case "joseph":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.st_joseph_parish_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "14.9734732";
                    coord2 = "120.5270013";
                    marker = "St. Joseph Parish Church";
                    break;
                case "lucia":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.sta_lucia_parish_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "15.021907";
                    coord2 = "120.6897735";
                    marker = "Sta. Lucia Parish Church";
                    break;
                case "minalin":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.minalin_church);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
                    coord1 = "14.9683876";
                    coord2 = "120.6837497";
                    marker = "Minalin Church";
                    break;
            }

            ImageButton btn = (ImageButton) findViewById(R.id.image);
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
        getMenuInflater().inflate(R.menu.menu_show_church, menu);
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

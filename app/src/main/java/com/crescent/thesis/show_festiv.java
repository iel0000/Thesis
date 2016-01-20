package com.crescent.thesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.crescent.thesis.R;

public class show_festiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_festiv);

        Bundle extras = getIntent().getExtras();
        if(extras!=null)

        {
            String imgbg = extras.getString("img");
            String title = extras.getString("title");
            String description = extras.getString("text");

            TextView t, desc;
            ImageView img;
            switch (imgbg) {

                case "el_circulo":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.el_circulo);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "sinukwan":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.sinukwan_festival);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "makatapak":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.makatapak_festival);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "hot_air":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.hot_air_balloon);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "sabuaga":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.sabuaga_festival);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "caragan":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.caragan_festival);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "cricifixion":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.cricifixion_rites);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "tugak":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.pyestang_tugak);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "lantern":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.giant_lantern);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "duman":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.duman_festival);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "iru":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.fluvial_festival);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;

                case "ebun":
                    img = (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.ibon_ebun);
                    t = (TextView) findViewById(R.id.title);

                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    desc.setText(description);

                    break;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_festiv, menu);
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

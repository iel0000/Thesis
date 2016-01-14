package com.crescent.thesis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class showPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_places);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String imgbg = extras.getString("img");
            String title = extras.getString("title");
            String description = extras.getString("text");
            String address = extras.getString("address");
            TextView t,add,desc;
            ImageView img;
            switch (imgbg)
            {
                case "gabaldon":
                    img= (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.gabaldon);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);

                    break;
                case "nayong_pilipino":
                    img= (ImageView) findViewById(R.id.image);
                    img.setImageResource(R.drawable.nayong_pilipino);
                    t = (TextView) findViewById(R.id.title);
                    add = (TextView) findViewById(R.id.address);
                    desc = (TextView) findViewById(R.id.description);
                    t.setText(title);
                    add.setText(address);
                    desc.setText(description);
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

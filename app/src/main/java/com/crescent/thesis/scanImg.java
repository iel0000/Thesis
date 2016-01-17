package com.crescent.thesis;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class scanImg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_img);

        Typeface font = Typeface.createFromAsset(getAssets(), "namo.ttf");

        Button cultural = (Button) findViewById(R.id.cultural);
        cultural.setTypeface(font);

        Button lwonders = (Button) findViewById(R.id.lwonders);
        lwonders.setTypeface(font);

        Button parks = (Button) findViewById(R.id.parks);
        parks.setTypeface(font);

        Button church = (Button) findViewById(R.id.church);
        church.setTypeface(font);

        Button lmarks = (Button) findViewById(R.id.salakot);
        lmarks.setTypeface(font);
    }

    public void showSubMenu (View view) {
        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
        String button_test;
        button_test = ((Button) view).getText().toString();
        Intent i;
        switch (button_test) {

            case "Salakot":
                i = new Intent(this, salakot.class);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            default:break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scan_img, menu);
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

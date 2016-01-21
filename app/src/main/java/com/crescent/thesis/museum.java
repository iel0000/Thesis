package com.crescent.thesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

import com.crescent.thesis.R;

public class museum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_museum, menu);
        return true;
    }

    public void showplaces (View view) {

        AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
        String button_test;
        button_test = ((Button) view).getText().toString();
        Intent i;
        String imgBg;
        String title;
        String text;
        String address;
        switch (button_test) {
            case "Clark Museum and Museong Kapampangan":
                imgBg="clark_museum";
                title = "Clark Museum and Museong Kapampangan";
                address = "Clark, Pampanga";
                text = "    The museum showcases the rich historical past of Clark, as a former US military base and its dramatic metamorphosis into a special economic zone and eventually, as a world-class aerotropolis. This is depicted in countless pictures, scenic dioramas, true-to-life replicas and murals, artifacts and others. It is also a tribute to the resilient Filipinos who strive to reshape their future despite ravages of war and the wrath of nature.";
                i = new Intent(this, show_museum.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Holy Angel University Center for Kapampangan Studies":
                imgBg="hau";
                title = "Holy Angel University Center for Kapampangan Studies";
                address = "Angeles City, Pampanga";
                text = "    Envisioned to preserve and promote the Kapampangan cultural heritage, the Juan D. Nepomuceno Center for Kapampangan Studies hopes to contribute to the total development of the Kapampangan and eventually the Filipino nation and the global community as well. It houses a research center, library and archives, museum and gallery, and a theater.";
                i = new Intent(this, show_museum.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Museo ning Angeles":
                imgBg="museoAngeles";
                title = "Museo ning Angeles";
                address = "Angeles City, Pampanga";
                text = "    The edifice was built in 1922 and served as the Municipio or town hall; it replaced the former La Casa Tribunal built during the construction boom of 1840. Built of typical Bahay na Bato (stone house) with a thatched roof, its location was about 20 yards to the south of the present structure since the present site was the town “Palenque” or public market.";
                i = new Intent(this, show_museum.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
        }
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

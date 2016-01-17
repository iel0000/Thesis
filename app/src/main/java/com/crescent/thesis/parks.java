package com.crescent.thesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);
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

            case "Air Force City\nAircraft Park":
                imgBg="airForce";
                title = "Air Force City\nAircraft Park";
                address = "Clark, Pampanga";
                text = "The park was developed to give local and foreign visitors to Clark an opportunity to witness a variety of aircrafts and other aviation equipment used by the Philippine Air Force (600th Air Base Wing). On display in an open field along CM Recto Avenue are a host of flying machines. A favorite spot for local and foreign visitors.";
                i = new Intent(this, show_parks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Angeles Industrial\nPark":
                imgBg="angIndustrial";
                title = "Angeles Industrial\nPark";
                address = "Bo. Calibutbut, Bacolor, Pampanga";
                text = "Light to medium, non-pollutant, export-oriented and labor-intentsive industries. High, medium or low voltage requirements sourced from the Angeles Electric Corp., 6th largest privately owned electric utility in the Philippines.";
                i = new Intent(this, show_parks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Bayanihan Park":
                imgBg="bayanihan";
                title = "Bayanihan Park";
                address = "Clark, Pampanga";
                text = "Located in front of Clark main gate and formerly known as Astro Park, Bayanihan Park is a beehive of activities everyday from basketball, volleball to kite flying. It is a perfect venue for carnival fairs, religious rites and political rallies.";
                i = new Intent(this, show_parks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Bicentennial Park":
                imgBg="bicentennial";
                title = "Bicentennial Park";
                address = "Clark, Pampanga";
                text = "The Bicentennial Park is a favorite place for picnickers and nature lovers as it is lined with shady acacia trees and ornamentals built by Clark Development Corporation as an alternative picnic area for local and foreign visitors into Clark. It has become a favorite place for company outings and events.";
                i = new Intent(this, show_parks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Clark Parade Ground":
                imgBg="clarkParade";
                title = "Clark Parade Ground";
                address = "Clark, Pampanga";
                text = "Originally this area was called \"Pati\" by the Aetas and was then a treeless pastureland. In 1897, during the revolution against Spain, Kapampangan katipuneros used this area as a gathering point for staging attacks against Spanish detachments and patrols.";
                i = new Intent(this, show_parks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Mt. Arayat National\nPark":
                imgBg="arayatPark";
                title = "Mt. Arayat National\nPark";
                address = "Arayat, Pampanga";
                text = "Located in Brgy. San Juan Bano, Mt. Arayat National Park is an ideal site for picnickers and nature lovers with its quaint environs under cool shades of lush green foliage, mountain breeze, natural waterfalls and three standard-sized swimming pools. It is two kilometers away from the town proper of Arayat and about forty-five minutes drive from Angeles City.";
                i = new Intent(this, show_parks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            default:break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_parks, menu);
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

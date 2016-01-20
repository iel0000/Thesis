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

public class fest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fest, menu);
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
            case "El Circulo\nFernandino":
                imgBg="el_circulo";
                title = "El Circulo Fernandino";
                text = "    A prestigious social event of the rich in the City of San Fernando. It has been established since 1920 and held every year.  It is a night full of luster because of the gorgeous women wearing their most best expensive jewelries, gowns and ternos.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Sinukwan Festival":
                imgBg="sinukwan";
                title = "Sinukwan Festival";
                text = "    Aring Sinukwan (King Sinukwan) is a god of the ancient Kapampangans. The celebration participated by representatives of different towns of Pampanga.  Street dancing is the highlight of this event, each delegates dance to the tune of the Pampanga Song “Atin ku pong singsing” in their elegant headdresses and colorful costumes.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Makatapak Festival":
                imgBg="makatapak";
                title = "Makatapak Festival";
                text = "    \" Makatapak\" is a Kapampangan word means barefoot. This festival is the famous re-enactment of the town people in Apalit who walked through lahar in barefoot to look for a safer place to stay after the eruption of Mt. Pinatubo.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Philippine Hot Air\nBalloon Festival":
                imgBg="hot_air";
                title = "Philippine Hot Air\nBalloon Festival";
                text = "    Held annually in Omni Aviation Complex inside Clark Freeport Zone.  It features multicolored hot air balloons from around the globe, it is the biggest aviation sports event in the Philippines.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Sabuaga Festival":
                imgBg="sabuaga";
                title = "Sabuaga Festival";
                text = "    Held every morning of Easter Sunday.  Flower petals are strewn while the procession of the image of the Blessed Virgin Mary passes.  “Sabuaga” means showering of flowers; this has been celebrated in Sto. Tomas to honor the Blessed Mother Mary.  Street dancing also follows to promote the products and traditions of the town.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Caragan Festival":
                imgBg="caragan";
                title = "Caragan Festival";
                text = "    Caragan is the name of the first chieftain of the native Aeta.  It is held every third week of February through street dancing.  The Aetas lead the presentation showcasing their customs and traditions in their native costumes.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "San Pedro Cutud Cricifixion Rites":
                imgBg="cricifixion";
                title = "San Pedro Cutud\nCricifixion Rites";
                text = "    At 3pm every Good Friday, there is an actual nailing on the cross of three flagellants in the town of San Pedro Cutud.  This is now an international tourist’s attraction.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Pyestang Tugak":
                imgBg="tugak";
                title = "Pyestang Tugak";
                text = "    Pyestang Tugak or Frog Festival which started in 2003 in City of San Fernando.  Its aim is to preserve the Kapampangan culture and to promote the Pampanga’s unique frog cuisine.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Giant Lantern\nFestival":
                imgBg="lantern";
                title = "Giant Lantern Festival";
                text = "    City if San Fernando is known to be the Christmas Capital of the Philipplines. Seven barangays from City of San Fernando are participating in the contest of the giant lantern competition. 20 feet diameter lanterns with thousands of dancing lights are being judge and display every Saturday before Christmas.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Duman Festival":
                imgBg="duman";
                title = "Duman Festival";
                text = "    This tradition of pounding and winnowing unripe glutinous rice till it turns to a green delicacy called duman with a sweet and delicious small.  This is held every first Saturday of December in Sta. Rita Parish Church.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Apung Iru Fluvial\nFestival":
                imgBg="iru";
                title = "Apung Iru Fluvial Festival";
                text = "    This is a fluvial parade of the image of St. Peter or the local called Apung Iru starts every June 27 and culminates on June 29. Decorative pagoda is carried and ferried by men along Pampanga river routes.  Devoteed are riding in colorfully decorated boats are praying around the images.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Ibun-ebun Festival":
                imgBg="ebun";
                title = "Ibun-ebun Festival";
                text = "    “Ibun” means bird “Ebun” means egg.  This festival in the town of Candaba is a tribute to the productive duck egg industry.  Dumara are the wild Philippine duck which successfully breeds in Candaba Swamp.";
                i = new Intent(this, show_festiv.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
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

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

public class lmarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lmarks);
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
            case "Archdiocesan\nChancery":
                imgBg = "archdiocesan";
                title = "Archdiocesan Chancery";
                address = "City of San Fernando, Pampanga";
                text = "    This is a heritage house in the City of San Fernando, Pampanga. It was the former residence of Luis Wenceslao Dison and Felisa Hizon that was purchased by the Roman Catholic Archdiocese of San Fernando. It is now being used as the Archdiocesan Chancery.";
                i = new Intent(this, show_lmarks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Buluyut Bridge":
                imgBg = "buluyut";
                title = "Buluyut Bridge";
                address = "City of San Fernando, Pampanga";
                text = "    Originally a wooden bridge known as Puente Colgante, it was reconstructed in 1896 using iron and stone but three years later destroyed during the Philippine-American War.";
                i = new Intent(this, show_lmarks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Crissot Monument":
                imgBg = "crissot";
                title = "Crissot Monument";
                address = "Bacolor, Pampanga";
                text = "    A monument built in honor of Juan Crisostomo Soto, he was a distinguished Pampango poet, dramatist and newspaperman (1867-1918). Born in Sta. Ines, Bacolor, he is known as the Father of Pampango Literature. He learned his first letters from a town tutor Cirilio Fernandez; pursued higher education under a noted teacher Vicente Quirino; wrote numerous lyrical poems, historical dramas, humorous plays, fiery editorials and philosophical essays; translated into Pampango the Spanish version of Romeo and Juliet and old European plays like the Lovers of Turuel Faust and Nero and the Gladiators; translated Rizal's Noli Me Tangere and El Filibusterismo; joined the Philippine Revolution in 1896 and figured in several battles against the American forces in 1898. ";
                i = new Intent(this, show_lmarks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "El Kabayo":
                imgBg = "kabayo";
                title = "El Kabayo";
                address = "Clark Freeport Zone, Pampanga";
                text = "    This facility is a replica of an old western town directly out of an American cowboy movie. If you enjoy watching John Wayne and Clint Eastwood in their glory days of Tinsel Town, you will feel as if you are on the set of one of their productions when you visit El Kabayo.\n" +
                        "   Here you will find mock-up recreations of an old-west general store, saloon/restaurant, post office, trading post, hotel, telegraph office, bank drugstore and more.\n";
                i = new Intent(this, show_lmarks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Macario Arnedo Park":
                imgBg = "macario";
                title = "Macario Arnedo Park";
                address = "City of San Fernando, Pampanga";
                text = "    The park is dedicated to Governor Macario Arnedo who was responsible for the transfer of the capital from Bacolor to San Fernando. Among the attractions in the park are the monument of revolutionary general Maximino H. Hizon, the statues of Chief Justice Abad Santos, Governor Honorio Ventura, Sen. Benigno Aquino and the markers of the province of Pampanga and Zoilo S. Hilario.";
                i = new Intent(this, show_lmarks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Salakot Arch":
                imgBg = "salakot";
                title = "Salakot Arch";
                address = "Angeles City, Pampanga";
                text = "    Located in front of the Clark main gate, and fashioned after a farmer's hat, this cavernous welcome landmark was built in 1979 to commemorate the historic signing of the RP-US Military Bases Agreement, which conferred complete sovereignty over all US military bases on the Philippine government. In 2005, the arch was transferred at the center of the so-called Bayanihan Park which underwent complete renovation to become a world-class public park and transport terminal.";
                i = new Intent(this, show_lmarks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "San Fernando\nRailway Station":
                imgBg = "sfRail";
                title = "San Fernando\nRailway Station";
                address = "San Fernando, Pampanga";
                text = "    San Fernando City station or simply San Fernando station is a defunct railway station of the PNR Northrail line of Philippine National Railways. It is situated San Fernando, Pampanga. Historically, the old PNR train station was the site of a stopping place for Filipino andAmerican prisoners of war during the Bataan death march in 1942.";
                i = new Intent(this, show_lmarks.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "President Roxas Marker":
                imgBg = "roxas";
                title = "President Roxas Marker";
                address = "Clark, Pampanga";
                text = "    Situated in front of the 13th Air Force building, this marker signifies the exact location where then President Manuel Roxas - 1st Chief Executive of the Philippine Republic - suffered a heart attack while delivering a speech before the US military personnel on April 15, 1948. President Roxas died at the quarter of 13th Air Force commander, Maj. Eugene L. Eubanks.";
                i = new Intent(this, show_lmarks.class);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lmarks, menu);
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

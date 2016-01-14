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

public class cultural extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultural);
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
               /*show gabaldon*/
            case "Gabaldon Schoolhouse":
                imgBg="gabaldon";
                title = "Gabaldon Schoolhouse";
                address = "City of San Fernando, Pampanga";
                text = "The Gabaldon school buildings(now known as Pampanga High School) named after Assemblyman Isauro Gabaldon of Nueva Ecija who authored Act 1801 that set aside P1 million for their construction, are known as the \"Parthenons\" of the golden years of Philippine public education system. Three, perhaps more, generations of Filipinos learned the Three Rs (reading, 'riting and 'rithmetic) in these historic structures which now count by the thousands and are spread out all over the archipelago.\n";
                i = new Intent(this, showPlaces.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            /*show nayong pilipino*/
            case "Nayong Pilipino sa Clark":
                imgBg="nayong_pilipino";
                title = "Nayong Pilipino sa Clark";
                address = "Centennial Rd., Clark Freeport Zone, Clark, Pampanga";
                text = "At Nayong Pilipino sa Clark, we feature our colorful culture. Visit the Precolonial and the Colonial Eras of our history. See our rendition of our mythical Malakas and Maganda. Visit the miniature replicas of our scenic and historic Philippine landmarks.\n";
                i = new Intent(this, showPlaces.class);
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
        getMenuInflater().inflate(R.menu.menu_cultural, menu);
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

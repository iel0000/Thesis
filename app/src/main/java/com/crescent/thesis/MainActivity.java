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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface font = Typeface.createFromAsset(getAssets(), "namo.ttf");

        Button touristAtt = (Button) findViewById(R.id.touristAtt);
        touristAtt.setTypeface(font);

        Button about = (Button) findViewById(R.id.aboutPampanga);
        about.setTypeface(font);

        Button credits = (Button) findViewById(R.id.credits);
        credits.setTypeface(font);

        Button map = (Button) findViewById(R.id.map);
        map.setTypeface(font);

        Button quit = (Button) findViewById(R.id.quit);
        quit.setTypeface(font);
    }
       // touristAtt.setOnClickListener(new View.OnClickListener() {
           /* public void onClick(View view) {
                    String coord1 = "15.1680832";
                    String coord2 = "120.5795193";
                    String marker ="SM Clark";
                    Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                    i.putExtra("coordX",coord1);
                    i.putExtra("coordY",coord2);
                    i.putExtra("marker",marker);
                    startActivity(i);
            }
        });*/

           public void showSubMenu (View view)
           {
               AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
               String button_test;
               button_test =((Button) view).getText().toString();

               if (button_test.equals("       Tourist\n   Attractions"))
               {
                   Intent i= new Intent(this,tourist_att_menu.class);
                   startActivity(i);
                   view.startAnimation(buttonClick);
               }
               else if(button_test.equals("Show Map      "))
               {
                   Intent i = new Intent(getApplicationContext(), MapsActivity.class);
                   String coord1 = "15.156692";
                   String coord2 = "120.5952847";
                   String marker ="Pampanga";
                   i.putExtra("coordX",coord1);
                   i.putExtra("coordY",coord2);
                   i.putExtra("marker",marker);
                   startActivity(i);
               }

               else if (button_test.equals("      Quit"))
               {
                   finish();
                   System.exit(0);
               }
              // Intent i = new Intent(getApplicationContext(), tourist_att_menu.class);
              // startActivity(i);
           }

       // });


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}

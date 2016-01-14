package com.crescent.thesis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

public class lwonders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lwonders);
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

            case "Abe's Farm\n(Events Village Country\n Cuisine and Spa)":
                imgBg="abesfarm";
                title = "Abe's Farm";
                address = "(Events Village Country Cuisine and Spa)";
                text = "Enjoy the culinary delights of Abe Restaurant right where it comes from - the gourmet province of Pampanga, in the town of Magalang where the famed writer and artist Abe Aguilar Cruz first saw the light of day and majestic beauty of Mt. Arayat.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address",address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Bale Dutung":
                imgBg="baleDutung";
                title = "Bale Dutung";
                address = "(Wooden House by Claude Tayag)";
                text = "A must-see in the province of Pampanga is Claude Tayag's residence or more popularly known as Bale Dutung in Villa Gloria, Angeles City. A P1800 per head Kapampangan feast has to be pre-arranged as well and there must have at least 12 persons in a group.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Candaba Hanging Bridge":
                imgBg="candabaHangingBridge";
                title = "Candaba Hanging Bridge";
                address = "Candaba, Pampanga";
                text = "It is known as the Candaba Suspension Bridge. The bridge's design and framework were patterned after the famous San Francisco Bridge in the U.S.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Clark Education City":
                imgBg="clarkEduc";
                title = "Clark Education City\n(formerly Clark Expo)";
                address = "Clark, Pampanga";
                text = "With an initial investment of USD$60m, Clark Education City has transformed the more than 300,000 sqm campus of the former Expo Pilipino (or Clark Expo) into a 100% Australian-based learning environment that is suitable for both education and living experience.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Clark Expo":
                imgBg="clarkExpo";
                title = "Clark Expo\n(now Clark Education City)";
                address = "Clark, Pampanga";
                text = "Clark Expo (formerly Expo Pilipino)in 1998 became the Philippine National Centennial Exposition and centerpiece of the commemoration of the 100th anniversary of the declaration of Philippine Independence on June 12, 1898. The exposition is a celebration of the Filipino's history, culture, and achievements in the past 100 years, as well as aspirations for the next millennium.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Clark Freeport Zone":
                imgBg="clarkFreeport";
                title = "Clark Freeport Zone";
                address = "Clark, Pampanga";
                text = "Known as Clark Air Base before 1991, Clark was once the biggest American air base facility outside the United States as it served as a major destination and refuel/ transit point for US military aircrafts within the Asia-Pacific Region. With the expiration of the Philippine-US Military Bases Agreement in 1991, Clark was turned over to the Philippine government and declared a special economic zone.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Dara Falls":
                imgBg="daraFalls";
                title = "Dara Falls";
                address = "Porac, Pampanga)";
                text = "An ideal place for picnickers. Its waterfall basin has a depth of 100 feet.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Del-Marco Marble\nMarble Products":
                imgBg="delMarcoMarble";
                title = "Del-Marco Marble\nMarble Products";
                address = "Friendship Hwy., Angeles City, Angeles City";
                text = "Innovative designs produced with precision craftsmanship. International selection of marble and granite varieties. Steel reinforcement permanently embedded for additional strength. Stoned carved and frabricated to the highest technical standards\n";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Dinosaurs Island":
                imgBg="dinoIsland";
                title = "Dinosaurs Island";
                address = "Clark, Pampanga";
                text = "Clarkland is a park museum that is designed to offer visitors a unique interactive learning experience. It is situated in a 20,000 thousand square meter forested land with century old acacia trees. It offers 4 major attractions where guests will experience a one of a kind educational entertainment.\n";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Diosdado Macapagal\nIntl Airport":
                imgBg="diosMac";
                title = "Diosdado Macapagal\nIntl Airport";
                address = "Clark, Pampanga";
                text = "DMIA, a sprawling 2,500 hectare area, has two 3.2 km long runways which are capable of accommodating wide bodied aircraft like the Boeing 747s, Airbus 300 series and military cargo planes, including the C-5 galaxy, a wide ramp area, apron and taxiway facilities as required for world-class standards.";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Everybody's Cafe":
                imgBg="evCafe";
                title = "Everybody's Cafe";
                address = "(Authentic Capampangan Cuisine)";
                text = "Everybody's Cafe is where Kapampangan food is available everyday in their turo-turo style display. Try out the pako salad, calderetang baka, morcon, chicharon bulaklak, tortang bangus, inihaw na hito or bulalo soup. For the brave, go further and savor the buro with hito (fermented fish paste with catfish), betute (deep-fried stuffed frog), camaru (fried cricket adobo), dumara (wild duck adobo) or pindang damulag (carabeef tapa).\n";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Hilaga Cultural Village":
                imgBg="hilCultVil";
                title = "Hilaga Cultural Village";
                address = "City of San Fernando, Pampanga";
                text = "Located at the mouth of the San Fernando Toll Exit along the North Luzon Expressway, North Philippines Hilaga (formerly Paskuhan Village) was transformed into a cultural, historical, tourism, trade, and entertainment village by former Secretary Richard J. Gordon in 2003. Its design and concept make it a virtual show window to the cultural and historical heritage of the four regions of the North Philippines as well as a showcase for their indigenous products, and arts and crafts.\n";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Pampanga's Best":
                imgBg="pampBest";
                title = "Pampanga's Best";
                address = "Brgy., dela Paz Norte, City of San Fernando, Pampanga";
                text = "The story goes that Mrs. Lolita O. Hizon’'s neighbor, a meat vendor, had some unsold pork at the end of a market day and, not wanting to let these spoil, asked Mrs. Hizon'’s help in cooking them. Mrs. Hizon came up with a formula to cure the meat; she revised the traditional Capampangan pindang (fermented pork), causing the pork to acquire that unique salty-sweet taste that we have all come to love. She called it tocino, derived from a Spanish delicacy that is sweet.\n";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Pampanga Agricultural College":
                imgBg="psau";
                title = "Pampanga Agricultural\nCollege";
                address = "Magalang, Pampanga";
                text = "Located at the foot of Mt. Arayat, this state-owned college is the center for agri-based education in the province. It has model farms, housing facilities for its faculty, conference pavilion and a swimming pool for local residents. Its prestine natural environment make way for a relaxing and rejuvenating experience.\n";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Sisig sa Pampanga":
                imgBg="sisig";
                title = "Sisig sa Pampanga";
                address = "Angeles City, Pampanga";
                text = "THE SISIG STORY: The first time that sisig was ever recorded in history was in 1732, in a Kapampangan dictionary compiled by an Augustinian friar, Diego Bergaño. (The Spanish missionary served as parish priest of Mexico, Pampanga in 1725-1731, where he most likely encountered the dish.)\n";
                i = new Intent(this, show_lwonders.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("address",address);
                i.putExtra("text",text);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Basa Air Base":
                imgBg="basaAir";
                title = "Basa Air Base";
                address = "Floridablanca, Pampanga";
                text = "Basa Air Base had its humble beginnings as a small airstrip built by the US Army Air Corps before the Second World War and was named Floridablanca Air Field. At the outbreak of the Pacific War on December 8, 1941, the air field suffered heavy damage under the Japanese bombers and zero fighters. It then became a major base of the Japanese during the occupation. ";
                i = new Intent(this, show_lwonders.class);
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
        getMenuInflater().inflate(R.menu.menu_lwonders, menu);
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

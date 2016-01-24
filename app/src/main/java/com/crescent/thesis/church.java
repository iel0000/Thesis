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

public class church extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_church);
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
            case "Holy Rosary\nParish Church":
                imgBg = "holy_rosary";
                title = "Holy Rosary\nParish Church";
                address = "Saint Joseph Street, Angeles, Central Luzon";
                text = "    Located at the intersection of Sto. Rosario and Sto. Entierro Streets, the Holy Rosary Church was constructed from 1877 to 1896 by the townspeople of Angeles by forced labor system known as \"polos y servicios\" imposed by the Spanish colonial government. From 1899 to 1900 the church was used by the US Army as a military hospital.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Immaculate Conception\nParish Church":
                imgBg = "immaculate";
                title = "Immaculate Conception\nParish Church";
                address = "Guagua, Pampanga";
                text = "    The Immaculate Conception parish church, also known as the Guagua Church, is a 17th-century Baroque church located at Brgy. Plaza Burgos,Guagua, Pampanga, Philippines. In 1982, a historical marker bearing the brief history of the church was installed on the facade by the church by the National Historical Committee, precursor of the National Historical Commission of the Philippines. Today, the church is under the care of the Immaculate Conception parish of the Roman Catholic Archdiocese of San Fernando.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Metropolitan Catherdral of San Fernando":
                imgBg = "metropolitan";
                title = "Metropolitan Catherdral\nof San Fernando";
                address = "City of San Fernando,Pampanga";
                text = "    In 1755 the first structure of wood and thatch was built on this site by theAugustinian friars under the patronage of San Fernando III, King of Castile. Fray Sebastian Moreno, O.S.A. was its first cura parroco. On October 17, 1757, townsfolk petitioned the governor-general for exemptions from tribute to enable them to build the church and convent.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Nuestra Senyora del\nPila Parish Church":
                imgBg = "nuestra";
                title = "Nuestra Senyora del\nPila Parish Church";
                address = "San Juan, San Simon,Pampanga";
                text = "    Also known as the San Simon Church, is a 19th-century Baroque church located at Barangay San Juan, San Simon, Pampanga, Philippines. The parish church, under the protection of its patron saints, the Virgin of the Pillar and Saint Peter, is under the Roman Catholic Archdiocese of San Fernando.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Our Lady of Divine\nGrace Parish Church":
                imgBg = "lady_of_divine";
                title = "Our Lady of Divine\\nGrace Parish Church";
                address = "Mabalacat, Pampanga";
                text = "    This church was said to have been established in the year 1768, but a more realistic date would be around the early 1830s. The oldest bell in the parish is dated 1835, during the term of Fr. Jose Varela, the town’s first cura parocco. Cast by 19th c. Quiapo bell maker, Mac.(ario) E Los Angeles, the bell pre-dates those cast by the more renown Hilario Sunico. A second bell, dated 1846 is dedicated to Nuestra Señora de Grasia ( as spelled). It is certain therefore that a structure of more permanent materials must have existed earlier to house these bells.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "San Guillermo\nParish Church":
                imgBg = "guillermo";
                title = "San Guillermo\nParish Church";
                address = "Bacolor, Pampanga";
                text = "    San Guillermo Parish church is one of the oldest and largest churches in Pampanga. It was constructed by the Augustinian friars in 1576 on the lot of Don Guillermo Manabat, a rich landlord believed to be the founder of Bacolor.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "San Luis Church":
                imgBg = "san_luis";
                title = "San Luis Church";
                address = "San Luis, Pampanga";
                text = "    The San Luis Church (San Luis Gonzaga Parish) is located in a place that used to be called Cabagsac, referring to the proliferation of fruit bats. In fact, today, a fishnet is permanently installed high above the altar precisely to catch thousands of bats that are roosting inside the church. The interior is dark, has an ambience of antiquity and mystery and overpowering odor of bat urine.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Apalit Parochial Church":
                imgBg = "apalit";
                title = "Apalit Parochial Church";
                address = "Apalit, Pampanga";
                text = "    Located at the town plaza, it was built in the year 1629 - 1630 and designed in Baroque architecture. The painting on the ceilings and dome are filled with beautiful paintings and are worth studying. The style of the facade is reminiscent of European neo-classic churches.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "St. Andrew\nParish Church":
                imgBg = "andrew";
                title = "St. Andrew\nParish Church";
                address = "Candaba, Pampanga";
                text = "    St. Andrew Parish Church (Candaba) - The simplicity of line and scarcity of ornamentation are the main traits of the facade of this church, the triangular pediment with its protruding center helps maintain the simplicity of line. A new feature of the facade is the depressed three-centered arches of the windows on the second level. The second level is separated by a cornice decorated with geometric designs.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "St. Anne\nParish Church":
                imgBg = "anne";
                title = "St. Anne\nParish Church";
                address = "Sta. Ana, Pampanga";
                text = "    St. Anne Parish Church (Sta. Ana) - The church is 58m long, 14m wide and 13 m high. The recently applied coat of red and white paint has turned this centuries old church into a gaudy 20th century anomaly. The massive hexagonal four-storey bellower has blind and open recesses, keeping with the symmetry of the facade. It ends in a balustrated dome topped by a cross.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "San Agustin Church":
                imgBg = "agustin";
                title = "San Agustin Church";
                address = "San Nicolas 1st,Lubao,Pampanga";
                text = "    Also known as the Lubao church, is a 17th-century Neo-classic, Spanish stone and brick church located at Brgy. San Nicolas I, Lubao, Pampanga, Philippines. In 1952, a historical marker bearing a brief history of the structure was installed on the facade of the church by the Historical Committee of the Philippines, precursor of the National Historical Commission of the Philippines. In 2013, the church has been declared by theNational Museum of the Philippines as an Important Cultural Property.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "San Bartolome Church":
                imgBg = "bartolome";
                title = "San Bartolome Church";
                address = "Brgy. San Nicolas I, Magalang,Pampanga";
                text = "    Also referred to as the Magalang Church, is a 19th-century Baroque church located at Brgy. San Nicolas I,Magalang, Pampanga, Philippines. The parish church, dedicated to Saint Bartholomew, is under the Roman Catholic Archdiocese of San Fernando.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "St. Catherine \nAlexandra Church":
                imgBg = "cath";
                title = "St. Catherine \nAlexandra Church";
                address = "Porac, Pampanga";
                text = "    St. Catherine Parish Church (Arayat) - One of the oldest churches in Pampanga and known for its classical architectures. No records on builder and date of construction of present church. The church measures 70m. long, 16m. wide and 12m. high. The presbytery, ceiling and the main altar have been recently renovated. The original stone of the facade has been covered with cement and painted white.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "St. Joseph\nParish Church":
                imgBg = "joseph";
                title = "St. Joseph\nParish Church";
                address = "Floridablanca, Pampanga";
                text = "    St. Joseph Parish Church (Floridablanca) - Pseudo-Gothic elements blend subtly along the classic design of the structure. The flame-like arch of the main entrance and lateral doors provide contrast to the triangular pediment. The structures are simple and the large voids lend drama to an otherwise bare design.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Sta. Lucia\nParish Church":
                imgBg = "lucia";
                title = "Sta. Lucia\nParish Church";
                address = "Sasmoan, Pampanga";
                text = "    Sta. Lucia Parish Church (Sasmoan) - The church is 45m long and 11m wide and 6m high. An author described it as \"very beautiful and of very good condition\". When looking at the complex of church and convent, one is stuck by the impression that the round and rectangular openings are capriciously aligned. This makes the facade both interesting and unique. Attracts devotees from all over the provinces to honor Sta. Lucia and ask their petitions. She is believed to be a miraculous saint.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;
            case "Minalin Church":
                imgBg = "minalin";
                title = "Minalin Church";
                address = "Minalin, Pampanga";
                text = "    The Minalin Church (Sta. Monica Parish), located on the town's highest ground called burul (the town had moved to its present site due to flooding, hence 'minalis,' later corrupted to minalin) but despite its elevation, silt from the river has already invaded its beautiful church. The peeled palitada reveals the original red brick walls, giving the church its unique old-rose touches. The ancient mural paintings in the adjoining convent, one of which is a primitive-looking map with details of trees, ducks, crows, a boat, a hunter and a crocodile.";
                i = new Intent(this, show_church.class);
                i.putExtra("img",imgBg);
                i.putExtra("title",title);
                i.putExtra("text",text);
                i.putExtra("address", address);
                startActivity(i);
                view.startAnimation(buttonClick);
                break;

        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_church, menu);
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

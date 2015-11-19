package brainbreaker.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button app1;
    Button app2;
    Button app3;
    Button app4;
    Button app5;
    Button app6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app1 = (Button) findViewById(R.id.spotifystreamer);
        app2 = (Button) findViewById(R.id.scoresapp);
        app3 = (Button) findViewById(R.id.library);
        app4 = (Button) findViewById(R.id.builditbigger);
        app5 = (Button) findViewById(R.id.xyzreader);
        app6 = (Button) findViewById(R.id.capstone);
        
        app1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my SPOTIFY STREAMER App.", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        app2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my SCORES App.", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        app3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my LIBRARY App.", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        app4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my BUILD IT BIGGER App.", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        app5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my XYZ READER App.", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        app6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my CAPSTONE App.", Toast.LENGTH_SHORT)
                        .show();
            }
        });


    }

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

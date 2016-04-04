package yulongproductions.com.minmax;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Button minMax;
    private TextView display;
    private Nums mNums;

    public static final int RANGE = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minMax = (Button) findViewById(R.id.minMaxButton);
        display = (TextView) findViewById(R.id.display);
        display.setText((int) (Math.random() * RANGE) + "");
        final int displayNum = Integer.parseInt(display.getText().toString());
        mNums = new Nums();

        minMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "The min is " + mNums.getMin(displayNum);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });

        minMax.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String message = "The max is " + mNums.getMax(displayNum);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
                return true;
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

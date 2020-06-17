package bts.fr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumber = null;
    private Button button_meteo;
    private Ville ville;
    private TextView test;
    private Switch sun;
    private Switch cloud;
    private Switch rain;
    private Switch snow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber = (EditText) findViewById(R.id.temperature);
        button_meteo = (Button) findViewById(R.id.button_meteo1);
        test = (TextView) findViewById(R.id.test);
        sun = (Switch) findViewById(R.id.sun);
        cloud = (Switch) findViewById(R.id.cloud);
        rain = (Switch) findViewById(R.id.rain);
        snow = (Switch) findViewById(R.id.snow);


        button_meteo.setOnClickListener(buttonListener);

        init();

    }
    private void init() {

    }
    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int meteo = 0;


            String temperature = txtNumber.getText().toString();
            if (sun.isChecked()) {
                meteo = 1;
            }
            else if (sun.isChecked())
                meteo = 2;
            else if (rain.isChecked())
                meteo = 3;
            else if (snow.isChecked())
                meteo = 4;
            ville = new Ville (temperature, meteo);
            temperature = String.valueOf(meteo);
            test.setText(temperature);

            txtNumber.setText("");
            sun.setChecked(false);
            rain.setChecked(false);
            cloud.setChecked(false);

            //page1(),
            //d


        }
    };
    private void page1 (View view) {
        startActivity(new Intent(this, page_2.class));
    }
}

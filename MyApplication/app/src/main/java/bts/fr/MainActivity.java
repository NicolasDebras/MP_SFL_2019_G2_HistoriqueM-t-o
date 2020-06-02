package bts.fr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNumber = null;
    private Button button_meteo;
    private Ville ville;
    private TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber = (EditText) findViewById(R.id.temperature);
        button_meteo = (Button) findViewById(R.id.button_meteo1);
        test = (TextView) findViewById(R.id.test);

        button_meteo.setOnClickListener(buttonListener);

        init();

    }
    private void init() {

    }
    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String temperature = txtNumber.getText().toString();
            ville = new Ville (temperature);
            test.setText(temperature);

            txtNumber.setText("");

        }
    };
}

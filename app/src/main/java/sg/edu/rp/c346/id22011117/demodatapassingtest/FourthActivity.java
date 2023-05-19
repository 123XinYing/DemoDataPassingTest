package sg.edu.rp.c346.id22011117.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    //Step 1
    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        // Step 2
        tvDouble = findViewById(R.id.textViewPassDouble);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 99.99);
        tvDouble.setText("Double value received is: " + value);
    }
}
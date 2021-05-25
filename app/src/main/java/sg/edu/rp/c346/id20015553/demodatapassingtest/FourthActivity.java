package sg.edu.rp.c346.id20015553.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        textView = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        Double value = intentReceived.getDoubleExtra("value", 99.99);
        textView.setText("Double value received is: " + value);
    }
}
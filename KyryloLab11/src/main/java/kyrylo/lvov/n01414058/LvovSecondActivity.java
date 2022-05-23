package kyrylo.lvov.n01414058;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LvovSecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvov_second);

        TextView textView = findViewById(R.id.kyryloSecondScreenText);

        String value = getIntent().getStringExtra("message");

        textView.setText(value);
    }
}
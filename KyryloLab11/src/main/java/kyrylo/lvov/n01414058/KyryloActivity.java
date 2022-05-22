// Kyrylo Lvov n01414058 section B
package kyrylo.lvov.n01414058;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class KyryloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.kyryloWebButton:
                Context websiteContext = getApplicationContext();
                Toast websiteToast = Toast.makeText(websiteContext, getString(R.string.toast_message), Toast.LENGTH_SHORT);

                websiteToast.show();
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.jetbrains.com/idea/"));
                startActivity(intent);
                break;
            case R.id.kyryloProcessButton:
                EditText editText = findViewById(R.id.kyryloEditText);
                String text = editText.getText().toString();
                Context processContext = getApplicationContext();
                Toast processToast = Toast.makeText(processContext, text, Toast.LENGTH_SHORT);

                processToast.show();
        }
    }
}
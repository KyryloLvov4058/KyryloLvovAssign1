// Kyrylo Lvov n01414058 section B
package kyrylo.lvov.n01414058;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class KyryloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPause() {
        super.onPause();
        Log.d("Background", "Kyrylo Lvov n01414058");
    }

    public void callIntent(View view) {
        Intent intent = null;
        EditText editText = findViewById(R.id.kyryloEditText);
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
                String text = editText.getText().toString();

                Context processContext = getApplicationContext();
                Toast processToast = Toast.makeText(processContext, text, Toast.LENGTH_SHORT);

                processToast.show();
                break;
            case R.id.kyryloLaunchButton:
                View parentLayout = findViewById(android.R.id.content);
                Snackbar.make(parentLayout, R.string.snackbar_text, Snackbar.LENGTH_LONG)
                        .setAction(R.string.snackbar_action, new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String passText = editText.getText().toString();
                                Intent snackIntent = new Intent(KyryloActivity.this, LvovSecondActivity.class);
                                snackIntent.putExtra("message", passText);

                                startActivity(snackIntent);
                            }
                        })
                        .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                        .show();
                break;
            default:
                Context defaultContext = getApplicationContext();
                Toast defaultToast = Toast.makeText(defaultContext, getString(R.string.toast_message), Toast.LENGTH_SHORT);

                defaultToast.show();
                break;

        }
    }
}
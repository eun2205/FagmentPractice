package example.tacademy.fagmentpractice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import example.tacademy.fagmentpractice.Fragment.OneFragment;
import example.tacademy.fagmentpractice.Fragment.ThreeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ThreeFragment())
                    .commit();
        }
    }

    public void changeSignup() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new OneFragment())
                .addToBackStack(null)
                .commit();
    }

    public void moveActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

package UTS.musique.cindyaristawati.umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ToProfilePage(View view) {
        Intent intent = new Intent(MainActivity.this, Profile.class);
        MainActivity.this.startActivity(intent);
    }

    public void ToLoginPage(View view) {
        Intent intent = new Intent(MainActivity.this, Login.class);
        MainActivity.this.startActivity(intent);
    }
}
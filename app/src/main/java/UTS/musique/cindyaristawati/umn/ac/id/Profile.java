package UTS.musique.cindyaristawati.umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void ToReferencePage(View view) {
        Intent intent = new Intent(Profile.this, ReferencePage.class);
        Profile.this.startActivity(intent);
    }

    public void ToMain(View view) {
        Intent intent = new Intent(Profile.this, MainActivity.class);
        Profile.this.startActivity(intent);
    }


}
package UTS.musique.cindyaristawati.umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ReferencePage extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference_page);

        textView = findViewById(R.id.LoginFormReference);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.MusicPlayerReference);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.ImageViewReference1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.ImageViewReference2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.PopupMenu1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.PopupMenu2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        textView = findViewById(R.id.WelcomeDialog);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void ToMain(View view) {
        Intent intent = new Intent(ReferencePage.this, Profile.class);
        ReferencePage.this.startActivity(intent);
    }
}
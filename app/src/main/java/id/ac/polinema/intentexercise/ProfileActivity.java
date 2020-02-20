package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import model.User;

public class ProfileActivity extends AppCompatActivity {
    private TextView fullName;
    private TextView email;
    private TextView homePage;
    private TextView aboutYou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        fullName = findViewById(R.id.label_fullname);
        email = findViewById(R.id.label_email);
        homePage = findViewById(R.id.label_homepage);
        aboutYou = findViewById(R.id.label_about);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            User data = getIntent().getParcelableExtra("user");
            aboutYou.setText(data.getAboutYou());
            fullName.setText(data.getFullName());
            email.setText(data.getEmail());
            homePage.setText(data.getHomePage());
        }
    }
}

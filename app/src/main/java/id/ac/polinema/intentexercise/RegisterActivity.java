package id.ac.polinema.intentexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import model.User;

public class RegisterActivity extends AppCompatActivity {
    private EditText fullName;
    private EditText email;
    private EditText password;
    private EditText confirmPass;
    private EditText homePage;
    private EditText aboutYou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fullName = findViewById(R.id.text_fullname);
        email = findViewById(R.id.text_email);
        password = findViewById(R.id.text_password);
        confirmPass = findViewById(R.id.text_confirm_password);
        homePage = findViewById(R.id.text_homepage);
        aboutYou = findViewById(R.id.text_about);
    }

//    public void handleOk(View view) {
//        Intent intent = new Intent(this, ProfileActivity.class);
//        startActivity(intent);
//    }

    public void handleOK(View view) {
        String fullnameInput = fullName.getText().toString();
        String emailInput = email.getText().toString();
        String passwordInput = password.getText().toString();
        String confirm = confirmPass.getText().toString();
        String homePageInput = homePage.getText().toString();
        String aboutyou = aboutYou.getText().toString();

        User user = new User(fullnameInput, emailInput, passwordInput, confirm,homePageInput, aboutyou);
        if(!passwordInput.equals(confirmPass)){
            Toast.makeText(this, "Masukkan password", Toast.LENGTH_SHORT).show();
        } else{
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("user", user);
            startActivity(intent);
        }

    }
}

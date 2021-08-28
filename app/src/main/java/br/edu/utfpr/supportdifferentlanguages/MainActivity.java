package br.edu.utfpr.supportdifferentlanguages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFirstName, editTextLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);

        setTitle(getString(R.string.new_record));

        Toast.makeText(this,
                R.string.welcome_message,
                Toast.LENGTH_LONG).show();
    }

    public void submit(View view) {
        String firstName = editTextFirstName.getText().toString();
        String lastName = editTextLastName.getText().toString();

        Toast.makeText(this,
                getString(R.string.full_name,firstName, lastName),
                Toast.LENGTH_LONG).show();
    }

    public void clear(View view) {
        editTextFirstName.setText(null);
        editTextLastName.setText(null);

        editTextFirstName.requestFocus();
    }
}
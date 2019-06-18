package com.example.accountex;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.accountex.Adapter.CountryAdapter;
import com.example.accountex.Adapter.StateAdapter;
import com.example.accountex.Model.CountryRow;
import com.example.accountex.Model.StateRow;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView login, login2;
    EditText edit_fname, edit_lname, edit_locality, edit_house, edit_district,
            edit_phone, edit_mobile, edit_username, edit_password, edit_password2;
    Button signup;
    RadioGroup rd_gender;
    RadioButton rd_male, rd_female;
    Spinner spinner_state, spinner_country;

    List<StateRow> data;
    List<CountryRow> data2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();

        Resources resources = getResources();
        String[] india_states = resources.getStringArray(R.array.india_states);

        for (int i = 0; i < 36; i++) {
            data.add(new StateRow(india_states[i]));
        }
        spinner_state = findViewById(R.id.spinner_state);
        spinner_state.setAdapter(new StateAdapter(this, data));

        data2 = new ArrayList<>();
        Resources resources1 = getResources();

        String[] countries_array = resources.getStringArray(R.array.countries_array);
        for (int i2 = 0; i2 < 240; i2++) {
            data2.add(new CountryRow(countries_array[i2]));
        }
        spinner_country = findViewById(R.id.spinner_country);
        spinner_country.setAdapter(new CountryAdapter(this,data2));

        login = (TextView) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        login2 = (TextView) findViewById(R.id.login2);
        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}

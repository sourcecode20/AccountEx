package com.example.accountex;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
            edit_father_name, edit_mother_name, edit_phone, edit_mobile, edit_username,
            edit_password, edit_password2;
    Button signup;
    Intent fname, lname, father_name, mother_name, locality, house, district, phone, mobile;
    RadioGroup rd_gender;
    RadioButton rd_male, rd_female;
    Spinner spinner_state, spinner_country;
    List<StateRow> data;
    List<CountryRow> data2;

    String state,country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        finalAllViewId();

        data = new ArrayList<>();

        Resources resources = getResources();
        String[] india_states = resources.getStringArray(R.array.india_states);

        for (int i = 0; i < 36; i++) {
            data.add(new StateRow(india_states[i]));
        }
        spinner_state.setAdapter(new StateAdapter(this, data));

        spinner_state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                RelativeLayout linearLayout = (RelativeLayout) spinner_state.getSelectedView();
                TextView textView = linearLayout.findViewById(R.id.state);
                state = textView.getText().toString();
                Toast.makeText(MainActivity.this, "" + state, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        data2 = new ArrayList<>();
        Resources resources1 = getResources();

        String[] countries_array = resources.getStringArray(R.array.countries_array);
        for (int i2 = 0; i2 < 240; i2++) {
            data2.add(new CountryRow(countries_array[i2]));
        }

        spinner_country = findViewById(R.id.spinner_country);

        spinner_country = findViewById(R.id.spinner_country);
        spinner_country.setAdapter(new CountryAdapter(this, data2));

        spinner_country.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                RelativeLayout linearLayout = (RelativeLayout) spinner_country.getSelectedView();
                TextView textView = linearLayout.findViewById(R.id.country);
                country = textView.getText().toString();
                Toast.makeText(MainActivity.this, "" + country, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




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

        rd_gender = findViewById(R.id.rd_gender);

        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = rd_gender.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(selectedId);

                Intent intent = new Intent(getApplicationContext(), UserInfo.class);
                Bundle bundle = new Bundle();
                bundle.putString("first_name", edit_fname.getText().toString());
                bundle.putString("last_name", edit_lname.getText().toString());
                bundle.putString("father_name", edit_father_name.getText().toString());
                bundle.putString("mother_name", edit_mother_name.getText().toString());
                bundle.putString("locality", edit_locality.getText().toString());
                bundle.putString("house", edit_house.getText().toString());
                bundle.putString("district", edit_district.getText().toString());
                bundle.putString("phone", edit_phone.getText().toString());
                bundle.putString("mobile", edit_mobile.getText().toString());
                bundle.putString("state", state);
                bundle.putString("gender", radioButton.getText().toString());
                bundle.putString("country", country);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

    }

    private void finalAllViewId() {
        signup = (Button) findViewById(R.id.signup);
        edit_fname = (EditText) findViewById(R.id.edit_first_name);
        edit_lname = (EditText) findViewById(R.id.edit_last_name);
        edit_locality = (EditText) findViewById(R.id.edit_locality_address);
        edit_house = (EditText) findViewById(R.id.edit_house_number);
        edit_district = (EditText) findViewById(R.id.edit_district);
        edit_father_name = (EditText) findViewById(R.id.edit_father_name);
        edit_mother_name = (EditText) findViewById(R.id.edit_mother_name);
        edit_phone = (EditText) findViewById(R.id.edit_phone);
        edit_mobile = (EditText) findViewById(R.id.edit_mobile);
        spinner_state = (Spinner) findViewById(R.id.spinner_state);

    }


}

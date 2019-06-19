package com.example.accountex;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserInfo extends AppCompatActivity {

    TextView first_name, last_name, fathers_name, mothers_name, user_locality, user_house, user_district, user_phone, user_mobile;
    Spinner spinner_state,spinner_country;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info);

        Bundle bundle = getIntent().getExtras();
        first_name = (TextView) findViewById(R.id.get_first_name);
        last_name = (TextView) findViewById(R.id.get_last_name);
        fathers_name = (TextView) findViewById(R.id.get_father_name);
        mothers_name = (TextView) findViewById(R.id.get_mother_name);
        user_locality = (TextView) findViewById(R.id.get_locality_address);
        user_house = (TextView) findViewById(R.id.get_house_number);
        user_district = (TextView) findViewById(R.id.get_district);
        user_phone = (TextView) findViewById(R.id.get_phone);
        user_mobile = (TextView) findViewById(R.id.get_mobile);
        spinner_state=(Spinner)findViewById(R.id.spinner_state);

        first_name.setText(bundle.getCharSequence("first_name"));
        last_name.setText(bundle.getCharSequence("last_name"));
        fathers_name.setText(bundle.getCharSequence("father_name"));
        mothers_name.setText(bundle.getCharSequence("mother_name"));
        user_locality.setText(bundle.getCharSequence("locality"));
        user_house.setText(bundle.getCharSequence("house"));
        user_district.setText(bundle.getCharSequence("district"));
        user_phone.setText(bundle.getCharSequence("phone"));
        user_mobile.setText(bundle.getCharSequence("mobile"));





    }
}

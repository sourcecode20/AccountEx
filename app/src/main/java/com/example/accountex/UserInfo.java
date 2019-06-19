package com.example.accountex;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserInfo extends AppCompatActivity {

    TextView gender,first_name, last_name, fathers_name, mothers_name, user_locality, user_house, user_district, user_phone, user_mobile,user_state,user_country;

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
        user_state=(TextView) findViewById(R.id.get_state);
        user_country=(TextView)findViewById(R.id.get_country);
        gender=(TextView)findViewById(R.id.get_gender);

        first_name.setText(bundle.getCharSequence("first_name"));
        last_name.setText(bundle.getCharSequence("last_name"));
        fathers_name.setText(bundle.getCharSequence("father_name"));
        mothers_name.setText(bundle.getCharSequence("mother_name"));
        user_locality.setText(bundle.getCharSequence("locality"));
        user_house.setText(bundle.getCharSequence("house"));
        user_district.setText(bundle.getCharSequence("district"));
        user_phone.setText(bundle.getCharSequence("phone"));
        user_mobile.setText(bundle.getCharSequence("mobile"));
        user_state.setText(bundle.getCharSequence("state"));
        user_country.setText(bundle.getCharSequence("country"));
        gender.setText(bundle.getCharSequence("gender"));



    }
}

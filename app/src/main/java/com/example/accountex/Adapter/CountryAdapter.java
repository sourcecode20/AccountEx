package com.example.accountex.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.accountex.Model.CountryRow;
import com.example.accountex.R;

import java.util.List;

public class CountryAdapter extends BaseAdapter {

    List<CountryRow> list;
    Context context;


    boolean flag = false;

    public CountryAdapter(Context context, List<CountryRow> list) {
        this.list = list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.country_row, viewGroup, false);
        final TextView country = (TextView) row.findViewById(R.id.country);
        CountryRow temp = (CountryRow) list.get(position);
        country.setText(temp.country);


        return row;
    }
}

package com.example.accountex.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.accountex.Model.StateRow;
import com.example.accountex.R;

import java.util.List;

public class StateAdapter extends BaseAdapter {
    List<StateRow> list;
    Context context;
    boolean flag = false;

    public StateAdapter(Context context, List<StateRow> list) {
        this.context = context;
        this.list = list;
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
        View row1 = inflater.inflate(R.layout.state_row, viewGroup, false);
        final TextView state = (TextView) row1.findViewById(R.id.state);
        StateRow temp = (StateRow) list.get(position);
        state.setText(temp.state);


        return row1;
    }
}

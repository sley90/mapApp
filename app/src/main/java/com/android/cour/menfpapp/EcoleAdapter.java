package com.android.cour.menfpapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.android.cour.menfpapp.model.Ecole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sley on 3/12/2018.
 */

public class EcoleAdapter extends ArrayAdapter<Ecole> {

    List<Ecole> ecoles = new ArrayList<>();
    Context mContext;
    public EcoleAdapter(@NonNull Context context, @LayoutRes int resource,  List<Ecole> objects) {
        super(context, resource, objects);
        ecoles = objects;
        mContext = context;
    }

    public int getCount() {
        return super.getCount();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.ecole_list,null);
        //TextView tv_loc = convertView.findViewById(R.id.tv_loc);
        //tv_loc.setText(ecoles.get(position).getDesciption());
        //TextView tv_nom = convertView.findViewById(R.id.tv_nom);
        //tv_nom.setText(ecoles.get(position).getDesciption());
        //TextView tv_nom = convertView.findViewById(R.id.tv_nom);
        //tv_nom.setText(ecoles.get(position).getDesciption());

        return convertView;
    }
}

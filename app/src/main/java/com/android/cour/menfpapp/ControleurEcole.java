package com.android.cour.menfpapp;

import android.content.ContentValues;
import android.content.Context;

import com.android.cour.menfpapp.model.Ecole;
/**
 * Created by Sley on 3/12/2018.
 */

public class ControleurEcole {
       public static DataBase dataBase;


    public void ajouterEcole(Context context, Ecole ecole) {
       // dataBase = new DataBase(context);
        ContentValues contentValues = new ContentValues();
        //contentValues.put("location", ecole.getLocation());
        dataBase.OpenConnection();
        dataBase.getConnection().insert("ecole", null,contentValues);
        dataBase.CloseConnection();

    }
}

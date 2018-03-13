package com.android.cour.menfpapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.android.cour.menfpapp.model.Ecole;

/**
 * Created by Sley on 3/11/2018.
 */

public class DataBase extends SQLiteOpenHelper{

    final static String DATABASE_NAME = "ecole.db";
    final static int DATABASE_VERSION = 1;

    SQLiteDatabase sqLiteDatabase;
    Context mContext;

    public DataBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public  void OpenConnection(){sqLiteDatabase = this.getWritableDatabase();}

    public SQLiteDatabase getConnection() {return sqLiteDatabase;}

    public  void CloseConnection() {sqLiteDatabase.close();}

    private void createTableEcole(SQLiteDatabase sqliteDatabase){
        sqliteDatabase.execSQL(Ecole.getScriptEcole());
    }
}

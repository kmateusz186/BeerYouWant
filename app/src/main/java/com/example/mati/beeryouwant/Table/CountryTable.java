package com.example.mati.beeryouwant.Table;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import com.example.mati.beeryouwant.model.Country;


public class CountryTable {
    public static final String TABLE_NAME = "country";
    //public static final String ID_COUNTRY = "id_country";
    public static final String NAME_COUNTRY = "name";

    public static void onCreate(SQLiteDatabase db){
        String CREATE_COUNTRY_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NAME_COUNTRY + " TEXT"
                + ")";
        db.execSQL(CREATE_COUNTRY_TABLE);
        onInsert(db, new Country(0,"Polska",null));
    }

    public static void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        CountryTable.onCreate(db);
    }

    public static void onInsert(SQLiteDatabase db, Country country){
        ContentValues contentValues = new ContentValues();
        contentValues.put(NAME_COUNTRY, country.getNameCountry());
        db.insert(TABLE_NAME, null, contentValues);
    }
}

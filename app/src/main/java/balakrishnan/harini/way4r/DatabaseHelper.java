package balakrishnan.harini.way4r;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


/**
 * Created by harinibalakrishnan on 4/12/18.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Way4r.db";
    private static final String TABLE_NAME = "markersList";
    private static final String ID = "id";
    private static final String TITLE = "title";
    private static final String DESCRIPTION = "description";
    private static final String ADDRESS = "address";
    private static final String LATITUDE ="latitude";
    private static final String LONGITUDE ="longitude";
    private static final String ICON = "markers";


    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + "(" +
                ID + " INTEGER PRIMARY KEY," +
                TITLE + " TEXT," +
                DESCRIPTION + " TEXT," +
                ADDRESS + " TEXT," +
                LATITUDE + " REAL," +
                LONGITUDE + " REAL," +
                ICON + " TEXT);";

        db.execSQL(createTable);
        Log.i("SQLite","========= TABLE CREATED SUCCESSFULLY =========");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    boolean addData(String title, String description, String address, Double latitude, Double longitude, String mIcon) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TITLE, title);
        contentValues.put(DESCRIPTION, description);
        contentValues.put(ADDRESS, address);
        contentValues.put(LATITUDE, latitude);
        contentValues.put(LONGITUDE, longitude);
        contentValues.put(ICON, mIcon);

        long result = db.insert(TABLE_NAME, null, contentValues);
        Log.i(contentValues.toString(),String.valueOf(result));
        //if date as inserted incorrectly it will return -1
        return result != -1;
    }

    Cursor getListContents(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data;
        data = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return data;
    }
}


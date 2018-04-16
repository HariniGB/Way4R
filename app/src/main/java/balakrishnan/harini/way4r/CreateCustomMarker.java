package balakrishnan.harini.way4r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;


/**
 * Created by harinibalakrishnan on 4/12/18.
 */

public class CreateCustomMarker extends AppCompatActivity {

    // Database
    DatabaseHelper myDB;

    // Var
    String mTitle, mIcon, mDescription, mAddress;
    Double mlat, mlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_custom_marker);
        myDB = new DatabaseHelper(this);

        Bundle extras = getIntent().getExtras();
        assert extras != null;
        mTitle = extras.getString("Title");
        mIcon =  extras.getString("Icon");
        mDescription = extras.getString("Description");
        mAddress = extras.getString("Address");
        mlat = extras.getDouble("Latitude",0);
        mlog = extras.getDouble("Longitude",0);

        if( mTitle.length()!=0 && mIcon.length()!=0 && mDescription.length()!=0){
            AddData(mTitle, mDescription, mAddress, mlat, mlog, mIcon);
            CreateCustomMarker.this.finish();
        }else {
            Toast.makeText(CreateCustomMarker.this, "Fill all the text fields!", Toast.LENGTH_LONG).show();
        }
    }
    public  void AddData(String title, String description, String address, Double lat, Double log, String mIcon ){
        boolean insertData = myDB.addData(title, description, address, lat, log, mIcon);
        if(insertData){
            Toast.makeText(this, "Data Successfully Inserted!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Something went wrong.", Toast.LENGTH_LONG).show();
        }
    }
}

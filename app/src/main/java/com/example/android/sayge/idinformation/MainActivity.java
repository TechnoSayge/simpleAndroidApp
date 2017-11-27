package com.example.android.sayge.idinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = (EditText) findViewById(R.id.etID);
        tvMessage = (TextView) findViewById(R.id.tvMessage);
    }
    public void btnSubmit_OnClick(View v)
    {
        String data = etID.getText().toString();

        String DOB = data.substring(0, 6);

        int gender = Integer.parseInt(data.charAt(6) + "");

        String sGender;

        if (gender >= 5)
            sGender = "Male";
        else
            sGender = "Female";

        int nationality = Integer.parseInt(data.charAt(10)+ "");

        String sNationality;

        if (nationality == 0)
            sNationality = "North American";
        else
            sNationality = "Permanent Resident";

        tvMessage.setText("Your information from your ID #: \n" +
                            "Date of Birth: " + DOB + "\n" +
                            "Gender: " + sGender + "\n" +
                            "Nationality: " + sNationality);


    }
}

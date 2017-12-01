package com.example.admin.threeactivitieshw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonPressed(View view) {
        switch (view.getId()) {
            case R.id.takeDisplayPicture :
                Intent intent = new Intent(this,takePictureActivity.class);
                startActivity(intent);
                break;

            case R.id.emiCalculator:
                    Intent intent1 = new Intent(this, emiCalculatorActivity.class);
                    startActivity(intent1);
                    break;

            case R.id.personForm:
                    Intent intent2 = new Intent(this,peopleFormActivity.class);
                    startActivity(intent2);
                    break;
        }
    }
}

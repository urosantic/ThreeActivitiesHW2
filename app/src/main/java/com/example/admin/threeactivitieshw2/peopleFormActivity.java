package com.example.admin.threeactivitieshw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.threeactivitieshw2.model.Person;

import java.util.ArrayList;
import java.util.List;

public class peopleFormActivity extends AppCompatActivity {

    EditText name,email,gender,age;

    ArrayList<Person> list = new ArrayList<Person>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_form);

        name = findViewById(R.id.personName);
        email = findViewById(R.id.personEmail);
        age = findViewById(R.id.personAge);
        gender = findViewById(R.id.personGender);
    }

    public void addPersonToTheList(View view) {
        String pName = name.getText().toString();
        String pEmail = email.getText().toString();
        String pAge = age.getText().toString();
        String pGender = gender.getText().toString();

        if (!(pName.equals("") || pAge.equals("") || pEmail.equals("") || pGender.equals(""))) {
            Person person = new Person(pName, pEmail, pAge, pGender);

            list.add(person);
            Toast.makeText(getApplicationContext(), "Person added", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Input can't be empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void sendList(View view) {
        Intent intent = new Intent(this,ListOfPeopleActivity.class);
        intent.putParcelableArrayListExtra("data",list);
        startActivity(intent);
    }
}

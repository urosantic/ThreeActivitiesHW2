package com.example.admin.threeactivitieshw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.threeactivitieshw2.model.Person;

import java.util.ArrayList;

public class ListOfPeopleActivity extends AppCompatActivity {

    private ArrayList<Person> list;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_people);

        list = getIntent().getParcelableArrayListExtra("data");
        layout = findViewById(R.id.linearLayoutWithinScroll);

        for (int i =0; i < list.size();i++) {
            Person person = list.get(i);
            TextView textView = new TextView(ListOfPeopleActivity.this);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );


            textView.setText("Name: " + person.getName() + "    Age: " + person.getAge() + "\n" +
                             "Email: " + person.getEmail() + "  Gender: " + person.getGender());
            layout.addView(textView,params);
        }
    }
}

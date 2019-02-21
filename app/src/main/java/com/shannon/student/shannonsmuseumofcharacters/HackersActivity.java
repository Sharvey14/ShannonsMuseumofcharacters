package com.shannon.student.shannonsmuseumofcharacters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HackersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackers);

        ArrayList<Character> hackers = new ArrayList<>();

        hackers.add(new Character("Raymond Kenney", R.drawable.raymond));
        hackers.add(new Character("Aiden Pearce", R.drawable.aiden));

        ListView listView = findViewById(R.id.hackers);
        CharacterAdapter adapter = new CharacterAdapter (this, hackers);
        listView.setAdapter(adapter);
    }
}

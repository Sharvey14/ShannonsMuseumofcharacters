package com.shannon.student.shannonsmuseumofcharacters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExhibitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibits);
    }

    public void Hack3r (View view){
        Intent i = new Intent(this, HackersActivity.class);
        startActivity(i);
    }

    public void Heroes (View view){
        Intent i = new Intent(this, LegendHeroesActivity.class);
        startActivity(i);
    }

}

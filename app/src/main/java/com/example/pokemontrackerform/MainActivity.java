package com.example.pokemontrackerform;
import androidx.constraintlayout.widget.ConstraintLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button reset, save;
    RadioGroup gender;
    Spinner levelSpin;
    EditText nationalNumber, name, species, Height, Weight, hp, attack, defense;

    View.OnClickListener resetListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            nationalNumber.setText(R.string.nationalNumber);
            name.setText(R.string.name);
            species.setText(R.string.species);
//            Height.setText(R.string.height);
//            Weight.setText(R.string.weight);

            hp.setText(R.string.hp);
            attack.setText(R.string.attack);
            defense.setText(R.string.defense);
            levelSpin.setSelection(0);
            gender.clearCheck();
        }
    };



    private Spinner levels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        levels = findViewById(R.id.Level);

        
        
    }
    private void useStringResource() {
        String[] values = getResources().getStringArray(R.array.levels);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
        levels.setAdapter(adapter);
    }



    }


   
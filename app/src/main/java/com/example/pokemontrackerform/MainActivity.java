package com.example.pokemontrackerform;
import androidx.constraintlayout.widget.ConstraintLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button resetBT;
    Button saveBT;
    RadioGroup gender;
    Spinner levels;
    EditText nationalNumberET, nameET, speciesET,HeightET, WeightET, hpET, attackET, defenseET;
    TextView nationalNumberTV,nameTV,speciesTV,genderTV,heightTV,weightTV, levelTV, hpTV ,attackTV, defenseTV;

    View.OnClickListener resetListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (view == findViewById(R.id.Reset)){
            nationalNumberET.setText("896");
            nameET.setText("Glastrier");
            speciesET.setText("Wild Horse Pokemon");
            HeightET.setText("N/A");
            WeightET.setText("800.0 kg");

            hpET.setText("0");
            attackET.setText("0");
            defenseET.setText("0");
            levels.setSelection(0);
            gender.clearCheck();


            Toast.makeText(MainActivity.this, "Everything has been reset!!!!!!", Toast.LENGTH_SHORT).show();

            } else{
            boolean check = true;
            if (nationalNumberET.getText().toString().matches("") || !(0 <= Float.valueOf(nationalNumberET.getText().toString()) && Float.valueOf(nationalNumberET.getText().toString()) <= 1010)){
                check = false;
                nationalNumberET.setTextColor(Color.RED);
            }
            if (nameET.getText().toString().matches("") || !(3 <= nameET.getText().toString().length() && nameET.getText().toString().length() <= 12)){
                check = false;
                nameTV.setTextColor(Color.RED);
            }
            if (gender.getCheckedRadioButtonId() == -1){
                check = false;
                genderTV.setTextColor(Color.RED);
            }
            if (hpET.getText().toString().matches("") || !(1 <= Float.valueOf(hpET.getText().toString()) && Float.valueOf(hpET.getText().toString()) <= 362)){
                check = false;
                //hpTV.setTextColor(getResources().getColor(R.color.red));

            }
            if (attackET.getText().toString().matches("") || !(5 <= Float.valueOf(attackET.getText().toString()) && Float.valueOf(attackET.getText().toString()) <= 526)){
                check = false;
                attackTV.setTextColor(Color.RED);
            }
            if (defenseET.getText().toString().matches("") || !(5 <= Float.valueOf(defenseET.getText().toString()) && Float.valueOf(defenseET.getText().toString()) <= 614)){
                check = false;
                defenseTV.setTextColor(Color.RED);
            }
            if (HeightET.getText().toString().matches("") || !(0.3 <= Float.valueOf(HeightET.getText().toString()) && Float.valueOf(HeightET.getText().toString()) <= 19.99)){
                check = false;
                heightTV.setTextColor(Color.RED);
            }
            if (WeightET.getText().toString().matches("") || !(0.1 <= Float.valueOf(WeightET.getText().toString()) && Float.valueOf(WeightET.getText().toString()) <= 820)){
                check = false;
                weightTV.setTextColor(Color.RED);
            }
            if (!check){
                Toast.makeText(MainActivity.this, "Please fix all fields with red labels!", Toast.LENGTH_SHORT).show();
            }else{
                nationalNumberTV.setTextColor(Color.BLACK);
                nameTV.setTextColor(Color.BLACK);
                speciesTV.setTextColor(Color.BLACK);
                genderTV.setTextColor(Color.BLACK);
                heightTV.setTextColor(Color.BLACK);
                weightTV.setTextColor(Color.BLACK);
                levelTV.setTextColor(Color.BLACK);
                hpTV.setTextColor(Color.BLACK);
                attackTV.setTextColor(Color.BLACK);
                defenseTV.setTextColor(Color.BLACK);

                Toast.makeText(MainActivity.this, "Your entry has been submitted successfully!", Toast.LENGTH_LONG).show();
            }
        }
    };
};

//    View.OnClickListener submitlistener = new View.OnClickListener(){
//
//    String hpval = hp.getText().toString();
//    if(Integer.valueof(hpval)>700){
//        //this was a bunch of if statements thingy
//        }
//
//    {
//
//
//    }
//
//}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
        levels = findViewById(R.id.Level);
        nationalNumberET = findViewById(R.id.NationalNumber);
        nameET = findViewById(R.id.Name);
        speciesET = findViewById(R.id.Species);
        HeightET = findViewById(R.id.Height);
        WeightET = findViewById(R.id.Weight);
        hpET = findViewById(R.id.HP);
        attackET = findViewById(R.id.Attack);
        defenseET = findViewById(R.id.Defense);
        gender = findViewById(R.id.Gender);
        resetBT = findViewById(R.id.Reset);
        saveBT = findViewById(R.id.Save);

//        levelTV = findViewById(R.id.levelLabel);
//        nationalNumberTV = findViewById(R.id.nationalNumberLabel);
//        nameTV = findViewById(R.id.nameLabel);
//        speciesTV = findViewById(R.id.speciesLabel);
//        heightTV = findViewById(R.id.heightLabel);
//        weightTV = findViewById(R.id.weightLabel);
//        hpTV = findViewById(R.id.hpLabel);
//        attackTV = findViewById(R.id.attackLabel);
//        defenseTV = findViewById(R.id.defenseLabel);
//        genderTV = findViewById(R.id.genderLabel);


        nationalNumberET.setText("896");
        nameET.setText("Glastrier");
        speciesET.setText("Wild Horse Pokemon");
        HeightET.setText("N/A");
        WeightET.setText("800.0 kg");

        hpET.setText("0");
        attackET.setText("0");
        defenseET.setText("0");
        resetBT.setOnClickListener(resetListener);
        saveBT.setOnClickListener(resetListener);

        //Button resetButton = findViewById(R.id.Reset);




    }
    private void useStringResource() {
        String[] values = getResources().getStringArray(R.array.levels);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
        levels.setAdapter(adapter);
    }


//    private String initialText;
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
////
//        TextView textView = findViewById(R.id.myTextView);
//        initialText = textView.getText().toString();
//    }





    }


   
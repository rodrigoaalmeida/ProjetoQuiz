package com.example.rodri.projetoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton radioBtnOneOne;
    RadioButton radioBtnOneTwo;
    RadioButton radioBtnOneThree;
    RadioButton radioBtnOneFour;
    EditText editTextTwo;
    CheckBox checkBoxThreeOne;
    CheckBox checkBoxThreeTwo;
    CheckBox checkBoxThreeThree;
    CheckBox checkBoxThreeFour;
    RadioButton radioBtnFourOne;
    RadioButton radioBtnFourTwo;
    RadioButton radioBtnFourThree;
    RadioButton radioBtnFourFour;
    CheckBox checkBoxFiveOne;
    CheckBox checkBoxFiveTwo;
    CheckBox checkBoxFiveThree;
    CheckBox checkBoxFiveFour;
    RadioButton radioBtnSixOne;
    RadioButton radioBtnSixTwo;
    RadioButton radioBtnSixThree;
    RadioButton radioBtnSixFour;
    RadioButton radioBtnSevenOne;
    RadioButton radioBtnSevenTwo;
    RadioButton radioBtnSevenThree;
    RadioButton radioBtnSevenFour;
    RadioButton radioBtnEightOne;
    RadioButton radioBtnEightTwo;
    RadioButton radioBtnEightThree;
    RadioButton radioBtnEightFour;
    RadioButton radioBtnNineOne;
    RadioButton radioBtnNineTwo;
    RadioButton radioBtnNineThree;
    RadioButton radioBtnNineFour;
    EditText editTextTen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atribuirComponenteView();
    }

    private void atribuirComponenteView(){
        radioBtnOneOne = findViewById(R.id.radio_btn_one_one);
        radioBtnOneTwo = findViewById(R.id.radio_btn_one_two);
        radioBtnOneThree = findViewById(R.id.radio_btn_one_three);
        radioBtnOneFour = findViewById(R.id.radio_btn_one_four);
        editTextTwo = findViewById(R.id.edit_text_two);
        checkBoxThreeOne = findViewById(R.id.check_box_three_one);
        checkBoxThreeTwo = findViewById(R.id.check_box_three_two);
        checkBoxThreeThree = findViewById(R.id.check_box_three_three);
        checkBoxThreeFour = findViewById(R.id.check_box_three_four);
        radioBtnFourOne = findViewById(R.id.radio_btn_four_one);
        radioBtnFourTwo = findViewById(R.id.radio_btn_four_two);
        radioBtnFourThree = findViewById(R.id.radio_btn_four_three);
        radioBtnFourFour = findViewById(R.id.radio_btn_four_four);
        checkBoxFiveOne = findViewById(R.id.check_box_five_one);
        checkBoxFiveTwo = findViewById(R.id.check_box_five_two);
        checkBoxFiveThree = findViewById(R.id.check_box_five_three);
        checkBoxFiveFour = findViewById(R.id.check_box_five_four);
        radioBtnSixOne = findViewById(R.id.radio_btn_six_one);
        radioBtnSixTwo = findViewById(R.id.radio_btn_six_two);
        radioBtnSixThree = findViewById(R.id.radio_btn_six_three);
        radioBtnSixFour = findViewById(R.id.radio_btn_six_four);
        radioBtnSevenOne = findViewById(R.id.radio_btn_seven_one);
        radioBtnSevenTwo = findViewById(R.id.radio_btn_seven_two);
        radioBtnSevenThree = findViewById(R.id.radio_btn_seven_three);
        radioBtnSevenFour = findViewById(R.id.radio_btn_seven_four);
        radioBtnEightOne = findViewById(R.id.radio_btn_eight_one);
        radioBtnEightTwo = findViewById(R.id.radio_btn_eight_two);
        radioBtnEightThree = findViewById(R.id.radio_btn_eight_three);
        radioBtnEightFour = findViewById(R.id.radio_btn_eight_four);
        radioBtnNineOne = findViewById(R.id.radio_btn_nine_one);
        radioBtnNineTwo = findViewById(R.id.radio_btn_nine_two);
        radioBtnNineThree = findViewById(R.id.radio_btn_nine_three);
        radioBtnNineFour = findViewById(R.id.radio_btn_nine_four);
        editTextTen = findViewById(R.id.edit_text_ten);
    }
}

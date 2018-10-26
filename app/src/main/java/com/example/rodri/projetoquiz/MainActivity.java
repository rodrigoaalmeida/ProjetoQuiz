package com.example.rodri.projetoquiz;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //    Declaração das variaveis globais.
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
    //    Declaração dos radios gupos e suas listas.
    RadioGroup radioGroup1;
    RadioGroup radioGroup4;
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    RadioGroup radioGroup9;
    List<RadioGroup> listaRadioGroup = new ArrayList<>();
    List<RadioButton> listRadioBtnCertos = new ArrayList<>();
    //    Criação da matriz e vetor dos CheckBox.
    CheckBox[][] matrizCheckBox = new CheckBox[2][4];
    CheckBox[] vetorCheckBoxRespostasCertas = new CheckBox[5];
    //    Variavel para pontuação do quiz.
    int pontucao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atribuirComponenteView();
        pontucao = 0;
    }

    private void atribuirComponenteView() {
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
//        Componentes para comparação das respostas trabalhando com ArrayList.
        radioGroup1 = findViewById(R.id.radio_group_one);
        radioGroup4 = findViewById(R.id.radio_group_four);
        radioGroup6 = findViewById(R.id.radio_group_six);
        radioGroup7 = findViewById(R.id.radio_group_seven);
        radioGroup8 = findViewById(R.id.radio_group_eight);
        radioGroup9 = findViewById(R.id.radio_group_nine);
        listaRadioGroup.add(radioGroup1);
        listaRadioGroup.add(radioGroup4);
        listaRadioGroup.add(radioGroup6);
        listaRadioGroup.add(radioGroup7);
        listaRadioGroup.add(radioGroup8);
        listaRadioGroup.add(radioGroup9);
//        Respostas das questões com RadioButton adicionadas a lista para comparação.
        listRadioBtnCertos.add(radioBtnOneFour);
        listRadioBtnCertos.add(radioBtnFourThree);
        listRadioBtnCertos.add(radioBtnSixFour);
        listRadioBtnCertos.add(radioBtnSevenFour);
        listRadioBtnCertos.add(radioBtnEightThree);
        listRadioBtnCertos.add(radioBtnNineOne);
//        Atribuição dos valores CheckBox a matriz para comparações.
        matrizCheckBox[0][0] = checkBoxThreeOne;
        matrizCheckBox[0][1] = checkBoxThreeTwo;
        matrizCheckBox[0][2] = checkBoxThreeThree;
        matrizCheckBox[0][3] = checkBoxThreeFour;
        matrizCheckBox[1][0] = checkBoxFiveOne;
        matrizCheckBox[1][1] = checkBoxFiveTwo;
        matrizCheckBox[1][2] = checkBoxFiveThree;
        matrizCheckBox[1][3] = checkBoxFiveFour;
//        Atribuição dos valores do vetor com as respostas do CheckBox.
        vetorCheckBoxRespostasCertas[0] = checkBoxThreeOne;
        vetorCheckBoxRespostasCertas[1] = checkBoxThreeThree;
        vetorCheckBoxRespostasCertas[2] = checkBoxFiveOne;
        vetorCheckBoxRespostasCertas[3] = checkBoxFiveTwo;
        vetorCheckBoxRespostasCertas[4] = checkBoxFiveThree;
    }

    //    Metodo chamado pelo Button finalizar, que verifica se tudo foi respondido se sim da a pontuação, do contrario manda terminar o quiz.
    public void pontuacaoQuiz(View view) {
        String pontucaoParte1 = getResources().getString(R.string.pontucao_metade);
        String pontucaoParte2 = getResources().getString(R.string.pontuacao_final);
        if (verificadorRespostaVazia()) {
            return;
        }
        compararRadioButton();
        compararCheckBox();
        opcoesDesabilitadas();
        compararEditText();
        Toast.makeText(getApplicationContext(), pontucaoParte1 + " " + pontucao + pontucaoParte2, Toast.LENGTH_LONG).show();
    }

    /**
     * Verifica se todas as questões receberam pelo menos uma resposta
     *
     * @return verificador que pode mandar seguir em frente ou mandar completar o quiz
     */
    private boolean verificadorRespostaVazia() {
        String mensErroRadioBtn = getResources().getString(R.string.erro_radio_button);
        String mensErroCheckBox = getResources().getString(R.string.erro_check_box);
        String mensErroEditText = getResources().getString(R.string.erro_edit_text);
        boolean verificador = false;
        String sQuestionTwo = editTextTwo.getText().toString();
        String sQuestionTen = editTextTen.getText().toString();
        int contRadioVazio = 0;
        int contCheckBoxVazio = 0;
        for (RadioGroup group : listaRadioGroup) {
            int vazio = group.getCheckedRadioButtonId();
            if (vazio == -1) {
                contRadioVazio++;
            }
        }
        if (contRadioVazio > 0) {
            Toast.makeText(getApplicationContext(), mensErroRadioBtn, Toast.LENGTH_SHORT).show();
            verificador = true;
        }
        if (sQuestionTwo.equals("") || sQuestionTen.equals("")) {
            Toast.makeText(getApplicationContext(), mensErroEditText, Toast.LENGTH_SHORT).show();
            verificador = true;
        }
        for (int i = 0; i < matrizCheckBox.length; i++) {
            for (int j = 0; j < matrizCheckBox[i].length; j++) {
                if (!matrizCheckBox[i][j].isChecked()) {
                    contCheckBoxVazio++;
                }
            }
        }
        if (contCheckBoxVazio > 6) {
            Toast.makeText(getApplicationContext(), mensErroCheckBox, Toast.LENGTH_SHORT).show();
            verificador = true;
        }
        return verificador;
    }

    //    Verifica as respostas do campos de texto com a resposta correta.
    private void compararEditText() {
        String respostaQuestionTwo = getResources().getString(R.string.edit_resposta_two);
        String respostaQuestionTen = getResources().getString(R.string.edit_resposta_ten);
        if (respostaQuestionTwo.equalsIgnoreCase(editTextTwo.getText().toString())) {
            pontucao += 10;
            editTextTwo.setTextColor(getResources().getColor(R.color.resposta_certa));
            editTextTwo.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            editTextTwo.setTextColor(getResources().getColor(R.color.resposta_errada));
        }
        if (respostaQuestionTen.equalsIgnoreCase(editTextTen.getText().toString())) {
            pontucao += 10;
            editTextTen.setTextColor(getResources().getColor(R.color.resposta_certa));
            editTextTen.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            editTextTen.setTextColor(getResources().getColor(R.color.resposta_errada));
        }
    }

    //    Compara as resposta marcadas com o vetor para verificar as certas.
    private void compararCheckBox() {
        for (int i = 0; i < matrizCheckBox.length; i++) {
            for (int j = 0; j < matrizCheckBox[i].length; j++) {
                if (matrizCheckBox[i][j].isChecked()) {
                    compararMatrizVetorCheckBox(i, j);
                }
            }
        }
        for (CheckBox alternativas : vetorCheckBoxRespostasCertas) {
            if (!alternativas.isChecked()) {
                alternativas.setTypeface(Typeface.DEFAULT_BOLD);
                alternativas.setTextColor(getResources().getColor(R.color.resposta_certa));
            }
        }
    }

    /**
     * Compara as resposta do metodo compararCheckBox com o vetor de respostas certas
     *
     * @param linha  pega a linha da matriz
     * @param coluna pega a coluna da matriz
     */
    private void compararMatrizVetorCheckBox(int linha, int coluna) {
        for (CheckBox alternativas : vetorCheckBoxRespostasCertas) {
            if (alternativas.equals(matrizCheckBox[linha][coluna])) {
                alternativas.setTypeface(Typeface.DEFAULT_BOLD);
                alternativas.setTextColor(getResources().getColor(R.color.resposta_certa));
                pontucao += 4;
                return;
            } else {
                matrizCheckBox[linha][coluna].setTextColor(getResources().getColor(R.color.resposta_errada));
            }
        }
    }

    //    Procura nos RadioGroup as respostas marcadas e compara com a lista de respostas.
    private void compararRadioButton() {
        for (RadioGroup group : listaRadioGroup) {
            RadioButton respostaRadioBtn = findViewById(group.getCheckedRadioButtonId());
            for (RadioButton button : listRadioBtnCertos) {
                if (button.equals(respostaRadioBtn)) {
                    pontucao += 10;
                    button.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    respostaRadioBtn.setTextColor(getResources().getColor(R.color.resposta_errada));
                }
                button.setTextColor(getResources().getColor(R.color.resposta_certa));
            }
        }
    }

    //    Desabilita tudo quando o quiz é finalizado.
    private void opcoesDesabilitadas() {
        radioBtnOneOne.setEnabled(false);
        radioBtnOneTwo.setEnabled(false);
        radioBtnOneThree.setEnabled(false);
        radioBtnOneFour.setEnabled(false);
        editTextTwo.setEnabled(false);
        checkBoxThreeOne.setEnabled(false);
        checkBoxThreeTwo.setEnabled(false);
        checkBoxThreeThree.setEnabled(false);
        checkBoxThreeFour.setEnabled(false);
        radioBtnFourOne.setEnabled(false);
        radioBtnFourTwo.setEnabled(false);
        radioBtnFourThree.setEnabled(false);
        radioBtnFourFour.setEnabled(false);
        checkBoxFiveOne.setEnabled(false);
        checkBoxFiveTwo.setEnabled(false);
        checkBoxFiveThree.setEnabled(false);
        checkBoxFiveFour.setEnabled(false);
        radioBtnSixOne.setEnabled(false);
        radioBtnSixTwo.setEnabled(false);
        radioBtnSixThree.setEnabled(false);
        radioBtnSixFour.setEnabled(false);
        radioBtnSevenOne.setEnabled(false);
        radioBtnSevenTwo.setEnabled(false);
        radioBtnSevenThree.setEnabled(false);
        radioBtnSevenFour.setEnabled(false);
        radioBtnEightOne.setEnabled(false);
        radioBtnEightTwo.setEnabled(false);
        radioBtnEightThree.setEnabled(false);
        radioBtnEightFour.setEnabled(false);
        radioBtnNineOne.setEnabled(false);
        radioBtnNineTwo.setEnabled(false);
        radioBtnNineThree.setEnabled(false);
        radioBtnNineFour.setEnabled(false);
        editTextTen.setEnabled(false);
        Button buttonEncerrar = findViewById(R.id.button_submit);
        buttonEncerrar.setEnabled(false);
    }
}

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
    private RadioButton radioBtnOneOne;
    private RadioButton radioBtnOneTwo;
    private RadioButton radioBtnOneThree;
    private RadioButton radioBtnOneFour;
    private EditText editTextTwo;
    private CheckBox checkBoxThreeOne;
    private CheckBox checkBoxThreeTwo;
    private CheckBox checkBoxThreeThree;
    private CheckBox checkBoxThreeFour;
    private RadioButton radioBtnFourOne;
    private RadioButton radioBtnFourTwo;
    private RadioButton radioBtnFourThree;
    private RadioButton radioBtnFourFour;
    private CheckBox checkBoxFiveOne;
    private CheckBox checkBoxFiveTwo;
    private CheckBox checkBoxFiveThree;
    private CheckBox checkBoxFiveFour;
    private RadioButton radioBtnSixOne;
    private RadioButton radioBtnSixTwo;
    private RadioButton radioBtnSixThree;
    private RadioButton radioBtnSixFour;
    private RadioButton radioBtnSevenOne;
    private RadioButton radioBtnSevenTwo;
    private RadioButton radioBtnSevenThree;
    private RadioButton radioBtnSevenFour;
    private RadioButton radioBtnEightOne;
    private RadioButton radioBtnEightTwo;
    private RadioButton radioBtnEightThree;
    private RadioButton radioBtnEightFour;
    private RadioButton radioBtnNineOne;
    private RadioButton radioBtnNineTwo;
    private RadioButton radioBtnNineThree;
    private RadioButton radioBtnNineFour;
    private EditText editTextTen;
    //    Declaração dos radios gupos e suas listas.
    private List<RadioGroup> listaRadioGroup = new ArrayList<>();
    private List<RadioButton> listRadioBtnCertos = new ArrayList<>();
    //    Criação da matriz e vetor dos CheckBox.
    private CheckBox[][] matrizCheckBox = new CheckBox[2][4];
    private CheckBox[] vetorCheckBoxRespostasCertas = new CheckBox[5];
    //    Variavel para pontuação do quiz.
    private int pontucao;

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
        RadioGroup radioGroup1;
        RadioGroup radioGroup4;
        RadioGroup radioGroup6;
        RadioGroup radioGroup7;
        RadioGroup radioGroup8;
        RadioGroup radioGroup9;
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
        boolean questionCheckBoxImcompleta = false;
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
        for (CheckBox[] question : matrizCheckBox) {
            for (CheckBox alternativa : question) {
                if (!alternativa.isChecked()) {
                    contCheckBoxVazio++;
                }
            }
            if (contCheckBoxVazio > 3) {
                questionCheckBoxImcompleta = true;
            }
            contCheckBoxVazio = 0;
        }
        if (questionCheckBoxImcompleta) {
            Toast.makeText(getApplicationContext(), mensErroCheckBox, Toast.LENGTH_SHORT).show();
            verificador = true;
        }
        return verificador;
    }

    //    Verifica as respostas do campos de texto com a resposta correta.
    //    link com modelo de comparação para EditText
    //    https://pt.stackoverflow.com/questions/3905/como-comparar-strings-em-java
    private void compararEditText() {
        if (getString(R.string.edit_resposta_two).equalsIgnoreCase(editTextTwo.getText().toString())) {
            pontucao += 10;
            editTextTwo.setTextColor(getResources().getColor(R.color.resposta_certa));
            editTextTwo.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            editTextTwo.setTextColor(getResources().getColor(R.color.resposta_errada));
        }
        if (getString(R.string.edit_resposta_ten).equalsIgnoreCase(editTextTen.getText().toString())) {
            pontucao += 10;
            editTextTen.setTextColor(getResources().getColor(R.color.resposta_certa));
            editTextTen.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            editTextTen.setTextColor(getResources().getColor(R.color.resposta_errada));
        }
    }

    //    Compara as resposta marcadas com o vetor para verificar as certas.
    private void compararCheckBox() {
        for (CheckBox[] question : matrizCheckBox) {
            for (CheckBox opcao : question) {
                if (opcao.isChecked()) {
                    compararMatrizVetorCheckBox(opcao);
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
     * @param opcao passa o CheckBox marcado para ver se esta certo ou errado
     */
    private void compararMatrizVetorCheckBox(CheckBox opcao) {
        for (CheckBox alternativas : vetorCheckBoxRespostasCertas) {
            if (alternativas.equals(opcao)) {
                alternativas.setTypeface(Typeface.DEFAULT_BOLD);
                alternativas.setTextColor(getResources().getColor(R.color.resposta_certa));
                pontucao += 4;
                return;
            } else {
                opcao.setTextColor(getResources().getColor(R.color.resposta_errada));
            }
        }
    }

    //    Procura nos RadioGroup as respostas marcadas e compara com a lista de respostas.
    //    Link utilizado para informação sobre comparar RadioButtons
    //    https://stackoverflow.com/questions/26736285/getcheckedradiobuttonid-of-radiogroup-returns-2131034181-2-3-4
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

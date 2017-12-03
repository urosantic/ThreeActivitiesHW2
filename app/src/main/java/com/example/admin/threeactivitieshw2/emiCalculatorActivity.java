package com.example.admin.threeactivitieshw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class emiCalculatorActivity extends AppCompatActivity {

    SeekBar sbLoan, sbRIO,sbLength;
    TextView textViewLoan, textViewRIO, textViewLength, textViewAmount;

    private double value1,value2,value3 = 1;
    private double amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_calculator);
        initializeVariables();

        //First SeekBar
        textViewLoan.setText("Amount " + sbLoan.getProgress() + "/" + sbLoan.getMax());

        sbLoan.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                textViewLoan.setText("Amount " + sbLoan.getProgress() + "/" + sbLoan.getMax());
                value1 = sbLoan.getProgress();
                amt = value1 * value2 * (Math.pow((1+value2),value3))/(Math.pow((1+ value2),value3) -1);

                textViewAmount.setText("Amount Payable Monthly Rate \n" + Double.toString(amt));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewLoan.setText("Amount " + progress + "/" + sbLoan.getMax());
            }
        });

        //Second SeekBAr
        textViewRIO.setText("RIO % " + sbRIO.getProgress() + "/" + sbRIO.getMax());

        sbRIO.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                textViewRIO.setText("RIO % " + sbRIO.getProgress() + "/" + sbRIO.getMax());
                value2 = sbRIO.getProgress();
                amt = value1 * value2 * (Math.pow((1+value2),value3))/(Math.pow((1+ value2),value3) -1);
                textViewAmount.setText("Amount Payable Monthly Rate \n" + Double.toString(amt));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewRIO.setText("RIO % " + progress + "/" + sbRIO.getMax());
            }
        });

        //Third seek bar
        textViewLength.setText("Loan Tenure " + sbLength.getProgress() + "/" + sbLength.getMax());

        sbLength.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                textViewLength.setText("Loan Tenure " + sbLength.getProgress() + "/" + sbLength.getMax());
                value3 = sbLength.getProgress();
                amt = value1 * value2 * (Math.pow((1+value2),value3))/(Math.pow((1+ value2),value3) -1);
                textViewAmount.setText("Amount Payable Monthly Rate \n" + Double.toString(amt));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewLength.setText("Loan Tenure " + progress + "/" + sbLength.getMax());
            }
        });

        //int amt = sbLoan.getProgress();
        //textViewAmount.setText(sbLoan.getProgress());

    }

    private void initializeVariables() {
        sbLoan = findViewById(R.id.seekBar1);
        sbRIO = findViewById(R.id.seekBar2);
        sbLength = findViewById(R.id.seekBar3);
        textViewLoan = findViewById(R.id.tv1);
        textViewRIO = findViewById(R.id.tv2);
        textViewLength= findViewById(R.id.tv3);
        textViewAmount = findViewById(R.id.tv4);
    }
}

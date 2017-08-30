package com.example.oliver.tablaseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtTitulo;
    TextView txtRes;
    SeekBar seekBar;
    TextView txtSb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = (TextView) findViewById(R.id.txt_titulo);
        txtRes = (TextView) findViewById(R.id.txt_res);
        seekBar = (SeekBar) findViewById(R.id.seekbar);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               // txtRes.setText(i+ "");
                obtenerCadena();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void obtenerCadena(){
        int numero = seekBar.getProgress();
        String resultado = "";
        //realizar un ciclo para la cadena de texto seekBar
        for (int i=1;i<=10;i++){
            int result1 = i * numero;
            resultado = resultado + numero+ " x " + i + " = " + String.valueOf(result1) + "\n";

        }
        txtRes.setText("Este es el resultado "+ "\n"+resultado);
    }


}

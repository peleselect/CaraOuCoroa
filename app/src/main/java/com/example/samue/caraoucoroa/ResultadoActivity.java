package com.example.samue.caraoucoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Button botaoVoltar;
    private ImageView resultadoImagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        botaoVoltar = findViewById(R.id.buttonVoltar);
        resultadoImagem = findViewById(R.id.imageResultado);

        //Recuperar dados
        Bundle dados = getIntent().getExtras();
        int num = dados.getInt("numero");

        if(num == 0){
            resultadoImagem.setImageResource(R.drawable.moeda_cara);
        } else {
            resultadoImagem.setImageResource(R.drawable.moeda_coroa);
        }

        // Evento de click para o botao voltar

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // esse método destroi a activity atual, voltando a anterior
                // funciona com o conceito de pilhas de activitys.
                finish();

            }
        });

    }
}

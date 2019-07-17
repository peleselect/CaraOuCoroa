package com.example.samue.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar =  findViewById(R.id.buttonJogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                a partir do click será chamada esse start activity, que precisa de uma Intent
                logo após instanciar a intent eu passo o contexto e a activity que eu quero abrir.
                 */
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                //Passar os dados da primeira activity para a activity de resultado
                //porém antes disso é preciso gerar o rand com essas duas linhas abaixo.
                int num = new Random().nextInt(2);
                intent.putExtra("numero", num);

                startActivity(intent);
            }
        });

    }
}

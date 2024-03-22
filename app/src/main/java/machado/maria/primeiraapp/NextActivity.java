package machado.maria.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next); //le o arquivo de layout e constroi a interface

        Intent i = getIntent(); //pega o Intent enviado pela tela MainActivity
        String texto = i.getStringExtra("texto"); //pega o texto que veio junto com a Intent
        TextView tvTexto = findViewById(R.id.tvTexto); //cria uma variavel e armazena o textview
        tvTexto.setText(texto); //bota o texto que veio da outra tela na textview dessa interface
    }
}
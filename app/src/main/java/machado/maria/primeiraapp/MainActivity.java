package machado.maria.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //le o arquivo de layout e constroi a interface
        Button btnEnviar = findViewById(R.id.btnEnviar); //cria uma variavel e armazena o botao btnEnviar da interface

        btnEnviar.setOnClickListener(new View.OnClickListener() { //metodo pra saber quando o usuario clica no botao
            @Override
            public void onClick(View v) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //cria uma variavel e armazena o edittext etDigiteAqui
                String textoDigitado = etDigiteAqui.getText().toString(); //cria outra variavel e armazena o que foi escrito no etDigiteAqui
                Intent i = new Intent(MainActivity.this, NextActivity.class); //cria uma variavel Intent pra navegar pra proxima tela
                i.putExtra("texto", textoDigitado); //leva junto o texto armazenado na variavel textoDigitado
                startActivity(i); //navega pra proxima tela
            }
        });
    }
}
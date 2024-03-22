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
        setContentView(R.layout.activity_main);
        Button btnEnviar = findViewById(R.id.btnEnviar); //cria uma variavel e armazena o botao btnenviar da interface
        btnEnviar.setOnClickListener(new View.OnClickListener() { //metodo pra saber quando o usuario clica no botao
            @Override
            public void onClick(View v) {
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); //cria uma variavel e armazena o edittext etdigiteaqui
                String textoDigitado = etDigiteAqui.getText().toString(); //cria uma variavel e armazena o que foi escrito no etdigiteaqui
                Intent i = new Intent(MainActivity.this, NextActivity.class); //
                i.putExtra("texto", textoDigitado);
                startActivity(i);
            }
        });
    }
}
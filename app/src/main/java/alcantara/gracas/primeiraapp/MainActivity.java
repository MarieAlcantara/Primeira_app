package alcantara.gracas.primeiraapp;//onde está a app

//importações
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

        Button btnEnviar = findViewById(R.id.btnEnviar);//indentificando o botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {//adicionando um ouvidor para o botão
            @Override
            public void onClick(View v) {// ao clicar:
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);//pegando o texto digitado
                String textoDigitado = etDigiteAqui.getText().toString();//convertendo o tipo de texto
                Intent i = new Intent(MainActivity.this, NextActivity.class);// Intenção de navegar de Onde eu estou, para onde eu vou.
                i.putExtra("texto", textoDigitado);//preencher dicionário//mandar o texto para a outra tela
                startActivity(i);
            }
        });
    }
}
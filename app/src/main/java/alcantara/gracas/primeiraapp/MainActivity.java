package alcantara.gracas.primeiraapp;//onde esta a app

//importacoes
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
        setContentView(R.layout.activity_main);//le o arquivo de layout

        Button btnEnviar = findViewById(R.id.btnEnviar);//obter o botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {//cria um ouvidor para o botao
            @Override
            public void onClick(View v) {//o metodo onclick e chamado toda vez que tem um clique do mouse no botao
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();//pegando o tipo de texto
                Intent i = new Intent(MainActivity.this, NextActivity.class);// Intencao de navegar de Onde eu estou, para onde eu vou.//ir para a proxima tela
                i.putExtra("texto", textoDigitado);//preencher dicionario//mandar o texto para a outra tela
                startActivity(i);//executa a intencao e vai para a proxima tela
            }
        });
    }
}
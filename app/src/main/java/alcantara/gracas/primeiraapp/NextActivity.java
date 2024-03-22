package alcantara.gracas.primeiraapp;//aonde está a app
//próxima tela
//importações
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Intent i = getIntent();//pega o intent mandado pela outra tela
        String texto = i.getStringExtra("texto");//mesma chave definida previamente
        TextView tvTexto = findViewById(R.id.tvTexto);//indentificando o texto enviado
        tvTexto.setText(texto);//manda o texto para o text view
    }
}
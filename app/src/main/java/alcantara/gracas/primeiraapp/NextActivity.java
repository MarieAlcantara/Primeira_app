package alcantara.gracas.primeiraapp;//aonde esta a app
//proxima tela

//importacoes
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
        String texto = i.getStringExtra("texto");//mesma chave definida previamente//obter o texto
        TextView tvTexto = findViewById(R.id.tvTexto);//obter o elemento do textview
        tvTexto.setText(texto);//manda o texto para o text view
    }
}

package rafael.guimaraes.projeto02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao_lista_produto;
    private Button botao_cadastrar_anuncio;
    private Button botao_sobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaComponentes();
        botao_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Sobre.class));
            }
        });

        botao_cadastrar_anuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), CadastrarAnuncio.class));
            }
        });
        botao_lista_produto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ListaProdutos.class));

            }
        }

        );

    }

    private void inicializaComponentes(){
        botao_lista_produto = findViewById(R.id.botao_lista_anuncio);
        botao_cadastrar_anuncio = findViewById(R.id.botao_cadastrar_anuncio);
        botao_sobre = findViewById(R.id.botao_sobre);
    }

}
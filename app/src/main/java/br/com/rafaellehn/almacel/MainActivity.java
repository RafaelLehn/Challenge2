package br.com.rafaellehn.almacel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText texto;
    private Button clico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.et_texto);
        clico = findViewById(R.id.clicar);


        clico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar();
            }
        });

    }

    private void validar(){
        boolean res = true;
        String hierarquia = texto.getText().toString();


        if(res == vazio(hierarquia)){
            Toast.makeText(MainActivity.this, "true", Toast.LENGTH_SHORT).show();

        } else if(res != vazio(hierarquia)) {
            Toast.makeText(MainActivity.this, "false", Toast.LENGTH_SHORT).show();
        }

    }

//        String[] res = {"{[]}", "[{}]", "{()}", "[()]", "[{}]", "{[()]}"};
    
    private boolean vazio(String valor){

        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return  resultado;
    }
}

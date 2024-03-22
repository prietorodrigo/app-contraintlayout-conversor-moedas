package com.example.conversaomoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
    private EditText e1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.txtTitulo);
        e1 = findViewById(R.id.edtValor);
        btn1 = findViewById(R.id.btnConverter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valor = Float.parseFloat(e1.getText().toString());
                float resultado = (float) (valor * 8.05);
                Intent i = new Intent(getApplicationContext(), ActivityResultado.class);
                Bundle params = new Bundle();
                params.putString("result", String.valueOf(resultado));
                i.putExtras(params);
                startActivity(i);
            }
        });
    }
}
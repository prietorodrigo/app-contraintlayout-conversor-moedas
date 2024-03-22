package com.example.conversaomoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityResultado extends AppCompatActivity {

    private ListView lview;
    String mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        lview = findViewById(R.id.lview);
        Bundle params = getIntent().getExtras();
        String s = getIntent().getExtras().getString("result");
        mensagem = "O valor em pesos é $U "+s;
        preencherListView();
    }

    public void preencherListView() {
        String[] listItem = {mensagem};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,listItem);
        lview.setAdapter(adaptador);
    }
}
package com.example.mobiilisovellus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Intent intent = getIntent();
    private ArrayList<Tehtava> tehtavaLista;
    private ListView listView;
    private TehtavaAdapter tAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tehtavaLista = new ArrayList<>();
        listView = findViewById(R.id.tLista);

        tehtavaLista.add(new Tehtava("Juo kaljaa","26.3.2020", 30));
        tehtavaLista.add(new Tehtava("Juo kaljaa","27.3.2020", 50));
        tehtavaLista.add(new Tehtava("Juo kaljaa","28.3.2020", 70));
        tehtavaLista.add(new Tehtava("Juo","29.3.2020", 79));
        tehtavaLista.add(new Tehtava("Juo lisää","30.3.2020", 74));
        tehtavaLista.add(new Tehtava("Juo vettä","31.3.2020", 55));

        tAdapter = new TehtavaAdapter(this,tehtavaLista);
        listView.setAdapter(tAdapter);

    }


}

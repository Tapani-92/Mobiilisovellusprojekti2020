package com.example.mobiilisovellus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TehtavaOsioPaanakyma extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tehtava_osio_paanakyma);
        findViewById(R.id.saveTask).setOnClickListener(buttonClickListener);
        findViewById(R.id.addSubtask).setOnClickListener(buttonClickListener);
        findViewById(R.id.subTask).setOnClickListener(buttonClickListener);
        findViewById(R.id.mainWindow).setOnClickListener(buttonClickListener);
}

public View.OnClickListener buttonClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.addSubtask:
                startActivity(new Intent(TehtavaOsioPaanakyma.this, TehtavaOsio.class));
                break;
            case R.id.saveTask:
                startActivity(new Intent(TehtavaOsioPaanakyma.this, MainActivity.class));
                break;
            case R.id.subTask:
                startActivity(new Intent(TehtavaOsioPaanakyma.this, TehtavaOsio.class));
                break;
            case R.id.mainWindow:
                startActivity(new Intent(TehtavaOsioPaanakyma.this, MainActivity.class));
                break;
        }

    }
};
}


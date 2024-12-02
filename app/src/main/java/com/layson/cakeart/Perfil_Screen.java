package com.layson.cakeart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Perfil_Screen extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.perfil_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void AtiveMore(View V) {
        Intent intent = new Intent(Perfil_Screen.this, More_Screen.class);
        startActivity(intent);
    }
    public void AtiveMain(View V) {
        Intent intent = new Intent(Perfil_Screen.this, Principal_Screen.class);
        startActivity(intent);
    }
    public void AtiveTutorial(View V) {
        Intent intent = new Intent(Perfil_Screen.this, Tutorial_Screen.class);
        startActivity(intent);
    }
    public void AtiveConfiguracoes(View V) {
        Intent intent = new Intent(Perfil_Screen.this, More_Screen.class);
        startActivity(intent);
    }
    public void AtiveRecentes(View V) {
        Intent intent = new Intent(Perfil_Screen.this, Recentes_Screen.class);
        startActivity(intent);
    }

}
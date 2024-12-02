package com.layson.cakeart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Recentes_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.recentes_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void AtivePerfil(View V) {
        Intent intent = new Intent(Recentes_Screen.this, Perfil_Screen.class);
        startActivity(intent);
    }
    public void AtiveMore(View V) {
        Intent intent = new Intent(Recentes_Screen.this, More_Screen.class);
        startActivity(intent);
    }
    public void AtiveMain(View V) {
        Intent intent = new Intent(Recentes_Screen.this, Principal_Screen.class);
        startActivity(intent);
    }

}
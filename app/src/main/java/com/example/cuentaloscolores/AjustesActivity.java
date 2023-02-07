package com.example.cuentaloscolores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AjustesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorAjustes,new AjustesFragment()).commit();


    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.btnAtras:
                finish();
                break;
        }
    }
}
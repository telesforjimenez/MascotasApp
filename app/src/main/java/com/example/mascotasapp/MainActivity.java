package com.example.mascotasapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> lista;
    RecyclerView rvListaMascotas;

   // ImageButton imbSuma;
    TextView tvResultadoRaiting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = new ArrayList<Mascota>();
        lista.add(new Mascota(R.drawable.bulldog_frances,"BULDOG","0"));
        lista.add(new Mascota(R.drawable.mascota1,"Mascota 1","0"));
        lista.add(new Mascota(R.drawable.mascota2,"Mascota 2","0"));
        lista.add(new Mascota(R.drawable.mascota4,"Mascota 3","0"));
        lista.add(new Mascota(R.drawable.mascota3,"Mascota 4","0"));

        rvListaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvListaMascotas.setLayoutManager(llm);
        MascotaAdaptador adp = new MascotaAdaptador(lista);
        rvListaMascotas.setAdapter(adp);

        tvResultadoRaiting = (TextView)findViewById(R.id.tvResultadoRaiting);
        //imbSuma = (ImageButton)findViewById(R.id.btnSumaRaiting);
       /* imbSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int contador = Integer.parseInt(tvResultadoRaiting.getText().toString());
                contador++;

            }
        });*/
    }
}
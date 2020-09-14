package com.example.mascotasapp;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> lista;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.lista = mascotas;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);

        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolder, final int position) {
        final Mascota mascota = lista.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvRaiting.setText(mascota.getRaiting());
        mascotaViewHolder.btnSumaRaiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int raiting = Integer.parseInt(mascota.getRaiting());
                raiting++;
                mascota.setRaiting(raiting+"");
                mascotaViewHolder.tvRaiting.setText(mascota.getRaiting());
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvRaiting;
        private ImageButton btnSumaRaiting;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView)itemView.findViewById(R.id.imgMascota);
            tvNombre = (TextView)itemView.findViewById(R.id.tvNombre);
            tvRaiting = (TextView)itemView.findViewById(R.id.tvResultadoRaiting);
            btnSumaRaiting = (ImageButton)itemView.findViewById(R.id.btnSumaRaiting);
        }
    }
}

package com.pab.iCafe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class RegulerAdapter extends RecyclerView.Adapter<RegulerAdapter.ViewHolder> {

    ViewHolder holder;

    public RegulerAdapter(ArrayList<Reguler> listDrinks) {
        this.listDrinks = listDrinks;
    }

    private ArrayList<Reguler> listDrinks;

    @NonNull
    @Override
    public RegulerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder =  new ViewHolder(inflater.inflate(R.layout.item_menu, parent, false));

        return holder;
    }

    public String rp(int txt){
        Locale locale = new Locale("in", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        format.setMaximumFractionDigits(0);
        return format.format(txt); // Integer.toString(total);
    }

    @Override
    public void onBindViewHolder(@NonNull RegulerAdapter.ViewHolder holder, int position) {
        Reguler reguler = listDrinks.get(position);
        holder.txtNamaDrinks.setText(reguler.getNamaDrinks());
        holder.txtHargaDrinks.setText(rp(Integer.parseInt(reguler.getHargaDrinks())));
        holder.imgDrinks.setImageResource(reguler.getImgDrinks());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listDrinks.get(position).getNamaDrinks().equals("REGULER 1")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_reguler);
                    intent.putExtra("NAMA_DEFAULT", "REGULER 1");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI STANDAR");
                    intent.putExtra("HARGA_DEFAULT", "25000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listDrinks.get(position).getNamaDrinks().equals("REGULER 2")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_reguler);
                    intent.putExtra("NAMA_DEFAULT", "REGULER 2");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI STANDAR");
                    intent.putExtra("HARGA_DEFAULT", "25000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listDrinks.get(position).getNamaDrinks().equals("REGULER 3")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_reguler);
                    intent.putExtra("NAMA_DEFAULT", "REGULER 3");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI STANDAR");
                    intent.putExtra("HARGA_DEFAULT", "25000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listDrinks.get(position).getNamaDrinks().equals("REGULER 4")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_reguler);
                    intent.putExtra("NAMA_DEFAULT", "REGULER 4");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI STANDAR");
                    intent.putExtra("HARGA_DEFAULT", "25000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listDrinks.get(position).getNamaDrinks().equals("REGULER 5")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_reguler);
                    intent.putExtra("NAMA_DEFAULT", "REGULER 5");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI STANDAR");
                    intent.putExtra("HARGA_DEFAULT", "25000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listDrinks.get(position).getNamaDrinks().equals("REGULER 6")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_reguler);
                    intent.putExtra("NAMA_DEFAULT", "REGULER 6");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI STANDAR");
                    intent.putExtra("HARGA_DEFAULT", "25000");
                    holder.itemView.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listDrinks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNamaDrinks, txtHargaDrinks;
        public ImageView imgDrinks;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNamaDrinks = (TextView) itemView.findViewById(R.id.txtNamaItem);
            txtHargaDrinks = (TextView) itemView.findViewById(R.id.txtHargaItem);
            imgDrinks = (ImageView) itemView.findViewById(R.id.imgItem);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.itemLayout);
        }
    }
}

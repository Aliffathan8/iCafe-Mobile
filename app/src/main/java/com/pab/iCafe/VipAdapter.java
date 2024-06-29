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

public class VipAdapter extends RecyclerView.Adapter<VipAdapter.ViewHolder> {

    ViewHolder holder;

    public VipAdapter(ArrayList<Vip> listVip) {
        this.listVip = listVip;
    }

    private ArrayList<Vip> listVip;

    @NonNull
    @Override
    public VipAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
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
    public void onBindViewHolder(@NonNull VipAdapter.ViewHolder holder, int position) {
        Vip vip = listVip.get(position);
        holder.txtNamaPenyetan.setText(vip.getNamaPenyetan());
        holder.txtHargaPenyetan.setText(rp(Integer.parseInt(vip.getHargaPenyetan())));
        holder.imgPenyetan.setImageResource(vip.getImgPenyetan());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listVip.get(position).getNamaPenyetan().equals("VIP 1")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_vip);
                    intent.putExtra("NAMA_DEFAULT", "VIP 1");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI PROFESSIONAL");
                    intent.putExtra("HARGA_DEFAULT", "100000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listVip.get(position).getNamaPenyetan().equals("VIP 2")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_vip);
                    intent.putExtra("NAMA_DEFAULT", "VIP 2");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI PROFESSIONAL");
                    intent.putExtra("HARGA_DEFAULT", "100000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listVip.get(position).getNamaPenyetan().equals("VIP 3")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_vip);
                    intent.putExtra("NAMA_DEFAULT", "VIP 3");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI PROFESSIONAL");
                    intent.putExtra("HARGA_DEFAULT", "100000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listVip.get(position).getNamaPenyetan().equals("VIP 4")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_vip);
                    intent.putExtra("NAMA_DEFAULT", "VIP 4");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI PROFESSIONAL");
                    intent.putExtra("HARGA_DEFAULT", "100000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listVip.get(position).getNamaPenyetan().equals("VIP 5")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_vip);
                    intent.putExtra("NAMA_DEFAULT", "VIP 5");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI PROFESSIONAL");
                    intent.putExtra("HARGA_DEFAULT", "100000");
                    holder.itemView.getContext().startActivity(intent);
                }
                if (listVip.get(position).getNamaPenyetan().equals("VIP 6")) {
                    Intent intent = new Intent(holder.itemView.getContext(), MenuDetailActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.foto_vip);
                    intent.putExtra("NAMA_DEFAULT", "VIP 6");
                    intent.putExtra("DESKRIPSI_DEFAULT", "SPESIFIKASI PROFESSIONAL");
                    intent.putExtra("HARGA_DEFAULT", "100000");
                    holder.itemView.getContext().startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return listVip.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNamaPenyetan, txtHargaPenyetan;
        public ImageView imgPenyetan;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNamaPenyetan = (TextView) itemView.findViewById(R.id.txtNamaItem);
            txtHargaPenyetan = (TextView) itemView.findViewById(R.id.txtHargaItem);
            imgPenyetan = (ImageView) itemView.findViewById(R.id.imgItem);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.itemLayout);
        }
    }
}

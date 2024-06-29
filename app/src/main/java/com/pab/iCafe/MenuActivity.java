package com.pab.iCafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    String namaUser;
    TextView txtNama;

    FirebaseUser user;
    FirebaseAuth mAuth;

    FirebaseFirestore fireDb;

    private RecyclerView recPenyetan;
    private RecyclerView recDrinks;
    private ArrayList<Vip> listVip;
    private ArrayList<Reguler> listDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initFab();

        fireDb = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();
        namaUser = user.getEmail();

        recPenyetan = findViewById(R.id.rec_penyetan);
        recDrinks = findViewById((R.id.rec_drinks));
        initDataPenyetan();
        initDataDrinks();

        recPenyetan.setAdapter(new VipAdapter(listVip));
        recPenyetan.setLayoutManager(new LinearLayoutManager(this));

        recDrinks.setAdapter(new RegulerAdapter(listDrinks));
        recDrinks.setLayoutManager(new LinearLayoutManager(this));

        txtNama = findViewById(R.id.txtNama);
        txtNama.setText("Hi, " + namaUser);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void initFab(){
        FloatingActionButton fabCart = findViewById(R.id.fabCart);
        fabCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), CartActivity.class));
            }
        });

        FloatingActionButton fabLogout = findViewById(R.id.fabLogout);
        fabLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                startActivity(new Intent(getBaseContext(), MainActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
            }
        });
    }

    private void initDataPenyetan(){
        this.listVip =  new ArrayList<>();
        listVip.add(new Vip("VIP 1", "100000", R.drawable.foto_vip));
        listVip.add(new Vip("VIP 2", "100000", R.drawable.foto_vip));
        listVip.add(new Vip("VIP 3", "100000", R.drawable.foto_vip));
        listVip.add(new Vip("VIP 4", "100000", R.drawable.foto_vip));
        listVip.add(new Vip("VIP 5", "100000", R.drawable.foto_vip));
        listVip.add(new Vip("VIP 6", "100000", R.drawable.foto_vip));
    }

    private void initDataDrinks(){
        this.listDrinks = new ArrayList<>();
        listDrinks.add(new Reguler("REGULER 1", "25000", R.drawable.foto_reguler));
        listDrinks.add(new Reguler("REGULER 2", "25000", R.drawable.foto_reguler));
        listDrinks.add(new Reguler("REGULER 3", "25000", R.drawable.foto_reguler));
        listDrinks.add(new Reguler("REGULER 4", "25000", R.drawable.foto_reguler));
        listDrinks.add(new Reguler("REGULER 5", "25000", R.drawable.foto_reguler));
        listDrinks.add(new Reguler("REGULER 6", "25000", R.drawable.foto_reguler));
    }
}
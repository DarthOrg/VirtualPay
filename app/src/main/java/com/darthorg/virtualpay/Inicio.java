package com.darthorg.virtualpay;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        fullscreenTransparent();

        final LinearLayout cartao = (LinearLayout) findViewById(R.id.cartao);
        ImageButton cor = (ImageButton) findViewById(R.id.cor);
        final Button btnComecar = (Button) findViewById(R.id.btnComecar);

        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, JogoAberto.class);
                startActivity(intent);
            }
        });

        cor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builderCor = new AlertDialog.Builder(Inicio.this);

                LayoutInflater layoutInflater = getLayoutInflater();
                final View dialoglayout = layoutInflater.inflate(R.layout.dialog_cor_cartao, null);

                builderCor.setView(dialoglayout);

                final FloatingActionButton corBlack = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorBlack);
                final FloatingActionButton corGrey = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorGrey);
                final FloatingActionButton corIndigo = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorIndigo);
                final FloatingActionButton corOrange = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorOrange);
                final FloatingActionButton corPink = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorPink);
                final FloatingActionButton corPurple = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorPurple);
                final FloatingActionButton corRed = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorRed);
                final FloatingActionButton corVerde = (FloatingActionButton) dialoglayout.findViewById(R.id.btnCorVerde);

                builderCor.setTitle("Cor");
                builderCor.setMessage("Personaliza seu cartão inicial");
                final AlertDialog dialogCor = builderCor.create();

                corBlack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_black));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_black));
                        dialogCor.dismiss();
                    }
                });
                corGrey.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_grey));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_grey));
                        dialogCor.dismiss();
                    }
                });
                corIndigo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_indigo));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_indigo));
                        dialogCor.dismiss();
                    }
                });
                corOrange.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_orange));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_orange));
                        dialogCor.dismiss();
                    }
                });
                corPink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_pink));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_pink));
                        dialogCor.dismiss();
                    }
                });
                corPurple.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_purple));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_purple));
                        dialogCor.dismiss();
                    }
                });
                corRed.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_red));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_red));
                        dialogCor.dismiss();
                    }
                });
                corVerde.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_verde));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_verde));
                        dialogCor.dismiss();
                    }
                });



                dialogCor.show();
            }
        });



    }

    public void fullscreenTransparent(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
    }
}

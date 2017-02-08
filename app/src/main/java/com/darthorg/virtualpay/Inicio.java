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

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        fullscreenTransparent();

        final LinearLayout cartao = (LinearLayout) findViewById(R.id.cartao);
        ImageButton cor = (ImageButton) findViewById(R.id.cor);
        final Button btnComecar = (Button) findViewById(R.id.btnComecar);
        final TextView corID = (TextView) findViewById(R.id.corId);

        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, AdicionarJogadores.class);

                String cor = "";

                cor = corID.getText().toString();
                Bundle bundle = new Bundle();

                bundle.putString("corID", cor);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        cor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builderCor = new AlertDialog.Builder(Inicio.this);

                LayoutInflater layoutInflater = getLayoutInflater();
                final View dialoglayout = layoutInflater.inflate(R.layout.dialog_cor, null);

                builderCor.setView(dialoglayout);

                final ImageButton corBlack = (ImageButton) dialoglayout.findViewById(R.id.btnCorBlack);
                final ImageButton corGrey = (ImageButton) dialoglayout.findViewById(R.id.btnCorGrey);
                final ImageButton corIndigo = (ImageButton) dialoglayout.findViewById(R.id.btnCorIndigo);
                final ImageButton corOrange = (ImageButton) dialoglayout.findViewById(R.id.btnCorOrange);
                final ImageButton corPink = (ImageButton) dialoglayout.findViewById(R.id.btnCorPink);
                final ImageButton corPurple = (ImageButton) dialoglayout.findViewById(R.id.btnCorPurple);
                final ImageButton corRed = (ImageButton) dialoglayout.findViewById(R.id.btnCorRed);
                final ImageButton corVerde = (ImageButton) dialoglayout.findViewById(R.id.btnCorVerde);

//                final LinearLayout corBlack = (LinearLayout) dialoglayout.findViewById(R.id.btnCorBlack);
//                final LinearLayout corGrey = (LinearLayout) dialoglayout.findViewById(R.id.btnCorGrey);
//                final LinearLayout corIndigo = (LinearLayout) dialoglayout.findViewById(R.id.btnCorIndigo);
//                final LinearLayout corOrange = (LinearLayout) dialoglayout.findViewById(R.id.btnCorOrange);
//                final LinearLayout corPink = (LinearLayout) dialoglayout.findViewById(R.id.btnCorPink);
//                final LinearLayout corPurple = (LinearLayout) dialoglayout.findViewById(R.id.btnCorPurple);
//                final LinearLayout corRed = (LinearLayout) dialoglayout.findViewById(R.id.btnCorRed);
//                final LinearLayout corVerde = (LinearLayout) dialoglayout.findViewById(R.id.btnCorVerde);

                builderCor.setTitle("Cor");
                builderCor.setMessage("Personaliza seu cartão inicial");
                final AlertDialog dialogCor = builderCor.create();

                corBlack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_black));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_black));
                        corID.setText("1");
                        dialogCor.dismiss();
                    }
                });
                corGrey.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_grey));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_grey));
                        corID.setText("2");
                        dialogCor.dismiss();
                    }
                });
                corIndigo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_indigo));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_indigo));
                        corID.setText("3");
                        dialogCor.dismiss();
                    }
                });
                corPurple.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_purple));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_purple));
                        corID.setText("4");
                        dialogCor.dismiss();
                    }
                });
                corOrange.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_orange));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_orange));
                        corID.setText("5");
                        dialogCor.dismiss();
                    }
                });
                corPink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_pink));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_pink));
                        corID.setText("6");
                        dialogCor.dismiss();
                    }
                });

                corRed.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_red));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_red));
                        corID.setText("7");
                        dialogCor.dismiss();
                    }
                });
                corVerde.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        cartao.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_verde));
                        btnComecar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cor_cartao_verde));
                        corID.setText("8");
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

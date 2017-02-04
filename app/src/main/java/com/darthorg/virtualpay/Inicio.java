package com.darthorg.virtualpay;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import manager.PrefManager;

public class Inicio extends AppCompatActivity {

    private PrefManager prefManager;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        fullscreenTransparent();

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final LinearLayout cartao =(LinearLayout) findViewById(R.id.cartao);
        final TextView nome_jogador = (TextView) findViewById(R.id.nome_jogador);
        final TextView titulos_jogador = (TextView) findViewById(R.id.titulos_jogadores);
        final TextView valor_cartao_jogador = (TextView) findViewById(R.id.valor_cartao);

        final Button btnSorteReves = (Button) findViewById(R.id.btnSorteReves);
        final Button btnBanco = (Button) findViewById(R.id.btnBanco);
        final Button btnJogadores = (Button) findViewById(R.id.btnJogadores);

        final Button btnPagar = (Button) findViewById(R.id.btnPagar);
        final Button btnVender = (Button) findViewById(R.id.btnVender);
        final Button btnComprar = (Button) findViewById(R.id.btnComprar);

        //Dialog SORTE OU REVES
        btnSorteReves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Sorte ou Revés Clicado ",Toast.LENGTH_LONG).show();
            }
        });

        //Dialog BANCO
        btnBanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Banco Clicado ",Toast.LENGTH_LONG).show();
            }
        });

        //Dialog JOGADORES
        btnJogadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Jogadores Clicado ",Toast.LENGTH_LONG).show();
            }
        });

        //Dialog PAGAR
        btnPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builderPagar = new AlertDialog.Builder(Inicio.this);

                LayoutInflater layoutInflater = getLayoutInflater();
                final View dialoglayout = layoutInflater.inflate(R.layout.dialog_funcoes_pagar, null);

                builderPagar.setView(dialoglayout);

                final FloatingActionButton btnPagarJogador = (FloatingActionButton) dialoglayout.findViewById(R.id.btnPagarJogador);
                final FloatingActionButton btnPagarBanco = (FloatingActionButton) dialoglayout.findViewById(R.id.btnPagarBanco);



                builderPagar.setIcon(getResources().getDrawable(R.drawable.ic_cartao));
                builderPagar.setTitle("Pagar quem?");
                final AlertDialog dialogPagar = builderPagar.create();


                dialogPagar.show();
            }

        });
        //Dialog VENDER
        btnVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builderVender = new AlertDialog.Builder(Inicio.this);

                LayoutInflater layoutInflater = getLayoutInflater();
                final View dialoglayout = layoutInflater.inflate(R.layout.dialog_funcoes_vender, null);

                builderVender.setView(dialoglayout);

                final FloatingActionButton btnVenderCasa = (FloatingActionButton) dialoglayout.findViewById(R.id.btnVenderCasa);
                final FloatingActionButton btnHipotecar = (FloatingActionButton) dialoglayout.findViewById(R.id.btnVenderHipotecarTitulos);



                builderVender.setIcon(getResources().getDrawable(R.drawable.ic_vender));
                builderVender.setTitle("O que você quer vender?");
                final AlertDialog dialogVender = builderVender.create();


                dialogVender.show();
            }

        });

        //Dialog COMPRAR
        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builderComprar = new AlertDialog.Builder(Inicio.this);

                LayoutInflater layoutInflater = getLayoutInflater();
                final View dialoglayout = layoutInflater.inflate(R.layout.dialog_funcoes_comprar, null);

                builderComprar.setView(dialoglayout);

                final FloatingActionButton btnComprarcTitulos = (FloatingActionButton) dialoglayout.findViewById(R.id.btnComprarcTitulos);
                final FloatingActionButton btnComprarCasa = (FloatingActionButton) dialoglayout.findViewById(R.id.btnComprarCasa);



                builderComprar.setIcon(getResources().getDrawable(R.drawable.ic_comprar));
                builderComprar.setTitle("Gostaria de comprar o que?");
                final AlertDialog dialogComprar = builderComprar.create();


                dialogComprar.show();
            }

        });
//





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_virtualpay, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_fechar) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }



    public void fullscreenTransparent(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.BLACK);
        }
//        if (Build.VERSION.SDK_INT >= 21) {
//            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
//        }
    }
}

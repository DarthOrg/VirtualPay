package com.darthorg.virtualpay;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class AdicionarJogadores extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_jogadores);
        fullscreenTransparent();

        AppBarLayout appBar = (AppBarLayout) findViewById(R.id.appbar);
        final ImageButton fab = (ImageButton) findViewById(R.id.fab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String cor = bundle.getString("corID");

        TextView IDcor = (TextView) findViewById(R.id.cor);
        IDcor.setText(cor);


        if (IDcor.getText().equals("1")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_black));

        }else if (IDcor.getText().equals("2")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorGrey));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_grey));

        }else if (IDcor.getText().equals("3")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorIndigo));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_indigo));

        }else if (IDcor.getText().equals("4")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorPurple));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_purple));

        }else if (IDcor.getText().equals("5")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorOrange));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_orange));

        }else if (IDcor.getText().equals("6")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorPink));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_pink));

        }else if (IDcor.getText().equals("7")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorRed));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_red));

        }else if (IDcor.getText().equals("8")){
            appBar.setBackgroundColor(getResources().getColor(R.color.colorVerdeLight));
            fab.setBackground(getResources().getDrawable(R.drawable.circulo_verde));

        }


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdicionarJogadores.this,JogoAberto.class);
                startActivity(intent);
                finish();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void fullscreenTransparent(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.colorBlackTransparente61));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
    }

}

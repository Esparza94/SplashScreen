package com.esparza.splashscreen;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    //private Button btPlay, btSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Referencia nosso objeto com o layout
        //btPlay = (Button) findViewById(R.id.btPlay);
        //btSair = (Button) findViewById(R.id.btSair);
        //Cria a instancia da fonte que será utilizada
        //Typeface fonte = Typeface.createFromAsset(getAssets(), "fonts/angrybirds.ttf");
        //Aplica a fonte nos botoes do game
        //btPlay.setTypeface(fonte);
        //btSair.setTypeface(fonte);

    }

    public void onClickPlayButton(View v) {
        //Exibe uma mensagem para usuario informando que o jogo ainda está em construção
        Toast.makeText(this, "O jogo ainda está sendo construido",
                Toast.LENGTH_SHORT).show();
    }

    public void onClickSairButton(View v) {
        //finaliza a activity atual
        finish();
    }
}

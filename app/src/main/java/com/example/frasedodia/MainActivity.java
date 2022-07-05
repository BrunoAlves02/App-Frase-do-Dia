package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Sem mandrake",
                "Não adianta, vai ter que fatorar..",
                "Voce não sabe nem eu..",
                "Um momento amigo..",
                "Siete minutinhos pessoal..",
                "Vou sacanear voces..",
                "Não vou ficar escrevendo na lousa que nem um besta..",
                "Essa técnica é por sua conta e risco. Ctrl C + Ctrl V.",
                "Ferramenta avancada de programaçao.",
                "Se colar eu vou ficar muito brava com voces.",
                "Publicar no SIMGETEC, junto com o artigo, site, videos, dicas, sugestoes, etc.",
                "Procure a secretaria.",
                "Marcelo C#, Cristiano JAVA, Everton GIMP.",
                "Hoje a aula vai ser bem legal.. abre comigo o GIMP para criarmos um banner..",
                "CHMOD777, ubuntu, kubuntu, lubuntu..",
                "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                "Vitória acorda.. acorda.. eu falei pra mandar foto do gatinho.. ataa ataa",
                "De longe parece que é feio, de perto parece que tá longe..",
                "Ex nihilo nihil fit",
                "Não está na hora de desconectar isso daí nao?",
                "Siri..? tá esquecendo de nada não? cade meu manto de ouro?",
                "Chamada chamada chamada, chamada professora!",
                "Quem manda e desmanda no laboratorio somos nós, qualquer coisa fala comigo depois..",
                "Em quatro anos vamos acabar com essa area, então dane-se!",

        };

        int num = new Random().nextInt(24);

        TextView texto = findViewById(R.id.txt_frase);
        texto.setText(frases[num]);

    }


}
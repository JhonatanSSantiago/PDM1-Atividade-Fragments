package com.jhonssantiago.atividade4fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*Faça um app que tenha:
 uma lista com 3 itens. Ao clicar em um elemento da lista, deve ser chamado um dos fragmentos, apresentando uma imagem e um texto sobre a imagem.
ou:
3 botões. Ao clicar em um botão, deve ser chamado um dos fragmentos, apresentando uma imagem e um texto sobre a imagem*/
public class MainActivity extends AppCompatActivity {
    private Button B1, B2, B3;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1=findViewById(R.id.Btn1);
        B2=findViewById(R.id.Btn2);
        B3=findViewById(R.id.Btn3);

        fm = getSupportFragmentManager();

    }

    public void trocar(View view){
        if(view.getId() == R.id.Btn1){
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.telaPrincipal, new Tela1());
            ft.commit();
        }

        if(view.getId() == R.id.Btn2){
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.telaPrincipal, new Tela2());
            ft.commit();
        }

        if(view.getId() == R.id.Btn3){
            FragmentTransaction ft = fm.beginTransaction();
            ft.add(R.id.telaPrincipal, new Tela3());
            ft.commit();
        }
    }
}
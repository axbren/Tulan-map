package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;


public class Menu_mapas extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedeInstanceState){
        super.onCreate(savedeInstanceState);
        setContentView(R.layout.activity_menu_mapas);

        btn=findViewById(R.id.boton_ruta_1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_mapas.this, Ruta_1.class);

                startActivity(a);
            }
        });

        btn=findViewById(R.id.boton_ruta_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_mapas.this, Ruta_2.class);

                startActivity(a);
            }
        });
       btn=findViewById(R.id.boton_ruta_3);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent a=new Intent(Menu_mapas.this, Ruta_3.class);

               startActivity(a);
           }
       });

    }
}
package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;


public class Menu extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedeInstanceState){
        super.onCreate(savedeInstanceState);
        setContentView(R.layout.activity_menu);

        btn=findViewById(R.id.boton_mapas);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu.this, Menu_mapas.class);
                startActivity(a);
            }
        });
    }
}
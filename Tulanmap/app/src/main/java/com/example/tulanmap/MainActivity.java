package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    Button btn;

    @Override
    protected void onCreate(Bundle savedeInstanceState){
        super.onCreate(savedeInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.boton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this, Menu.class);
                startActivity(a);
            }
        });
    }
}


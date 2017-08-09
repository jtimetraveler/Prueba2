package com.example.juancho.prueba2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boton = (Button) findViewById(R.id.buttonV2);

        boton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                //Acciones
                Intent Ventana1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Ventana1);

            }
        });
    }
}

package com.example.juancho.prueba2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button boton, boton2;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.buttonPrueba) ;
        boton2 = (Button) findViewById(R.id.buttonV1);
        editText = (EditText) findViewById(R.id.editTextP);
        textView= (TextView) findViewById(R.id.PtextViewP);

        boton.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                //Acciones
                String mensaje = editText.getText().toString();
                textView.setText(mensaje);

            }
        });

        boton2.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                //Acciones
                Intent ListSong = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(ListSong);

            }
        });


    }





}

package guzmancom.cristina.calculadoraaaaaa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
        TextView editar;
        double resultado;
        String operador, mostrar,reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button boton1 = (Button) findViewById(R.id.button1);
        final Button boton2 = (Button) findViewById(R.id.button2);
        final Button boton3 = (Button) findViewById(R.id.button3);
        final Button boton4 = (Button) findViewById(R.id.button4);
        final Button boton5 = (Button) findViewById(R.id.button5);
        final Button boton6 = (Button) findViewById(R.id.button6);
        final Button boton7 = (Button) findViewById(R.id.button7);
        final Button botoncero = (Button) findViewById(R.id.buttoncero);
        final Button boton9 = (Button) findViewById(R.id.button9);
        final Button boton0 = (Button) findViewById(R.id.button0);
        final Button botonmul=(Button) findViewById(R.id.buttonmul);
        final TextView editar = (TextView) findViewById(R.id.editar);
        final Button buttonmas = (Button) findViewById(R.id.buttonmas);
        final Button buttonmenos = (Button) findViewById(R.id.buttonmenos);
        final Button buttondiv = (Button) findViewById(R.id.buttondiv);
        final Button buttonigual =(Button) findViewById(R.id.buttonigual);
        final Button  buttonpunt =(Button) findViewById(R.id.buttonpunt);
        final Button buttonLimpiar = (Button) findViewById(R.id.buttonLimpiar);



        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"1";
                editar.setText(mostrar);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"2";
                editar.setText(mostrar);
            }

        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"3";
                editar.setText(mostrar);
            }

        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"4";
                editar.setText(mostrar);
            }

        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"5";
                editar.setText(mostrar);
            }

        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"6";
                editar.setText(mostrar);
            }

        });
        botonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"7";
                editar.setText(mostrar);
            }

        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"8";
                editar.setText(mostrar);
            }

        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"9";
                editar.setText(mostrar);
            }

        });
        botoncero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"0";
                editar.setText(mostrar);
            }

        });
        buttonpunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+".";
                editar.setText(mostrar);
            }

        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar=mostrar+"*";
                editar.setText("");
            }

        });
        buttonmas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = editar.getText().toString();
                operador= "+";
                editar.setText("");
            }

        });
        buttonmenos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = editar.getText().toString();
                operador= "-";
                editar.setText("");
            }

        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                reserva = editar.getText().toString();
                operador= "/";
                editar.setText("");
            }

        });
        buttonLimpiar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                editar.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        buttonigual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                mostrar = editar.getText().toString();
                mostrar = mostrar + "1";

                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(editar.getText().toString());
                    editar.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(editar.getText().toString());
                    editar.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(editar.getText().toString());
                    editar.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(editar.getText().toString());
                    editar.setText(String.valueOf(resultado));
                }
            }
        });
    }
}
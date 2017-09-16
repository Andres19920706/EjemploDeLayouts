/*
 * Ejemplo de LinealLayout
 */
package es.ujaen.ssmm.ejemplodelayouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=0;
        mostrarResultado();
    }

    public void incrementaContador (View vista){
        contador++;
        //Llamamos a la funcion mostrasResultado
        mostrarResultado();
    }

    public void decrementaContador (View vista){
        contador--;
        //Llamamos a la funcion mostrasResultado
        mostrarResultado();
    }

    public void resetearContador (View vista){
        contador=0;
        //Llamamos a la funcion mostrasResultado
        mostrarResultado();
    }

    public void mostrarResultado (){
        //Creamos una instancia de la case textView y buscamos el
        //LabView donde queremos escribir (necesita un casting)
        TextView textoResultado = (TextView) findViewById(R.id.textContador);
        //Pasamos el resultado al textView
        textoResultado.setText(""+contador);

    }
}

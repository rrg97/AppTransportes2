package apps.android.rubeng.apptransportes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Nuevo_pedido extends AppCompatActivity {

    Spinner spinner1,spinner2;
    TextView textView1,textView2,textView3;
    EditText cantidad;
    Button bton;

    List<String> familia = new ArrayList<String>();
    List<String> productos = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_pedido);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        textView1 = (TextView) findViewById(R.id.textView6);
        textView1 = (TextView) findViewById(R.id.textView7);
        textView1 = (TextView) findViewById(R.id.textView8);

        cantidad = (EditText)findViewById(R.id.edit_text_cantidad);

        bton = (Button) findViewById(R.id.button);

        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Nuevo_pedido.this,Formulario.class);
                startActivity(i);
            }
        });

        familia.add("Cosmética");
        familia.add("Ropa");
        familia.add("Informática");
        familia.add("familia4");
        familia.add("familia5");

        productos.add("Pantalón");
        productos.add("Camiseta");
        productos.add("Sudadera");
        productos.add("Calcetines");
        productos.add("Camisa");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,familia);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        spinner1.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,productos);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        spinner2.setAdapter(adapter2);

    }
}

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

public class Formulario extends AppCompatActivity {

    Spinner spinner;
    TextView textView1,textView2,textView3;
    Button btn;
    EditText editText;

    List<String> tipo_envio = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        spinner = (Spinner) findViewById(R.id.spinner4);

        textView1 = (TextView) findViewById(R.id.textView10);
        textView2 = (TextView) findViewById(R.id.textView11);
        textView3 = (TextView) findViewById(R.id.textView12);

        editText = (EditText) findViewById(R.id.editText8);

        btn = (Button) findViewById(R.id.button2);

        tipo_envio.add("Urgente");
        tipo_envio.add("Estándar");
        tipo_envio.add("Entrega Festivos");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,tipo_envio);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_item);
        spinner.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Formulario.this,Presupuesto.class);
                startActivity(i);
            }
        });
    }
}

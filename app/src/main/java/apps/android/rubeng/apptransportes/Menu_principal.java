package apps.android.rubeng.apptransportes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Menu_principal extends AppCompatActivity {

    //Botones de la UI para las secciones de  Perfil, Nuevo pedido y Mis pedidos
    ImageView perfil,pedidos,nuevo_pedido;
    TextView texto_perfil,texto_pedidos,texto_nuevo_pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Bundle bundle = getIntent().getExtras();


        perfil = (ImageView) findViewById(R.id.mi_perfil);
        pedidos = (ImageView) findViewById(R.id.packages);
        nuevo_pedido = (ImageView) findViewById(R.id.envios);

        texto_perfil = (TextView) findViewById(R.id.textView3);
        texto_perfil = (TextView) findViewById(R.id.textView4);
        texto_perfil = (TextView) findViewById(R.id.textView5);


        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_principal.this,Perfil.class);
                    startActivity(i);
            }
        });

        pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_principal.this,Mis_pedidos.class);
                startActivity(i);
            }
        });

        nuevo_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_principal.this,Nuevo_pedido.class);
                startActivity(i);
            }
        });


    }
}

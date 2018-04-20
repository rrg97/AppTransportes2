package apps.android.rubeng.apptransportes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    Button bton;
   EditText editText2;
    EditText editText;
    private final String user = "Rubgir97";
    private final String pass = "hola1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bton = (Button) findViewById(R.id.user_sign_in_button);
        editText2 = (EditText) findViewById(R.id.user);
        editText = (EditText) findViewById(R.id.password);

        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,Menu_principal.class);

                String password=editText.getText().toString();
                String usuario=editText2.getText().toString();

                if(correctPassword(password)&&correctUser(usuario)){
                    startActivity(i);
                }
                else if(usuario.isEmpty()){
                    Toast.makeText(Login.this,"Campo de usuario vacío",Toast.LENGTH_LONG).show();
                }

                else if(password.isEmpty()){
                    Toast.makeText(Login.this,"Campo de contraseña vacío",Toast.LENGTH_LONG).show();
                }

                else if(!correctPassword(password)||!correctUser(usuario)){
                    Toast.makeText(Login.this,"Usuario o contraseña incorrectos",Toast.LENGTH_LONG).show();
                }

                else if(password.length() < 8){
                    Toast.makeText(Login.this,"Contraseña demasiado corta",Toast.LENGTH_LONG).show();
                }

            }
        });


    }

    public boolean correctPassword(String password){
        return(password.equals(pass));
    }

    public boolean correctUser(String usuario){return(usuario.equals(user));
    }



}

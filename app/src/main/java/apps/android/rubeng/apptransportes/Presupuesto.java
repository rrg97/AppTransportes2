package apps.android.rubeng.apptransportes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Presupuesto extends AppCompatActivity {

    Button btn1,btn2,btn3;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presupuesto);

        btn1 = (Button) findViewById(R.id.button3);
        btn2 = (Button) findViewById(R.id.button5);
        btn3 = (Button) findViewById(R.id.button6);

        textView1 = (TextView) findViewById(R.id.textView16);
        textView1 = (TextView) findViewById(R.id.textView15);
        textView1 = (TextView) findViewById(R.id.textView14);
        textView1 = (TextView) findViewById(R.id.textView19);
        textView1 = (TextView) findViewById(R.id.textView20);
        textView1 = (TextView) findViewById(R.id.textView21);
        textView1 = (TextView) findViewById(R.id.textView22);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}

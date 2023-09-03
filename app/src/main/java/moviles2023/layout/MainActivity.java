package moviles2023.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import moviles2023.layout.ui.theme.Mercancia;

public class MainActivity extends AppCompatActivity {

    CheckBox dinero;
    TextView cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cantidad= (TextView) findViewById(R.id.cantidad_main_txt);
        dinero= (CheckBox) findViewById(R.id.mostrar_dinero);

        dinero.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            String a= cantidad.getText().toString();
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b){
                    cantidad.setText("0");
                }
                else {cantidad.setText(a);}
            }
        });
    }

    public void in(View view){
        Intent intent=new Intent(MainActivity.this,perfilActivity.class);
        startActivity(intent);
    }
    public void mer(View view){
        Intent intent=new Intent(MainActivity.this, Mercancia.class);
        startActivity(intent);
    }
}
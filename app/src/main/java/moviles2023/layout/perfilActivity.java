package moviles2023.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import moviles2023.layout.ui.theme.Mercancia;

public class perfilActivity extends AppCompatActivity {

    RadioGroup perfil_act;
    ImageButton imagen_perfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        perfil_act= (RadioGroup) findViewById(R.id.actividad);
        imagen_perfil= (ImageButton) findViewById(R.id.perfil);
         perfil_act.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup radioGroup, int i) {
                 if(radioGroup.getCheckedRadioButtonId()==R.id.boton_activo){
                     imagen_perfil.setBackgroundColor(Color.GREEN);
                 } else if (radioGroup.getCheckedRadioButtonId()==R.id.boton_suspendido) {
                     imagen_perfil.setBackgroundColor(Color.YELLOW);
                 }else if (radioGroup.getCheckedRadioButtonId()==R.id.boton_ausente) {
                     imagen_perfil.setBackgroundColor(Color.RED);
             }
         }
         });

    }
    public void in(View view){
        Intent intent=new Intent(perfilActivity.this,MainActivity.class);
        startActivity(intent);
    }
    public void mer(View view){
        Intent intent=new Intent(perfilActivity.this, Mercancia.class);
        startActivity(intent);
    }
}
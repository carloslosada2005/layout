package moviles2023.layout.ui.theme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import moviles2023.layout.MainActivity;
import moviles2023.layout.R;

public class Mercancia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercancia);
    }

    public void in(View view){
        Intent intent=new Intent(Mercancia.this, MainActivity.class);
        startActivity(intent);
    }
    public void per(View view){
        Intent intent=new Intent(Mercancia.this, perfilActivity.class);
        startActivity(intent);
    }
}
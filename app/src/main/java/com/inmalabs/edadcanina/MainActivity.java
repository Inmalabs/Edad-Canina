package com.inmalabs.edadcanina;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.inmalabs.edadcanina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText editText= binding.editEdad;
        TextView textView= binding.textviewResult;
        Button button= binding.bottom;

        /*Se puede eliminar las 3 lineas superiores para reducir código
        * y poner directamente binding.idelemento*/


        Log.d("MainActivity", "Creada activy principal");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edad = editText.getText().toString();
                if (!edad.isEmpty()){
                    int num = Integer.parseInt(edad);
                    int resltult= 7*num;
                    String resultFinal = getString(R.string.en_edad_de_perro_tienes, resltult);
                    textView.setText(resultFinal);
                }else {

                    Log.d("ActivityMain","No se ha insertado la edad");
                    Toast.makeText(MainActivity.this, "Debes de poner una edad", Toast.LENGTH_SHORT).show();


                }



            }
        });

    }
}

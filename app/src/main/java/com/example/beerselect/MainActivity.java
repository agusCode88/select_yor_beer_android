package com.example.beerselect;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.beerselect.provider.BeerExpert;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView brands;
    Spinner typeBeer;
    Button findBeer;

    BeerExpert beerExpert  = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        brands = findViewById(R.id.reult_find);
        typeBeer = findViewById(R.id.selector_beeer);
        findBeer = findViewById(R.id.btn_find);

        findBeer.setOnClickListener(v -> {
            brands.setText("Cerveza:\n");
            String  brandSelected = String.valueOf(typeBeer.getSelectedItem());
            StringBuilder typeFormatted = new StringBuilder();

            List<String> typesOfBeerList = beerExpert.getAllTypesBeer(brandSelected);

            for( String type : typesOfBeerList){
                typeFormatted.append(type).append("\n");
            }

            brands.setText(typeFormatted);
        });


    }

}
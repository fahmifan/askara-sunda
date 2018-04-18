package io.github.fahmifan.askara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AksaraSundaKuno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aksara_list);

        // Create a list of aksara
        ArrayList<Aksara> aksaras = new ArrayList<Aksara>();
        aksaras.add(new Aksara("Ka"));
        aksaras.add(new Aksara("Ga"));
        aksaras.add(new Aksara("Nga"));
        aksaras.add(new Aksara("Ca"));
        aksaras.add(new Aksara("Ja"));
        aksaras.add(new Aksara("Nya"));

        // Create an {@link AksaraAdpater}
        AksaraAdapter aksaraAdapter = new AksaraAdapter(this, aksaras);

        ListView listView = (ListView) findViewById(R.id.aksara_list);

        listView.setAdapter(aksaraAdapter);

    }
}

package io.github.fahmifan.askara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onSundaBakuClick();
        onSundaKunoClick();
    }

    private void onSundaKunoClick() {
        findViewById(R.id.btn_sunda_kuno).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AksaraSundaKuno.class);
            startActivity(intent);
        });
    }

    private void onSundaBakuClick() {
        findViewById(R.id.btn_sunda_baku).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AksaraSundaBaku.class);
            startActivity(intent);
        });

    }
}

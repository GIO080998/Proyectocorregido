package MDGF.edu.tesoem.itics.proyectomdgf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dellActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell);
    }

    public void sig143(View v) {
        Intent sig143 = new Intent(this, MenuActivity.class);
        startActivity(sig143);
    }}
package com.ecommerce.merchant.fypproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.Objects;

public class TermOfServicesActivity extends AppCompatActivity {
    private Toolbar contenttoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_of_services);

        contenttoolbar = findViewById(R.id.termServiceToolbar);
        setSupportActionBar(contenttoolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle(getResources().getString(R.string.TOS));

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    public  boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}

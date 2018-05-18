package com.accenture.accenfindskills;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;

public class personaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona_detail);
     //  Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
      //  setSupportActionBar(toolbar);

        FloatingActionButton faby = (FloatingActionButton) findViewById(R.id.faby);
        faby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString(personaDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(personaDetailFragment.ARG_ITEM_ID));
            personaDetailFragment fragment = new personaDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.persona_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            navigateUpTo(new Intent(this, personaListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
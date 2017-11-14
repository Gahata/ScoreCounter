package com.example.pawel.scorecounter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.pawel.scorecounter.MainActivity.colorizeToolbar;

public class AboutActivity extends AppCompatActivity {

    Context context = this;

    TextView toolbarTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbarTextView = toolbar.findViewById(R.id.toolbar_title);
        toolbarTextView.setText(getResources().getString(R.string.toolbar_title));

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        colorizeToolbar(toolbar, getResources().getColor(R.color.md_white_1000), getResources().getColor(R.color.md_blue_grey_700), this);
        //showing the back arrow
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //intent for sending mail
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:pkjezierski@gmail.com"));
                startActivity(emailIntent);
            }
        });
    }

    //back arrow button (titlebar) code
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
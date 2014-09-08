package com.example.yuudachi.mobilecheckup;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yuudachi.mobilecheckup.R;

public class MyActivity3 extends ActionBarActivity implements AdapterView.OnItemClickListener{
    public final static String EXTRA_MESSAGE = "com.example.mobilecheckup.MESSAGE";
    ListView dl;
    String[] dla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity3);
        dl = (ListView)findViewById(R.id.listv4);
        dla = getResources().getStringArray(R.array.DiseaseList);
        dl.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dla));
        dl.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> a, View view, int i, long l) {
        Intent intent = new Intent(this,MyActivity4.class);
        intent.putExtra(EXTRA_MESSAGE,dla[i].toString());
        startActivity(intent);
    }
}

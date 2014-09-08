package com.example.yuudachi.mobilecheckup;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.yuudachi.mobilecheckup.R;

public class MyActivity2 extends ActionBarActivity implements AdapterView.OnItemClickListener {
    ArrayAdapter<String> array;
    ListView culv;
    ListView sllv3;
    String[] items2;
    String[] items;
    int[] z;
    int[] check;
    int[] temp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity2);
        items2 =  getResources().getStringArray(R.array.SymptomList);
        items = new String[0];
        check= new int[items2.length];
        for(int i = 0; i < check.length;i++)
            check[i] = -1;
        z = new int[0];
        culv = (ListView) findViewById(R.id.sslv);
        sllv3 = (ListView) findViewById(R.id.lv3);
        culv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
        culv.setOnItemClickListener(this);
        sllv3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items2));
        sllv3.setOnItemClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_activity2, menu);
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
    public void act(View view){
        findViewById(R.id.checkUps).setVisibility(View.INVISIBLE);
        findViewById(R.id.addSym).setVisibility(View.VISIBLE);
    }
    public void act2(View view){
        findViewById(R.id.checkUps).setVisibility(View.INVISIBLE);

    }
    public void act3(View view){
        findViewById(R.id.checkUps).setVisibility(View.INVISIBLE);
        findViewById(R.id.addSign).setVisibility(View.VISIBLE);
    }
    public void back(View view){
        findViewById(R.id.addSign).setVisibility(View.INVISIBLE);
        findViewById(R.id.addSym).setVisibility(View.INVISIBLE);
        findViewById(R.id.checkUps).setVisibility(View.VISIBLE);
    }

    @Override
    public void onItemClick(AdapterView<?> a, View view, int i, long l) {
        String[] temp;
        int k;
        if(a==culv) {
            items2[z[i]] = items2[z[i]].substring(1);
            check[z[i]]=-1;
            temp = new String[items.length - 1];
            for (k = 0; !items[i].equals(items[k]) && k < temp.length; k++) {
                temp[k] = items[k];
                temp2[k] = z[k];
            }
            for (; k < temp.length; k++) {
                temp[k] = items[k + 1];
                temp2[k] = z[k+1];
                check[temp2[k]] = k;
            }
            items = temp;
            sllv3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items2));
            culv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
        }
        if(a==sllv3){
            if(check[i]==-1) {
                items2[i] = "*" + items2[i];
                temp = new String[items.length + 1];
                temp2 = new int[z.length+1];
                for (k = 0; k < items.length; k++) {
                    temp2[k] = z[k];
                    temp[k] = items[k];
                }
                temp[k] = items2[i];
                temp2[k] = i;
                items = temp;
                check[i] = k;
                z = temp2;
                sllv3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items2));
                culv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
            }
            else{
                items2[i] = items2[i].substring(1);
                temp = new String[items.length - 1];
                for (k = 0; !items[check[i]].equals(items[k]) && k < temp.length; k++) {
                    temp[k] = items[k];
                    temp2[k] = z[k];
                }
                for (; k < temp.length; k++) {
                    temp[k] = items[k + 1];
                    temp2[k] = z[k+1];
                    check[z[k]] = k;
                }
                items = temp;
                check[i] = -1;
                sllv3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items2));
                culv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
            }
        }
    }


}

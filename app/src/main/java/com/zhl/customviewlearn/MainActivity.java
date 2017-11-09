package com.zhl.customviewlearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()){
            case R.id.menu1:
                intent = new Intent(this,CustomView2Activity.class);
                break;
            case R.id.menu2:
                intent = new Intent(this,CustomView2Activity.class);
                startActivity(intent);
                break;
            case R.id.menu3:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

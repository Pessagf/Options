package com.example.user.options;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void toDoList(View v){

        Intent intent = new Intent(this,ToDoList.class);
        startActivity(intent);
    }
    public void shoppingList(View V){

        Intent intent = new Intent(this,ShoppingList.class);
        startActivity(intent);
    }


    public void packingList(View v){

        Intent intent = new Intent(this,PackingList.class);
        startActivity(intent);
    }
    public void menu(View v){

        Intent intent = new Intent(this,MenuOption.class);
        startActivity(intent);
    }
    public void invite(View v){

        Intent intent = new Intent(this,Invite.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

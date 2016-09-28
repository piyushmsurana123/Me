package com.example.rakesh.me;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.rakesh.me.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void intro(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void skills(View view) {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
    public void andro(View view) {
        Intent intent = new Intent(this,Main4Activity.class);
        startActivity(intent);
    }
    public void achi(View view) {
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }
    public void expe(View view) {
        Intent intent = new Intent(this,Main6Activity.class);
        startActivity(intent);
    }
    public void dream(View view) {
        Intent intent = new Intent(this,Main7Activity.class);
        startActivity(intent);
    }


}

package com.example.saggi.clothesstore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Saggi on 05/12/2017.
 */

public class ReadMe extends AppCompatActivity implements View.OnClickListener {


Button getBackToMenu;
EditText myInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_me_layout);
        getBackToMenu = (Button)findViewById(R.id.back_to_menu);
        getBackToMenu.setOnClickListener(this);
        myInfo = (EditText)findViewById(R.id.app_info);
        myInfo.setText("My Application is a clothe store that provide services to customer" +
                "through the network");
        myInfo.setEnabled(false);
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.back_to_menu:
                Intent info = new Intent(this, Menu.class);
                startActivity(info);
                break;
        }
    }
}

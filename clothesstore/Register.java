package com.example.saggi.clothesstore;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends AppCompatActivity implements View.OnClickListener {

Button submit,upload;
    private static final int PICK_IMAGE=100;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        submit = (Button)findViewById(R.id.upload);
        submit.setOnClickListener(this);
        upload = (Button)findViewById(R.id.submit);
        upload.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
    int id = view.getId();
    switch (id){
        case R.id.upload:
            openGallery();
            break;
        case R.id.submit:
            Toast.makeText(this,"Registered Successfully",Toast.LENGTH_SHORT).show();

            Intent back = new Intent(this,MainActivity.class);
            startActivity(back);
            break;
    }
    }


    private void  openGallery ()
    {
        Intent gallery=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery,PICK_IMAGE);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode==RESULT_OK && requestCode ==PICK_IMAGE)
        {
            imageUri=data.getData();
        }
    }
}

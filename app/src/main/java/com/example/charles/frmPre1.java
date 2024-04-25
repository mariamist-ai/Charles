package com.example.charles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;

public class frmPre1 extends AppCompatActivity {

    EditText txta, txtm, txtd, txte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frm_pre1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txta=findViewById(R.id.txtanio1);
        txtm=findViewById(R.id.txtmes1);
        txtd=findViewById(R.id.txtdia1);
        txte=findViewById(R.id.txtrespuesta1);

    }

    public void EdadPersona(View view){
        int d=Integer.parseInt(txtd.getText().toString());
        int m=Integer.parseInt(txtm.getText().toString());
        int a=Integer.parseInt(txta.getText().toString());
        Date x=new Date();
        int e=x.getYear()-a+1900;
        if((m-1>x.getMonth()) ||(m-1==x.getMonth() && d>x.getDate()))e--;
        txte.setText(e+"");
    }

    public void Inicio(View view){
        Intent x= new Intent(this, MainActivity.class);
        startActivity(x);
    }

}
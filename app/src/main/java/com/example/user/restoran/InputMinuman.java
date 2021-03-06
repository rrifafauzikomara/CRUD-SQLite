package com.example.user.restoran;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class InputMinuman extends AppCompatActivity {
    DataHelper dbHelper;
    Button simpan, kembali;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_minuman);
        dbHelper = new DataHelper(this);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        cb5 = (CheckBox) findViewById(R.id.checkBox5);
        cb6 = (CheckBox) findViewById(R.id.checkBox6);
        cb7 = (CheckBox) findViewById(R.id.checkBox7);
        cb8 = (CheckBox) findViewById(R.id.checkBox8);
        cb9 = (CheckBox) findViewById(R.id.checkBox9);
        cb10 = (CheckBox) findViewById(R.id.checkBox10);
        simpan = (Button) findViewById(R.id.btnSimpan);
        kembali = (Button) findViewById(R.id.btnKembali);
        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                String a = "";
                if (cb1.isChecked()) {
                    a += "Teh Pucuk\n";
                }
                if (cb2.isChecked()) {
                    a += "Es Jeruk\n";
                }
                if (cb3.isChecked()) {
                    a += "Es Teh Manis\n";
                }
                if (cb4.isChecked()) {
                    a += "Capucino Cincau\n";
                }
                if (cb5.isChecked()) {
                    a += "Es Pisang Ijo\n";
                }
                if (cb6.isChecked()) {
                    a += "Soda Milk\n";
                }
                if (cb7.isChecked()) {
                    a += "Juice Nanas\n";
                }
                if (cb8.isChecked()) {
                    a += "Juice Mangga\n";
                }
                if (cb9.isChecked()) {
                    a += "Juice Naga\n";
                }
                if (cb10.isChecked()) {
                    a += "Juice Lemon\n";
                }

                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into minuman(nama) values('" + a + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                Minuman.mi.RefreshList();
                finish();
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
// TODO Auto-generated method stub
                finish();
            }
        });

    }

}

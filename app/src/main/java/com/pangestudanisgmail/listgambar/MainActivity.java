package com.pangestudanisgmail.listgambar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] maintitle = {
            "Sepatu Vans 01", "Sepatu Vans 02",
            "Sepatu Vans 03", "Sepatu Vans 04",
            "Sepatu Vans 05",
    };
    String[] subtitle = {
            "deskripsi", "deskripsi",
            "deskripsi", "deskripsi",
            "deskripsi",
    };
    Integer[] imgid = {
            R.drawable.coba1, R.drawable.coba2,
            R.drawable.coba3, R.drawable.coba4,
            R.drawable.coba1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListAdapter adapter = new MyListAdapter(this, maintitle, subtitle, imgid);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
// TODO Auto-generated method stub
                if (position == 0) {
//code specific to first list item
                    Toast.makeText(getApplicationContext(), "Place Your First Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(), "Place Your Second Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    Toast.makeText(getApplicationContext(), "Place Your Third Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    Toast.makeText(getApplicationContext(), "Place Your Forth Option Code", Toast.LENGTH_SHORT).show();
                } else if (position == 4) {
                    Toast.makeText(getApplicationContext(), "Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

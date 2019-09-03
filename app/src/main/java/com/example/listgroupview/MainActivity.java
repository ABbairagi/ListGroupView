package com.example.listgroupview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String list[]={
            "Hello",
            "Hii",
            "bye",
            "chitti",
            "Robo",
            "chintu",
            "pintu"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<GroupClass> it=new ArrayList<>();

        it.add(new GroupClass("hello 1st","ur first buddy",R.drawable.chrysanthemum));
        it.add(new GroupClass("Hii 2nd","ur second",R.drawable.hydrangeas));
        it.add(new GroupClass("bye 3rd","ur third buddy",R.drawable.jelly));
        it.add(new GroupClass("chitti 4th","ur 4th buddy",R.drawable.lighthouse));
        it.add(new GroupClass("Robo 5th","ut 5th buddy",R.drawable.pen));
        it.add(new GroupClass("Chintu 6th","ur 6th buddy",R.drawable.tul));
        it.add(new GroupClass("Pintu","ut 7th buddy",R.drawable.back));

        UserAdapter userAdapter=new UserAdapter(MainActivity.this,it);

        ListView listView=findViewById(R.id.list_view);

        listView.setDivider(null);
        listView.setAdapter(userAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Dialog dialog = new Dialog(MainActivity.this);//created a dialog object
                dialog.setContentView(R.layout.alert);//set the content view
                TextView text = dialog.findViewById(R.id.alert_text_view);
                Button done = dialog.findViewById(R.id.done_btn);

                text.setText(list[position]);
                dialog.show();

                done.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        });

    }
}

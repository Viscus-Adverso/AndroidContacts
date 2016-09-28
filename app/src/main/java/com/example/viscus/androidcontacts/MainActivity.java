package com.example.viscus.androidcontacts;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {
    ListView contactList;
    EditText name;
    EditText phone;
    Button addContact;

    ArrayAdapter<ContactList> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contactList = (ListView) findViewById(R.id.contactList);
        name = (EditText) findViewById(R.id.name);
        phone = (EditText) findViewById(R.id.phone);
        addContact = (Button) findViewById(R.id.addContact);

        items = new ArrayAdapter<ContactList>(this, android.R.layout.simple_list_item_1);
        contactList.setAdapter(items);


        addContact.setOnClickListener(this);
        contactList.setOnItemLongClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String n = name.getText().toString();
        String p = phone.getText().toString();
        if (!n.isEmpty() && !p.isEmpty()) {

        }
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        ContactList item = items.getItem(position);
        items.remove(item);
        return true;
    }

}










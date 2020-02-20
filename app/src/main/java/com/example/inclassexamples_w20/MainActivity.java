package com.example.inclassexamples_w20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContentView loads objects onto the screen.
        // Before this function, the screen is empty.
        setContentView(R.layout.activity_main);

        //Now that the screen was loaded, use findViewByid() to
        // get load the objects in Java:
        ListView myList = findViewById(R.id.theListView);

        myList.setAdapter( myAdapter = new MyListAdapter() );

        //EditText theEdit = findViewById(R.id.firstEditText);

        String message = getResources().getString(R.string.hello);
        theEdit.setText(message);

        final Button btn = findViewById(R.id.myButton);
        btn.setText("New strings");
        btn.setOnClickListener( (click) ->  { btn.setText("You clicked me"); }  );


        CheckBox cb = findViewById(R.id.checkb);
        cb.setOnCheckedChangeListener( (compoundButton, b) -> {

          //  Toast.makeText(MainActivity.this, "Checkbox is " + b, Toast.LENGTH_LONG).show();
            Snackbar.make(theEdit, "Checkbox is " + b, Snackbar.LENGTH_LONG)
                    .setAction("Undo", click-> compoundButton.setChecked( !b ))
                    .show();

        });
    }
}

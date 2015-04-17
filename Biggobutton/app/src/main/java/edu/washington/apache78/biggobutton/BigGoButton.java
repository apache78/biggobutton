package edu.washington.apache78.biggobutton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class BigGoButton extends ActionBarActivity {
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_go_button);
        counter=0;
        final Button button = (Button) findViewById(R.id.gobutton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                button.setText("You clicked me " + counter + "times!");

            }
        });
    }

}

package com.jnu.student;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonMainActivity extends AppCompatActivity {

    private Button buttonHelloEn,buttonHelloCn;
    private TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);

        buttonHelloCn=this.findViewById(R.id.buttonHelloWorldCN);
        buttonHelloEn=this.findViewById(R.id.butttonHelloWorldEN);
        textViewHelloWorld=this.findViewById(R.id.textViewHelloWorld);

        buttonHelloCn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textViewHelloWorld.setText(buttonHelloCn.getText());
            }
        });

        buttonHelloEn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textViewHelloWorld.setText(buttonHelloEn.getText());
            }
        });
    }
}

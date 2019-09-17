package com.jnu.student;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewMainActivity extends AppCompatActivity {


    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_main);

        textView=findViewById(R.id.text_view_hello_world);

        Context context=this.getApplicationContext();
        String resName="Hello_Android";
        int helloWorldId=context.getResources().getIdentifier(resName,"string",context.getPackageName());
        textView.setText(this.getString(helloWorldId));

    }
}


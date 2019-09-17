package com.jnu.student;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeLanguageMainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;
    String curLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_main);

        editText=findViewById(R.id.edit_text_country);
        textView=findViewById(R.id.text_view_language);
        button=findViewById(R.id.button_change_language);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                curLanguage=editText.getText().toString();
                String cn="cn";
                String en="en";
                String jp="jp";
                String kr="kr";
                if(curLanguage.equals(cn)){
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            textView.setText(R.string.Language_CN);
                            button.setText(R.string.Language_Change_CN);
                        }
                    });
                }
                if(curLanguage.equals(en)){
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            textView.setText(R.string.Language_EN);
                            button.setText(R.string.Language_Change_EN);
                        }
                    });
                }
                if(curLanguage.equals(jp)){
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            textView.setText(R.string.Language_JP);
                            button.setText(R.string.Language_Change_JP);
                        }
                    });
                }
                if(curLanguage.equals(kr)){
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            textView.setText(R.string.Language_KR);
                            button.setText(R.string.Language_Change_KR);
                        }
                    });
                }
            }
        });
    }
}

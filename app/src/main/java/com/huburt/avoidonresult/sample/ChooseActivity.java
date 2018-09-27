package com.huburt.avoidonresult.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.huburt.avoidonresult.R;

/**
 * Created by hubert on 2018/9/27.
 */
public class ChooseActivity extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        et = findViewById(R.id.et);

        findViewById(R.id.btn_ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = et.getText().toString();
                Intent data = new Intent();
                data.putExtra("text", text);
                setResult(RESULT_OK,data);
            }
        });
    }
}

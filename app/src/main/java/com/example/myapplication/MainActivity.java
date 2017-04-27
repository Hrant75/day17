package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(this);


        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        Test test = new Test();
        bundle.putSerializable("sdfsdf", test);
        intent.putExtras(bundle);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button: {
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("a", "sdfsdfs sdfsdfsdf");
                startActivity(intent);
            }
        }
    }
}

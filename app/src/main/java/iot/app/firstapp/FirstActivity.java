package iot.app.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FirstActivity", "创建FirstActivity");
        setContentView(R.layout.activity_first);
        //通过根R和按钮ID找到按钮组件
        Button button2 = findViewById(R.id.hellobtn);
        //添加点击事件
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                TODO:同学们自己完成这里的关键代码
                Toast.makeText(FirstActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
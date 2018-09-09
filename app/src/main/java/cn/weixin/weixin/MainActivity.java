package cn.weixin.weixin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private TextView textView;
  private ImageView imageView;
  private Button btnNext;
  private int[] arr= {R.drawable.dog1,R.drawable.dog2,R.drawable.dog3,R.drawable.dog4,R.drawable.dog5};
  private int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView  = findViewById(R.id.text1);
        textView.setText(R.string.lovename);
        textView.setTextColor(Color.BLUE);


        imageView = findViewById(R.id.imageView);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            imageView.setImageResource(arr[index]);
            index = (index+1)% arr.length;
            }
        });
    }
}

package ru.lastgear.myapplication_less_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    ImageView iv1;

    Button bt1, bt2, bt3;

    public static final String TAG = "MyLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d(TAG, "Запустилось");

        tv1 = (TextView)findViewById(R.id.tv1);

        iv1 = (ImageView)findViewById(R.id.iv1);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.bt1:
                        tv1.setText("НАжата кнопка 1");
                        break;
                    case R.id.bt2:
                        tv1.setText("НАжата кнопка 2");
                        break;
                    case R.id.bt3:
                        tv1.setText("НАжата кнопка 3");
                        break;
                }
            }
        };

        bt1.setOnClickListener(onClickListener);
        bt2.setOnClickListener(onClickListener);
        bt3.setOnClickListener(onClickListener);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("Large Text");
                iv1.setImageDrawable(getResources().getDrawable(R.drawable.ic_brightness_6_black_24dp));

            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv1.setImageDrawable(getResources().getDrawable(R.drawable.ic_brightness_7_black_48dp));
            }
        });

    }

}

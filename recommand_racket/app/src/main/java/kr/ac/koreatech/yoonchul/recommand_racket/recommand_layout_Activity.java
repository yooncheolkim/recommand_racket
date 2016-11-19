package kr.ac.koreatech.yoonchul.recommand_racket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by yoonchul on 2016-11-19.
 */

public class recommand_layout_Activity extends AppCompatActivity {
    TextView tv_power;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommand_layout);


        tv_power = (TextView)findViewById(R.id.power);

        Intent intent = getIntent();

        //이전 인텐트에서 넘어온 값들
        String temp_gender = intent.getStringExtra("gender");
        int temp_weight = intent.getIntExtra("weight",1);
        int temp_height = intent.getIntExtra("height",1);
        String temp_type = intent.getStringExtra("type");
        int temp_price = intent.getIntExtra("price",1);
        double power = intent.getDoubleExtra("power",1); //double


        tv_power.setText(Double.toString(power));

    }
}

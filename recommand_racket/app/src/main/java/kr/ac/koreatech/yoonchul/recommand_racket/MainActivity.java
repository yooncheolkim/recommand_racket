package kr.ac.koreatech.yoonchul.recommand_racket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup gender;
    RadioButton male;
    RadioButton female;

    EditText weight;
    EditText height;

    RadioGroup type;
    RadioButton allrounder;
    RadioButton defensive;
    RadioButton offensive;

    EditText price;

    Button next;

    Button price_button;
    Button height_button;
    Button weight_button;
    Button style_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender = (RadioGroup) findViewById(R.id.gender);
        male = (RadioButton) findViewById(R.id.radio_male);
        female = (RadioButton) findViewById(R.id.radio_female);

        weight = (EditText) findViewById(R.id.weight);
        height = (EditText) findViewById(R.id.height);

        type = (RadioGroup) findViewById(R.id.type);
        allrounder = (RadioButton) findViewById(R.id.allrounder);
        defensive = (RadioButton) findViewById(R.id.defensive);
        offensive = (RadioButton) findViewById(R.id.offensive);

        price = (EditText) findViewById(R.id.price);

        next = (Button) findViewById(R.id.next);
        price_button = (Button) findViewById(R.id.price_button);
        height_button = (Button) findViewById(R.id.height_button);
        weight_button = (Button) findViewById(R.id.weight_button);
        style_button = (Button) findViewById(R.id.style_button);

        style_button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "올라운더 : 공격, 수비 다 자신있다! \n"+
                                                        "수비형 : 수비가 자신있다! \n" +
                                                        "공격형 : 공격이 자신있다! ",Toast.LENGTH_SHORT).show();
            }
        });
        price_button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "'5만원 ~ 35만원' 사이로 입력하세요.",Toast.LENGTH_SHORT).show();
            }
        });

        height_button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "'100cm ~ 250cm' 사이로 입력하세요.",Toast.LENGTH_SHORT).show();
            }
        });

        weight_button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "'30kg ~ 150kg' 사이로 입력하세요.",Toast.LENGTH_SHORT).show();
            }
        });




        next.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                //오류 검출
                String getEdit_w = weight.getText().toString();
                getEdit_w = getEdit_w.trim();

                String getEdit_h = height.getText().toString();
                getEdit_h = getEdit_h.trim();

                String getEdit_p = price.getText().toString();
                getEdit_p = getEdit_p.trim();

                if((getEdit_w.getBytes().length<=0) ||(getEdit_h.getBytes().length<=0)||(getEdit_p.getBytes().length<=0)){
                    Toast.makeText(getApplicationContext(), "빈칸이 있습니다. 채워주세용.",Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!(male.isChecked()|| female.isChecked()) || !(allrounder.isChecked() || defensive.isChecked() || offensive.isChecked()) )
                {
                    Toast.makeText(getApplicationContext(), "빈칸이 있습니다. 채워주세용.",Toast.LENGTH_SHORT).show();
                    return;
                }

                //엉뚱한 입력값을 걸러내기 위해
                int weight_compare = Integer.parseInt(weight.getText().toString());
                int height_compare = Integer.parseInt(height.getText().toString());
                int price_compare = Integer.parseInt(price.getText().toString());

                //라디오버튼 값 처리
                String putGender;
                String putType;
                if(gender.getCheckedRadioButtonId() == male.getId())
                    putGender = "male";
                else if(gender.getCheckedRadioButtonId() == female.getId())
                    putGender = "female";
                else
                    putGender = "";

                if(type.getCheckedRadioButtonId() == allrounder.getId())
                    putType = "allrounder";
                else if(type.getCheckedRadioButtonId() == defensive.getId())
                    putType = "defensive";
                else
                    putType = "offensive";


                //오류 걸러내기기
                if (weight_compare < 30 || weight_compare > 150) {
                    Toast.makeText(getApplicationContext(), "몸무게를 정확히 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (height_compare < 100 || height_compare > 250) {
                    Toast.makeText(getApplicationContext(), "키를 정확히 입력하세요.", Toast.LENGTH_SHORT).show();
                } else if (price_compare < 50000 || price_compare > 350000) {
                    Toast.makeText(getApplicationContext(), "찾을수 있는 라켓이 없습니다. 가격을 다시 입력해주세요.", Toast.LENGTH_SHORT).show();
                } else if (type.isContextClickable() || gender.isContextClickable()) {
                    Toast.makeText(getApplicationContext(), "성별/ 스타일을 선택하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), calPower_Activity.class);
                    intent.putExtra("gender", putGender);  //string
                    intent.putExtra("weight", weight_compare);  //int
                    intent.putExtra("height", height_compare);  //int
                    intent.putExtra("type", putType);   //string
                    intent.putExtra("price", price_compare);    //int
                    startActivity(intent);
                }


            }
        });
    }




}
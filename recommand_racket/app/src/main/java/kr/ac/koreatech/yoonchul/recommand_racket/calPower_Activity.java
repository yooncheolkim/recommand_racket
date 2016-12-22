package kr.ac.koreatech.yoonchul.recommand_racket;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.Date;


/**
 * Created by yoonchul on 2016-11-14.
 */

public class calPower_Activity extends AppCompatActivity {
    SensorManager sm;
    SensorEventListener acc;
    Sensor accSensor;

    //double [] ia_p = new double[1000];//힘 측정하기 위한 순간가속도값 배열
    //int i=0; //배열 카운트

    //int mCount=0;// 시간 측정하기 위한 변수
    //boolean running = true; // 시간 측정하기 위한 변수
    //CountThread w;


    TextView x;
    TextView y;
    TextView z;
    TextView ia;

    long start;
    //가속도 저장을 위한 변수
    double tmpAcc = 0;
    double maxAcc = 0;

    String gender;
    int weight;
    int height;
    String type;
    int price;


    protected void onCreate(Bundle savedInstanceState) {
        start = new Date().getTime();
        tmpAcc = 0.;
        maxAcc = 0.;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_power);

        Intent intent = getIntent();
        //이전 인텐트에서 넘어온 값들
        String temp_gender = intent.getStringExtra("gender");
        int temp_weight = intent.getIntExtra("weight",1);
        int temp_height = intent.getIntExtra("height",1);
        String temp_type = intent.getStringExtra("type");
        int temp_price = intent.getIntExtra("price",1);

        //다음으로 넘어갈 인텐트 값들
        gender = temp_gender;
        weight = temp_weight;
        height = temp_height;
        type = temp_type;
        price = temp_price;

        x = (TextView)findViewById(R.id.x);
        y = (TextView)findViewById(R.id.y);
        z = (TextView)findViewById(R.id.z);
        ia = (TextView)findViewById(R.id.ia);


        sm = (SensorManager)getSystemService(SENSOR_SERVICE);  // SensorManager 인스턴스를 가져옴
        accSensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        acc = new accListener();



        //w = new CountThread();
        //running = true;
        //w.start();

    }
    /*
    @Override
    protected void onStart(){
        super.onStart();
        w = new CountThread();
        running = true;
        w.start();
    }
    */
    /*
    @Override
    protected void onStop(){
        super.onStop();
        running = false;
    }
    */
    @Override
    public void onResume(){
        super.onResume();

        sm.registerListener(acc,accSensor,SensorManager.SENSOR_DELAY_GAME);//가속도 센서 리스너 오브젝트를 등록

        start = new Date().getTime();
        tmpAcc = 0.;
        maxAcc = 0.;

        //running = true;
    }

    @Override
    public void onPause(){
        super.onPause();
        sm.unregisterListener(acc); //unregister orientation listener

        //running = false;
    }

    private class accListener implements SensorEventListener{
        public void onSensorChanged(SensorEvent event){//가속도 센서 값이 바뀔때마다 호출됨
            if(new Date().getTime() > start + 5000) {
                double realPower = 0;

                //성별과 몸무게에 따라 힘을 다르게 주기

                if(gender.equals("male"))
                    realPower = maxAcc * weight*2.85/100;
                else if(gender.equals("female"))
                    realPower = maxAcc * weight*2.49/100;
                else
                    realPower = maxAcc;


                Intent intent = new Intent(getApplicationContext(), recommand_layout_Activity.class);
                intent.putExtra("gender", gender);  //string
                intent.putExtra("weight", weight);  //int
                intent.putExtra("height", height);  //int
                intent.putExtra("type", type);   //string
                intent.putExtra("price", price);    //int
                intent.putExtra("power", realPower); //double
                startActivity(intent);
            }



            //x.setText(Float.toString(event.values[0]));
            //y.setText(Float.toString(event.values[1]));
            //z.setText(Float.toString(event.values[2]));

            double tmpAcc = Math.pow(event.values[0],2) + Math.pow(event.values[1],2) + Math.pow(event.values[2],2);
            maxAcc = (maxAcc > tmpAcc)? maxAcc : tmpAcc;

            //ia.setText(Double.toString(maxAcc));

/*
            //힘을 측정하는 알고리즘
            if(2500<temp_ia_p){
                ia_p[i] = temp_ia_p;
                i++;

                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            ia.setText(String.valueOf(ia_p));
            //가속도 변할때마다 너무 많은 가속도 값을 넣으면.... 안돼니깐, 하나씩 넣기 위해...
*/

        }
        public void onAccuracyChanged(Sensor sensor, int accuracy){}
    }

/*
    //10초 카운트 그리고 ia_p 배열에 저장된 값을 이용하여 평균 가속도 구하기.
    class CountThread extends Thread{
        public void run(){

            for(int i=0;i<10 &&running;i++){
                mCount++;

                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                Log.d("Mobile Programming", "Thread: time =" + mCount);
            }

            //순간가속도들 평균 내기
            for(int j=0;j<ia_p.length;j++) {
                temp += ia_p[j];
            }
            avg_acc = temp/ia_p.length;



        }
    }
    */
}

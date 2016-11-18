package kr.ac.koreatech.yoonchul.recommand_racket;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by yoonchul on 2016-11-14.
 */

public class calPower_Activity extends AppCompatActivity {
    SensorManager sm;
    SensorEventListener acc;
    Sensor accSensor;

    double ia_p=0;


    TextView x;
    TextView y;
    TextView z;
    TextView ia;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_power);

        Intent intent = getIntent();

        String gender = intent.getStringExtra("gender");
        int weight = intent.getIntExtra("weight",1);
        int height = intent.getIntExtra("height",1);
        String type = intent.getStringExtra("type");
        int price = intent.getIntExtra("price",1);


        x = (TextView)findViewById(R.id.x);
        y = (TextView)findViewById(R.id.y);
        z = (TextView)findViewById(R.id.z);

        ia = (TextView)findViewById(R.id.ia);

        sm = (SensorManager)getSystemService(SENSOR_SERVICE);  // SensorManager 인스턴스를 가져옴
        accSensor = sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        acc = new accListener();



    }

    @Override
    public void onResume(){
        super.onResume();

        sm.registerListener(acc,accSensor,SensorManager.SENSOR_DELAY_GAME);//가속도 센서 리스너 오브젝트를 등록
    }

    @Override
    public void onPause(){
        super.onPause();
        sm.unregisterListener(acc); //unregister orientation listener
    }

    private class accListener implements SensorEventListener{
        public void onSensorChanged(SensorEvent event){//가속도 센서 값이 바뀔때마다 호출됨
            x.setText(Float.toString(event.values[0]));
            y.setText(Float.toString(event.values[1]));
            z.setText(Float.toString(event.values[2]));

            double temp_ia_p;
            temp_ia_p = Math.pow(event.values[0],2) + Math.pow(event.values[1],2) + Math.pow(event.values[2],2);

            if(ia_p <temp_ia_p){
                ia_p = temp_ia_p;
            }

            ia.setText(String.valueOf(ia_p));

        }
        public void onAccuracyChanged(Sensor sensor, int accuracy){}


    }

    class TimeControl extends Thread{
        public void run(){
            SensorEventListener acc_2;
            acc_2 = new accListener();

        }
    }

}

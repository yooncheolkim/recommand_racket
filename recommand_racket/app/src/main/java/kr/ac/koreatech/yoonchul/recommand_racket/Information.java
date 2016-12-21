package kr.ac.koreatech.yoonchul.recommand_racket;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.onClick;

/**
 * Created by yoonchul on 2016-12-21.
 */

public class Information extends AppCompatActivity{
    private DBHelper helper;
    private SQLiteDatabase db;
    private Cursor c;

    ImageView IV;
    TextView E_RC_name;
    TextView E_RC_company;
    TextView E_RC_weight;
    TextView E_RC_balance;
    TextView E_RC_shaft;
    TextView E_RC_price;
    Button B_RC_page;

    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_racket);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        helper = new DBHelper(this);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException e) {
            db = helper.getReadableDatabase();
        }
                IV = (ImageView)findViewById(R.id.RC_view);
                E_RC_name = (TextView)findViewById(R.id.RC_name);
                E_RC_company = (TextView)findViewById(R.id.RC_company);
                E_RC_weight = (TextView)findViewById(R.id.RC_weight);
                E_RC_balance = (TextView)findViewById(R.id.RC_balance);
                E_RC_shaft = (TextView)findViewById(R.id.RC_shaft);
                E_RC_price = (TextView)findViewById(R.id.RC_price);
                B_RC_page = (Button)findViewById(R.id.RC_page);



        c = db.rawQuery("select * from contacts where racket_name = '"+name+"' ", null);
        c.moveToFirst();

        String rc_name = c.getString(1); //라켓이름
        String rc_company = c.getString(2); // 제작사
        int rc_weight = c.getInt(3); // 무게
        String rc_balance = c.getString(4); // 발란스
        String rc_shaft = c.getString(5); // 샤프트
        int rc_price = c.getInt(6); // 가격
        String rc_row_name = c.getString(7);//사진 찾기 위한...
        String rc_url = c.getString(8);
        url = rc_url;
        int resID = getResources().getIdentifier(rc_row_name, "drawable", this.getPackageName());//resource

        IV.setImageResource(resID);
        E_RC_name.setText(rc_name);
        E_RC_company.setText(rc_company);
        E_RC_weight.setText(String.valueOf(rc_weight) + "U   ");
        E_RC_balance.setText(rc_balance);
        E_RC_shaft.setText(rc_shaft);
        E_RC_price.setText(String.valueOf(rc_price)+ "원");

        B_RC_page.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        c.close();
    }
}

package kr.ac.koreatech.yoonchul.recommand_racket;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by yoonchul on 2016-11-19.
 */

public class recommand_layout_Activity extends AppCompatActivity {
    TextView tv_power;
    private DBHelper helper;
    private SQLiteDatabase db;
    private Cursor c;
    private ListView mListView = null;
    private ListViewAdapter mAdapter = null;
    static final String TAG = "Recommand_racket";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommand_layout);
        mListView = (ListView) findViewById(R.id.lv);

        helper = new DBHelper(this);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException e) {
            db = helper.getReadableDatabase();
        }


        Intent intent = getIntent();
        //이전 인텐트에서 넘어온 값들
        String temp_gender = intent.getStringExtra("gender");
        int temp_weight = intent.getIntExtra("weight", 1);
        int temp_height = intent.getIntExtra("height", 1);
        String temp_type = intent.getStringExtra("type");
        int temp_price = intent.getIntExtra("price", 1);
        double power = intent.getDoubleExtra("power", 1); //double

        Log.i(TAG, "gender= " + temp_gender);
        Log.i(TAG, "weight= " + temp_weight);
        Log.i(TAG, "height= " + temp_height);
        Log.i(TAG, "type= " + temp_type);
        Log.i(TAG, "price= " + temp_price);
        Log.i(TAG, "power = " + power);


        int check_weight;
        String check_balance = temp_type;
        String check_shaft;
        int check_price = temp_price;

        int real_price_row = check_price - 50000;
        int real_price_up = check_price + 50000;


        //플레이 스타일 결정
        if (temp_type.equals("allrounder"))
            check_balance = "even";
        else if (temp_type.equals("defensive"))
            check_balance = "light";
        else if (temp_type.equals("offensive"))
            check_balance = "heavy";

        Log.i(TAG,"type = "+check_balance);

        //성별과 power를 측정하여 샤프트와 무게 결정
        if ((power <= 13000) && (temp_gender.equals("male"))) {//남자이고 힘이 13000이하면,
            c = db.rawQuery("select * from contacts where (balance = '" + check_balance + "') and " +//발란스 측정
                            "(price <= " + real_price_up + ") and (price >= " + real_price_row + ") and " +//가격 측정
                            "(weight = 4 or weight = 5 or weight = 6) and " +//무게 측정
                            "(shaft ='Flexible' or shaft = 'Medium' );"//샤프트 측정
                    , null);
            Log.i(TAG,"if moon = 1");
        }
        else if ((13000<power && power<= 20000) && (temp_gender.equals("male"))) {//남자이고 힘이 130000~ 20000
            c = db.rawQuery("select * from contacts where (balance = '" + check_balance + "') and " +//발란스 측정
                            "(price <= " + real_price_up + ") and (price >= " + real_price_row + ") and " +//가격 측정
                            "(weight = 3 or weight = 4 or weight = 5 or weight = 6) and " +//무게 측정
                            "(shaft = 'Medium' or shaft = 'Stiff' ) ;"//샤프트 측정
                    , null);
            Log.i(TAG,"if moon = 2");
        }
        else if ((power > 20000) && (temp_gender.equals("male"))) { //남자고 힘이 20000이상이면,
            c = db.rawQuery("select * from contacts where (balance = '" + check_balance + "') and " +//발란스 측정
                            "(price <= " + real_price_up + ") and (price >= " + real_price_row + ") and " +//가격 측정
                            "(weight = 4 or weight = 3) and " +//무게 측정
                            "(shaft = 'Medium' or shaft ='Stiff' );"//샤프트 측정
                    , null);
            Log.i(TAG,"if moon = 3");
        }
        else if ((power <= 14000) && (temp_gender.equals("female"))) {//여자고 힘이 14000이하면,
            c = db.rawQuery("select * from contacts where (balance = '" + check_balance + "') and " +//발란스 측정
                            "(price <= " + real_price_up + ") and (price >= " + real_price_row + ") and " +//가격 측정
                            "(weight = 4 or weight = 5 or weight = 6) and " +//무게 측정
                            "(shaft ='Flexible' or shaft = 'Medium');"//샤프트 측정
                    , null);
            Log.i(TAG,"if moon = 4");
        }
        else if ((14000 < power && power<=20000) && (temp_gender.equals("female"))) {//여자고 힘이 14000 ~ 20000
            c = db.rawQuery("select * from contacts where (balance = '" + check_balance + "') and " +//발란스 측정
                            "(price <= " + real_price_up + ") and (price >= " + real_price_row + ") and " +//가격 측정
                            "(weight = 4 or weight = 5 or weight = 6) and " +//무게 측정
                            "(shaft = 'Medium' or shaft = 'Stiff' );"//샤프트 측정
                    , null);
            Log.i(TAG,"if moon = 5");
        }
        else if ((power > 20000) && (temp_gender.equals("female"))) {//여자고 힘이 20000이상이면,
            c = db.rawQuery("select * from contacts where (balance = '" + check_balance + "') and " +//발란스 측정
                            "(price <= " + real_price_up + ") and (price >= " + real_price_row + ") and " +//가격 측정
                            "(weight = 5 or weight = 4 or weight = 3) and " +//무게 측정
                            "(shaft = 'Medium' or shaft = 'Stiff');"//샤프트 측정
                    , null);
            Log.i(TAG,"if moon = 6");
        }

        c.moveToFirst(); // 커서 처음으로 이동
        if (c.getCount() == 0) {
            Log.i(TAG, "해당 없음.......");
            Toast.makeText(getApplicationContext(), "적절한 라켓이 없습니다.",Toast.LENGTH_SHORT).show();
            Intent intent3 = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent3);

        }


        mAdapter = new ListViewAdapter(this);
        mListView.setAdapter(mAdapter);


        String name = c.getString(1);
        String row_name = c.getString(7);
        String company = c.getString(2);
        String resName = row_name;
        String packName = this.getPackageName();
        int resID = getResources().getIdentifier(resName, "drawable", packName);//resource
        mAdapter.addItem(getResources().getDrawable(resID), name, company);
        int i=0;
        while (c.moveToNext()) {
            name = c.getString(1);
            row_name = c.getString(7);
            company = c.getString(2);

            //drawable 폴더의 이미지를 동적으로 가져옴
            resName = row_name;
            packName = this.getPackageName();
            resID = getResources().getIdentifier(resName, "drawable", packName);//resource
            Log.i(TAG, "resName = " + resName);
            Log.i(TAG, "resID = " + resID);
            Log.i(TAG, "company = " + company);

            i++;
            if(i==3)//이러는 내가 너무 밉다....
                return;

            mAdapter.addItem(getResources().getDrawable(resID), name, company);
            //mAdapter.addItem(null, name, company);
        }

        mListView.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ListData mData = mAdapter.mListData.get(position);
                Toast.makeText(recommand_layout_Activity.this, mData.mTitle, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Information.class);
                intent.putExtra("name",mData.mTitle );  //string
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onDestroy();

        c.close();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) // 액션바 생성
    {
        getMenuInflater().inflate(R.menu.action_bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if(id == R.id.back_first)
        {
            for(int i=0; i< mAdapter.getCount();i++) // 어댑터 해제
                mAdapter.remove(i);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


    private class ViewHolder {
        public ImageView mIcon;
        public TextView mText;
        public TextView mDate;
    }

    private class ListViewAdapter extends BaseAdapter {
        private Context mContext = null;
        private ArrayList<ListData> mListData = new ArrayList<ListData>();
        public  ListData mData = new ListData();

        public ListViewAdapter(Context mContext) {
            super();
            this.mContext = mContext;
        }

        @Override
        public int getCount() {
            return mListData.size();
        }

        @Override
        public Object getItem(int position) {
            return mListData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        //한 아이템에 들어갈 레이아웃을 지정해 주는 메소드
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();

                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.listview_item, null);
                holder.mIcon = (ImageView) convertView.findViewById(R.id.racket_image);
                holder.mText = (TextView) convertView.findViewById(R.id.racket_name);
                holder.mDate = (TextView) convertView.findViewById(R.id.company);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            mData = mListData.get(position);

            if (mData.mIcon != null) {
                holder.mIcon.setVisibility(View.VISIBLE);
                holder.mIcon.setImageDrawable(mData.mIcon);
            } else {
                holder.mIcon.setVisibility(View.GONE);
            }

            holder.mText.setText(mData.mTitle);
            holder.mDate.setText(mData.mDate);
            return convertView;
        }

        //아이템 추가 메소드 구현
        public void addItem(Drawable icon, String mTitle, String mDate) {
            ListData addInfo = null;
            addInfo = new ListData();
            addInfo.mIcon = icon;
            addInfo.mTitle = mTitle;
            addInfo.mDate = mDate;

            mListData.add(addInfo);
        }

        public void remove(int position){
            mListData.remove(position);
        }



    }

}

package kr.ac.koreatech.yoonchul.recommand_racket;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yoonchul on 2016-12-19.
 */

public class DBHelper extends SQLiteOpenHelper{
    private static final String DBName = "racket.db";
    private static final int DBVer = 2;

    public DBHelper(Context context){super(context,DBName, null, DBVer);}

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(
                "Create table contacts(_id integer primary key autoincrement,racket_name TEXT,company text, weight integer, balance text, shaft text, price integer,lower_name text,url text);");

        db.execSQL("insert into contacts values(null,'DUORA10','yonex','3','even','Stiff','259000','duora10','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001008000009&code=047001001008');");
        db.execSQL("insert into contacts values(null,'DUORA7','yonex','3','even','Stiff','230000','duora7','http://www.akmall.com/goods/GoodsDetail.do?goods_id=74066454');");
        db.execSQL("insert into contacts values(null,'DUORA6','yonex','4','even','Flexible','200000','duora6','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001008000007&code=047001001008');");
        db.execSQL("insert into contacts values(null,'DUORA77','yonex','3','even','Medium','100000','duora77','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001008000002&code=047001001008');");
        db.execSQL("insert into contacts values(null,'DUORA88','yonex','3','heavy','Stiff','120000','duora88','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001008000003&code=047001001008');");
        db.execSQL("insert into contacts values(null,'ARCSABER FB','yonex','5','even','Stiff','230000','arcsaber_fb','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000042&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 10 THL','yonex','3','even','Stiff','240000','arcsaber_10_thl','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000044&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 6FL','yonex','4','even','Flexible','120000','arcsaber_6fl','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000046&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER FD','yonex','5','even','Stiff','110000','arcsaber_fd','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000045&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 1-TOUR','yonex','3','heavy','Medium','110000','arcsaber_1_tour','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000043&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 11','yonex','3','even','Stiff','240000','arcsaber_11','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000003&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER Z-SLASH','yonex','3','even','Stiff','275000','arcsaber_z_slash','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000036&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 9FL','yonex','4','even','Medium','220000','arcsaber_9fl','http://storefarm.naver.com/jyardmall/products/564076205?NaPm=ct%3Diwyp2czc%7Cci%3D3f3b68722e4a6f39d3b30c9f9a0f4ba4d0c06b50%7Ctr%3Dsls%7Csn%3D311396%7Chk%3D881293239a409fe048dc0ea6e045f2da43d80a6f');");
        db.execSQL("insert into contacts values(null,'ARCSABER 7','yonex','3','even','Medium','180000','arcsaber_7','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000001&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER i-SLASH','yonex','3','even','Medium','175000','arcsaber_i_slash','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000036&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 6','yonex','5','even','Stiff','120000','arcsaber_6','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000046&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 4DX','yonex','3','even','Stiff','90000','arcsaber_4dx','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000038&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER LITE','yonex','4','even','Medium','49000','arcsaber_lite','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000039&code=047001001003');");
        db.execSQL("insert into contacts values(null,'ARCSABER 002','yonex','3','even','Flexible','55000','arcsaber_002','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101010');");
        db.execSQL("insert into contacts values(null,'ARCSABER 001','yonex','3','even','Flexible','55000','arcsaber_001','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101010');");
        db.execSQL("insert into contacts values(null,'ARCSABER 8DX','yonex','3','even','Stiff','180000','arcsaber_8dx','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101010');");
        db.execSQL("insert into contacts values(null,'ARCSABER 5DX','yonex','3','even','Medium','159000','arcsaber_5dx','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001003000026&code=047001001003');");
        db.execSQL("insert into contacts values(null,'NANORAY GlanZ','yonex','4','light','Flexible','300000','nanoray_glanz','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000032&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY Z SPEED','yonex','3','light','Stiff','295000','nanoray_z_speed','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000044&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 900','yonex','3','light','Stiff','260000','nanoray_900','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000023&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 800','yonex','4','light','Stiff','259000','nanoray_800','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000010&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 750','yonex','4','light','Medium','220000','nanoray_750','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000004&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 700FX','yonex','4','light','Medium','200000','nanoray_700fx','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000034&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 300R','yonex','3','light','Stiff','119000','nanoray_300r','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000024&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY i-SPEED','yonex','3','light','Medium','175000','nanoray_i_speed','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000033&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY SPEED','yonex','3','light','Stiff','110000','nanoray_speed','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000025&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 95DX','yonex','3','light','Stiff','110000','nanoray_95dx','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000048&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 90DX','yonex','4','light','Stiff','120000','nanoray_90dx','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'NANORAY 70DX','yonex','4','light','Stiff','100000','nanoray_70dx','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'NANORAY D27','yonex','3','light','Medium','70000','nanoray_d27','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000035&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 60','yonex','4','light','Medium','75000','nanoray_60','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'NANORAY 20','yonex','3','light','Flexible','58000','nanoray_20','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'NANORAY 10F','yonex','4','light','Flexible','49000','nanoray_10f','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000039&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 10','yonex','4','light','Flexible','49000','nanoray_10','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'NANORAY 9','yonex','3','light','Flexible','50000','nanoray_9','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000043&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 6','yonex','3','light','Medium','45000','nanoray_6','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000042&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 5','yonex','3','light','Stiff','39000','nanoray_5','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'NANORAY 600','yonex','4','light','Flexible','195000','nanoray_600','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001001000009&code=047001001001');");
        db.execSQL("insert into contacts values(null,'NANORAY 300','yonex','3','light','Stiff','147000','nanoray_300','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'NANORAY 500','yonex','4','light','Medium','150000','nanoray_500','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101020');");
        db.execSQL("insert into contacts values(null,'VOLTRIC GlanZ','yonex','4','heavy','Medium','320000','voltric_glanz','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000045&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC Z FORCE 2','yonex','3','heavy','Stiff','250000','voltric_z_force_2','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000023&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC LD-FORCE','yonex','3','heavy','Stiff','260000','voltric_ld_force','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000049&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC LD200','yonex','4','heavy','Medium','65000','voltric_ld200','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101019');");
        db.execSQL("insert into contacts values(null,'VOLTRIC LD100','yonex','4','heavy','Medium','58000','voltric_ld100','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101019');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 10DG','yonex','3','heavy','Stiff','110000','voltric_10dg','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000048&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 7DG','yonex','3','heavy','Medium','95000','voltric_7dg','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000046&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 1DG','yonex','3','heavy','Medium','75000','voltric_1dg','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000047&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 50 E-tune','yonex','4','heavy','Stiff','140000','voltric_50_e_tune','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000041&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 8 E-tune','yonex','4','heavy','Medium','100000','voltric_8_e_tune','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000040&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 7','yonex','4','heavy','Medium','95000','voltric_7','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000030&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 5','yonex','3','heavy','Medium','70000','voltric_5','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000043&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC LITE','yonex','4','heavy','Flexible','50000','voltric_lite','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000044&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 80 E-tune','yonex','4','heavy','Stiff','240000','voltric_80_e_tune','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000033&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 70 E-tune','yonex','4','heavy','Medium','195000','voltric_70_e_tune','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000027&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC FORCE','yonex','4','heavy','Stiff','110000','voltric_force','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000029&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 1','yonex','4','heavy','Flexible','75000','voltric_1','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000032&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 80','yonex','3','heavy','Stiff','220000','voltric_80','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000005&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 80 Peter Gade','yonex','3','heavy','Stiff','220000','voltric_80_petergade','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101019');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 60','yonex','4','heavy','Flexible','160000','voltric_60','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101019');");
        db.execSQL("insert into contacts values(null,'VOLTRIC i-FORCE','yonex','5','heavy','Medium','200000','voltric_i_force','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000004&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 50 NEO','yonex','4','heavy','Stiff','148000','voltric_50_neo','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101019');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 9 NEO','yonex','3','heavy','Stiff','110000','voltric_9_neo','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001002000021&code=047001001002');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 2','yonex','4','heavy','Medium','65000','voltric_2','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101019');");
        db.execSQL("insert into contacts values(null,'VOLTRIC 0','yonex','4','heavy','Flexible','49000','voltric_0','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101019');");
        db.execSQL("insert into contacts values(null,'CARBONEX 7000N','yonex','2','heavy','Medium','43000','carbonex_7000n','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101016');");
        db.execSQL("insert into contacts values(null,'CARBONEX 6000N','yonex','1','heavy','Stiff','32000','carbonex_6000n','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101016');");
        db.execSQL("insert into contacts values(null,'CARBONEX 7000DF','yonex','2','heavy','Stiff','43000','carbonex_7000df','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001005000001&code=047001001005');");
        db.execSQL("insert into contacts values(null,'CARBONEX 6000DF','yonex','1','heavy','Stiff','32000','carbonex_6000df','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101016');");
        db.execSQL("insert into contacts values(null,'CARBONEX 8000 PLUS','yonex','3','heavy','Medium','150000','carbonex_8000_plus','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101016');");
        db.execSQL("insert into contacts values(null,'ISOMETRIC POWER','yonex','3','even','Stiff','49000','isometric_power','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101021');");
        db.execSQL("insert into contacts values(null,'ISOMETRIC LITE2','yonex','3','even','Medium','30000','isometric_lite2','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101021');");
        db.execSQL("insert into contacts values(null,'MUSCLE POWER 7','yonex','2','heavy','Medium','44000','musclepower_7','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001004000027&code=047001001004');");
        db.execSQL("insert into contacts values(null,'MUSCLE POWER 5','yonex','1','heavy','Stiff','38000','musclepower_5','http://www.badmintonmarket.co.kr/front/productdetail.php?productcode=047001001004000026&code=047001001004');");
        db.execSQL("insert into contacts values(null,'MUSCLE POWER 3','yonex','2','heavy','Medium','30000','musclepower_3','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101014');");
        db.execSQL("insert into contacts values(null,'ISOMETRIC TR1','yonex','1','heavy','Medium','92000','isometric_tr1','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101023');");
        db.execSQL("insert into contacts values(null,'MUSCLE POWER 2 JUNIOR','yonex','4','light','Stiff','50000','musclepower_2_junior','https://www.yonex.co.kr/pi/productSubMain.do?menuId=00101024');");


        db.execSQL("insert into contacts values(null,'JETSPEED S 10','victor','3','light','Stiff','306000','jetspeed_s_10','http://www.victorkorea.co.kr/product/detail.html?product_no=65&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S NATSIR L','victor','3','light','Medium','297000','jetspeed_s_natsir_l','http://www.victorkorea.co.kr/product/detail.html?product_no=67&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S AHMAD T','victor','3','light','Stiff','297000','jetspeed_s_ahmad_t','http://www.victorkorea.co.kr/product/detail.html?product_no=66&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 9','victor','3','light','Stiff','297000','jetspeed_s_9','http://www.victorkorea.co.kr/product/detail.html?product_no=64&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 12','victor','3','light','Stiff','270000','jetspeed_s_12','http://www.victorkorea.co.kr/product/detail.html?product_no=577&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S YYS','victor','3','light','Medium','270000','jetspeed_s_yys','http://www.victorkorea.co.kr/product/detail.html?product_no=401&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 8ST','victor','3','light','Stiff','270000','jetspeed_s_8st','http://www.victorkorea.co.kr/product/detail.html?product_no=60&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 8PS','victor','3','even','Stiff','270000','jetspeed_s_8ps','http://www.victorkorea.co.kr/product/detail.html?product_no=59&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 09L','victor','3','light','Flexible','159300','jetspeed_s_09l','http://www.victorkorea.co.kr/product/detail.html?product_no=62&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 08 NEW','victor','4','light','Medium','157500','jetspeed_s_08_new','http://www.victorkorea.co.kr/product/detail.html?product_no=580&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 08','victor','5','light','Medium','157500','jetspeed_s_08','http://www.victorkorea.co.kr/product/detail.html?product_no=61&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 05','victor','5','light','Stiff','112500','jetspeed_s_05','http://www.victorkorea.co.kr/product/detail.html?product_no=63&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'JETSPEED S 02','victor','5','light','Stiff','100000','jetspeed_s_02','http://www.victorkorea.co.kr/product/detail.html?product_no=402&cate_no=30&display_group=1');");
        db.execSQL("insert into contacts values(null,'HYPERNANO X AIR','victor','6','heavy','Stiff','270000','hypernano_x_air','http://www.victorkorea.co.kr/product/detail.html?product_no=501&cate_no=79&display_group=1');");
        db.execSQL("insert into contacts values(null,'HYPERNANO X 800LTD POWER','victor','3','heavy','Stiff','270000','hypernano_x_800ltd_power','http://www.victorkorea.co.kr/product/detail.html?product_no=500&cate_no=79&display_group=1');");
        db.execSQL("insert into contacts values(null,'HYPERNANO X 800LTD CONTROL','victor','3','heavy','Medium','270000','hypernano_x_800ltd_control','http://www.victorkorea.co.kr/product/detail.html?product_no=499&cate_no=79&display_group=1');");
        db.execSQL("insert into contacts values(null,'HYPERNANO X 800','victor','3','heavy','Stiff','270000','hypernano_x_800','http://www.victorkorea.co.kr/product/detail.html?product_no=409&cate_no=79&display_group=1');");
        db.execSQL("insert into contacts values(null,'HYPERNANO X 70','victor','4','heavy','Medium','182700','hypernano_x_70','http://www.victorkorea.co.kr/product/detail.html?product_no=502&cate_no=79&display_group=1');");
        db.execSQL("insert into contacts values(null,'BRAVE SWORD 09 NEW','victor','3','even','Stiff','228600','brave_sword_09_new','http://www.victorkorea.co.kr/product/detail.html?product_no=84&cate_no=29&display_group=1');");
        db.execSQL("insert into contacts values(null,'BRAVE SWORD 1800O','victor','3','even','Flexible','117000','brave_sword_1800o','http://www.victorkorea.co.kr/product/detail.html?product_no=88&cate_no=29&display_group=1');");
        db.execSQL("insert into contacts values(null,'BRAVE SWORD 1800G','victor','3','even','Flexible','117000','brave_sword_1800g','http://www.victorkorea.co.kr/product/detail.html?product_no=87&cate_no=29&display_group=1');");
        db.execSQL("insert into contacts values(null,'BRAVE SWORD 1212','victor','2','heavy','Flexible','58500','brave_sword_1212','http://www.victorkorea.co.kr/product/detail.html?product_no=416&cate_no=29&display_group=1');");
        db.execSQL("insert into contacts values(null,'BRAVE SWORD 1133','victor','2','heavy','Flexible','36000','brave_sword_1133','http://www.victorkorea.co.kr/product/detail.html?product_no=80&cate_no=29&display_group=1');");
        db.execSQL("insert into contacts values(null,'THRUSTER K 9000','victor','3','heavy','Stiff','306000','thruster_k_9000','http://www.victorkorea.co.kr/product/detail.html?product_no=77&cate_no=45&display_group=1');");
        db.execSQL("insert into contacts values(null,'THRUSTER K KOREA','victor','4','heavy','Medium','270000','thruster_k_korea','http://www.victorkorea.co.kr/product/detail.html?product_no=410&cate_no=45&display_group=1');");
        db.execSQL("insert into contacts values(null,'THRUSTER K 7000L','victor','4','heavy','Medium','270000','thruster_k_7000l','http://www.victorkorea.co.kr/product/detail.html?product_no=76&cate_no=45&display_group=1');");
        db.execSQL("insert into contacts values(null,'THRUSTER K 8000','victor','3','heavy','Medium','252000','thruster_k_8000','http://www.victorkorea.co.kr/product/detail.html?product_no=74&cate_no=45&display_group=1');");
        db.execSQL("insert into contacts values(null,'THRUSTER K 6000','victor','4','heavy','Medium','234000','thruster_k_6000','http://www.victorkorea.co.kr/product/detail.html?product_no=75&cate_no=45&display_group=1');");
        db.execSQL("insert into contacts values(null,'THRUSTER K 15','victor','5','heavy','Medium','182700','thruster_k_15','http://www.victorkorea.co.kr/product/detail.html?product_no=78&cate_no=45&display_group=1');");


        //db.execSQL("insert into contacts values(null,'METEOR X 90','victor','3','heavy','Stiff','288000','meteor_x_90');");
        //db.execSQL("insert into contacts values(null,'METEOR X 90','victor','3','heavy','Stiff','288000','meteor_x_90');");
        //db.execSQL("insert into contacts values(null,'METEOR X 5600','victor','3','even','Stiff','216000'.'meteor_x_5600');");
        //db.execSQL("insert into contacts values(null,'METEOR X 30L','victor','3','even','Flexible','198000'.'meteor_x_30l');");
        //db.execSQL("insert into contacts values(null,'METEOR X 7000','victor','3','heavy','Flexible','153000'.'meteor_x_7000');");
        //db.execSQL("insert into contacts values(null,'METEOR X 2600E','victor','3','heavy','Flexible','126000'.'meteor_x_2600e');");
        //db.execSQL("insert into contacts values(null,'METEOR X 8166','victor','2','heavy','Flexible','41400'.'meteor_x_8166');");














    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }
}

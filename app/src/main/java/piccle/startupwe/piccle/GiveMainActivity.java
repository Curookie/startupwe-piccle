package piccle.startupwe.piccle;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

public class GiveMainActivity extends AppCompatActivity {

    TabHost TabHost = null;
    TabHost.TabSpec TabSpec;
    Drawable imgIcon = null;
    ImageView btnimg;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_main);

        btnimg = (ImageView)findViewById(R.id.imgbtn);
        btnimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GiveMainActivity.this, GiverConform.class);
                startActivity(intent);
            }
        });

        TabHost=  (TabHost)findViewById(R.id.tabhost);
        TabHost.setup();

        if(android.os.Build.VERSION.SDK_INT >= 21){
            imgIcon = getResources().getDrawable(R.mipmap.btnaa, getTheme());
        } else {
            imgIcon = getResources().getDrawable(R.mipmap.btnaa);
        }

        TabSpec= TabHost.newTabSpec("Message").setIndicator("",imgIcon).setContent(R.id.tab1);
        TabHost.addTab(TabSpec);

        if(android.os.Build.VERSION.SDK_INT >= 21){
            imgIcon = getResources().getDrawable(R.mipmap.btnbb, getTheme());
        } else {
            imgIcon = getResources().getDrawable(R.mipmap.btnbb);
        }

        TabSpec= TabHost.newTabSpec("Plan").setIndicator("",imgIcon).setContent(R.id.tab2);
        TabHost.addTab(TabSpec);

        if(android.os.Build.VERSION.SDK_INT >= 21){
            imgIcon = getResources().getDrawable(R.mipmap.btncc, getTheme());
        } else {
            imgIcon = getResources().getDrawable(R.mipmap.btncc);
        }

        TabSpec= TabHost.newTabSpec("Setting").setIndicator("",imgIcon).setContent(R.id.tab3);
        TabHost.addTab(TabSpec);

        TabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#00CFB5"));
        TabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#aaaaaa"));
        TabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#aaaaaa"));

        TabHost.setCurrentTab(0);

        TabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                if(s=="Message") {
                    TabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#00CFB5"));
                    TabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#aaaaaa"));
                    TabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#aaaaaa"));
                } else if(s=="Plan") {
                    TabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#aaaaaa"));
                    TabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#00CFB5"));
                    TabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#aaaaaa"));
                } else if(s=="Setting") {
                    TabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#aaaaaa"));
                    TabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#aaaaaa"));
                    TabHost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#00CFB5"));
                }
            }
        });
    }
}

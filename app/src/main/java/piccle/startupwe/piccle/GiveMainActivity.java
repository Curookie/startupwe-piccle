package piccle.startupwe.piccle;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class GiveMainActivity extends AppCompatActivity {

    TabHost TabHost = null;
    TabHost.TabSpec TabSpec;
    Drawable imgIcon = null;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_main);

        TabHost=  (TabHost)findViewById(R.id.tabhost);
        TabHost.setup();

        imgIcon = getResources().getDrawable(R.mipmap.btnaa, getTheme());
        TabSpec= TabHost.newTabSpec("Message").setIndicator("",imgIcon).setContent(R.id.tab1);
        TabHost.addTab(TabSpec);

        imgIcon = getResources().getDrawable(R.mipmap.btnbb, getTheme());
        TabSpec= TabHost.newTabSpec("Plan").setIndicator("",imgIcon).setContent(R.id.tab2);
        TabHost.addTab(TabSpec);

        imgIcon = getResources().getDrawable(R.mipmap.btncc, getTheme());
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

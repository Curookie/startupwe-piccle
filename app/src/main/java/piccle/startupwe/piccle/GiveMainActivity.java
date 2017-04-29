package piccle.startupwe.piccle;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class GiveMainActivity extends AppCompatActivity {

    TabHost TabHost = null;
    TabHost.TabSpec TabSpec;
    Drawable imgIcon = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_main);

        TabHost=  (TabHost)findViewById(R.id.tabhost);
        TabHost.setup();

        TabSpec= TabHost.newTabSpec("Message").setIndicator("메세지").setContent(R.id.tab1);
        TabHost.addTab(TabSpec);

        TabSpec= TabHost.newTabSpec("Plan").setIndicator("일정").setContent(R.id.tab1);
        TabHost.addTab(TabSpec);

        TabSpec= TabHost.newTabSpec("Setting").setIndicator("설정").setContent(R.id.tab1);
        TabHost.addTab(TabSpec);

        TabHost.setCurrentTab(0);
    }
}

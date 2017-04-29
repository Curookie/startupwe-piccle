package piccle.startupwe.piccle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ShowGiverListActivity extends AppCompatActivity {

    private ListView mListView = null;
    private ListViewAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_giver_list);

        mListView = (ListView) findViewById(R.id.showGiverListView);
        mAdapter = new ListViewAdapter(this);

        mAdapter.addItem(getResources().getDrawable(R.drawable.noprofile), "홍", "길동");
        mAdapter.addItem(getResources().getDrawable(R.drawable.noprofile), "김", "길동");
        mAdapter.addItem(getResources().getDrawable(R.drawable.noprofile), "이", "길동");
        mAdapter.addItem(getResources().getDrawable(R.drawable.noprofile), "박", "길동");
        mAdapter.addItem(getResources().getDrawable(R.drawable.noprofile), "황", "길동");

    }
}

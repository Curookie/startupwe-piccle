package piccle.startupwe.piccle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

public class ShowGiverListActivity extends AppCompatActivity {

//    private ListView mListView = null;
//    private ListViewAdapter mAdapter = null;
    Button bDslr;
    Button bPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_giver_list);

//        mListView = (ListView) findViewById(R.id.showGiverListView);
//        mAdapter = new ListViewAdapter(this);
//        mListView.setAdapter(mAdapter);

//        mAdapter.addItem(getResources().getDrawable(R.drawable.noprofile), "홍", "길동");
//        mAdapter.addItem(getResources().getDrawable(R.drawable.noprofile), "김", "길동");

        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_show_giver_list);
        linearLayout.setBackgroundResource(R.mipmap.img_listdslr);

        bDslr = (Button) findViewById(R.id.dslrB);
        bPhone = (Button) findViewById(R.id.phoneB);

        bDslr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundResource(R.mipmap.img_listdslr);
            }
        });
        bPhone.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                linearLayout.setBackgroundResource(R.mipmap.img_listphone);
            }
        });


    }
}

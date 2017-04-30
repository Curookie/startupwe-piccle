package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class giverSelectedActivity extends AppCompatActivity {

    private ImageView BresReq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giver_selected);

        BresReq = (ImageView) findViewById(R.id.imageVie);
        BresReq.setClickable(true);
        BresReq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(giverSelectedActivity.this, MakingReservationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

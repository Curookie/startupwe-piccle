package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TakeMypageActivity extends AppCompatActivity {

    private Button bask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_mypage);

        bask = (Button) findViewById(R.id.ask);

        bask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TakeMypageActivity.this, ReservationConditionSetting.class);
                startActivity(intent);
            }
        });
    }
}

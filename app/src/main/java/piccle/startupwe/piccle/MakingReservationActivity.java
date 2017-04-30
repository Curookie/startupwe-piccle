package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MakingReservationActivity extends AppCompatActivity {

    private Button btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_making_reservation);

        btnSetting = (Button)findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MakingReservationActivity.this, StartActivity.class);
                Toast.makeText(MakingReservationActivity.this,"예약을 신청했습니다.",Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });
    }
}

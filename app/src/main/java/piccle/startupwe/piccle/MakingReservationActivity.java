package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MakingReservationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_making_reservation);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(MakingReservationActivity.this, ConfirmingReservation.class);
        startActivity(intent);
    }
}

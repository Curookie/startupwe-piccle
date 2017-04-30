package piccle.startupwe.piccle;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;

public class ConfirmingReservation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirming_reservation);
    }

    public void confirmReservation(View view) {
        Intent intent = new Intent(ConfirmingReservation.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}

package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    private ImageView btnGive, btnTake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnGive = (ImageView)findViewById(R.id.btnGive);
        btnTake = (ImageView)findViewById(R.id.btnTake);

        btnGive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, GiveRegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnTake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, TakeMypageActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}

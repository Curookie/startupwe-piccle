package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GiverConform extends AppCompatActivity {

    private Button btnConform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giver_conform);

        btnConform = (Button)findViewById(R.id.btnConform);
        btnConform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GiverConform.this,"사진 신청자를 확인했습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(GiverConform.this, GiveMainActivity.class);
                startActivity(intent);
            }
        });
    }
}

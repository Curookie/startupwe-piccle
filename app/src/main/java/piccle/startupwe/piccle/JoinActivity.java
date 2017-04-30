package piccle.startupwe.piccle;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class JoinActivity extends AppCompatActivity {

    private Button emailAcceptButton;
    private Button numberAcceptButton;
    private Button numberAcceptedButton;
    private EditText AcceptingNumberEdit;
    private CustomDialog customDialog;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        emailAcceptButton = (Button) findViewById(R.id.emailAccept);
        numberAcceptButton = (Button) findViewById(R.id.numberAccept);
        numberAcceptedButton = (Button) findViewById(R.id.numberAccepted);
        nextBtn = (Button)findViewById(R.id.btnNext);

        AcceptingNumberEdit = (EditText) findViewById(R.id.AcceptingNumber);

        emailAcceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "인증 메일이 전송되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        numberAcceptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                rand.setSeed(System.currentTimeMillis());

                AcceptingNumberEdit.setText(rand.nextInt(899999) + 100000 + "");
            }
        });

        numberAcceptedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "핸드폰 인증이 완료되었습니다.", Toast.LENGTH_SHORT).show();

                customDialog = new CustomDialog(JoinActivity.this);
                customDialog.show();
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JoinActivity.this, HelloActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
package piccle.startupwe.piccle;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private Button startButton;
    private Button joinButton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout background = (RelativeLayout) findViewById(R.id.activity_main);

        background.setBackgroundResource(R.drawable.img_main01);


        loginButton = (Button) findViewById(R.id.loginButton);
        startButton = (Button) findViewById(R.id.startButton);
        joinButton = (Button) findViewById(R.id.joinButton);

//        loginButton.setBackgroundResource(R.drawable.img_login)
//        startButton.setBackgroundResource(R.drawable.img_facebook);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, JoinActivity.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            }
        });

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, StartActivity.class);
//                startActivity(intent);
                //intent.putExtra("CafeData",arrData.get(position));
            }
        });

    }
}

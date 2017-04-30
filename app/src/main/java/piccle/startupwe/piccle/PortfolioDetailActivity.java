package piccle.startupwe.piccle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PortfolioDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio_detail);

        ImageView portfolioDetail = (ImageView)findViewById(R.id.portfolioDetail);
        portfolioDetail.setClickable(true);

        portfolioDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PortfolioDetailActivity.this, giverSelectedActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}

package piccle.startupwe.piccle;

import android.content.Context;
import android.content.Intent;
import android.icu.text.LocaleDisplayNames;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;


public class PorfolioDialog extends Dialog {
    public PorfolioDialog(Context context) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 다이얼로그 외부 화면 흐리게 표현
        WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();
        lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow);
        setCanceledOnTouchOutside(false);
        setContentView(R.layout.activity_portfolio_dialog);

        ImageView portfolioDetail = (ImageView)findViewById(R.id.portfolioDetail);
        portfolioDetail.setClickable(true);

        portfolioDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), giverSelectedActivity.class);
                getContext().startActivity(intent);
            }
        });

    }
}


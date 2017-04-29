package piccle.startupwe.piccle;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by alsrn on 2017-04-29.
 */

public class CustomDialog extends Dialog {
    public CustomDialog(Context context) {
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
        setContentView(R.layout.custom_dialog);

        Button loginCheckedButton = (Button) findViewById(R.id.loginChecked);
        loginCheckedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), StartActivity.class);
                getContext().startActivity(intent);
            }
        });
    }
}

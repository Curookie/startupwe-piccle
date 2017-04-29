package piccle.startupwe.piccle;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;

public class GiveRegisterActivity extends AppCompatActivity {

    private ImageView giverImg;
    private Spinner cameraSelect;
    private GridView objGridView;

//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_register);

        giverImg = (ImageView)findViewById(R.id.imageView);
        objGridView = (GridView)findViewById(R.id.gridView1);
        objGridView.setAdapter(new ImageAdapter(this));

//        giverImg.setBackground(new ShapeDrawable(new OvalShape()));
//        giverImg.setClipToOutline(true);

        cameraSelect = (Spinner)findViewById(R.id.spinner1);

//        cameraSelect.setPrompt(getResources().getString(R.string.));
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinnerArray, android.R.layout.simple_spinner_item);
        cameraSelect.setAdapter(adapter);


    }

    private class ImageAdapter extends BaseAdapter {
        private Context mContext;
        private Integer[] mThumbIds = {
                R.drawable.img_1, R.drawable.img_2, R.drawable.img_3,
                R.drawable.img_4, R.drawable.img_5, R.drawable.img_6,
                R.drawable.img_7, R.drawable.img_8, R.drawable.img_9
        };


        public ImageAdapter(Context objC) {
            mContext = objC;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView objImgView;

            if (convertView == null)

            {
                objImgView = new ImageView(mContext);
                objImgView.setLayoutParams(new GridView.LayoutParams(355, 260));
                objImgView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                objImgView.setPadding(2, 2, 2, 2);
            } else {
                objImgView = (ImageView) convertView;
            }
            objImgView.setImageResource(mThumbIds[position]);
            return objImgView;
        }
    }
}

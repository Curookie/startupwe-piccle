package piccle.startupwe.piccle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alsrn on 2017-04-30.
 */

public class ListViewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private Context mContext = null;
    private ArrayList<ListData> mListData = new ArrayList<ListData>() ;

    // ListViewAdapter의 생성자
    public ListViewAdapter(Context mContext) {
        super();
        this.mContext = mContext;
    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return mListData.size() ;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return mListData.get(position) ;
    }

    public void addItem(Drawable icon, String mTitle, String mDate){
        ListData addInfo = null;
        addInfo = new ListData();
        addInfo.mIcon = icon;
        addInfo.mFirstName = mTitle;
        addInfo.mLastName = mDate;

        mListData.add(addInfo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.giver_list_view, null);

            holder.mIcon = (ImageView) convertView.findViewById(R.id.imageView);
            holder.mText = (TextView) convertView.findViewById(R.id.ListTextViewFirstName);
            holder.mDate = (TextView) convertView.findViewById(R.id.ListTextViewLastName);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        ListData mData = mListData.get(position);

        if (mData.mIcon != null) {
            holder.mIcon.setVisibility(View.VISIBLE);
            holder.mIcon.setImageDrawable(mData.mIcon);
        }else{
            holder.mIcon.setVisibility(View.GONE);
        }

        holder.mText.setText(mData.mFirstName);
        holder.mDate.setText(mData.mLastName);

        return convertView;
    }
}

class ViewHolder{
    public ImageView mIcon;
    public TextView mText;
    public TextView mDate;
}
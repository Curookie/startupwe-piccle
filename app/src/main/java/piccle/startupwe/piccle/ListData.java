package piccle.startupwe.piccle;

import android.graphics.drawable.Drawable;

import java.text.Collator;
import java.util.Comparator;

/**
 * Created by alsrn on 2017-04-30.
 */

public class ListData {
    public Drawable mIcon;
    public String mFirstName;
    public String mLastName;

    public static final Comparator<ListData> ALPHA_COMPARATOR = new Comparator<ListData>() {
        private final Collator sCollator = Collator.getInstance();

        @Override
        public int compare(ListData listData, ListData t1) {
            return sCollator.compare(listData.mFirstName, t1.mFirstName);
        }
    };
}

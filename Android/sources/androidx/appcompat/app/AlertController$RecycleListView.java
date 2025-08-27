package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, koc.RecycleListView);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(koc.RecycleListView_paddingBottomNoButtons, -1);
        this.a = obtainStyledAttributes.getDimensionPixelOffset(koc.RecycleListView_paddingTopNoTitle, -1);
    }
}

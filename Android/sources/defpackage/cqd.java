package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: cqd  reason: default package */
public final class cqd extends RecyclerView {
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a81.e((float) 150, vo4.c().getDisplayMetrics().density, View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
    }
}

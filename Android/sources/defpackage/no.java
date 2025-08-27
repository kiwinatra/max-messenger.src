package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: no  reason: default package */
public final class no extends RatingBar {
    public final xe8 a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public no(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = defpackage.hdc.ratingBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            defpackage.zhf.a(r2, r1)
            xe8 r2 = new xe8
            r2.<init>((android.widget.ProgressBar) r1)
            r1.a = r2
            r2.u(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}

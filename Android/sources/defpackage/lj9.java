package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.a;
import kotlin.ranges.RangesKt;
import org.apache.http.HttpStatus;

/* renamed from: lj9  reason: default package */
public final class lj9 extends ew7 {
    public final boolean p;

    public lj9(int i, Context context, boolean z) {
        super(context);
        this.p = z;
        if (i >= 0) {
            this.a = i;
        }
    }

    public final void j(View view, cb4 cb4) {
        int i;
        int h = h();
        a aVar = this.c;
        if (aVar == null || !aVar.f()) {
            i = 0;
        } else {
            bzc bzc = (bzc) view.getLayoutParams();
            i = l(a.F(view) - bzc.topMargin, a.z(view) + bzc.bottomMargin, aVar.L(), aVar.o - aVar.I(), h);
        }
        int e = e(i);
        if (e > 0) {
            cb4.d(0, -i, RangesKt.coerceAtMost(e, (int) HttpStatus.SC_MULTIPLE_CHOICES), this.i);
        }
    }

    public final int l(int i, int i2, int i3, int i4, int i5) {
        int l;
        if (i5 != -1) {
            boolean z = this.p;
            if (i5 != 0) {
                if (i5 == 1) {
                    int i6 = i4 - i2;
                    return (i6 - (i2 - i) >= i3 || z) ? i6 : i3 - i;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            } else if (!z && (l = l(i, i2, i3, i4, -1)) > 0) {
                return l;
            } else {
                int l2 = l(i, i2, i3, i4, 1);
                if (l2 < 0) {
                    return l2;
                }
                return 0;
            }
        } else {
            return g63.b((float) 30, vo4.c().getDisplayMetrics().density, i3 - i);
        }
    }
}

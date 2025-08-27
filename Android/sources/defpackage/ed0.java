package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import ru.ok.utils.widgets.BadgeCountView;

/* renamed from: ed0  reason: default package */
public final class ed0 extends ObservableProperty {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ed0(defpackage.fd0 r2, defpackage.k2b r3) {
        /*
            r1 = this;
            r0 = 0
            r1.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.b = r2
            r1.c = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed0.<init>(fd0, k2b):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        int i;
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    fd0 fd0 = (fd0) this.b;
                    Paint b2 = fd0.b();
                    xef text = ((k2b) this.c).getText();
                    if (booleanValue) {
                        text.getClass();
                        i = -1;
                    } else {
                        i = text.e;
                    }
                    b2.setColor(i);
                    fd0.c();
                    fd0.invalidateSelf();
                    return;
                }
                return;
            default:
                int intValue = ((Number) obj2).intValue();
                ((Number) obj).intValue();
                BadgeCountView badgeCountView = (BadgeCountView) this.b;
                if (badgeCountView.getManageVisibility()) {
                    badgeCountView.setVisibility(intValue > 0 ? 0 : 8);
                }
                og0 og0 = null;
                if (badgeCountView.getVisibility() != 0) {
                    badgeCountView.setText((CharSequence) null);
                    return;
                } else if (intValue >= 0) {
                    badgeCountView.setText(badgeCountView.getNeedPlusIndicator() ? ((Context) this.c).getString(umc.folder_new_messages_max_exceeded, new Object[]{Integer.valueOf(intValue)}) : String.valueOf(intValue));
                    int i2 = badgeCountView.w0;
                    GradientDrawable K = intValue < 10 ? i8b.K(Integer.valueOf(i2), (Integer) null, (Integer) null) : i8b.O(Integer.valueOf(i2), (Integer) null, (Integer) null, MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density));
                    if (1 <= intValue && intValue < 10) {
                        og0 = new og0(K, 20, c44.DEFAULT_ASPECT_RATIO, 12);
                    } else if (10 <= intValue && intValue < 100) {
                        og0 = new og0(K, 22, c44.DEFAULT_ASPECT_RATIO, 12);
                    } else if (100 <= intValue && intValue < 1000) {
                        og0 = new og0(K, 26, c44.DEFAULT_ASPECT_RATIO, 12);
                    } else if (1000 <= intValue && intValue < 10000) {
                        og0 = new og0(K, 31, 10.0f, 4);
                    }
                    badgeCountView.setStyle(og0);
                    return;
                } else {
                    return;
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ed0(BadgeCountView badgeCountView, Context context) {
        super(0);
        this.b = badgeCountView;
        this.c = context;
    }
}

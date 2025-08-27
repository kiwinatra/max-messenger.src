package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: zxa  reason: default package */
public final class zxa extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ aya b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zxa(defpackage.aya r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            rxa r2 = defpackage.rxa.a
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            xxa r2 = defpackage.xxa.a
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zxa.<init>(aya, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    txa txa = (txa) obj;
                    js9 js9 = fu4.k;
                    aya aya = this.b;
                    aya.setIndicatorColor(aya.d((txa) obj2, js9.f(aya)));
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    yxa yxa = (yxa) obj2;
                    yxa yxa2 = (yxa) obj;
                    boolean areEqual = Intrinsics.areEqual((Object) yxa, (Object) uxa.a);
                    aya aya2 = this.b;
                    if (areEqual) {
                        aya2.setIndicatorSize(MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density));
                        aya2.setTrackThickness(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                    } else if (Intrinsics.areEqual((Object) yxa, (Object) vxa.a)) {
                        aya2.setIndicatorSize(MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
                        aya2.setTrackThickness(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density));
                    } else if (Intrinsics.areEqual((Object) yxa, (Object) wxa.a)) {
                        aya2.setIndicatorSize(MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density));
                        aya2.setTrackThickness(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density));
                    } else if (!Intrinsics.areEqual((Object) yxa, (Object) xxa.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aya2.requestLayout();
                    aya2.invalidate();
                    return;
                }
                return;
        }
    }
}

package defpackage;

import android.content.res.ColorStateList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: vsa  reason: default package */
public final class vsa extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ wsa b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vsa(defpackage.wsa r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 2: goto L_0x001d;
                case 3: goto L_0x0015;
                case 4: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            uy4 r2 = defpackage.uy4.b
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x0015:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x001d:
            qsa r2 = defpackage.qsa.a
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vsa.<init>(wsa, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    wsa wsa = this.b;
                    if (!wsa.B0) {
                        wsa.a(wsa.getTextFont());
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    wsa wsa2 = this.b;
                    if (!wsa2.B0) {
                        wsa2.a(wsa2.getTextFont());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    js9 js9 = fu4.k;
                    wsa wsa3 = this.b;
                    wsa3.f(js9.f(wsa3));
                    return;
                }
                return;
            case 3:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    wsa wsa4 = this.b;
                    if (booleanValue) {
                        wsa4.A0.setStroke(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 1.5d), fu4.k.e(wsa4.getContext()).f().h().f);
                        return;
                    } else {
                        wsa4.A0.setStroke(MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), (ColorStateList) null);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    wsa wsa5 = this.b;
                    wsa5.setBackground(booleanValue2 ? wsa5.A0 : null);
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vsa(Object obj, wsa wsa) {
        super(obj);
        this.a = 1;
        this.b = wsa;
    }
}

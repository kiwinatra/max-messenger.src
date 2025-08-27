package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: b1b  reason: default package */
public final class b1b extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1b b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b1b(defpackage.c1b r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            p0b r2 = defpackage.p0b.a
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            v0b r2 = defpackage.v0b.a
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1b.<init>(c1b, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                s0b s0b = (s0b) obj2;
                if (!Intrinsics.areEqual((Object) (s0b) obj, (Object) s0b)) {
                    c1b c1b = this.b;
                    c1b.setLeft(s0b);
                    c1b.N();
                    return;
                }
                return;
            default:
                y0b y0b = (y0b) obj2;
                if (!Intrinsics.areEqual((Object) (y0b) obj, (Object) y0b)) {
                    c1b c1b2 = this.b;
                    c1b2.setRight(y0b);
                    c1b2.N();
                    return;
                }
                return;
        }
    }
}

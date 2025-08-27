package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: fn1  reason: default package */
public final class fn1 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn1 b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fn1(defpackage.gn1 r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            en1 r2 = defpackage.en1.b
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            r0.b = r1
            r1 = 0
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn1.<init>(gn1, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (((en1) obj) != ((en1) obj2)) {
                    gn1.P(this.b);
                    return;
                }
                return;
            default:
                k2b k2b = (k2b) obj2;
                if (!Intrinsics.areEqual((Object) (k2b) obj, (Object) k2b)) {
                    gn1 gn1 = this.b;
                    if (k2b == null) {
                        k2b = fu4.k.f(gn1);
                    }
                    gn1.onThemeChanged(k2b);
                    return;
                }
                return;
        }
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: vwa  reason: default package */
public final class vwa extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ wwa b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vwa(defpackage.wwa r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            uwa r2 = defpackage.uwa.a
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            twa r2 = defpackage.twa.a
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vwa.<init>(wwa, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    uwa uwa = (uwa) obj2;
                    uwa uwa2 = (uwa) obj;
                    this.b.c();
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    twa twa = (twa) obj2;
                    twa twa2 = (twa) obj;
                    this.b.b();
                    return;
                }
                return;
        }
    }
}

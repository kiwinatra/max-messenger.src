package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: zde  reason: default package */
public final class zde extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ aee b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zde(defpackage.aee r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x001c;
                case 2: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x0010:
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x001c:
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zde.<init>(aee, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    aee aee = this.b;
                    aee.c(aee.d);
                    aee.e = aee.a();
                    return;
                }
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    aee aee2 = this.b;
                    aee2.c(aee2.d);
                    aee2.e = aee2.a();
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    aee aee3 = this.b;
                    aee3.e = aee3.a();
                    return;
                }
                return;
        }
    }
}

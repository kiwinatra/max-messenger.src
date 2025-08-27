package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: a2b  reason: default package */
public final class a2b extends ObservableProperty {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ b2b b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a2b(woa woa, b2b b2b) {
        super(woa);
        this.b = b2b;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual((Object) (woa) obj, (Object) (woa) obj2)) {
                    b2b.a(this.b);
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    b2b.a(this.b);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a2b(defpackage.b2b r2) {
        /*
            r1 = this;
            r0 = 1
            r1.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2b.<init>(b2b):void");
    }
}

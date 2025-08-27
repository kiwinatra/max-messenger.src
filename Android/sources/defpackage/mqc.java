package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: mqc  reason: default package */
public final class mqc extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ nqc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mqc(hqc hqc, nqc nqc) {
        super(hqc);
        this.a = 1;
        this.b = nqc;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                    nqc nqc = this.b;
                    if (booleanValue || !booleanValue2) {
                        nqc.invalidate();
                        return;
                    } else {
                        nqc.a(true);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    hqc hqc = (hqc) obj;
                    this.b.z.setText(((hqc) obj2).a);
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    this.b.v0.g(intValue, true);
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mqc(defpackage.nqc r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 2: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqc.<init>(nqc, int):void");
    }
}

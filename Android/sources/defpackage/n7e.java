package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: n7e  reason: default package */
public final class n7e extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7e b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7e(Object obj, o7e o7e, int i) {
        super(obj);
        this.a = i;
        this.b = o7e;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        o7e o7e = this.b;
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    l7e l7e = (l7e) obj2;
                    l7e l7e2 = (l7e) obj;
                    o7e.a(fu4.k.e(o7e.a).f());
                    return;
                }
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    float[] fArr = (float[]) obj2;
                    float[] fArr2 = (float[]) obj;
                    o7e.x.setFloatValues(Arrays.copyOf(fArr, fArr.length));
                    return;
                }
                return;
            case 2:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    m7e m7e = (m7e) obj;
                    int ordinal = ((m7e) obj2).ordinal();
                    if (ordinal == 0) {
                        o7e.x.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(o7e.v, new float[]{c44.DEFAULT_ASPECT_RATIO, 359.0f})});
                        return;
                    } else if (ordinal == 1) {
                        o7e.x.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(o7e.v, new float[]{359.0f, c44.DEFAULT_ASPECT_RATIO})});
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            case 3:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    long longValue = ((Number) obj2).longValue();
                    ((Number) obj).longValue();
                    o7e.x.setDuration(longValue);
                    return;
                }
                return;
            case 4:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    float[] fArr3 = (float[]) obj2;
                    float[] fArr4 = (float[]) obj;
                    o7e.w.setFloatValues(Arrays.copyOf(fArr3, fArr3.length));
                    return;
                }
                return;
            case 5:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    long longValue2 = ((Number) obj2).longValue();
                    ((Number) obj).longValue();
                    o7e.w.setDuration(longValue2);
                    return;
                }
                return;
            case 6:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    Integer num = (Integer) obj2;
                    Integer num2 = (Integer) obj;
                    o7e.invalidateSelf();
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (booleanValue) {
                        o7e.b();
                    } else {
                        ObjectAnimator objectAnimator = o7e.w;
                        if (objectAnimator.isRunning()) {
                            objectAnimator.cancel();
                        }
                    }
                    o7e.invalidateSelf();
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n7e(defpackage.o7e r3, int r4) {
        /*
            r2 = this;
            r2.a = r4
            switch(r4) {
                case 2: goto L_0x0034;
                case 3: goto L_0x0028;
                case 4: goto L_0x0005;
                case 5: goto L_0x001c;
                case 6: goto L_0x0015;
                case 7: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            l7e r4 = defpackage.l7e.a
            r2.b = r3
            r2.<init>(r4)
            return
        L_0x000d:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.b = r3
            r2.<init>(r4)
            return
        L_0x0015:
            r2.b = r3
            r3 = 0
            r2.<init>(r3)
            return
        L_0x001c:
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2.b = r3
            r2.<init>(r4)
            return
        L_0x0028:
            r0 = 8000(0x1f40, double:3.9525E-320)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r2.b = r3
            r2.<init>(r4)
            return
        L_0x0034:
            m7e r4 = defpackage.m7e.a
            r2.b = r3
            r2.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7e.<init>(o7e, int):void");
    }
}

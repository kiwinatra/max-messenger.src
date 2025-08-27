package defpackage;

import android.text.InputFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: km4  reason: default package */
public final class km4 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm4 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km4(Integer num, lm4 lm4, int i) {
        super(num);
        this.a = i;
        this.b = lm4;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    lm4 lm4 = this.b;
                    lm4.w.setFilters(lm4.getMaxCount() != Integer.MAX_VALUE ? (InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(lm4.getMaxCount())} : new InputFilter[0]);
                    return;
                }
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    js9 js9 = fu4.k;
                    lm4 lm42 = this.b;
                    lm42.onThemeChanged(js9.f(lm42));
                    return;
                }
                return;
            case 2:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    js9 js92 = fu4.k;
                    lm4 lm43 = this.b;
                    lm43.onThemeChanged(js92.f(lm43));
                    return;
                }
                return;
            case 3:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    js9 js93 = fu4.k;
                    lm4 lm44 = this.b;
                    lm44.onThemeChanged(js93.f(lm44));
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    js9 js94 = fu4.k;
                    lm4 lm45 = this.b;
                    lm45.onThemeChanged(js94.f(lm45));
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public km4(defpackage.lm4 r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x0012:
            r0.b = r1
            r1 = 0
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km4.<init>(lm4, int):void");
    }
}

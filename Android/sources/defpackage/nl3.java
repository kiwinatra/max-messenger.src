package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: nl3  reason: default package */
public final class nl3 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol3 b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nl3(defpackage.ol3 r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x0014;
                case 2: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            r0.b = r1
            r1 = 0
            r0.<init>(r1)
            return
        L_0x0014:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl3.<init>(ol3, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue) {
                    ol3 ol3 = this.b;
                    if (ol3.M0.isInitialized() || booleanValue) {
                        ((View) ol3.M0.getValue()).setVisibility(booleanValue ? 0 : 8);
                        ol3.M(ol3);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue2) {
                    Lazy lazy = this.b.M0;
                    if (lazy.isInitialized()) {
                        ((AppCompatCheckBox) lazy.getValue()).setChecked(booleanValue2);
                        return;
                    }
                    return;
                }
                return;
            default:
                k2b k2b = (k2b) obj2;
                if (!Intrinsics.areEqual((Object) (k2b) obj, (Object) k2b)) {
                    ol3 ol32 = this.b;
                    if (k2b == null) {
                        k2b = fu4.k.f(ol32);
                    }
                    ol32.onThemeChanged(k2b);
                    return;
                }
                return;
        }
    }
}

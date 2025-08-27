package defpackage;

import android.view.View;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: bqa  reason: default package */
public final class bqa extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeButton b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bqa(one.me.sdk.uikit.common.button.OneMeButton r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x0024;
                case 2: goto L_0x001c;
                case 3: goto L_0x0015;
                case 4: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            aqa r2 = defpackage.aqa.b
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x0015:
            r0.b = r1
            r1 = 0
            r0.<init>(r1)
            return
        L_0x001c:
            xpa r2 = defpackage.xpa.a
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x0024:
            zpa r2 = defpackage.zpa.a
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqa.<init>(one.me.sdk.uikit.common.button.OneMeButton, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        OneMeButton oneMeButton = this.b;
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    aqa aqa = (aqa) obj2;
                    aqa aqa2 = (aqa) obj;
                    KProperty[] kPropertyArr = OneMeButton.z0;
                    oneMeButton.k();
                    return;
                }
                return;
            case 1:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    zpa zpa = (zpa) obj2;
                    zpa zpa2 = (zpa) obj;
                    KProperty[] kPropertyArr2 = OneMeButton.z0;
                    oneMeButton.e();
                    return;
                }
                return;
            case 2:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    xpa xpa = (xpa) obj2;
                    xpa xpa2 = (xpa) obj;
                    KProperty[] kPropertyArr3 = OneMeButton.z0;
                    oneMeButton.e();
                    return;
                }
                return;
            case 3:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    k2b k2b = (k2b) obj;
                    if (((k2b) obj2) == null) {
                        fu4.k.f(oneMeButton);
                    }
                    oneMeButton.e();
                    return;
                }
                return;
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    if (booleanValue) {
                        ((View) oneMeButton.w.getValue()).setVisibility(0);
                        OneMeButton.a(oneMeButton, dad.h, false);
                    } else {
                        Lazy lazy = oneMeButton.w;
                        if (lazy.isInitialized()) {
                            ((aya) lazy.getValue()).setVisibility(8);
                            OneMeButton.a(oneMeButton, dad.h, true);
                        }
                    }
                    KProperty[] kPropertyArr4 = OneMeButton.z0;
                    oneMeButton.k();
                    return;
                }
                return;
        }
    }
}

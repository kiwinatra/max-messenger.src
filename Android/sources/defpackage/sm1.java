package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.uuid.Uuid;

/* renamed from: sm1  reason: default package */
public final class sm1 extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ tm1 b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sm1(defpackage.tm1 r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            pm1 r2 = defpackage.pm1.b
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            qm1 r2 = defpackage.qm1.c
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm1.<init>(tm1, int):void");
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        p7e background;
        p7e background2;
        p7e background3;
        switch (this.a) {
            case 0:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    pm1 pm1 = (pm1) obj;
                    int ordinal = ((pm1) obj2).ordinal();
                    tm1 tm1 = this.b;
                    if (ordinal == 0) {
                        tm1.getNegativeButtonView().setMode(k8d.c);
                        tm1.getPositiveButtonView().setMode(k8d.b);
                        return;
                    } else if (ordinal == 1) {
                        tm1.getNegativeButtonView().setMode(k8d.a);
                        tm1.getPositiveButtonView().setMode(k8d.b);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                if (!Intrinsics.areEqual(obj, obj2)) {
                    qm1 qm1 = (qm1) obj2;
                    qm1 qm12 = (qm1) obj;
                    int ordinal2 = qm1.ordinal();
                    tm1 tm12 = this.b;
                    if (ordinal2 == 0 || ordinal2 == 1) {
                        if (tm12.getBackground() == null) {
                            tm12.setBackground(tm12.getAnimatedBackground());
                        }
                        if (qm12 == qm1.b && qm1 == qm1.a && (background2 = tm12.getBackground()) != null) {
                            background2.setAlpha(Uuid.SIZE_BITS);
                        }
                        p7e background4 = tm12.getBackground();
                        if (background4 != null) {
                            l7e l7e = qm1 == qm1.a ? l7e.c : l7e.b;
                            o7e o7e = background4.b;
                            o7e.getClass();
                            o7e.y.setValue(o7e, o7e.y0[0], l7e);
                        }
                        if (tm12.isAttachedToWindow() && (background = tm12.getBackground()) != null && !background.isRunning()) {
                            p7e background5 = tm12.getBackground();
                            if (background5 != null) {
                                background5.onThemeChanged(l2b.a);
                            }
                            p7e background6 = tm12.getBackground();
                            if (background6 != null) {
                                background6.start();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (ordinal2 == 2) {
                        if (tm12.isAttachedToWindow() && (background3 = tm12.getBackground()) != null) {
                            background3.stop();
                        }
                        tm12.setBackground((Drawable) null);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
        }
    }
}

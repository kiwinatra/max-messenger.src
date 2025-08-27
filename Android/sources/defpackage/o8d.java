package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: o8d  reason: default package */
public final class o8d extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ p8d b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o8d(l8d l8d, p8d p8d) {
        super(l8d);
        this.a = 2;
        this.b = p8d;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (((k8d) obj) != ((k8d) obj2)) {
                    this.b.Q();
                    return;
                }
                return;
            case 1:
                if (((j8d) obj) != ((j8d) obj2)) {
                    this.b.Q();
                    return;
                }
                return;
            default:
                l8d l8d = (l8d) obj2;
                if (!Intrinsics.areEqual((Object) (l8d) obj, (Object) l8d)) {
                    ImageView M = this.b.getIconView();
                    ViewGroup.LayoutParams layoutParams = M.getLayoutParams();
                    if (layoutParams != null) {
                        fj3 fj3 = (fj3) layoutParams;
                        fj3.height = l8d.b;
                        fj3.width = l8d.a;
                        M.setLayoutParams(fj3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o8d(defpackage.p8d r1, int r2) {
        /*
            r0 = this;
            r0.a = r2
            switch(r2) {
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            k8d r2 = defpackage.k8d.x
            r0.b = r1
            r0.<init>(r2)
            return
        L_0x000d:
            j8d r2 = defpackage.j8d.a
            r0.b = r1
            r0.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.<init>(p8d, int):void");
    }
}

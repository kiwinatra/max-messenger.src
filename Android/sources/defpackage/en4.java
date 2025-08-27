package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: en4  reason: default package */
public final /* synthetic */ class en4 implements ztd {
    public final /* synthetic */ fn4 a;
    public final /* synthetic */ WeakReference b;

    public /* synthetic */ en4(fn4 fn4, WeakReference weakReference) {
        this.a = fn4;
        this.b = weakReference;
    }

    public final void j() {
        fn4 fn4 = this.a;
        fn4.getClass();
        if (((fn4) this.b.get()) != null) {
            fn4.e.a();
        }
    }
}

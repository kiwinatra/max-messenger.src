package defpackage;

import kotlin.Lazy;
import one.me.sdk.arch.Widget;

/* renamed from: cng  reason: default package */
public final class cng implements Lazy {
    public xag a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ Class c;

    public cng(Widget widget, Class cls) {
        this.b = widget;
        this.c = cls;
    }

    public final Object getValue() {
        xag xag = this.a;
        if (xag != null) {
            return xag;
        }
        xag a2 = this.b.getViewModelStore$arch_release().a(this.c);
        this.a = a2;
        return a2;
    }

    public final boolean isInitialized() {
        return this.a != null;
    }
}

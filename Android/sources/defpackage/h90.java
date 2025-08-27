package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: h90  reason: default package */
public final class h90 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public h90(Lazy lazy, Lazy lazy2, ccb ccb) {
        this.a = lazy;
        this.b = lazy2;
        this.c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new s2(3, (Object) ccb, (Object) this));
    }

    public final boolean a() {
        Lazy lazy = this.a;
        boolean f = ((rh3) lazy.getValue()).f();
        boolean z = ((rh3) lazy.getValue()).b() == mi3.b;
        Lazy lazy2 = this.b;
        int i = ((ltb) ((jtb) lazy2.getValue())).c.g.getInt("app.video.auto.play", 1);
        if (i != 0) {
            if (i == 1) {
                return z;
            }
        } else if (z || ((ltb) ((jtb) lazy2.getValue())).c.m() || !f) {
            return true;
        }
        return false;
    }
}

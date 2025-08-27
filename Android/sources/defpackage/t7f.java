package defpackage;

import android.media.MediaRouter;

/* renamed from: t7f  reason: default package */
public final class t7f extends hw8 {
    public final Object a;

    public t7f(Object obj) {
        this.a = obj;
    }

    public final void f(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    public final void i(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}

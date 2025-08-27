package defpackage;

import kotlin.reflect.KProperty;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: eig  reason: default package */
public final class eig extends qa {
    public final irb d = irb.b;
    public final /* synthetic */ WebAppRootScreen e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eig(WebAppRootScreen webAppRootScreen) {
        super(webAppRootScreen, 1);
        this.e = webAppRootScreen;
    }

    public final int a() {
        KProperty[] kPropertyArr = WebAppRootScreen.D0;
        if (this.e.r0()) {
            return 0;
        }
        return c();
    }

    public final irb b() {
        return this.d;
    }

    public final int c() {
        KProperty[] kPropertyArr = WebAppRootScreen.D0;
        if (this.e.r0()) {
            return 0;
        }
        return super.c();
    }

    public final boolean n(float f, float f2) {
        KProperty[] kPropertyArr = WebAppRootScreen.D0;
        WebAppRootScreen webAppRootScreen = this.e;
        return !webAppRootScreen.r0() && webAppRootScreen.q0().b;
    }
}

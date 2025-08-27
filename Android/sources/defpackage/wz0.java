package defpackage;

import javax.inject.Provider;
import kotlin.Lazy;

/* renamed from: wz0  reason: default package */
public final /* synthetic */ class wz0 implements Provider, u2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;

    public /* synthetic */ wz0(int i, Lazy lazy) {
        this.a = i;
        this.b = lazy;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return ((fn4) this.b.getValue()).a();
            case 1:
                return (lt6) this.b.getValue();
            default:
                return (nt6) this.b.getValue();
        }
    }
}

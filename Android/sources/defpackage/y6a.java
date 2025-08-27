package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: y6a  reason: default package */
public final class y6a extends qj3 {
    public final ConnectivityManager w = ((ConnectivityManager) ((Context) this.b).getSystemService("connectivity"));
    public final wh3 x = new wh3(1, this);

    public y6a(Context context, g6d g6d) {
        super(context, g6d);
    }

    public final Object i() {
        return z6a.a(this.w);
    }

    public final void r() {
        try {
            h88.x().p(z6a.a, "Registering network callback");
            n6a.a(this.w, this.x);
        } catch (IllegalArgumentException e) {
            h88.x().u(z6a.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            h88.x().u(z6a.a, "Received exception while registering network callback", e2);
        }
    }

    public final void s() {
        try {
            h88.x().p(z6a.a, "Unregistering network callback");
            l6a.c(this.w, this.x);
        } catch (IllegalArgumentException e) {
            h88.x().u(z6a.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            h88.x().u(z6a.a, "Received exception while unregistering network callback", e2);
        }
    }
}

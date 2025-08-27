package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.Objects;

/* renamed from: iw8  reason: default package */
public abstract class iw8 {
    public final Context a;
    public final vs6 b;
    public final hy c = new hy(11, (Object) this);
    public e4 o;
    public pv8 v;
    public boolean w;
    public jw8 x;
    public boolean y;

    public iw8(Context context, vs6 vs6) {
        if (context != null) {
            this.a = context;
            if (vs6 == null) {
                this.b = new vs6(28, (Object) new ComponentName(context, getClass()));
            } else {
                this.b = vs6;
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public gw8 c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract hw8 d(String str);

    public hw8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return d(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public abstract void f(pv8 pv8);

    public final void g(jw8 jw8) {
        sw8.b();
        if (this.x != jw8) {
            this.x = jw8;
            if (!this.y) {
                this.y = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public final void h(pv8 pv8) {
        sw8.b();
        if (!Objects.equals(this.v, pv8)) {
            this.v = pv8;
            if (!this.w) {
                this.w = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }
}

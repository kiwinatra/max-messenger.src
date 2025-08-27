package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* renamed from: ex8  reason: default package */
public class ex8 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final yx8 a;

    public ex8(Context context, tc5 tc5, k0d k0d, o9a o9a, Bundle bundle, Bundle bundle2, ox0 ox0) {
        synchronized (b) {
            HashMap hashMap = c;
            if (!hashMap.containsKey("")) {
                hashMap.put("", this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
        }
        this.a = new yx8(this, context, tc5, k0d, o9a, bundle, bundle2, ox0);
    }

    public final fo0 a() {
        return this.a.m;
    }

    public final yx8 b() {
        return this.a;
    }

    public final vob c() {
        return this.a.s.a;
    }

    public final PendingIntent d() {
        return this.a.t;
    }

    public final boolean e() {
        return this.a.p;
    }
}

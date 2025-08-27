package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: pv8  reason: default package */
public final class pv8 {
    public final Bundle a;
    public kw8 b;

    public pv8(kw8 kw8, boolean z) {
        if (kw8 != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = kw8;
            bundle.putBundle("selector", kw8.a);
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.b == null) {
            Bundle bundle = this.a.getBundle("selector");
            kw8 kw8 = null;
            if (bundle != null) {
                kw8 = new kw8((List) null, bundle);
            } else {
                kw8 kw82 = kw8.c;
            }
            this.b = kw8;
            if (kw8 == null) {
                this.b = kw8.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pv8)) {
            return false;
        }
        pv8 pv8 = (pv8) obj;
        a();
        kw8 kw8 = this.b;
        pv8.a();
        return kw8.equals(pv8.b) && b() == pv8.b();
    }

    public final int hashCode() {
        a();
        return b() ^ this.b.hashCode() ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        kw8 kw8 = this.b;
        kw8.a();
        return tr1.m(sb, !kw8.b.contains((Object) null), " }");
    }
}

package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: htd  reason: default package */
public final class htd implements dn4, SharedPreferences.OnSharedPreferenceChangeListener {
    public final x23 a;
    public final Lazy b;
    public final long c = System.nanoTime();
    public final long o = System.nanoTime();
    public final xme v;
    public final etc w;

    public htd(Lazy lazy, x23 x23) {
        this.a = x23;
        this.b = lazy;
        xme a2 = f6e.a(d());
        this.v = a2;
        this.w = new etc(a2);
        y2 y2Var = x23 instanceof y2 ? (y2) x23 : null;
        if (y2Var != null) {
            y2Var.g.registerOnSharedPreferenceChangeListener(this);
        }
    }

    public final ome a() {
        return this.w;
    }

    public final void b(o94 o94) {
        long j = this.c;
        long j2 = o94.a;
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        Lazy lazy = this.b;
        if (i == 0) {
            um4.b.getClass();
            ((ta4) lazy.getValue()).b(bb4.a(um4.f.a), (Bundle) null);
        } else if (j2 == this.o) {
            um4.b.getClass();
            ((ta4) lazy.getValue()).b(bb4.a(um4.g.a), (Bundle) null);
        }
    }

    public final void c() {
        x23 x23 = this.a;
        y2 y2Var = x23 instanceof y2 ? (y2) x23 : null;
        if (y2Var != null) {
            y2Var.g.unregisterOnSharedPreferenceChangeListener(this);
        }
    }

    public final List d() {
        a33 a33 = (a33) this.a;
        String z = a33.z();
        String str = "";
        if (z == null) {
            z = str;
        }
        o94 o94 = new o94(this.c, new mgf(z), 0, new mgf("Адрес сервера"), (ev0) null, 20);
        String A = a33.A();
        if (A != null) {
            str = A;
        }
        return CollectionsKt.listOf(o94, new o94(this.o, new mgf(str), 0, new mgf("Порт сервера"), (ev0) null, 20));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.v.setValue(d());
    }
}

package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: ef7  reason: default package */
public final class ef7 implements dn4 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final xme o;

    public ef7(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        long nanoTime = System.nanoTime();
        long nanoTime2 = System.nanoTime();
        long nanoTime3 = System.nanoTime();
        vpa vpa = kv0.f;
        vpa vpa2 = null;
        (vpa == null ? null : vpa).getClass();
        vpa vpa3 = kv0.f;
        (vpa3 != null ? vpa3 : vpa2).getClass();
        o94 o94 = new o94(nanoTime2, new mgf("25.6.4(6355)"), 0, new igf(flc.oneme_settings_app_version), (ev0) null, 20);
        o94 o942 = new o94(nanoTime, new mgf(String.valueOf(((qjd) ((x23) lazy2.getValue())).s())), 0, new igf(flc.oneme_settings_user_id), (ev0) null, 20);
        String str = (String) ((hn4) ((fn4) lazy3.getValue())).l.get();
        this.o = f6e.a(CollectionsKt.listOf(o94, o942, new o94(nanoTime3, new mgf(str == null ? "NULL" : str), 0, new igf(flc.oneme_settings_mytracker_id), (ev0) null, 20)));
    }

    public final ome a() {
        return this.o;
    }

    public final void b(o94 o94) {
        Lazy lazy = this.a;
        Context context = (Context) lazy.getValue();
        CharSequence a2 = o94.b.a((Context) lazy.getValue());
        b59.k(context, a2 != null ? a2.toString() : null);
    }
}

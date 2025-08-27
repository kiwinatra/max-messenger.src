package defpackage;

import android.os.Bundle;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: lt7  reason: default package */
public final class lt7 implements dn4 {
    public final Lazy a;
    public final long b;
    public final long c;
    public final etc o;

    public lt7(Lazy lazy) {
        this.a = lazy;
        long nanoTime = System.nanoTime();
        this.b = nanoTime;
        long nanoTime2 = System.nanoTime();
        this.c = nanoTime2;
        igf igf = new igf(flc.oneme_settings_old_dev_menu);
        int i = cad.T;
        m94 m94 = m94.m;
        this.o = new etc(f6e.a(CollectionsKt.listOf(new o94(nanoTime, igf, i, (ngf) null, m94, 8), new o94(nanoTime2, new igf(flc.oneme_settings_old_logs_menu), cad.e, (ngf) null, m94, 8))));
    }

    public final ome a() {
        return this.o;
    }

    public final void b(o94 o94) {
        long j = this.b;
        long j2 = o94.a;
        if (j2 == j) {
            vm4.b.W0().b(":settings/magic-room", (Bundle) null);
        } else if (j2 == this.c) {
            ((ta4) this.a.getValue()).b(":settings/dev/logsviewer", (Bundle) null);
        }
    }
}

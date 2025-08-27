package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: st3  reason: default package */
public final class st3 {
    public final sv0 a;
    public final lfd b;
    public final km3 c;
    public final ns3 d;
    public final tld e;
    public volatile List f = Collections.emptyList();
    public volatile List g = Collections.emptyList();
    public final lfd h;
    public final dac i;
    public final HashSet j = new HashSet();
    public volatile String k = "";
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicBoolean n = new AtomicBoolean(true);

    public st3(m95 m95, sv0 sv0, lfd lfd, lfd lfd2, km3 km3, ns3 ns3, tld tld) {
        this.a = sv0;
        this.b = lfd;
        this.c = km3;
        this.d = ns3;
        this.e = tld;
        this.h = lfd2;
        dac dac = new dac();
        this.i = dac;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        lfd a2 = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        m95 m952 = m95;
        new ika(dac, 1, timeUnit, a2, false).s(lfd2).a(new or7(new rt3(0, (Object) this), new rt3(1, (Object) m95), m58.e));
        b();
    }

    public final List a() {
        if (!this.m.get()) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(cvg.A(this.k) ? this.f : this.g);
    }

    public final void b() {
        if (!this.l.get()) {
            String str = this.k;
            if (!cvg.c(this.k, str)) {
                this.n.set(true);
            }
            this.k = str;
            jbd.a(new b5(8, this), this.h, (x6) null, new zb2(17), (lfd) null);
            this.l.set(true);
            return;
        }
        this.i.d(0);
    }

    public final void c() {
        z68.c("st3", "updateDataWorker: ", new Object[0]);
        this.c.d();
        List s = this.c.s();
        if (cvg.A(this.k)) {
            ns3 ns3 = this.d;
            ns3.getClass();
            Collections.sort(s, new ls3(ns3, 0));
            this.f = s;
        } else if (this.n.compareAndSet(true, false)) {
            String str = this.k;
            tld tld = this.e;
            if (!cvg.A(str)) {
                if (!(s instanceof Collection) || !s.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : s) {
                        try {
                            if (tld.g((vk3) next, str)) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    s = arrayList;
                } else {
                    s = Collections.emptyList();
                }
            }
            this.d.b(s);
            this.g = s;
        }
        this.m.set(true);
        this.b.c(new pr1(22, this));
    }

    @oye
    public void onEvent(w88 w88) {
        b();
    }

    @oye
    public void onEvent(zu3 zu3) {
        this.n.set(true);
        b();
    }

    @oye
    public void onEvent(jwf jwf) {
        b();
    }
}

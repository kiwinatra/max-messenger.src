package com.my.tracker.obfuscated;

import android.os.SystemClock;
import java.util.ArrayList;

public final class i2 {
    final z2 a;
    final w2 b;
    final a c;
    final j0 d;
    final c e;
    final x f;
    final i g;
    protected boolean h = false;
    protected b3 i = b3.j;

    public final class a {
        final int[] a = {0};
        final int[] b = {0};

        public a() {
        }

        private boolean d(int i) {
            for (int i2 : this.b) {
                if (i == i2) {
                    x2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        private boolean e(int i) {
            for (int i2 : this.a) {
                if (i == i2) {
                    x2.c("TimeSpentCore: you can't create timespent with id = " + i + " (reason: reserved for internal use)");
                    return true;
                }
            }
            return false;
        }

        public boolean a(int i) {
            StringBuilder sb;
            String str;
            if (e(i)) {
                return false;
            }
            if (i2.this.e.b(i)) {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have same type timespent with this id)";
            } else if (!i2.this.d.b(i) && !i2.this.f.a(i)) {
                return true;
            } else {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            x2.c(sb.toString());
            return false;
        }

        public boolean b(int i) {
            StringBuilder sb;
            String str;
            if (e(i)) {
                return false;
            }
            if (i2.this.d.b(i)) {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have same type timespent with this id)";
            } else if (!i2.this.e.b(i) && !i2.this.f.a(i)) {
                return true;
            } else {
                sb = new StringBuilder("TimeSpent: you can't create timespent with id = ");
                sb.append(i);
                str = " (reason: already have another type timespent with this id)";
            }
            sb.append(str);
            x2.c(sb.toString());
            return false;
        }

        public boolean c(int i) {
            if (d(i)) {
                return false;
            }
            if (!i2.this.d.b(i) && !i2.this.e.b(i)) {
                return true;
            }
            x2.c("TimeSpent: you can't create timespent with id = " + i + " (reason: already have another type timespent with this id)");
            return false;
        }
    }

    public i2(long j, z2 z2Var) {
        this.a = z2Var;
        this.b = w2.a(j, (Runnable) new nug(this, 0));
        this.c = b();
        this.d = new j0();
        this.e = new c();
        this.f = new x();
        this.g = new i();
        x2.a("TimeSpentCore: created");
    }

    public synchronized q2 a(long j, long j2) {
        q2 q2Var;
        x2.a("TimeSpentCore: start collecting DTO data, tickTimestamp = " + j2);
        boolean c2 = this.g.c();
        ArrayList a2 = this.f.a();
        ArrayList a3 = this.e.a(j, c2);
        ArrayList a4 = this.d.a(j, c2);
        e2 a5 = this.g.a(j);
        ArrayList arrayList = new ArrayList(a3.size() + a4.size());
        arrayList.addAll(a3);
        arrayList.addAll(a4);
        q2Var = new q2(j2, a5, (e2[]) arrayList.toArray(new e2[0]), (v[]) a2.toArray(new v[0]));
        if (x2.a()) {
            x2.a("TimeSpentCore: collected DTO data:\n" + q2Var);
        }
        return q2Var;
    }

    public a b() {
        return new a();
    }

    public synchronized void c() {
        x2.a("TimeSpentCore: ***** start generating zero tick *****");
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        this.f.b(0);
        b(uptimeMillis, currentTimeMillis, this.h, this.i);
        x2.a("TimeSpentCore: ***** zero tick generated *****");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockFinish
        jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:3:0x000d
        	at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75)
        	at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108)
        	at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472)
        	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27)
        */
    /* renamed from: d */
    public synchronized void h(long r3, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.my.tracker.obfuscated.j0 r0 = r2.d     // Catch:{ Exception -> 0x0010 }
            com.my.tracker.obfuscated.i r1 = r2.g     // Catch:{ Exception -> 0x0010 }
            boolean r1 = r1.c()     // Catch:{ Exception -> 0x0010 }
            r0.b(r5, r3, r1)     // Catch:{ Exception -> 0x0010 }
            goto L_0x0010
        L_0x000d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            throw r3
        L_0x0010:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i2.h(long, int):void");
    }

    public void a() {
        m.c(new nug(this, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.my.tracker.obfuscated.i2$a r0 = r1.c     // Catch:{ all -> 0x0023 }
            boolean r0 = r0.c(r2)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r1)
            return
        L_0x000b:
            com.my.tracker.obfuscated.x r0 = r1.f     // Catch:{ all -> 0x0023 }
            r0.b(r2)     // Catch:{ all -> 0x0023 }
            com.my.tracker.obfuscated.w2 r2 = r1.b     // Catch:{ all -> 0x0023 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = "TimeSpentCore: starting ticker... (reason: incremented count based TimeSpent)"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r2)     // Catch:{ all -> 0x0023 }
            com.my.tracker.obfuscated.w2 r2 = r1.b     // Catch:{ all -> 0x0023 }
            r2.e()     // Catch:{ all -> 0x0023 }
            goto L_0x0025
        L_0x0023:
            r2 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i2.c(int):void");
    }

    /* renamed from: c */
    public synchronized void g(long j, int i2) {
        try {
            this.e.b(i2, j, this.g.c());
            if (this.g.b() && this.e.b() == 0) {
                this.g.g(j);
                x2.a("TimeSpentCore: there was last anytime TimeSpent during background state, stop tracking app useful background");
            }
        } catch (Exception unused) {
        }
    }

    public void e() {
        m.c(new mug(this, SystemClock.uptimeMillis(), 1));
    }

    public void f() {
        m.c(new y55(6, SystemClock.uptimeMillis(), System.currentTimeMillis(), this));
    }

    public void a(int i2) {
        m.c(new l40(this, i2, 19));
    }

    /* renamed from: b */
    public synchronized void d(long j) {
        x2.a("TimeSpentCore: ***** app is going to foreground *****");
        if (this.g.c()) {
            x2.a("TimeSpentCore: something went wrong, already in FOREGROUND state. Skip");
            return;
        }
        this.d.e(j);
        this.e.e(j);
        this.g.e(j);
        this.g.d();
        this.d.c(j);
        this.e.c(j);
        this.g.c(j);
        if (this.b.b()) {
            x2.a("TimeSpentCore: starting ticker... (reason: app going to foreground)");
            this.b.e();
        }
        x2.a("TimeSpentCore: ***** app is on foreground *****");
    }

    public void d() {
        m.c(new mug(this, SystemClock.uptimeMillis(), 0));
    }

    /* renamed from: a */
    public synchronized void c(long j) {
        x2.a("TimeSpentCore: ***** app is going to background *****");
        if (this.g.b()) {
            x2.a("TimeSpentCore: something went wrong, already in BACKGROUND state. Skip");
            return;
        }
        this.d.d(j);
        this.e.d(j);
        this.g.d(j);
        this.g.a(this.e.b());
        this.d.b(j);
        this.e.b(j);
        this.g.b(j);
        x2.a("TimeSpentCore: ***** app is on background *****");
    }

    public synchronized void b(long j, long j2, boolean z, b3 b3Var) {
        try {
            x2.a("TimeSpentCore: ***** onTick started ***** timestamp = " + j2);
            if (this.g.b() && this.e.b() == 0 && this.b.a()) {
                x2.a("TimeSpentCore: onTick: stopping ticker... (reason: no useful background)");
                this.b.f();
            }
            q2 a2 = a(j, j2);
            x2.a("TimeSpentCore: ***** onTick finished *****");
            this.a.a(a2, Boolean.valueOf(z), b3Var);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized void a(long j, long j2, boolean z, b3 b3Var) {
        this.b.d();
        b(j, j2, z, b3Var);
    }

    /* renamed from: b */
    public synchronized void f(long j, int i2) {
        if (this.c.b(i2)) {
            this.d.a(i2, j, this.g.c());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(long j, long j2) {
        b(j, j2, this.h, this.i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void e(long r3, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.my.tracker.obfuscated.i2$a r0 = r2.c     // Catch:{ all -> 0x003c }
            boolean r0 = r0.a(r5)     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r2)
            return
        L_0x000b:
            com.my.tracker.obfuscated.c r0 = r2.e     // Catch:{ all -> 0x003c }
            com.my.tracker.obfuscated.i r1 = r2.g     // Catch:{ all -> 0x003c }
            boolean r1 = r1.c()     // Catch:{ all -> 0x003c }
            r0.a((int) r5, (long) r3, (boolean) r1)     // Catch:{ all -> 0x003c }
            com.my.tracker.obfuscated.i r5 = r2.g     // Catch:{ all -> 0x003c }
            boolean r5 = r5.b()     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x003e
            com.my.tracker.obfuscated.c r5 = r2.e     // Catch:{ all -> 0x003c }
            int r5 = r5.b()     // Catch:{ all -> 0x003c }
            r0 = 1
            if (r5 != r0) goto L_0x003e
            com.my.tracker.obfuscated.i r5 = r2.g     // Catch:{ all -> 0x003c }
            r5.h(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "TimeSpentCore: this is first anytime TimeSpent during background state, start tracking app useful background"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r3)     // Catch:{ all -> 0x003c }
            com.my.tracker.obfuscated.w2 r3 = r2.b     // Catch:{ all -> 0x003c }
            r3.e()     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "TimeSpentCore: starting ticker... (reason: first anytime timeSpent during background state)"
            com.my.tracker.obfuscated.x2.a((java.lang.String) r3)     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r3 = move-exception
            goto L_0x0040
        L_0x003e:
            monitor-exit(r2)
            return
        L_0x0040:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.i2.e(long, int):void");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b3 b3Var, long j, long j2) {
        if (l.a(this.i.g, b3Var.g) != 0) {
            a(j, j2, this.h, this.i);
        }
        this.i = b3Var;
    }

    public void b(b3 b3Var) {
        this.i = b3Var;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool, long j, long j2) {
        boolean booleanValue = bool.booleanValue();
        boolean z = this.h;
        if (booleanValue != z) {
            a(j, j2, z, this.i);
        }
        this.h = bool.booleanValue();
    }

    public void b(int i2, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        m.c(z ? new oug(this, uptimeMillis, i2, 0) : new oug(this, uptimeMillis, i2, 1));
    }

    public void a(b3 b3Var) {
        m.c(new d70(this, b3Var, SystemClock.uptimeMillis(), System.currentTimeMillis(), 6));
    }

    public void b(Boolean bool) {
        m.c(new d70(this, bool, SystemClock.uptimeMillis(), System.currentTimeMillis(), 5));
    }

    public void a(Boolean bool) {
        this.h = bool.booleanValue();
    }

    public void a(int i2, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        m.c(z ? new oug(this, uptimeMillis, i2, 2) : new oug(this, uptimeMillis, i2, 3));
    }
}

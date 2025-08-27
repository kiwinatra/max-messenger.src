package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hp5  reason: default package */
public final class hp5 {
    public static final Object j = new Object();
    public static final ts k = new qae(0);
    public final Context a;
    public final String b;
    public final rp5 c;
    public final ic3 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final js7 g;
    public final m9c h;
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r12v2, types: [cc3, ic3, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:51|52|105) */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x01d0 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hp5(android.content.Context r11, java.lang.String r12, defpackage.rp5 r13) {
        /*
            r10 = this;
            r0 = 1
            r10.<init>()
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r10.e = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            r10.f = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r10.i = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r10.a = r11
            defpackage.vzg.i(r12)
            r10.b = r12
            r10.c = r13
            ec0 r12 = com.google.firebase.provider.FirebaseInitProvider.a
            java.lang.String r1 = "Firebase"
            android.os.Trace.beginSection(r1)
            java.lang.String r1 = "ComponentDiscovery"
            android.os.Trace.beginSection(r1)
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r1 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            android.content.pm.PackageManager r5 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r5 != 0) goto L_0x0043
            goto L_0x0056
        L_0x0043:
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0056 }
            r6.<init>(r11, r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r5 = r5.getServiceInfo(r6, r7)     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r5 != 0) goto L_0x0054
            java.util.Objects.toString(r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x0056
        L_0x0054:
            android.os.Bundle r4 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
        L_0x0056:
            if (r4 != 0) goto L_0x005d
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0094
        L_0x005d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r5 = r4.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x006a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0094
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r8 = "com.google.firebase.components.ComponentRegistrar"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x006a
            java.lang.String r7 = "com.google.firebase.components:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x006a
            r7 = 31
            java.lang.String r6 = r6.substring(r7)
            r1.add(r6)
            goto L_0x006a
        L_0x0094:
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ad
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            ec3 r5 = new ec3
            r5.<init>(r2, r4)
            r3.add(r5)
            goto L_0x0098
        L_0x00ad:
            android.os.Trace.endSection()
            java.lang.String r1 = "Runtime"
            android.os.Trace.beginSection(r1)
            wuf r1 = defpackage.wuf.a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.addAll(r3)
            com.google.firebase.FirebaseCommonRegistrar r3 = new com.google.firebase.FirebaseCommonRegistrar
            r3.<init>()
            ec3 r5 = new ec3
            r5.<init>(r0, r3)
            r1.add(r5)
            com.google.firebase.concurrent.ExecutorsRegistrar r3 = new com.google.firebase.concurrent.ExecutorsRegistrar
            r3.<init>()
            ec3 r5 = new ec3
            r5.<init>(r0, r3)
            r1.add(r5)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            mb3 r3 = defpackage.mb3.b(r11, r3, r5)
            r4.add(r3)
            java.lang.Class<hp5> r3 = defpackage.hp5.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            mb3 r3 = defpackage.mb3.b(r10, r3, r5)
            r4.add(r3)
            java.lang.Class<rp5> r3 = defpackage.rp5.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            mb3 r13 = defpackage.mb3.b(r13, r3, r5)
            r4.add(r13)
            u9a r13 = new u9a
            r3 = 9
            r13.<init>(r3)
            boolean r3 = defpackage.k0g.a(r11)
            if (r3 == 0) goto L_0x011f
            java.util.concurrent.atomic.AtomicBoolean r3 = com.google.firebase.provider.FirebaseInitProvider.b
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x011f
            java.lang.Class<ec0> r3 = defpackage.ec0.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            mb3 r12 = defpackage.mb3.b(r12, r3, r5)
            r4.add(r12)
        L_0x011f:
            ic3 r12 = new ic3
            wuf r3 = defpackage.wuf.a
            r12.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.a = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.b = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r12.c = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r12.o = r3
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r12.w = r3
            r85 r3 = new r85
            r3.<init>()
            r12.v = r3
            r12.x = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Class<r85> r5 = defpackage.r85.class
            java.lang.Class<qye> r6 = defpackage.qye.class
            java.lang.Class<fac> r7 = defpackage.fac.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r7}
            mb3 r3 = defpackage.mb3.b(r3, r5, r6)
            r13.add(r3)
            java.lang.Class<ic3> r3 = defpackage.ic3.class
            java.lang.Class[] r5 = new java.lang.Class[r2]
            mb3 r3 = defpackage.mb3.b(r12, r3, r5)
            r13.add(r3)
            java.util.Iterator r3 = r4.iterator()
        L_0x0177:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0189
            java.lang.Object r4 = r3.next()
            mb3 r4 = (defpackage.mb3) r4
            if (r4 == 0) goto L_0x0177
            r13.add(r4)
            goto L_0x0177
        L_0x0189:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0192:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01a0
            java.lang.Object r4 = r1.next()
            r3.add(r4)
            goto L_0x0192
        L_0x01a0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            monitor-enter(r12)
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x01cd }
        L_0x01aa:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01cd }
            if (r4 == 0) goto L_0x01d4
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01cd }
            m9c r4 = (defpackage.m9c) r4     // Catch:{ all -> 0x01cd }
            java.lang.Object r4 = r4.get()     // Catch:{ InvalidRegistrarException -> 0x01d0 }
            com.google.firebase.components.ComponentRegistrar r4 = (com.google.firebase.components.ComponentRegistrar) r4     // Catch:{ InvalidRegistrarException -> 0x01d0 }
            if (r4 == 0) goto L_0x01aa
            java.lang.Object r5 = r12.x     // Catch:{ InvalidRegistrarException -> 0x01d0 }
            u9a r5 = (defpackage.u9a) r5     // Catch:{ InvalidRegistrarException -> 0x01d0 }
            java.util.List r4 = r5.b(r4)     // Catch:{ InvalidRegistrarException -> 0x01d0 }
            r13.addAll(r4)     // Catch:{ InvalidRegistrarException -> 0x01d0 }
            r3.remove()     // Catch:{ InvalidRegistrarException -> 0x01d0 }
            goto L_0x01aa
        L_0x01cd:
            r10 = move-exception
            goto L_0x02d5
        L_0x01d0:
            r3.remove()     // Catch:{ all -> 0x01cd }
            goto L_0x01aa
        L_0x01d4:
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x01cd }
        L_0x01d8:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01cd }
            if (r4 == 0) goto L_0x021b
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01cd }
            mb3 r4 = (defpackage.mb3) r4     // Catch:{ all -> 0x01cd }
            java.util.Set r4 = r4.b     // Catch:{ all -> 0x01cd }
            java.lang.Object[] r4 = r4.toArray()     // Catch:{ all -> 0x01cd }
            int r5 = r4.length     // Catch:{ all -> 0x01cd }
            r6 = r2
        L_0x01ec:
            if (r6 >= r5) goto L_0x01d8
            r7 = r4[r6]     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x01cd }
            java.lang.String r9 = "kotlinx.coroutines.CoroutineDispatcher"
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x01cd }
            if (r8 == 0) goto L_0x0219
            java.lang.Object r8 = r12.o     // Catch:{ all -> 0x01cd }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x01cd }
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x01cd }
            boolean r8 = r8.contains(r9)     // Catch:{ all -> 0x01cd }
            if (r8 == 0) goto L_0x020e
            r3.remove()     // Catch:{ all -> 0x01cd }
            goto L_0x01d8
        L_0x020e:
            java.lang.Object r8 = r12.o     // Catch:{ all -> 0x01cd }
            java.util.HashSet r8 = (java.util.HashSet) r8     // Catch:{ all -> 0x01cd }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x01cd }
            r8.add(r7)     // Catch:{ all -> 0x01cd }
        L_0x0219:
            int r6 = r6 + r0
            goto L_0x01ec
        L_0x021b:
            java.lang.Object r0 = r12.a     // Catch:{ all -> 0x01cd }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x01cd }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0229
            defpackage.cjf.m(r13)     // Catch:{ all -> 0x01cd }
            goto L_0x023c
        L_0x0229:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01cd }
            java.lang.Object r3 = r12.a     // Catch:{ all -> 0x01cd }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x01cd }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x01cd }
            r0.<init>(r3)     // Catch:{ all -> 0x01cd }
            r0.addAll(r13)     // Catch:{ all -> 0x01cd }
            defpackage.cjf.m(r0)     // Catch:{ all -> 0x01cd }
        L_0x023c:
            java.util.Iterator r0 = r13.iterator()     // Catch:{ all -> 0x01cd }
        L_0x0240:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x01cd }
            if (r3 == 0) goto L_0x025e
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x01cd }
            mb3 r3 = (defpackage.mb3) r3     // Catch:{ all -> 0x01cd }
            js7 r4 = new js7     // Catch:{ all -> 0x01cd }
            hc3 r5 = new hc3     // Catch:{ all -> 0x01cd }
            r5.<init>(r2, r12, r3)     // Catch:{ all -> 0x01cd }
            r4.<init>(r5)     // Catch:{ all -> 0x01cd }
            java.lang.Object r5 = r12.a     // Catch:{ all -> 0x01cd }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x01cd }
            r5.put(r3, r4)     // Catch:{ all -> 0x01cd }
            goto L_0x0240
        L_0x025e:
            java.util.ArrayList r13 = r12.y(r13)     // Catch:{ all -> 0x01cd }
            r1.addAll(r13)     // Catch:{ all -> 0x01cd }
            java.util.ArrayList r13 = r12.z()     // Catch:{ all -> 0x01cd }
            r1.addAll(r13)     // Catch:{ all -> 0x01cd }
            r12.x()     // Catch:{ all -> 0x01cd }
            monitor-exit(r12)     // Catch:{ all -> 0x01cd }
            java.util.Iterator r13 = r1.iterator()
        L_0x0274:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0284
            java.lang.Object r0 = r13.next()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x0274
        L_0x0284:
            java.lang.Object r13 = r12.w
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13
            java.lang.Object r13 = r13.get()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x029b
            java.lang.Object r0 = r12.a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r13 = r13.booleanValue()
            r12.j(r0, r13)
        L_0x029b:
            r10.d = r12
            android.os.Trace.endSection()
            js7 r13 = new js7
            hc3 r0 = new hc3
            r1 = 2
            r0.<init>(r1, r10, r11)
            r13.<init>(r0)
            r10.g = r13
            java.lang.Class<pf4> r11 = defpackage.pf4.class
            m9c r11 = r12.c(r11)
            r10.h = r11
            ep5 r11 = new ep5
            r11.<init>(r10)
            r10.a()
            java.util.concurrent.atomic.AtomicBoolean r12 = r10.e
            boolean r12 = r12.get()
            if (r12 == 0) goto L_0x02cc
            hf0 r12 = defpackage.hf0.v
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.a
            r12.get()
        L_0x02cc:
            java.util.concurrent.CopyOnWriteArrayList r10 = r10.i
            r10.add(r11)
            android.os.Trace.endSection()
            return
        L_0x02d5:
            monitor-exit(r12)     // Catch:{ all -> 0x01cd }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp5.<init>(android.content.Context, java.lang.String, rp5):void");
    }

    public static hp5 b() {
        hp5 hp5;
        synchronized (j) {
            try {
                hp5 = (hp5) k.get("[DEFAULT]");
                if (hp5 == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (n54.u == null) {
                        n54.u = Application.getProcessName();
                    }
                    sb.append(n54.u);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((pf4) hp5.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hp5;
    }

    public static hp5 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    hp5 b2 = b();
                    return b2;
                }
                rp5 a2 = rp5.a(context);
                if (a2 == null) {
                    return null;
                }
                hp5 f2 = f(context, a2);
                return f2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static hp5 f(Context context, rp5 rp5) {
        hp5 hp5;
        AtomicReference atomicReference = fp5.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = fp5.a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (!atomicReference2.compareAndSet((Object) null, obj)) {
                        if (atomicReference2.get() != null) {
                            break;
                        }
                    } else {
                        hf0.a(application);
                        hf0 hf0 = hf0.v;
                        hf0.getClass();
                        synchronized (hf0) {
                            hf0.c.add(obj);
                        }
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            ts tsVar = k;
            vzg.o("FirebaseApp name " + "[DEFAULT]" + " already exists!", !tsVar.containsKey("[DEFAULT]"));
            vzg.n(context, "Application context cannot be null.");
            hp5 = new hp5(context, "[DEFAULT]", rp5);
            tsVar.put("[DEFAULT]", hp5);
        }
        hp5.d();
        return hp5;
    }

    public final void a() {
        vzg.o("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        String str = null;
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!k0g.a(this.a)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = gp5.b;
            if (atomicReference.get() == null) {
                gp5 gp5 = new gp5(context);
                while (!atomicReference.compareAndSet((Object) null, gp5)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(gp5, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        ic3 ic3 = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) ic3.w;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet((Object) null, valueOf)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            } else {
                synchronized (ic3) {
                    hashMap = new HashMap((HashMap) ic3.a);
                }
                ic3.j(hashMap, equals);
                break;
            }
        }
        ((pf4) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hp5)) {
            return false;
        }
        hp5 hp5 = (hp5) obj;
        hp5.a();
        return this.b.equals(hp5.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        fj fjVar = new fj((Object) this);
        fjVar.k(this.b, "name");
        fjVar.k(this.c, "options");
        return fjVar.toString();
    }
}

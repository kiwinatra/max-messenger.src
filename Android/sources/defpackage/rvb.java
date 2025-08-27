package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: rvb  reason: default package */
public final class rvb implements u95, q96 {
    public static final String v0 = h88.V("Processor");
    public final HashSet X;
    public final ArrayList Y;
    public final Object Z;
    public PowerManager.WakeLock a;
    public final Context b;
    public final ve3 c;
    public final wdf o;
    public final WorkDatabase v;
    public final HashMap w = new HashMap();
    public final HashMap x = new HashMap();
    public final HashMap y;
    public final List z;

    public rvb(Context context, ve3 ve3, g6d g6d, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = ve3;
        this.o = g6d;
        this.v = workDatabase;
        this.z = list;
        this.X = new HashSet();
        this.Y = new ArrayList();
        this.a = null;
        this.Z = new Object();
        this.y = new HashMap();
    }

    public static boolean c(String str, mqg mqg) {
        if (mqg != null) {
            mqg.A0 = true;
            mqg.h();
            mqg.z0.cancel(true);
            if (mqg.w == null || !(mqg.z0.a instanceof u0)) {
                h88.x().p(mqg.B0, "WorkSpec " + mqg.v + " is already done. Not interrupting.");
            } else {
                mqg.w.stop();
            }
            h88 x2 = h88.x();
            String str2 = v0;
            x2.p(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        h88 x3 = h88.x();
        String str3 = v0;
        x3.p(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    public final void a(u95 u95) {
        synchronized (this.Z) {
            this.Y.add(u95);
        }
    }

    public final void b(wog wog, boolean z2) {
        synchronized (this.Z) {
            try {
                mqg mqg = (mqg) this.x.get(wog.a);
                if (mqg != null && wog.equals(m5a.z(mqg.v))) {
                    this.x.remove(wog.a);
                }
                h88 x2 = h88.x();
                String str = v0;
                x2.p(str, rvb.class.getSimpleName() + " " + wog.a + " executed; reschedule = " + z2);
                Iterator it = this.Y.iterator();
                while (it.hasNext()) {
                    ((u95) it.next()).b(wog, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z2;
        synchronized (this.Z) {
            try {
                if (!this.x.containsKey(str)) {
                    if (!this.w.containsKey(str)) {
                        z2 = false;
                    }
                }
                z2 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public final void e(u95 u95) {
        synchronized (this.Z) {
            this.Y.remove(u95);
        }
    }

    public final void f(wog wog) {
        ((ky6) ((g6d) this.o).o).execute(new hu2(this, wog));
    }

    public final void g(String str, o96 o96) {
        synchronized (this.Z) {
            try {
                h88 x2 = h88.x();
                String str2 = v0;
                x2.G(str2, "Moving WorkSpec (" + str + ") to the foreground");
                mqg mqg = (mqg) this.x.remove(str);
                if (mqg != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock a2 = teg.a(this.b, "ProcessorForegroundLck");
                        this.a = a2;
                        a2.acquire();
                    }
                    this.w.put(str, mqg);
                    hw3.b(this.b, e7f.c(this.b, m5a.z(mqg.v), o96));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [n09, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(defpackage.bme r12, defpackage.aqg r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Work "
            wog r1 = r12.a
            java.lang.String r2 = r1.a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            androidx.work.impl.WorkDatabase r4 = r11.v
            uu0 r5 = new uu0
            r6 = 3
            r5.<init>(r11, r3, r2, r6)
            java.lang.Object r4 = r4.p(r5)
            xpg r4 = (defpackage.xpg) r4
            r5 = 0
            if (r4 != 0) goto L_0x0037
            h88 r12 = defpackage.h88.x()
            java.lang.String r13 = v0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Didn't find WorkSpec for id "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r12.Z(r13, r0)
            r11.f(r1)
            return r5
        L_0x0037:
            java.lang.Object r6 = r11.Z
            monitor-enter(r6)
            boolean r7 = r11.d(r2)     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0080
            java.util.HashMap r13 = r11.y     // Catch:{ all -> 0x0078 }
            java.lang.Object r13 = r13.get(r2)     // Catch:{ all -> 0x0078 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0078 }
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x0078 }
            java.lang.Object r2 = r2.next()     // Catch:{ all -> 0x0078 }
            bme r2 = (defpackage.bme) r2     // Catch:{ all -> 0x0078 }
            wog r2 = r2.a     // Catch:{ all -> 0x0078 }
            int r2 = r2.b     // Catch:{ all -> 0x0078 }
            int r3 = r1.b     // Catch:{ all -> 0x0078 }
            if (r2 != r3) goto L_0x007b
            r13.add(r12)     // Catch:{ all -> 0x0078 }
            h88 r11 = defpackage.h88.x()     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = v0     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r13.<init>(r0)     // Catch:{ all -> 0x0078 }
            r13.append(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = " is already enqueued for processing"
            r13.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0078 }
            r11.p(r12, r13)     // Catch:{ all -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r11 = move-exception
            goto L_0x0116
        L_0x007b:
            r11.f(r1)     // Catch:{ all -> 0x0078 }
        L_0x007e:
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            return r5
        L_0x0080:
            int r0 = r4.t     // Catch:{ all -> 0x0078 }
            int r7 = r1.b     // Catch:{ all -> 0x0078 }
            if (r0 == r7) goto L_0x008b
            r11.f(r1)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            return r5
        L_0x008b:
            n09 r0 = new n09     // Catch:{ all -> 0x0078 }
            android.content.Context r5 = r11.b     // Catch:{ all -> 0x0078 }
            ve3 r7 = r11.c     // Catch:{ all -> 0x0078 }
            wdf r8 = r11.o     // Catch:{ all -> 0x0078 }
            androidx.work.impl.WorkDatabase r9 = r11.v     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            aqg r10 = new aqg     // Catch:{ all -> 0x0078 }
            r10.<init>()     // Catch:{ all -> 0x0078 }
            r0.z = r10     // Catch:{ all -> 0x0078 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0078 }
            r0.b = r5     // Catch:{ all -> 0x0078 }
            r0.a = r8     // Catch:{ all -> 0x0078 }
            r0.c = r11     // Catch:{ all -> 0x0078 }
            r0.o = r7     // Catch:{ all -> 0x0078 }
            r0.v = r9     // Catch:{ all -> 0x0078 }
            r0.w = r4     // Catch:{ all -> 0x0078 }
            r0.y = r3     // Catch:{ all -> 0x0078 }
            java.util.List r3 = r11.z     // Catch:{ all -> 0x0078 }
            r0.x = r3     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x00b9
            r0.z = r13     // Catch:{ all -> 0x0078 }
        L_0x00b9:
            mqg r13 = new mqg     // Catch:{ all -> 0x0078 }
            r13.<init>(r0)     // Catch:{ all -> 0x0078 }
            cyd r0 = r13.y0     // Catch:{ all -> 0x0078 }
            ij3 r3 = new ij3     // Catch:{ all -> 0x0078 }
            wog r4 = r12.a     // Catch:{ all -> 0x0078 }
            r5 = 4
            r3.<init>(r11, r4, r0, r5)     // Catch:{ all -> 0x0078 }
            wdf r4 = r11.o     // Catch:{ all -> 0x0078 }
            g6d r4 = (defpackage.g6d) r4     // Catch:{ all -> 0x0078 }
            java.lang.Object r4 = r4.o     // Catch:{ all -> 0x0078 }
            ky6 r4 = (defpackage.ky6) r4     // Catch:{ all -> 0x0078 }
            r0.d(r3, r4)     // Catch:{ all -> 0x0078 }
            java.util.HashMap r0 = r11.x     // Catch:{ all -> 0x0078 }
            r0.put(r2, r13)     // Catch:{ all -> 0x0078 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            r0.add(r12)     // Catch:{ all -> 0x0078 }
            java.util.HashMap r12 = r11.y     // Catch:{ all -> 0x0078 }
            r12.put(r2, r0)     // Catch:{ all -> 0x0078 }
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            wdf r11 = r11.o
            g6d r11 = (defpackage.g6d) r11
            java.lang.Object r11 = r11.b
            qn r11 = (defpackage.qn) r11
            r11.execute(r13)
            h88 r11 = defpackage.h88.x()
            java.lang.String r12 = v0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.Class<rvb> r0 = defpackage.rvb.class
            java.lang.String r0 = r0.getSimpleName()
            r13.append(r0)
            java.lang.String r0 = ": processing "
            r13.append(r0)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            r11.p(r12, r13)
            r11 = 1
            return r11
        L_0x0116:
            monitor-exit(r6)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvb.h(bme, aqg):boolean");
    }

    public final void i() {
        synchronized (this.Z) {
            try {
                if (!(!this.w.isEmpty())) {
                    Context context = this.b;
                    String str = e7f.X;
                    Intent intent = new Intent(context, SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    this.b.startService(intent);
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

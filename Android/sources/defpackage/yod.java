package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: yod  reason: default package */
public abstract class yod implements lt4 {
    public final q74 a;
    public final o8b b;
    public final ArrayList c;
    public final hx0 d;
    public final bx0 e;
    public final rx0 f = rx0.c;
    public final Executor g;
    public final long h = v0g.S(20000);
    public final ArrayList i = new ArrayList();
    public volatile boolean j;

    public yod(ir8 ir8, o8b o8b, hx0 hx0, Executor executor) {
        ir8.b.getClass();
        xq8 xq8 = ir8.b;
        this.a = d(xq8.a);
        this.b = o8b;
        this.c = new ArrayList(xq8.e);
        this.d = hx0;
        this.g = executor;
        bx0 bx0 = hx0.a;
        bx0.getClass();
        this.e = bx0;
    }

    public static q74 d(Uri uri) {
        Map emptyMap = Collections.emptyMap();
        n79.p(uri, "The uri must be set.");
        return new q74(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1, (Object) null);
    }

    public static void f(List list, rx0 rx0, long j2) {
        int i2;
        HashMap hashMap;
        String str;
        wod wod;
        List list2 = list;
        HashMap hashMap2 = new HashMap();
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            wod wod2 = (wod) list2.get(i3);
            String b2 = rx0.b(wod2.b);
            Integer num = (Integer) hashMap2.get(b2);
            wod wod3 = num == null ? null : (wod) list2.get(num.intValue());
            if (wod3 != null) {
                long j3 = wod3.a;
                if (wod2.a <= j3 + j2) {
                    q74 q74 = wod3.b;
                    Uri uri = q74.a;
                    q74 q742 = wod2.b;
                    if (uri.equals(q742.a)) {
                        long j4 = q74.g;
                        long j5 = -1;
                        if (j4 != -1) {
                            hashMap = hashMap2;
                            i2 = i3;
                            wod = wod2;
                            str = b2;
                            if (q74.f + j4 == q742.f && v0g.a(q74.h, q742.h) && q74.i == q742.i && q74.c == q742.c && q74.e.equals(q742.e)) {
                                long j6 = q742.g;
                                if (j6 != -1) {
                                    j5 = j4 + j6;
                                }
                                q74 c2 = q74.c(0, j5);
                                num.getClass();
                                list2.set(num.intValue(), new wod(j3, c2));
                                i3 = i2 + 1;
                                hashMap2 = hashMap;
                            }
                            hashMap.put(str, Integer.valueOf(i4));
                            list2.set(i4, wod);
                            i4++;
                            i3 = i2 + 1;
                            hashMap2 = hashMap;
                        }
                    }
                }
            }
            hashMap = hashMap2;
            i2 = i3;
            wod = wod2;
            str = b2;
            hashMap.put(str, Integer.valueOf(i4));
            list2.set(i4, wod);
            i4++;
            i3 = i2 + 1;
            hashMap2 = hashMap;
        }
        v0g.X(list2, i4, list.size());
    }

    public final void a(kt4 kt4) {
        jx0 jx0;
        byte[] bArr;
        ArrayDeque arrayDeque;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        ArrayDeque arrayDeque3 = new ArrayDeque();
        try {
            jx0 c2 = this.d.c();
            to5 to5 = (to5) c(new uod(this, c2, this.a), false);
            if (!this.c.isEmpty()) {
                to5 = (to5) to5.a(this.c);
            }
            ArrayList e2 = e(c2, to5, false);
            Collections.sort(e2);
            f(e2, this.f, this.h);
            int size = e2.size();
            int size2 = e2.size() - 1;
            int i2 = 0;
            long j2 = 0;
            long j3 = 0;
            while (size2 >= 0) {
                q74 q74 = ((wod) e2.get(size2)).b;
                String b2 = this.f.b(q74);
                long j4 = q74.g;
                if (j4 == -1) {
                    long a2 = nv3.a(((tae) this.e).i(b2));
                    if (a2 != -1) {
                        j4 = a2 - q74.f;
                    }
                }
                ArrayDeque arrayDeque4 = arrayDeque3;
                long g2 = ((tae) this.e).g(q74.f, b2, j4);
                j3 += g2;
                if (j4 != -1) {
                    if (j4 == g2) {
                        i2++;
                        e2.remove(size2);
                    }
                    if (j2 != -1) {
                        j2 += j4;
                    }
                } else {
                    j2 = -1;
                }
                size2--;
                arrayDeque3 = arrayDeque4;
            }
            ArrayDeque arrayDeque5 = arrayDeque3;
            vod vod = kt4 != null ? new vod(kt4, j2, size, j3, i2) : null;
            arrayDeque2.addAll(e2);
            while (!this.j && !arrayDeque2.isEmpty()) {
                if (!arrayDeque5.isEmpty()) {
                    xod xod = (xod) arrayDeque5.removeFirst();
                    jx0 = xod.z;
                    bArr = xod.Y;
                } else {
                    jx0 = this.d.c();
                    bArr = new byte[131072];
                }
                xod xod2 = new xod((wod) arrayDeque2.removeFirst(), jx0, vod, bArr);
                b(xod2);
                this.g.execute(xod2);
                int size3 = this.i.size() - 1;
                while (size3 >= 0) {
                    xod xod3 = (xod) this.i.get(size3);
                    if (arrayDeque2.isEmpty() || xod3.b.e()) {
                        try {
                            xod3.get();
                            g(size3);
                            arrayDeque = arrayDeque5;
                            try {
                                arrayDeque.addLast(xod3);
                            } catch (ExecutionException e3) {
                                e = e3;
                            }
                        } catch (ExecutionException e4) {
                            e = e4;
                            arrayDeque = arrayDeque5;
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (cause instanceof PriorityTaskManager$PriorityTooLowException) {
                                arrayDeque2.addFirst(xod3.y);
                                g(size3);
                                arrayDeque.addLast(xod3);
                                size3--;
                                arrayDeque5 = arrayDeque;
                            } else if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            } else {
                                throw cause;
                            }
                        }
                    } else {
                        arrayDeque = arrayDeque5;
                    }
                    size3--;
                    arrayDeque5 = arrayDeque;
                }
                ArrayDeque arrayDeque6 = arrayDeque5;
                xod2.a.b();
                arrayDeque5 = arrayDeque6;
            }
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                ((yad) this.i.get(i3)).cancel(true);
            }
            for (int size4 = this.i.size() - 1; size4 >= 0; size4--) {
                ((yad) this.i.get(size4)).a();
                g(size4);
            }
        } catch (Throwable th) {
            for (int i4 = 0; i4 < this.i.size(); i4++) {
                ((yad) this.i.get(i4)).cancel(true);
            }
            for (int size5 = this.i.size() - 1; size5 >= 0; size5--) {
                ((yad) this.i.get(size5)).a();
                g(size5);
            }
            throw th;
        }
    }

    public final void b(yad yad) {
        synchronized (this.i) {
            try {
                if (!this.j) {
                    this.i.add(yad);
                } else {
                    throw new InterruptedException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c(yad yad, boolean z) {
        if (z) {
            yad.run();
            try {
                return yad.get();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i2 = v0g.a;
                throw e2;
            }
        } else {
            while (!this.j) {
                b(yad);
                this.g.execute(yad);
                try {
                    return yad.get();
                } catch (ExecutionException e3) {
                    Throwable cause2 = e3.getCause();
                    cause2.getClass();
                    if (!(cause2 instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause2 instanceof IOException) {
                            throw ((IOException) cause2);
                        }
                        int i3 = v0g.a;
                        throw e3;
                    }
                } finally {
                    yad.a();
                    h(yad);
                }
            }
            throw new InterruptedException();
        }
    }

    public final void cancel() {
        synchronized (this.i) {
            try {
                this.j = true;
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    ((yad) this.i.get(i2)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList e(jx0 jx0, to5 to5, boolean z);

    public final void g(int i2) {
        synchronized (this.i) {
            this.i.remove(i2);
        }
    }

    public final void h(yad yad) {
        synchronized (this.i) {
            this.i.remove(yad);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void remove() {
        /*
            r8 = this;
            rx0 r0 = r8.f
            bx0 r1 = r8.e
            q74 r2 = r8.a
            hx0 r3 = r8.d
            int r4 = r3.e
            r5 = 1
            r4 = r4 | r5
            r6 = -4000(0xfffffffffffff060, float:NaN)
            r7 = 0
            jx0 r3 = r3.d(r7, r4, r6)
            uod r4 = new uod     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r4.<init>(r8, r3, r2)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.lang.Object r4 = r8.c(r4, r5)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            to5 r4 = (defpackage.to5) r4     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.util.ArrayList r8 = r8.e(r3, r4, r5)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r3 = 0
        L_0x0023:
            int r4 = r8.size()     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            if (r3 >= r4) goto L_0x0040
            java.lang.Object r4 = r8.get(r3)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            wod r4 = (defpackage.wod) r4     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            q74 r4 = r4.b     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            java.lang.String r4 = r0.b(r4)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r5 = r1
            tae r5 = (defpackage.tae) r5     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            r5.l(r4)     // Catch:{ InterruptedException -> 0x004a, Exception -> 0x0040 }
            int r3 = r3 + 1
            goto L_0x0023
        L_0x003e:
            r8 = move-exception
            goto L_0x0053
        L_0x0040:
            java.lang.String r8 = r0.b(r2)
            tae r1 = (defpackage.tae) r1
            r1.l(r8)
            goto L_0x0052
        L_0x004a:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003e }
            r8.interrupt()     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r0 = r0.b(r2)
            tae r1 = (defpackage.tae) r1
            r1.l(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yod.remove():void");
    }
}

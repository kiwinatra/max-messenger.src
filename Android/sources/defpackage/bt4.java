package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: bt4  reason: default package */
public final class bt4 extends Handler {
    public final HandlerThread a;
    public final uqg b;
    public final mt4 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i = 3;
    public int j = 5;
    public int k;
    public boolean l;

    public bt4(HandlerThread handlerThread, de4 de4, ee4 ee4, Handler handler, boolean z) {
        super(handlerThread.getLooper());
        this.a = handlerThread;
        this.b = de4;
        this.c = ee4;
        this.d = handler;
        this.h = z;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static rr4 a(rr4 rr4, int i2, int i3) {
        return new rr4(rr4.a, i2, rr4.c, System.currentTimeMillis(), rr4.e, i3, 0, rr4.h);
    }

    public final rr4 b(String str, boolean z) {
        int c2 = c(str);
        if (c2 != -1) {
            return (rr4) this.e.get(c2);
        }
        if (!z) {
            return null;
        }
        try {
            return ((de4) this.b).d(str);
        } catch (IOException e2) {
            i8b.p("Failed to load download: " + str, e2);
            return null;
        }
    }

    public final int c(String str) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            if (((rr4) arrayList.get(i2)).a.a.equals(str)) {
                return i2;
            }
            i2++;
        }
    }

    public final void d(rr4 rr4) {
        int i2 = rr4.b;
        boolean z = true;
        n79.n((i2 == 3 || i2 == 4) ? false : true);
        int c2 = c(rr4.a.a);
        ArrayList arrayList = this.e;
        if (c2 == -1) {
            arrayList.add(rr4);
            Collections.sort(arrayList, new oj4(3));
        } else {
            if (rr4.c == ((rr4) arrayList.get(c2)).c) {
                z = false;
            }
            arrayList.set(c2, rr4);
            if (z) {
                Collections.sort(arrayList, new oj4(3));
            }
        }
        try {
            ((de4) this.b).i(rr4);
        } catch (IOException e2) {
            i8b.p("Failed to update index.", e2);
        }
        this.d.obtainMessage(3, new at4(rr4, false, new ArrayList(arrayList), (Exception) null)).sendToTarget();
    }

    public final rr4 e(rr4 rr4, int i2, int i3) {
        n79.n((i2 == 3 || i2 == 4) ? false : true);
        rr4 a2 = a(rr4, i2, i3);
        d(a2);
        return a2;
    }

    public final void f(rr4 rr4, int i2) {
        rr4 rr42 = rr4;
        int i3 = i2;
        if (i3 == 0) {
            if (rr42.b == 1) {
                e(rr4, 0, 0);
            }
        } else if (i3 != rr42.f) {
            int i4 = rr42.b;
            if (i4 == 0 || i4 == 2) {
                i4 = 1;
            }
            d(new rr4(rr42.a, i4, rr42.c, System.currentTimeMillis(), rr42.e, i2, 0, rr42.h));
        }
    }

    public final void g() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                rr4 rr4 = (rr4) arrayList.get(i2);
                HashMap hashMap = this.f;
                dt4 dt4 = (dt4) hashMap.get(rr4.a.a);
                mt4 mt4 = this.c;
                int i4 = rr4.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            dt4.getClass();
                            n79.n(!dt4.o);
                            if (this.h || this.g != 0 || i3 >= this.i) {
                                e(rr4, 0, 0);
                                dt4.a(false);
                            }
                        } else if (i4 != 5 && i4 != 7) {
                            throw new IllegalStateException();
                        } else if (dt4 != null) {
                            if (!dt4.o) {
                                dt4.a(false);
                            }
                        } else if (!this.l) {
                            ht4 ht4 = rr4.a;
                            dt4 dt42 = new dt4(rr4.a, ((ee4) mt4).a(ht4), rr4.h, true, this.j, this);
                            hashMap.put(ht4.a, dt42);
                            this.l = true;
                            dt42.start();
                        }
                    } else if (dt4 != null) {
                        n79.n(!dt4.o);
                        dt4.a(false);
                    }
                } else if (dt4 != null) {
                    n79.n(!dt4.o);
                    dt4.a(false);
                } else if (this.h || this.g != 0 || this.k >= this.i) {
                    dt4 = null;
                } else {
                    rr4 e2 = e(rr4, 2, 0);
                    ht4 ht42 = e2.a;
                    dt4 dt43 = new dt4(e2.a, ((ee4) mt4).a(ht42), e2.h, false, this.j, this);
                    hashMap.put(ht42.a, dt43);
                    int i5 = this.k;
                    this.k = i5 + 1;
                    if (i5 == 0) {
                        sendEmptyMessageDelayed(12, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                    }
                    dt43.start();
                    dt4 = dt43;
                }
                if (dt4 != null && !dt4.o) {
                    i3++;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5, types: [int] */
    /* JADX WARNING: type inference failed for: r10v7, types: [int] */
    /* JADX WARNING: type inference failed for: r10v9, types: [int] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        r0 = r1.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r10 >= r0.size()) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r0 = (defpackage.rr4) r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r0.b != 2) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        ((defpackage.de4) r1.b).i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        defpackage.i8b.p("Failed to update index.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        sendEmptyMessageDelayed(12, ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.UPLOAD_NEXT_INTERVAL);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            int r2 = r0.what
            r3 = 12
            r4 = 4
            r5 = 7
            r6 = 3
            r7 = 0
            r8 = 2
            r9 = 5
            r10 = 0
            r11 = 1
            switch(r2) {
                case 1: goto L_0x03fc;
                case 2: goto L_0x03f1;
                case 3: goto L_0x03e8;
                case 4: goto L_0x037d;
                case 5: goto L_0x0374;
                case 6: goto L_0x036e;
                case 7: goto L_0x02b3;
                case 8: goto L_0x028e;
                case 9: goto L_0x01e3;
                case 10: goto L_0x00cc;
                case 11: goto L_0x007c;
                case 12: goto L_0x0054;
                case 13: goto L_0x0019;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0019:
            java.util.HashMap r0 = r1.f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            dt4 r2 = (defpackage.dt4) r2
            r2.a(r11)
            goto L_0x0023
        L_0x0033:
            uqg r0 = r1.b     // Catch:{ IOException -> 0x003b }
            de4 r0 = (defpackage.de4) r0     // Catch:{ IOException -> 0x003b }
            r0.k()     // Catch:{ IOException -> 0x003b }
            goto L_0x0041
        L_0x003b:
            r0 = move-exception
            java.lang.String r2 = "Failed to update index."
            defpackage.i8b.p(r2, r0)
        L_0x0041:
            java.util.ArrayList r0 = r1.e
            r0.clear()
            android.os.HandlerThread r0 = r1.a
            r0.quit()
            monitor-enter(r32)
            r32.notifyAll()     // Catch:{ all -> 0x0051 }
            monitor-exit(r32)     // Catch:{ all -> 0x0051 }
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r32)     // Catch:{ all -> 0x0051 }
            throw r0
        L_0x0054:
            java.util.ArrayList r0 = r1.e
            int r2 = r0.size()
            if (r10 >= r2) goto L_0x0076
            java.lang.Object r0 = r0.get(r10)
            rr4 r0 = (defpackage.rr4) r0
            int r2 = r0.b
            if (r2 != r8) goto L_0x0074
            uqg r2 = r1.b     // Catch:{ IOException -> 0x006e }
            de4 r2 = (defpackage.de4) r2     // Catch:{ IOException -> 0x006e }
            r2.i(r0)     // Catch:{ IOException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r0 = move-exception
            java.lang.String r2 = "Failed to update index."
            defpackage.i8b.p(r2, r0)
        L_0x0074:
            int r10 = r10 + r11
            goto L_0x0054
        L_0x0076:
            r4 = 5000(0x1388, double:2.4703E-320)
            r1.sendEmptyMessageDelayed(r3, r4)
            return
        L_0x007c:
            java.lang.Object r2 = r0.obj
            dt4 r2 = (defpackage.dt4) r2
            int r3 = r0.arg1
            int r0 = r0.arg2
            int r4 = defpackage.v0g.a
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            r7 = 32
            long r3 = r3 << r7
            long r7 = (long) r0
            long r5 = r5 & r7
            long r18 = r3 | r5
            ht4 r0 = r2.a
            java.lang.String r0 = r0.a
            rr4 r0 = r1.b(r0, r10)
            r0.getClass()
            long r2 = r0.e
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00cb
            r2 = -1
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00ac
            goto L_0x00cb
        L_0x00ac:
            rr4 r2 = new rr4
            long r16 = java.lang.System.currentTimeMillis()
            int r3 = r0.g
            gt4 r4 = r0.h
            ht4 r12 = r0.a
            int r13 = r0.b
            long r14 = r0.c
            int r0 = r0.f
            r11 = r2
            r20 = r0
            r21 = r3
            r22 = r4
            r11.<init>(r12, r13, r14, r16, r18, r20, r21, r22)
            r1.d(r2)
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.Object r0 = r0.obj
            dt4 r0 = (defpackage.dt4) r0
            ht4 r2 = r0.a
            java.lang.String r2 = r2.a
            java.util.HashMap r12 = r1.f
            r12.remove(r2)
            boolean r12 = r0.o
            if (r12 == 0) goto L_0x00e0
            r1.l = r10
            goto L_0x00ea
        L_0x00e0:
            int r13 = r1.k
            int r13 = r13 - r11
            r1.k = r13
            if (r13 != 0) goto L_0x00ea
            r1.removeMessages(r3)
        L_0x00ea:
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x00f3
            r32.g()
            goto L_0x0466
        L_0x00f3:
            java.lang.Exception r3 = r0.y
            if (r3 == 0) goto L_0x0112
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Task failed: "
            r13.<init>(r14)
            ht4 r0 = r0.a
            r13.append(r0)
            java.lang.String r0 = ", "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r0 = r13.toString()
            defpackage.i8b.p(r0, r3)
        L_0x0112:
            rr4 r2 = r1.b(r2, r10)
            r2.getClass()
            int r0 = r2.b
            if (r0 == r8) goto L_0x0184
            if (r0 == r9) goto L_0x0128
            if (r0 != r5) goto L_0x0122
            goto L_0x0128
        L_0x0122:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0128:
            defpackage.n79.n(r12)
            int r0 = r2.b
            if (r0 != r5) goto L_0x013c
            int r0 = r2.f
            if (r0 != 0) goto L_0x0134
            r11 = r10
        L_0x0134:
            r1.e(r2, r11, r0)
            r32.g()
            goto L_0x01de
        L_0x013c:
            ht4 r0 = r2.a
            java.lang.String r3 = r0.a
            int r3 = r1.c(r3)
            java.util.ArrayList r4 = r1.e
            r4.remove(r3)
            uqg r3 = r1.b     // Catch:{ IOException -> 0x016b }
            java.lang.String r0 = r0.a     // Catch:{ IOException -> 0x016b }
            de4 r3 = (defpackage.de4) r3     // Catch:{ IOException -> 0x016b }
            r3.b()     // Catch:{ IOException -> 0x016b }
            u74 r3 = r3.a     // Catch:{ SQLiteException -> 0x0164 }
            android.database.sqlite.SQLiteDatabase r3 = r3.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0164 }
            java.lang.String r5 = "ExoPlayerDownloads"
            java.lang.String r9 = "id = ?"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0164 }
            r3.delete(r5, r9, r0)     // Catch:{ SQLiteException -> 0x0164 }
            goto L_0x0170
        L_0x0164:
            r0 = move-exception
            androidx.media3.database.DatabaseIOException r3 = new androidx.media3.database.DatabaseIOException     // Catch:{ IOException -> 0x016b }
            r3.<init>(r0)     // Catch:{ IOException -> 0x016b }
            throw r3     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            java.lang.String r0 = "Failed to remove from database"
            defpackage.i8b.o(r0)
        L_0x0170:
            at4 r0 = new at4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            r0.<init>(r2, r11, r3, r7)
            android.os.Handler r2 = r1.d
            android.os.Message r0 = r2.obtainMessage(r6, r0)
            r0.sendToTarget()
            goto L_0x01de
        L_0x0184:
            r0 = r12 ^ 1
            defpackage.n79.n(r0)
            rr4 r5 = new rr4
            ht4 r13 = r2.a
            if (r3 != 0) goto L_0x0191
            r14 = r6
            goto L_0x0192
        L_0x0191:
            r14 = r4
        L_0x0192:
            long r17 = java.lang.System.currentTimeMillis()
            if (r3 != 0) goto L_0x019b
            r22 = r10
            goto L_0x019d
        L_0x019b:
            r22 = r11
        L_0x019d:
            gt4 r0 = r2.h
            long r11 = r2.c
            long r8 = r2.e
            int r2 = r2.f
            r15 = r11
            r12 = r5
            r19 = r8
            r21 = r2
            r23 = r0
            r12.<init>(r13, r14, r15, r17, r19, r21, r22, r23)
            java.util.ArrayList r2 = r1.e
            ht4 r0 = r5.a
            java.lang.String r0 = r0.a
            int r0 = r1.c(r0)
            r2.remove(r0)
            uqg r0 = r1.b     // Catch:{ IOException -> 0x01c5 }
            de4 r0 = (defpackage.de4) r0     // Catch:{ IOException -> 0x01c5 }
            r0.i(r5)     // Catch:{ IOException -> 0x01c5 }
            goto L_0x01cb
        L_0x01c5:
            r0 = move-exception
            java.lang.String r4 = "Failed to update index."
            defpackage.i8b.p(r4, r0)
        L_0x01cb:
            at4 r0 = new at4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r0.<init>(r5, r10, r4, r3)
            android.os.Handler r2 = r1.d
            android.os.Message r0 = r2.obtainMessage(r6, r0)
            r0.sendToTarget()
        L_0x01de:
            r32.g()
            goto L_0x0466
        L_0x01e3:
            uqg r2 = r1.b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r0 = new int[]{r6, r4}     // Catch:{ IOException -> 0x0220 }
            r4 = r2
            de4 r4 = (defpackage.de4) r4     // Catch:{ IOException -> 0x0220 }
            r4.b()     // Catch:{ IOException -> 0x0220 }
            java.lang.String r0 = defpackage.de4.g(r0)     // Catch:{ IOException -> 0x0220 }
            android.database.Cursor r4 = r4.c(r0, r7)     // Catch:{ IOException -> 0x0220 }
        L_0x01fc:
            int r0 = r4.getPosition()     // Catch:{ all -> 0x020f }
            int r0 = r0 + r11
            boolean r0 = r4.moveToPosition(r0)     // Catch:{ all -> 0x020f }
            if (r0 == 0) goto L_0x0212
            rr4 r0 = defpackage.de4.e(r4)     // Catch:{ all -> 0x020f }
            r3.add(r0)     // Catch:{ all -> 0x020f }
            goto L_0x01fc
        L_0x020f:
            r0 = move-exception
            r5 = r0
            goto L_0x0216
        L_0x0212:
            r4.close()     // Catch:{ IOException -> 0x0220 }
            goto L_0x0225
        L_0x0216:
            r4.close()     // Catch:{ all -> 0x021a }
            goto L_0x021f
        L_0x021a:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x0220 }
        L_0x021f:
            throw r5     // Catch:{ IOException -> 0x0220 }
        L_0x0220:
            java.lang.String r0 = "Failed to load downloads."
            defpackage.i8b.o(r0)
        L_0x0225:
            r0 = r10
        L_0x0226:
            java.util.ArrayList r4 = r1.e
            int r5 = r4.size()
            if (r0 >= r5) goto L_0x023d
            java.lang.Object r5 = r4.get(r0)
            rr4 r5 = (defpackage.rr4) r5
            rr4 r5 = a(r5, r9, r10)
            r4.set(r0, r5)
            int r0 = r0 + r11
            goto L_0x0226
        L_0x023d:
            r0 = r10
        L_0x023e:
            int r5 = r3.size()
            if (r0 >= r5) goto L_0x0253
            java.lang.Object r5 = r3.get(r0)
            rr4 r5 = (defpackage.rr4) r5
            rr4 r5 = a(r5, r9, r10)
            r4.add(r5)
            int r0 = r0 + r11
            goto L_0x023e
        L_0x0253:
            oj4 r0 = new oj4
            r0.<init>(r6)
            java.util.Collections.sort(r4, r0)
            de4 r2 = (defpackage.de4) r2     // Catch:{ IOException -> 0x0261 }
            r2.l()     // Catch:{ IOException -> 0x0261 }
            goto L_0x0267
        L_0x0261:
            r0 = move-exception
            java.lang.String r2 = "Failed to update index."
            defpackage.i8b.p(r2, r0)
        L_0x0267:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r2 = r10
        L_0x026d:
            int r3 = r4.size()
            if (r2 >= r3) goto L_0x0289
            at4 r3 = new at4
            java.lang.Object r5 = r4.get(r2)
            rr4 r5 = (defpackage.rr4) r5
            r3.<init>(r5, r10, r0, r7)
            android.os.Handler r5 = r1.d
            android.os.Message r3 = r5.obtainMessage(r6, r3)
            r3.sendToTarget()
            int r2 = r2 + r11
            goto L_0x026d
        L_0x0289:
            r32.g()
            goto L_0x0465
        L_0x028e:
            java.lang.Object r0 = r0.obj
            java.lang.String r0 = (java.lang.String) r0
            rr4 r2 = r1.b(r0, r11)
            if (r2 != 0) goto L_0x02ab
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to remove nonexistent download: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.i8b.o(r0)
            goto L_0x0465
        L_0x02ab:
            r1.e(r2, r9, r10)
            r32.g()
            goto L_0x0465
        L_0x02b3:
            java.lang.Object r2 = r0.obj
            r13 = r2
            ht4 r13 = (defpackage.ht4) r13
            int r0 = r0.arg1
            java.lang.String r2 = r13.a
            rr4 r2 = r1.b(r2, r11)
            long r19 = java.lang.System.currentTimeMillis()
            if (r2 == 0) goto L_0x0355
            int r3 = r2.b
            if (r3 == r9) goto L_0x02d4
            if (r3 == r6) goto L_0x02d4
            if (r3 != r4) goto L_0x02cf
            goto L_0x02d4
        L_0x02cf:
            long r6 = r2.c
            r17 = r6
            goto L_0x02d6
        L_0x02d4:
            r17 = r19
        L_0x02d6:
            if (r3 == r9) goto L_0x02e3
            if (r3 != r5) goto L_0x02db
            goto L_0x02e3
        L_0x02db:
            if (r0 == 0) goto L_0x02e0
            r16 = r11
            goto L_0x02e5
        L_0x02e0:
            r16 = r10
            goto L_0x02e5
        L_0x02e3:
            r16 = r5
        L_0x02e5:
            rr4 r3 = new rr4
            ht4 r2 = r2.a
            r2.getClass()
            java.lang.String r4 = r13.a
            java.lang.String r5 = r2.a
            boolean r4 = r5.equals(r4)
            defpackage.n79.g(r4)
            java.util.List r4 = r2.o
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0327
            java.util.List r5 = r13.o
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0308
            goto L_0x0327
        L_0x0308:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
        L_0x030d:
            int r4 = r5.size()
            if (r10 >= r4) goto L_0x0324
            java.lang.Object r4 = r5.get(r10)
            fxe r4 = (defpackage.fxe) r4
            boolean r7 = r6.contains(r4)
            if (r7 != 0) goto L_0x0322
            r6.add(r4)
        L_0x0322:
            int r10 = r10 + r11
            goto L_0x030d
        L_0x0324:
            r28 = r6
            goto L_0x032c
        L_0x0327:
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x0324
        L_0x032c:
            ht4 r15 = new ht4
            java.lang.String r4 = r13.w
            byte[] r5 = r13.x
            java.lang.String r2 = r2.a
            android.net.Uri r6 = r13.b
            java.lang.String r7 = r13.c
            byte[] r8 = r13.v
            r24 = r15
            r25 = r2
            r26 = r6
            r27 = r7
            r29 = r8
            r30 = r4
            r31 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r14 = r3
            r21 = r0
            r14.<init>(r15, r16, r17, r19, r21)
            r1.d(r3)
            goto L_0x0369
        L_0x0355:
            rr4 r2 = new rr4
            if (r0 == 0) goto L_0x035b
            r14 = r11
            goto L_0x035c
        L_0x035b:
            r14 = r10
        L_0x035c:
            r12 = r2
            r15 = r19
            r17 = r19
            r19 = r0
            r12.<init>(r13, r14, r15, r17, r19)
            r1.d(r2)
        L_0x0369:
            r32.g()
            goto L_0x0465
        L_0x036e:
            int r0 = r0.arg1
            r1.j = r0
            goto L_0x0465
        L_0x0374:
            int r0 = r0.arg1
            r1.i = r0
            r32.g()
            goto L_0x0465
        L_0x037d:
            java.lang.Object r2 = r0.obj
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r0.arg1
            uqg r3 = r1.b
            if (r2 != 0) goto L_0x03c9
        L_0x0387:
            java.util.ArrayList r2 = r1.e
            int r4 = r2.size()
            if (r10 >= r4) goto L_0x039a
            java.lang.Object r2 = r2.get(r10)
            rr4 r2 = (defpackage.rr4) r2
            r1.f(r2, r0)
            int r10 = r10 + r11
            goto L_0x0387
        L_0x039a:
            de4 r3 = (defpackage.de4) r3     // Catch:{ IOException -> 0x03c2 }
            r3.b()     // Catch:{ IOException -> 0x03c2 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ SQLException -> 0x03bb }
            r2.<init>()     // Catch:{ SQLException -> 0x03bb }
            java.lang.String r4 = "stop_reason"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLException -> 0x03bb }
            r2.put(r4, r0)     // Catch:{ SQLException -> 0x03bb }
            u74 r0 = r3.a     // Catch:{ SQLException -> 0x03bb }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLException -> 0x03bb }
            java.lang.String r3 = "ExoPlayerDownloads"
            java.lang.String r4 = defpackage.de4.d     // Catch:{ SQLException -> 0x03bb }
            r0.update(r3, r2, r4, r7)     // Catch:{ SQLException -> 0x03bb }
            goto L_0x03e3
        L_0x03bb:
            r0 = move-exception
            androidx.media3.database.DatabaseIOException r2 = new androidx.media3.database.DatabaseIOException     // Catch:{ IOException -> 0x03c2 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x03c2 }
            throw r2     // Catch:{ IOException -> 0x03c2 }
        L_0x03c2:
            r0 = move-exception
            java.lang.String r2 = "Failed to set manual stop reason"
            defpackage.i8b.p(r2, r0)
            goto L_0x03e3
        L_0x03c9:
            rr4 r4 = r1.b(r2, r10)
            if (r4 == 0) goto L_0x03d3
            r1.f(r4, r0)
            goto L_0x03e3
        L_0x03d3:
            de4 r3 = (defpackage.de4) r3     // Catch:{ IOException -> 0x03d9 }
            r3.m(r0, r2)     // Catch:{ IOException -> 0x03d9 }
            goto L_0x03e3
        L_0x03d9:
            r0 = move-exception
            java.lang.String r3 = "Failed to set manual stop reason: "
            java.lang.String r2 = r3.concat(r2)
            defpackage.i8b.p(r2, r0)
        L_0x03e3:
            r32.g()
            goto L_0x0465
        L_0x03e8:
            int r0 = r0.arg1
            r1.g = r0
            r32.g()
            goto L_0x0465
        L_0x03f1:
            int r0 = r0.arg1
            if (r0 == 0) goto L_0x03f6
            r10 = r11
        L_0x03f6:
            r1.h = r10
            r32.g()
            goto L_0x0465
        L_0x03fc:
            int r0 = r0.arg1
            uqg r2 = r1.b
            java.util.ArrayList r3 = r1.e
            r1.g = r0
            r0 = r2
            de4 r0 = (defpackage.de4) r0     // Catch:{ IOException -> 0x0448 }
            r0.k()     // Catch:{ IOException -> 0x0448 }
            r4 = 2
            int[] r0 = new int[]{r10, r11, r4, r9, r5}     // Catch:{ IOException -> 0x0448 }
            de4 r2 = (defpackage.de4) r2     // Catch:{ IOException -> 0x0448 }
            r2.b()     // Catch:{ IOException -> 0x0448 }
            java.lang.String r0 = defpackage.de4.g(r0)     // Catch:{ IOException -> 0x0448 }
            android.database.Cursor r0 = r2.c(r0, r7)     // Catch:{ IOException -> 0x0448 }
            af6 r2 = new af6     // Catch:{ IOException -> 0x0448 }
            r2.<init>(r11, r0)     // Catch:{ IOException -> 0x0448 }
        L_0x0421:
            java.lang.Object r0 = r2.b     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            int r4 = r0.getPosition()     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            int r4 = r4 + r11
            boolean r0 = r0.moveToPosition(r4)     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            if (r0 == 0) goto L_0x0442
            java.lang.Object r0 = r2.b     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            rr4 r0 = defpackage.de4.e(r0)     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            r3.add(r0)     // Catch:{ IOException -> 0x043f, all -> 0x043c }
            goto L_0x0421
        L_0x043c:
            r0 = move-exception
            r7 = r2
            goto L_0x0477
        L_0x043f:
            r0 = move-exception
            r7 = r2
            goto L_0x0449
        L_0x0442:
            defpackage.v0g.h(r2)
            goto L_0x0454
        L_0x0446:
            r0 = move-exception
            goto L_0x0477
        L_0x0448:
            r0 = move-exception
        L_0x0449:
            java.lang.String r2 = "Failed to load index."
            defpackage.i8b.p(r2, r0)     // Catch:{ all -> 0x0446 }
            r3.clear()     // Catch:{ all -> 0x0446 }
            defpackage.v0g.h(r7)
        L_0x0454:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            android.os.Handler r2 = r1.d
            android.os.Message r0 = r2.obtainMessage(r11, r0)
            r0.sendToTarget()
            r32.g()
        L_0x0465:
            r10 = r11
        L_0x0466:
            android.os.Handler r0 = r1.d
            java.util.HashMap r1 = r1.f
            int r1 = r1.size()
            r2 = 2
            android.os.Message r0 = r0.obtainMessage(r2, r10, r1)
            r0.sendToTarget()
            return
        L_0x0477:
            defpackage.v0g.h(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt4.handleMessage(android.os.Message):void");
    }
}

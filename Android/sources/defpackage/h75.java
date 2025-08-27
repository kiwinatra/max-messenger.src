package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: h75  reason: default package */
public final class h75 implements Runnable {
    public static final String c = h88.V("EnqueueRunnable");
    public final rog a;
    public final ata b;

    public h75(rog rog, ata ata) {
        this.a = rog;
        this.b = ata;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.rog r25) {
        /*
            r0 = r25
            r25.getClass()
            java.util.HashSet r1 = defpackage.rog.h0(r25)
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r3)
            java.lang.String[] r1 = (java.lang.String[]) r1
            long r3 = java.lang.System.currentTimeMillis()
            dpg r5 = r0.w
            androidx.work.impl.WorkDatabase r6 = r5.c
            if (r1 == 0) goto L_0x0021
            int r8 = r1.length
            if (r8 <= 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = r2
        L_0x0022:
            xog r9 = defpackage.xog.c
            xog r10 = defpackage.xog.w
            xog r11 = defpackage.xog.o
            if (r8 == 0) goto L_0x0072
            int r12 = r1.length
            r13 = r2
            r15 = r13
            r16 = r15
            r14 = 1
        L_0x0030:
            if (r13 >= r12) goto L_0x0076
            r2 = r1[r13]
            ypg r7 = r6.y()
            xpg r7 = r7.m(r2)
            if (r7 != 0) goto L_0x005e
            h88 r1 = defpackage.h88.x()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Prerequisite "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " doesn't exist; not enqueuing"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = c
            r1.t(r3, r2)
        L_0x005a:
            r1 = 1
            r2 = 0
            goto L_0x02b6
        L_0x005e:
            xog r2 = r7.b
            if (r2 != r9) goto L_0x0064
            r7 = 1
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            r14 = r14 & r7
            if (r2 != r11) goto L_0x006b
            r16 = 1
            goto L_0x006e
        L_0x006b:
            if (r2 != r10) goto L_0x006e
            r15 = 1
        L_0x006e:
            int r13 = r13 + 1
            r2 = 0
            goto L_0x0030
        L_0x0072:
            r14 = 1
            r15 = 0
            r16 = 0
        L_0x0076:
            java.lang.String r2 = r0.x
            boolean r7 = android.text.TextUtils.isEmpty(r2)
            r12 = 1
            r7 = r7 ^ r12
            xog r12 = defpackage.xog.a
            if (r7 == 0) goto L_0x01c0
            if (r8 != 0) goto L_0x01c0
            ypg r13 = r6.y()
            java.util.ArrayList r13 = r13.n(r2)
            boolean r17 = r13.isEmpty()
            if (r17 != 0) goto L_0x01c0
            r17 = r8
            fb5 r8 = defpackage.fb5.c
            r18 = r14
            fb5 r14 = defpackage.fb5.o
            r19 = r15
            fb5 r15 = r0.y
            if (r15 == r8) goto L_0x00f3
            if (r15 != r14) goto L_0x00a3
            goto L_0x00f3
        L_0x00a3:
            fb5 r8 = defpackage.fb5.b
            if (r15 != r8) goto L_0x00c0
            java.util.Iterator r8 = r13.iterator()
        L_0x00ab:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c0
            java.lang.Object r9 = r8.next()
            vpg r9 = (defpackage.vpg) r9
            xog r9 = r9.b
            if (r9 == r12) goto L_0x005a
            xog r14 = defpackage.xog.b
            if (r9 != r14) goto L_0x00ab
            goto L_0x005a
        L_0x00c0:
            fw1 r8 = new fw1
            r9 = 0
            r8.<init>(r5, r2, r9)
            r8.run()
            ypg r5 = r6.y()
            java.util.Iterator r8 = r13.iterator()
        L_0x00d1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e3
            java.lang.Object r9 = r8.next()
            vpg r9 = (defpackage.vpg) r9
            java.lang.String r9 = r9.a
            r5.e(r9)
            goto L_0x00d1
        L_0x00e3:
            r23 = r3
            r21 = r7
            r22 = r12
            r8 = r17
            r14 = r18
            r15 = r19
            r3 = 1
            r12 = 0
            goto L_0x01d4
        L_0x00f3:
            dm4 r5 = r6.t()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0100:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L_0x017b
            java.lang.Object r17 = r13.next()
            r20 = r13
            r13 = r17
            vpg r13 = (defpackage.vpg) r13
            r21 = r7
            java.lang.String r7 = r13.a
            r5.getClass()
            r22 = r12
            java.lang.String r12 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r23 = r3
            r3 = 1
            d7d r4 = defpackage.d7d.a(r3, r12)
            if (r7 != 0) goto L_0x0128
            r4.X(r3)
            goto L_0x012b
        L_0x0128:
            r4.h(r3, r7)
        L_0x012b:
            java.lang.Object r3 = r5.b
            i6d r3 = (defpackage.i6d) r3
            r3.b()
            r7 = 0
            android.database.Cursor r3 = r3.o(r4, r7)
            boolean r7 = r3.moveToFirst()     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x0148
            r12 = 0
            int r7 = r3.getInt(r12)     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x0149
            r7 = 1
            goto L_0x014a
        L_0x0146:
            r0 = move-exception
            goto L_0x0174
        L_0x0148:
            r12 = 0
        L_0x0149:
            r7 = r12
        L_0x014a:
            r3.close()
            r4.o()
            if (r7 != 0) goto L_0x016b
            xog r3 = r13.b
            if (r3 != r9) goto L_0x0158
            r4 = 1
            goto L_0x0159
        L_0x0158:
            r4 = r12
        L_0x0159:
            r4 = r18 & r4
            if (r3 != r11) goto L_0x0160
            r16 = 1
            goto L_0x0164
        L_0x0160:
            if (r3 != r10) goto L_0x0164
            r19 = 1
        L_0x0164:
            java.lang.String r3 = r13.a
            r8.add(r3)
            r18 = r4
        L_0x016b:
            r13 = r20
            r7 = r21
            r12 = r22
            r3 = r23
            goto L_0x0100
        L_0x0174:
            r3.close()
            r4.o()
            throw r0
        L_0x017b:
            r23 = r3
            r21 = r7
            r22 = r12
            r12 = 0
            if (r15 != r14) goto L_0x01ae
            if (r19 != 0) goto L_0x0188
            if (r16 == 0) goto L_0x01ae
        L_0x0188:
            ypg r3 = r6.y()
            java.util.ArrayList r4 = r3.n(r2)
            java.util.Iterator r4 = r4.iterator()
        L_0x0194:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a6
            java.lang.Object r5 = r4.next()
            vpg r5 = (defpackage.vpg) r5
            java.lang.String r5 = r5.a
            r3.e(r5)
            goto L_0x0194
        L_0x01a6:
            java.util.List r8 = java.util.Collections.emptyList()
            r15 = r12
            r16 = r15
            goto L_0x01b0
        L_0x01ae:
            r15 = r19
        L_0x01b0:
            java.lang.Object[] r1 = r8.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x01bb
            r8 = 1
            goto L_0x01bc
        L_0x01bb:
            r8 = r12
        L_0x01bc:
            r3 = r12
            r14 = r18
            goto L_0x01d4
        L_0x01c0:
            r23 = r3
            r21 = r7
            r17 = r8
            r22 = r12
            r18 = r14
            r19 = r15
            r12 = 0
            r3 = r12
            r8 = r17
            r14 = r18
            r15 = r19
        L_0x01d4:
            java.util.List r4 = r0.z
            java.util.Iterator r4 = r4.iterator()
        L_0x01da:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b1
            java.lang.Object r5 = r4.next()
            androidx.work.WorkRequest r5 = (androidx.work.WorkRequest) r5
            xpg r7 = r5.getWorkSpec()
            if (r8 == 0) goto L_0x01ff
            if (r14 != 0) goto L_0x01ff
            if (r16 == 0) goto L_0x01f5
            r7.b = r11
        L_0x01f2:
            r12 = r23
            goto L_0x0203
        L_0x01f5:
            if (r15 == 0) goto L_0x01fa
            r7.b = r10
            goto L_0x01f2
        L_0x01fa:
            xog r9 = defpackage.xog.v
            r7.b = r9
            goto L_0x01f2
        L_0x01ff:
            r12 = r23
            r7.n = r12
        L_0x0203:
            xog r9 = r7.b
            r17 = r3
            r3 = r22
            if (r9 != r3) goto L_0x020d
            r17 = 1
        L_0x020d:
            ypg r9 = r6.y()
            r22 = r3
            java.lang.Object r3 = r9.a
            i6d r3 = (defpackage.i6d) r3
            r3.b()
            r3.c()
            java.lang.Object r9 = r9.b     // Catch:{ all -> 0x02ac }
            mpg r9 = (defpackage.mpg) r9     // Catch:{ all -> 0x02ac }
            r9.c0(r7)     // Catch:{ all -> 0x02ac }
            r3.r()     // Catch:{ all -> 0x02ac }
            r3.l()
            if (r8 == 0) goto L_0x0266
            int r3 = r1.length
            r9 = 0
        L_0x022e:
            if (r9 >= r3) goto L_0x0266
            r7 = r1[r9]
            r18 = r1
            am4 r1 = new am4
            r19 = r3
            java.lang.String r3 = r5.getStringId()
            r1.<init>(r3, r7)
            dm4 r3 = r6.t()
            java.lang.Object r7 = r3.b
            i6d r7 = (defpackage.i6d) r7
            r7.b()
            r7.c()
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0261 }
            li r3 = (defpackage.li) r3     // Catch:{ all -> 0x0261 }
            r3.c0(r1)     // Catch:{ all -> 0x0261 }
            r7.r()     // Catch:{ all -> 0x0261 }
            r7.l()
            int r9 = r9 + 1
            r1 = r18
            r3 = r19
            goto L_0x022e
        L_0x0261:
            r0 = move-exception
            r7.l()
            throw r0
        L_0x0266:
            r18 = r1
            aqg r1 = r6.z()
            java.lang.String r3 = r5.getStringId()
            java.util.Set r7 = r5.getTags()
            r1.q(r3, r7)
            if (r21 == 0) goto L_0x02a3
            npg r1 = r6.w()
            lpg r3 = new lpg
            java.lang.String r5 = r5.getStringId()
            r3.<init>(r2, r5)
            java.lang.Object r5 = r1.b
            i6d r5 = (defpackage.i6d) r5
            r5.b()
            r5.c()
            java.lang.Object r1 = r1.c     // Catch:{ all -> 0x029e }
            mpg r1 = (defpackage.mpg) r1     // Catch:{ all -> 0x029e }
            r1.c0(r3)     // Catch:{ all -> 0x029e }
            r5.r()     // Catch:{ all -> 0x029e }
            r5.l()
            goto L_0x02a3
        L_0x029e:
            r0 = move-exception
            r5.l()
            throw r0
        L_0x02a3:
            r23 = r12
            r3 = r17
            r1 = r18
            r12 = 0
            goto L_0x01da
        L_0x02ac:
            r0 = move-exception
            r3.l()
            throw r0
        L_0x02b1:
            r17 = r3
            r2 = r17
            r1 = 1
        L_0x02b6:
            r0.C = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h75.a(rog):boolean");
    }

    public final void run() {
        boolean z;
        WorkDatabase workDatabase;
        ata ata = this.b;
        rog rog = this.a;
        try {
            rog.getClass();
            dpg dpg = rog.w;
            HashSet hashSet = new HashSet();
            hashSet.addAll(rog.A);
            HashSet h0 = rog.h0(rog);
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (h0.contains((String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    hashSet.removeAll(rog.A);
                    z = false;
                    break;
                }
            }
            if (!z) {
                workDatabase = dpg.c;
                workDatabase.c();
                boolean a2 = a(rog);
                workDatabase.r();
                workDatabase.l();
                if (a2) {
                    a7b.a(dpg.a, RescheduleReceiver.class, true);
                    yfd.a(dpg.b, dpg.c, dpg.e);
                }
                ata.z(u4b.U);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + rog + ")");
        } catch (Throwable th) {
            ata.z(new r4b(th));
        }
    }
}

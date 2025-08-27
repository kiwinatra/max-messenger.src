package defpackage;

import java.util.concurrent.Callable;

/* renamed from: z52  reason: default package */
public final /* synthetic */ class z52 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z52(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Object, o10] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            int r3 = r10.a
            switch(r3) {
                case 0: goto L_0x0286;
                case 1: goto L_0x0273;
                case 2: goto L_0x0226;
                case 3: goto L_0x0219;
                case 4: goto L_0x0203;
                case 5: goto L_0x015a;
                case 6: goto L_0x013f;
                case 7: goto L_0x009a;
                case 8: goto L_0x0079;
                case 9: goto L_0x006a;
                case 10: goto L_0x0059;
                case 11: goto L_0x0048;
                case 12: goto L_0x0015;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r0 = r10.b
            org.webrtc.audio.WebRtcAudioRecord r0 = (org.webrtc.audio.WebRtcAudioRecord) r0
            java.lang.Object r10 = r10.c
            android.media.AudioRecord r10 = (android.media.AudioRecord) r10
            java.lang.String r10 = r0.lambda$scheduleLogRecordingConfigurationsTask$0(r10)
            return r10
        L_0x0015:
            java.lang.Object r0 = r10.b
            t4g r0 = (defpackage.t4g) r0
            r0.getClass()
            java.lang.Object r10 = r10.c
            k4g r10 = (defpackage.k4g) r10
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r2 = "t4g"
            java.lang.String r3 = "newConversion: for data = %s"
            defpackage.z68.c(r2, r3, r1)
            lf6 r1 = new lf6
            r2 = 9
            r1.<init>((int) r2)
            ln5 r0 = r0.c
            java.lang.String r2 = "mp4"
            java.io.File r0 = r0.a(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r1.v = r0
            r1.c = r10
            j4g r10 = new j4g
            r10.<init>(r1)
            return r10
        L_0x0048:
            java.lang.Object r0 = r10.b
            zff r0 = (defpackage.zff) r0
            wi6 r0 = r0.a
            java.lang.Object r10 = r10.c
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.Object r10 = r0.get(r10)
            yff r10 = (defpackage.yff) r10
            return r10
        L_0x0059:
            java.lang.Object r0 = r10.b
            eef r0 = (defpackage.eef) r0
            java.lang.Object r10 = r10.c
            java.util.List r10 = (java.util.List) r10
            long r0 = r0.b(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            return r10
        L_0x006a:
            java.lang.Object r0 = r10.b
            zad r0 = (defpackage.zad) r0
            wl r0 = r0.a
            java.lang.Object r10 = r10.c
            am r10 = (defpackage.am) r10
            java.lang.Object r10 = r0.a(r10)
            return r10
        L_0x0079:
            java.lang.Object r0 = r10.c
            uea r0 = (defpackage.uea) r0
            java.lang.Object r10 = r10.b
            lfa r10 = (defpackage.lfa) r10
            i6d r1 = r10.a
            r1.c()
            boolean r10 = defpackage.lfa.a(r10, r0)     // Catch:{ all -> 0x0095 }
            r1.r()     // Catch:{ all -> 0x0095 }
            r1.l()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L_0x0095:
            r10 = move-exception
            r1.l()
            throw r10
        L_0x009a:
            java.lang.Object r0 = r10.b
            fd8 r0 = (defpackage.fd8) r0
            r0.getClass()
            long r3 = java.lang.System.nanoTime()
            gm4 r0 = r0.s
            java.lang.Object r0 = r0.get()
            pld r0 = (defpackage.pld) r0
            java.lang.Object r10 = r10.c
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r10 = r0.a(r10)
            jz9 r0 = new jz9
            r0.<init>((java.lang.Object) r2)
            jz9 r1 = new jz9
            r1.<init>((java.lang.Object) r2)
            jz9 r5 = new jz9
            r5.<init>((java.lang.Object) r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r10.size()
            r2.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x00d1:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0124
            java.lang.Object r6 = r10.next()
            ald r6 = (defpackage.ald) r6
            a32 r7 = r6.o
            if (r7 == 0) goto L_0x00f4
            long r7 = r7.a
            boolean r7 = r0.a(r7)
            if (r7 != 0) goto L_0x00f4
            a32 r7 = r6.o
            long r7 = r7.a
            r0.e(r7)
            r2.add(r6)
            goto L_0x00d1
        L_0x00f4:
            vk3 r7 = r6.v
            if (r7 == 0) goto L_0x010d
            long r8 = r7.r()
            boolean r8 = r1.a(r8)
            if (r8 != 0) goto L_0x010d
            long r7 = r7.r()
            r1.e(r7)
            r2.add(r6)
            goto L_0x00d1
        L_0x010d:
            b89 r7 = r6.w
            if (r7 == 0) goto L_0x0120
            long r7 = r7.a
            boolean r9 = r5.a(r7)
            if (r9 != 0) goto L_0x0120
            r5.e(r7)
            r2.add(r6)
            goto L_0x00d1
        L_0x0120:
            r2.add(r6)
            goto L_0x00d1
        L_0x0124:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r3
            long r0 = r10.toMillis(r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "fd8"
            java.lang.String r1 = "localSearchWorker, local search finish: %d ms"
            defpackage.z68.j(r0, r1, r10)
            return r2
        L_0x013f:
            java.lang.Object r0 = r10.b
            ru.ok.messages.views.fragments.base.FrgBaseProfile r0 = (ru.ok.messages.views.fragments.base.FrgBaseProfile) r0
            android.content.Context r1 = r0.O1()
            sjd r0 = r0.q1
            m95 r0 = r0.l()
            java.lang.Object r10 = r10.c
            android.net.Uri r10 = (android.net.Uri) r10
            boolean r10 = defpackage.o5a.L(r10, r1, r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        L_0x015a:
            java.lang.Object r3 = r10.b
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r10 = r10.c
            android.content.Intent r10 = (android.content.Intent) r10
            eud r4 = defpackage.eud.j()
            java.lang.Object r5 = r4.v
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5
            r5.offer(r10)
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r5 = "com.google.firebase.MESSAGING_EVENT"
            r10.<init>(r5)
            java.lang.String r5 = r3.getPackageName()
            r10.setPackage(r5)
            monitor-enter(r4)
            java.lang.Object r5 = r4.b     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01c5 }
            if (r5 == 0) goto L_0x0185
            monitor-exit(r4)
            r2 = r5
            goto L_0x01d5
        L_0x0185:
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ all -> 0x01c5 }
            android.content.pm.ResolveInfo r1 = r5.resolveService(r10, r1)     // Catch:{ all -> 0x01c5 }
            if (r1 == 0) goto L_0x01d4
            android.content.pm.ServiceInfo r1 = r1.serviceInfo     // Catch:{ all -> 0x01c5 }
            if (r1 != 0) goto L_0x0194
            goto L_0x01d4
        L_0x0194:
            java.lang.String r5 = r3.getPackageName()     // Catch:{ all -> 0x01c5 }
            java.lang.String r6 = r1.packageName     // Catch:{ all -> 0x01c5 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x01c5 }
            if (r5 == 0) goto L_0x01d2
            java.lang.String r5 = r1.name     // Catch:{ all -> 0x01c5 }
            if (r5 != 0) goto L_0x01a5
            goto L_0x01d2
        L_0x01a5:
            java.lang.String r2 = "."
            boolean r2 = r5.startsWith(r2)     // Catch:{ all -> 0x01c5 }
            if (r2 == 0) goto L_0x01c7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c5 }
            r2.<init>()     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = r3.getPackageName()     // Catch:{ all -> 0x01c5 }
            r2.append(r5)     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x01c5 }
            r2.append(r1)     // Catch:{ all -> 0x01c5 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01c5 }
            r4.b = r1     // Catch:{ all -> 0x01c5 }
            goto L_0x01cb
        L_0x01c5:
            r10 = move-exception
            goto L_0x0201
        L_0x01c7:
            java.lang.String r1 = r1.name     // Catch:{ all -> 0x01c5 }
            r4.b = r1     // Catch:{ all -> 0x01c5 }
        L_0x01cb:
            java.lang.Object r1 = r4.b     // Catch:{ all -> 0x01c5 }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x01c5 }
            monitor-exit(r4)
            goto L_0x01d5
        L_0x01d2:
            monitor-exit(r4)
            goto L_0x01d5
        L_0x01d4:
            monitor-exit(r4)
        L_0x01d5:
            if (r2 == 0) goto L_0x01de
            java.lang.String r1 = r3.getPackageName()
            r10.setClassName(r1, r2)
        L_0x01de:
            boolean r1 = r4.q(r3)     // Catch:{ SecurityException -> 0x01fa, IllegalStateException -> 0x01e9 }
            if (r1 == 0) goto L_0x01eb
            android.content.ComponentName r10 = defpackage.seg.c(r3, r10)     // Catch:{ SecurityException -> 0x01fa, IllegalStateException -> 0x01e9 }
            goto L_0x01ef
        L_0x01e9:
            r10 = move-exception
            goto L_0x01f4
        L_0x01eb:
            android.content.ComponentName r10 = r3.startService(r10)     // Catch:{ SecurityException -> 0x01fa, IllegalStateException -> 0x01e9 }
        L_0x01ef:
            if (r10 != 0) goto L_0x01fc
            r0 = 404(0x194, float:5.66E-43)
            goto L_0x01fc
        L_0x01f4:
            r10.toString()
            r0 = 402(0x192, float:5.63E-43)
            goto L_0x01fc
        L_0x01fa:
            r0 = 401(0x191, float:5.62E-43)
        L_0x01fc:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            return r10
        L_0x0201:
            monitor-exit(r4)     // Catch:{ all -> 0x01c5 }
            throw r10
        L_0x0203:
            java.lang.Object r0 = r10.b
            mi5 r0 = (defpackage.mi5) r0
            rl r0 = r0.a
            jna r0 = (defpackage.jna) r0
            java.lang.Object r10 = r10.c
            long[] r10 = (long[]) r10
            r1 = 5
            long r0 = r0.g(r10, r1)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            return r10
        L_0x0219:
            java.lang.Object r0 = r10.b
            org.webrtc.EglBase$Context r0 = (org.webrtc.EglBase.Context) r0
            java.lang.Object r10 = r10.c
            int[] r10 = (int[]) r10
            org.webrtc.EglBase$EglConnection r10 = org.webrtc.EglThread.lambda$create$0(r0, r10)
            return r10
        L_0x0226:
            java.lang.Object r2 = r10.c
            r4 = r2
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r10 = r10.b
            k74 r10 = (defpackage.k74) r10
            g74 r2 = r10.b
            j74 r2 = r2.a()
            android.graphics.BitmapFactory$Options r10 = r10.c
            q74 r9 = new q74     // Catch:{ all -> 0x026e }
            r5 = 0
            r7 = -1
            r3 = r9
            r3.<init>(r4, r5, r7)     // Catch:{ all -> 0x026e }
            r2.G(r9)     // Catch:{ all -> 0x026e }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x026e }
            r4 = r3
            r3 = r1
        L_0x024a:
            if (r1 == r0) goto L_0x0261
            int r1 = r4.length     // Catch:{ all -> 0x026e }
            if (r3 != r1) goto L_0x0257
            int r1 = r4.length     // Catch:{ all -> 0x026e }
            int r1 = r1 * 2
            byte[] r1 = java.util.Arrays.copyOf(r4, r1)     // Catch:{ all -> 0x026e }
            r4 = r1
        L_0x0257:
            int r1 = r4.length     // Catch:{ all -> 0x026e }
            int r1 = r1 - r3
            int r1 = r2.read(r4, r3, r1)     // Catch:{ all -> 0x026e }
            if (r1 == r0) goto L_0x024a
            int r3 = r3 + r1
            goto L_0x024a
        L_0x0261:
            byte[] r0 = java.util.Arrays.copyOf(r4, r3)     // Catch:{ all -> 0x026e }
            int r1 = r0.length     // Catch:{ all -> 0x026e }
            android.graphics.Bitmap r10 = defpackage.b0h.p(r0, r1, r10)     // Catch:{ all -> 0x026e }
            r2.close()
            return r10
        L_0x026e:
            r10 = move-exception
            r2.close()
            throw r10
        L_0x0273:
            java.lang.Object r0 = r10.b
            k74 r0 = (defpackage.k74) r0
            r0.getClass()
            java.lang.Object r10 = r10.c
            byte[] r10 = (byte[]) r10
            int r1 = r10.length
            android.graphics.BitmapFactory$Options r0 = r0.c
            android.graphics.Bitmap r10 = defpackage.b0h.p(r10, r1, r0)
            return r10
        L_0x0286:
            java.lang.Object r0 = r10.b
            r62 r0 = (defpackage.r62) r0
            r0.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "createMultiChat, contacts.size() = "
            r3.<init>(r4)
            java.lang.Object r10 = r10.c
            java.util.List r10 = (java.util.List) r10
            int r4 = r10.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "r62"
            defpackage.z68.c(r4, r3, new java.lang.Object[0])
            l72 r3 = defpackage.l72.b
            a32 r2 = r0.b(r3, r10, r2, r2)
            o10 r3 = new o10
            r3.<init>()
            p10 r4 = defpackage.p10.b
            r3.a = r4
            r4 = 3
            r3.l = r4
            r3.c = r10
            q10 r10 = r3.a()
            kud r3 = new kud
            long r4 = r2.a
            r6 = 1
            r3.<init>(r4, r10, r6)
            lud r10 = new lud
            r10.<init>(r3, r1)
            hs7 r0 = r0.w
            java.lang.Object r0 = r0.get()
            jqg r0 = (defpackage.jqg) r0
            r0.a(r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z52.call():java.lang.Object");
    }
}

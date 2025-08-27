package defpackage;

/* renamed from: msg  reason: default package */
public final class msg implements z9d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ msg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: bug} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.u64 r8, byte[] r9, int r10) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x009b;
                case 2: goto L_0x0086;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r7 = r7.b
            ihd r7 = (defpackage.ihd) r7
            boolean r8 = r7.f
            if (r8 == 0) goto L_0x000f
            goto L_0x0085
        L_0x000f:
            osg r8 = new osg
            r8.<init>(r9)
            wie r9 = r7.c
            int r10 = r8.d
            ue1 r9 = r9.m0(r10)
            if (r9 != 0) goto L_0x001f
            goto L_0x0085
        L_0x001f:
            boolean r10 = r7.f
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0026
            goto L_0x005b
        L_0x0026:
            java.util.concurrent.ConcurrentHashMap r10 = r7.a
            java.lang.Object r10 = r10.get(r9)
            if (r10 != 0) goto L_0x0052
            java.util.Set r10 = r7.h
            if (r10 != 0) goto L_0x0034
            r10 = r0
            goto L_0x003a
        L_0x0034:
            java.util.Set r10 = r7.h
            boolean r10 = r10.contains(r9)
        L_0x003a:
            if (r10 != 0) goto L_0x003d
            goto L_0x005b
        L_0x003d:
            bug r10 = new bug
            voc r1 = r7.b
            rjf r2 = r7.i
            pbb r3 = new pbb
            r4 = 15
            r3.<init>(r4, r7, r9)
            r10.<init>(r1, r2, r3)
            java.util.concurrent.ConcurrentHashMap r1 = r7.a
            r1.put(r9, r10)
        L_0x0052:
            java.util.concurrent.ConcurrentHashMap r10 = r7.a
            java.lang.Object r10 = r10.get(r9)
            r1 = r10
            bug r1 = (defpackage.bug) r1
        L_0x005b:
            if (r1 == 0) goto L_0x0069
            android.os.Handler r10 = r1.e
            l8g r2 = new l8g
            r3 = 16
            r2.<init>(r3, r1, r8)
            r10.post(r2)
        L_0x0069:
            byte r8 = r8.a
            r8 = r8 & 8
            if (r8 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 == 0) goto L_0x0085
            java.util.concurrent.ConcurrentHashMap r8 = r7.a
            java.lang.Object r8 = r8.get(r9)
            bug r8 = (defpackage.bug) r8
            if (r8 == 0) goto L_0x0085
            r8.a()
            java.util.concurrent.ConcurrentHashMap r7 = r7.a
            r7.remove(r9)
        L_0x0085:
            return
        L_0x0086:
            w55 r6 = new w55
            r5 = 6
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>((java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (int) r4, (int) r5)
            java.lang.Object r7 = r7.b
            q9d r7 = (defpackage.q9d) r7
            android.os.Handler r7 = r7.f
            r7.post(r6)
            return
        L_0x009b:
            java.lang.Object r7 = r7.b
            qpg r7 = (defpackage.qpg) r7
            java.lang.Object r8 = r7.c
            wie r8 = (defpackage.wie) r8
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.get()
            r9.get()
            r9.getShort()
            int r10 = r9.getInt()
            r0 = 268435455(0xfffffff, float:2.5243547E-29)
            r10 = r10 & r0
            r9.getInt()
            r9.getInt()
            java.nio.ByteBuffer r9 = r9.slice()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.CharBuffer r9 = r0.decode(r9)
            java.lang.String r9 = r9.toString()
            r8.m0(r10)
            pt r0 = new pt
            ue1 r8 = r8.m0(r10)
            r0.<init>(r8, r9)
            java.lang.Object r7 = r7.o
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x00e0:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00f6
            java.lang.Object r8 = r7.next()
            py0 r8 = (defpackage.py0) r8
            hz0 r8 = r8.a
            jc1 r8 = r8.U1
            mt r8 = r8.o
            r8.onAsrDataPackage(r0)
            goto L_0x00e0
        L_0x00f6:
            return
        L_0x00f7:
            w55 r0 = new w55
            r6 = 5
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (int) r5, (int) r6)
            java.lang.Object r7 = r7.b
            n09 r7 = (defpackage.n09) r7
            java.lang.Object r7 = r7.v
            android.os.Handler r7 = (android.os.Handler) r7
            r7.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msg.a(u64, byte[], int):void");
    }
}

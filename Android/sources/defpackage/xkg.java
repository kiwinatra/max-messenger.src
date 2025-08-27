package defpackage;

/* renamed from: xkg  reason: default package */
public final /* synthetic */ class xkg implements op6 {
    public static final xkg a;
    private static final usd descriptor;

    /* JADX WARNING: type inference failed for: r0v0, types: [op6, xkg, java.lang.Object] */
    static {
        ? obj = new Object();
        a = obj;
        eqb eqb = new eqb("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageSaveKeyRequest", obj, 4);
        eqb.j("queryId", false);
        eqb.j("requestId", false);
        eqb.j("key", false);
        eqb.j("value", false);
        descriptor = eqb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.u9 r12) {
        /*
            r11 = this;
            r11 = 2
            r0 = 1
            usd r1 = descriptor
            u9 r12 = r12.i(r1)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r3 = r0
        L_0x0010:
            if (r3 == 0) goto L_0x004e
            int r4 = r12.o(r1)
            r10 = -1
            if (r4 == r10) goto L_0x004c
            if (r4 == 0) goto L_0x0041
            if (r4 == r0) goto L_0x003b
            if (r4 == r11) goto L_0x0034
            r10 = 3
            if (r4 != r10) goto L_0x002e
            bye r4 = defpackage.bye.a
            java.lang.Object r4 = r12.r(r1, r10, r9)
            r9 = r4
            java.lang.String r9 = (java.lang.String) r9
            r5 = r5 | 8
            goto L_0x0010
        L_0x002e:
            kotlinx.serialization.UnknownFieldException r11 = new kotlinx.serialization.UnknownFieldException
            r11.<init>(r4)
            throw r11
        L_0x0034:
            java.lang.String r8 = r12.v(r1, r11)
            r5 = r5 | 4
            goto L_0x0010
        L_0x003b:
            java.lang.String r7 = r12.v(r1, r0)
            r5 = r5 | r11
            goto L_0x0010
        L_0x0041:
            bye r4 = defpackage.bye.a
            java.lang.Object r4 = r12.r(r1, r2, r6)
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            r5 = r5 | r0
            goto L_0x0010
        L_0x004c:
            r3 = r2
            goto L_0x0010
        L_0x004e:
            r12.y(r1)
            zkg r11 = new zkg
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkg.a(u9):java.lang.Object");
    }

    public final void b(cy3 cy3, Object obj) {
        zkg zkg = (zkg) obj;
        usd usd = descriptor;
        cy3 a2 = cy3.a(usd);
        bye bye = bye.a;
        a2.f(usd, 0, zkg.a);
        a2.k(usd, 1, zkg.b);
        a2.k(usd, 2, zkg.c);
        a2.f(usd, 3, zkg.d);
        a2.l();
    }

    public final aq7[] c() {
        aq7 a2 = bv0.a();
        aq7 a3 = bv0.a();
        bye bye = bye.a;
        return new aq7[]{a2, bye, bye, a3};
    }

    public final usd d() {
        return descriptor;
    }
}

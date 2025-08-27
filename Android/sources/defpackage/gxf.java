package defpackage;

/* renamed from: gxf  reason: default package */
public final /* synthetic */ class gxf implements qk3, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bxf b;

    public /* synthetic */ gxf(bxf bxf, int i) {
        this.a = i;
        this.b = bxf;
    }

    public void accept(Object obj) {
        bxf bxf = this.b;
        switch (this.a) {
            case 0:
                z68.g("jxf", "putUploadInRepository: failed, upload=%s", bxf, (Throwable) obj);
                return;
            default:
                j10 j10 = (j10) obj;
                j10.i = d20.v;
                kxf kxf = bxf.a;
                j10.m = kxf.a;
                j10.u = kxf.b;
                j10.k = bxf.e;
                j10.o = bxf.f;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [uyf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [uyf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [no5, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [uyf, java.lang.Object] */
    public Object apply(Object obj) {
        uyf uyf;
        switch (this.a) {
            case 1:
                ibf ibf = (ibf) obj;
                boolean z = ibf instanceof b9g;
                bxf bxf = this.b;
                if (z) {
                    c9g c9g = (c9g) ((b9g) ibf).c.get(0);
                    axf b2 = bxf.b();
                    b2.d = c9g.a;
                    ? obj2 = new Object();
                    obj2.a = c9g.c;
                    obj2.b = c9g.b;
                    b2.h = obj2.a();
                    return b2.a();
                } else if (ibf instanceof rn5) {
                    sn5 sn5 = (sn5) ((rn5) ibf).c.get(0);
                    axf b3 = bxf.b();
                    b3.d = sn5.c;
                    ? obj3 = new Object();
                    obj3.a = sn5.b;
                    obj3.b = sn5.a;
                    b3.h = obj3.a();
                    return b3.a();
                } else if (ibf instanceof jfb) {
                    axf b4 = bxf.b();
                    b4.d = ((jfb) ibf).c;
                    return b4.a();
                } else if (ibf instanceof wre) {
                    axf b5 = bxf.b();
                    b5.d = ((wre) ibf).c;
                    return b5.a();
                } else {
                    throw new RuntimeException("requestUrlSingle, can't request url for unknown media type= " + bxf.a.c);
                }
            case 3:
                return new tf9(this.b, (boe) obj);
            default:
                dzf dzf = (dzf) obj;
                lxf lxf = new lxf();
                bxf bxf2 = this.b;
                kxf kxf = bxf2.a;
                lxf.b = kxf.d;
                ? obj4 = new Object();
                obj4.c = kxf.a;
                obj4.b = kxf.c;
                obj4.a = kxf.b;
                lxf.a = obj4;
                lxf.c = bxf2.b;
                lxf.d = bxf2.c;
                lxf.e = bxf2.d;
                lxf.f = bxf2.e;
                lxf.g = bxf2.f;
                lxf.h = bxf2.g;
                vyf vyf = bxf2.h;
                if (vyf == null) {
                    uyf = null;
                } else {
                    ? obj5 = new Object();
                    obj5.b = vyf.b;
                    obj5.a = vyf.a;
                    uyf = obj5;
                }
                lxf.i = uyf;
                lxf.j = bxf2.i;
                dzf.getClass();
                return new qa3(2, new ni(29, dzf, lxf));
        }
    }
}

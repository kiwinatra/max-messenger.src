package defpackage;

import android.content.Context;
import kotlin.Lazy;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: kvb  reason: default package */
public final class kvb {
    public final Context a;
    public final Lazy b;
    public final sv0 c;
    public final Lazy d;

    public kvb(Context context, Lazy lazy, sv0 sv0, Lazy lazy2) {
        this.a = context;
        this.b = lazy;
        this.c = sv0;
        this.d = lazy2;
    }

    public final boolean a(sv3 sv3) {
        akd akd = (akd) ((bud) this.d.getValue());
        akd.getClass();
        return sv3.b <= ((long) ((int) akd.r(PmsKey.f46imagesize, (long) 40000000)));
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [w10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [w10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v18, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v5, types: [h10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v27, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v16, types: [r10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v17, types: [j10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v20, types: [e20, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v43, types: [j10, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.u7b b(defpackage.n2 r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = 1
            boolean r4 = r1 instanceof defpackage.l00
            if (r4 == 0) goto L_0x0014
            r0 = r1
            l00 r0 = (defpackage.l00) r0
            l20 r0 = r0.c
            u7b r2 = new u7b
            r2.<init>(r1, r0)
            return r2
        L_0x0014:
            boolean r4 = r1 instanceof defpackage.df5
            r4 = r4 ^ r3
            r5 = 3
            r6 = 0
            r7 = 2
            kotlin.Lazy r8 = r0.d
            java.lang.String r9 = "kvb"
            kotlin.Lazy r11 = r0.b
            if (r4 == 0) goto L_0x025c
            java.lang.String r4 = r20.a()
            boolean r12 = defpackage.cvg.A(r4)
            if (r12 == 0) goto L_0x0033
            java.lang.String r12 = "uri string is empty or null"
            defpackage.z68.f(r9, r12, r6)
            r12 = r6
            goto L_0x003f
        L_0x0033:
            java.lang.Object r12 = r11.getValue()
            ou8 r12 = (defpackage.ou8) r12
            wj0 r12 = (defpackage.wj0) r12
            sv3 r12 = r12.c(r4)
        L_0x003f:
            sv0 r13 = r0.c
            int r14 = r1.a
            if (r12 != 0) goto L_0x0054
            trd r0 = new trd
            java.lang.String r4 = "file.local.get.content.uri"
            r0.<init>(r4)
            r13.c(r0)
            r12 = r6
            r17 = r11
            goto L_0x0182
        L_0x0054:
            r15 = 0
            r17 = r11
            long r10 = r12.b
            int r15 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x0165
            if (r14 != r3) goto L_0x0067
            boolean r10 = r0.a(r12)
        L_0x0064:
            r18 = r4
            goto L_0x00a7
        L_0x0067:
            if (r14 != r5) goto L_0x006b
        L_0x0069:
            r10 = r3
            goto L_0x0064
        L_0x006b:
            if (r21 == 0) goto L_0x0088
            boolean r15 = r12.a()
            if (r15 != 0) goto L_0x0079
            boolean r15 = r12.b()
            if (r15 == 0) goto L_0x0088
        L_0x0079:
            boolean r10 = r12.a()
            if (r10 == 0) goto L_0x0069
            boolean r10 = r0.a(r12)
            if (r10 == 0) goto L_0x0086
            goto L_0x0069
        L_0x0086:
            r10 = 0
            goto L_0x0064
        L_0x0088:
            java.lang.Object r15 = r8.getValue()
            bud r15 = (defpackage.bud) r15
            akd r15 = (defpackage.akd) r15
            r15.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f42fileuploadmaxsize
            r18 = r4
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r15.r(r2, r3)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x00a6
            r10 = 1
            goto L_0x00a7
        L_0x00a6:
            r10 = 0
        L_0x00a7:
            if (r10 != 0) goto L_0x00c7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, file is bigger than max upload size: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            defpackage.z68.f(r9, r0, r6)
            trd r0 = new trd
            java.lang.String r2 = "file.local.max.size.reached"
            r0.<init>(r2)
            r13.c(r0)
        L_0x00c4:
            r12 = r6
            goto L_0x0182
        L_0x00c7:
            java.lang.String r2 = r12.c
            boolean r3 = defpackage.cvg.A(r2)
            if (r3 == 0) goto L_0x00d3
            r3 = 7
            if (r14 == r3) goto L_0x0116
            goto L_0x0118
        L_0x00d3:
            java.lang.Object r3 = r8.getValue()
            bud r3 = (defpackage.bud) r3
            akd r3 = (defpackage.akd) r3
            r3.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f43fileuploadunsupportedtypes
            java.lang.String r10 = "exe"
            java.util.List r10 = kotlin.collections.CollectionsKt.listOf(r10)
            java.util.List r3 = r3.v(r4, r10)
            java.util.Iterator r3 = r3.iterator()
        L_0x00ee:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0118
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r10 = r2.toLowerCase()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r15 = "."
            r11.<init>(r15)
            java.lang.String r4 = r4.toLowerCase()
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            boolean r4 = r10.endsWith(r4)
            if (r4 == 0) goto L_0x00ee
        L_0x0116:
            r2 = 0
            goto L_0x0119
        L_0x0118:
            r2 = 1
        L_0x0119:
            if (r2 != 0) goto L_0x0137
            trd r0 = new trd
            java.lang.String r2 = "file.local.unsupported.media.type"
            r0.<init>(r2)
            r13.c(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, unsupported media type: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            defpackage.z68.f(r9, r0, r6)
            goto L_0x00c4
        L_0x0137:
            android.net.Uri r2 = android.net.Uri.parse(r18)
            android.content.Context r0 = r0.a
            boolean r0 = defpackage.o5a.L(r2, r0, r6)
            if (r0 == 0) goto L_0x0182
            java.lang.String[] r0 = defpackage.ln5.a
            r2 = 0
        L_0x0146:
            r3 = 9
            if (r2 >= r3) goto L_0x015b
            r3 = r0[r2]
            r4 = r18
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0156
            r0 = 1
            goto L_0x015c
        L_0x0156:
            r3 = 1
            int r2 = r2 + r3
            r18 = r4
            goto L_0x0146
        L_0x015b:
            r0 = 0
        L_0x015c:
            if (r0 != 0) goto L_0x0182
            java.lang.String r0 = "try to share private file"
            defpackage.z68.f(r9, r0, r6)
            goto L_0x00c4
        L_0x0165:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "ContentUriParams not valid, file is empty: "
            r0.<init>(r2)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            defpackage.z68.f(r9, r0, r6)
            trd r0 = new trd
            java.lang.String r2 = "file.local.max.zero.size"
            r0.<init>(r2)
            r13.c(r0)
            goto L_0x00c4
        L_0x0182:
            if (r12 != 0) goto L_0x0185
            return r6
        L_0x0185:
            java.lang.String r0 = r12.e
            boolean r2 = defpackage.cvg.A(r0)
            if (r2 != 0) goto L_0x018e
            goto L_0x0192
        L_0x018e:
            java.lang.String r0 = r20.a()
        L_0x0192:
            java.lang.String r2 = r12.c
            r3 = 1
            if (r14 == r3) goto L_0x01ad
            if (r14 == r5) goto L_0x01ad
            r3 = 7
            if (r14 != r3) goto L_0x01ab
            if (r21 == 0) goto L_0x01ab
            boolean r3 = r12.a()
            if (r3 != 0) goto L_0x01ad
            boolean r3 = r12.b()
            if (r3 == 0) goto L_0x01ab
            goto L_0x01ad
        L_0x01ab:
            r3 = 7
            goto L_0x01fc
        L_0x01ad:
            java.lang.Object r3 = r17.getValue()
            ou8 r3 = (defpackage.ou8) r3
            wj0 r3 = (defpackage.wj0) r3
            r3.getClass()
            android.net.Uri r4 = android.net.Uri.parse(r0)
            kn5 r10 = r3.d
            android.content.Context r11 = r3.a
            java.lang.String r4 = defpackage.o5a.u(r11, r4, r10)
            boolean r10 = defpackage.cjf.p(r4)
            if (r10 == 0) goto L_0x01cc
            r0 = r4
            goto L_0x01ef
        L_0x01cc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r10 = "process: failed to get path from uri: "
            r4.<init>(r10)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r10 = "wj0"
            defpackage.z68.f(r10, r4, r6)
            java.lang.String r0 = r3.a(r0, r2)
            boolean r3 = defpackage.cjf.p(r0)
            if (r3 != 0) goto L_0x01ef
            java.lang.String r0 = "process: failed to get path with copy"
            defpackage.z68.f(r10, r0, r6)
            r0 = r6
        L_0x01ef:
            if (r0 != 0) goto L_0x01ab
            trd r3 = new trd
            java.lang.String r4 = "file.local.create.uri.copy"
            r3.<init>(r4)
            r13.c(r3)
            goto L_0x01ab
        L_0x01fc:
            if (r14 != r3) goto L_0x021f
            boolean r1 = r12.a()
            boolean r3 = r12.b()
            if (r21 == 0) goto L_0x0217
            if (r1 != 0) goto L_0x020c
            if (r3 == 0) goto L_0x0217
        L_0x020c:
            if (r1 == 0) goto L_0x0210
            r1 = 1
            goto L_0x0211
        L_0x0210:
            r1 = r5
        L_0x0211:
            cbe r2 = new cbe
            r2.<init>(r1, r0)
            goto L_0x0241
        L_0x0217:
            vm5 r1 = new vm5
            long r3 = r12.b
            r1.<init>(r3, r0, r2)
            goto L_0x0230
        L_0x021f:
            java.lang.String r2 = r20.a()
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0230
            r2 = 1
            if (r14 == r2) goto L_0x0255
            if (r14 == r7) goto L_0x0249
            if (r14 == r5) goto L_0x0232
        L_0x0230:
            r2 = 1
            goto L_0x0260
        L_0x0232:
            boolean r2 = r1 instanceof defpackage.q6g
            if (r2 == 0) goto L_0x0243
            q6g r1 = (defpackage.q6g) r1
            q6g r2 = new q6g
            p4g r3 = r1.c
            java.lang.String r1 = r1.o
            r2.<init>(r0, r3, r1)
        L_0x0241:
            r1 = r2
            goto L_0x0230
        L_0x0243:
            cbe r1 = new cbe
            r1.<init>(r5, r0)
            goto L_0x0230
        L_0x0249:
            k50 r1 = (defpackage.k50) r1
            k50 r2 = new k50
            long r3 = r1.c
            byte[] r1 = r1.o
            r2.<init>(r0, r3, r1)
            goto L_0x0241
        L_0x0255:
            cbe r1 = new cbe
            r2 = 1
            r1.<init>(r2, r0)
            goto L_0x0260
        L_0x025c:
            r2 = r3
            r17 = r11
            r12 = r6
        L_0x0260:
            int r0 = r1.a
            d20 r3 = defpackage.d20.v
            if (r0 == r2) goto L_0x03bf
            if (r0 == r7) goto L_0x0393
            if (r0 == r5) goto L_0x02fd
            r2 = 7
            if (r0 == r2) goto L_0x02d1
            r2 = 10
            if (r0 != r2) goto L_0x02bf
            r0 = r1
            dpe r0 = (defpackage.dpe) r0
            e20 r2 = new e20
            r2.<init>()
            java.lang.String r0 = r0.b
            r2.d = r0
            java.lang.Object r4 = r8.getValue()
            bud r4 = (defpackage.bud) r4
            akd r4 = (defpackage.akd) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f28defaultstickersize
            r6 = 144(0x90, float:2.02E-43)
            long r6 = (long) r6
            long r9 = r4.r(r5, r6)
            int r4 = (int) r9
            r2.b = r4
            java.lang.Object r4 = r8.getValue()
            bud r4 = (defpackage.bud) r4
            akd r4 = (defpackage.akd) r4
            r4.getClass()
            long r4 = r4.r(r5, r6)
            int r4 = (int) r4
            r2.c = r4
            f20 r2 = r2.a()
            j10 r4 = new j10
            r4.<init>()
            r4.f = r2
            g20 r2 = defpackage.g20.w
            r4.a = r2
            r4.i = r3
            r4.m = r0
            l20 r0 = r4.a()
            goto L_0x0491
        L_0x02bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r3 = "Unknown media type %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r2, r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x02d1:
            r0 = r1
            vm5 r0 = (defpackage.vm5) r0
            r10 r2 = new r10
            r2.<init>()
            long r4 = r0.c
            r2.b = r4
            java.lang.String r4 = r0.o
            r2.c = r4
            s10 r4 = new s10
            r4.<init>(r2)
            j10 r2 = new j10
            r2.<init>()
            java.lang.String r0 = r0.b
            r2.m = r0
            r2.r = r4
            g20 r0 = defpackage.g20.X
            r2.a = r0
            r2.i = r3
            l20 r0 = r2.a()
            goto L_0x0491
        L_0x02fd:
            java.lang.String r0 = r1.a()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "getVideoAttach: retrieve params started"
            defpackage.z68.c(r9, r2, new java.lang.Object[0])
            java.lang.Object r2 = r17.getValue()
            ou8 r2 = (defpackage.ou8) r2
            wj0 r2 = (defpackage.wj0) r2
            i7g r2 = r2.d(r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "getVideoAttach: retrieve params finished "
            r7.<init>(r8)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r4
            r7.append(r10)
            java.lang.String r4 = r7.toString()
            defpackage.z68.c(r9, r4, new java.lang.Object[0])
            boolean r4 = r1 instanceof defpackage.q6g
            long r7 = r2.d
            java.lang.String r5 = r2.a
            if (r4 == 0) goto L_0x0366
            r4 = r1
            q6g r4 = (defpackage.q6g) r4
            p4g r9 = r4.c
            if (r9 == 0) goto L_0x0366
            int r6 = defpackage.j20.e
            i20 r6 = new i20
            r10 = 0
            r6.<init>(r10)
            float r10 = r9.b
            r6.b = r10
            float r10 = r9.c
            r6.c = r10
            qac r10 = r9.a
            r6.a = r10
            boolean r9 = r9.d
            r6.d = r9
            j20 r9 = new j20
            r9.<init>(r6)
            float r6 = (float) r7
            float r7 = r9.b
            float r8 = r9.a
            float r7 = r7 - r8
            float r7 = r7 * r6
            long r7 = (long) r7
            java.lang.String r4 = r4.o
            if (r4 == 0) goto L_0x0365
            r5 = r4
        L_0x0365:
            r6 = r9
        L_0x0366:
            h20 r4 = new h20
            r4.<init>()
            r4.e = r7
            int r7 = r2.b
            r4.b = r7
            int r2 = r2.c
            r4.c = r2
            r4.d = r5
            r4.o = r6
            k20 r2 = new k20
            r2.<init>(r4)
            j10 r4 = new j10
            r4.<init>()
            r4.d = r2
            g20 r2 = defpackage.g20.o
            r4.a = r2
            r4.i = r3
            r4.m = r0
            l20 r0 = r4.a()
            goto L_0x0491
        L_0x0393:
            r0 = r1
            k50 r0 = (defpackage.k50) r0
            h10 r2 = new h10
            r2.<init>()
            long r4 = r0.c
            r2.c = r4
            byte[] r4 = r0.o
            r2.d = r4
            i10 r4 = new i10
            r4.<init>(r2)
            j10 r2 = new j10
            r2.<init>()
            r2.e = r4
            g20 r4 = defpackage.g20.v
            r2.a = r4
            r2.i = r3
            java.lang.String r0 = r0.b
            r2.m = r0
            l20 r0 = r2.a()
            goto L_0x0491
        L_0x03bf:
            r10 = 0
            boolean r0 = r1 instanceof defpackage.df5
            r2 = 1
            r0 = r0 ^ r2
            g20 r2 = defpackage.g20.c
            if (r0 == 0) goto L_0x0458
            java.lang.Object r0 = r17.getValue()
            ou8 r0 = (defpackage.ou8) r0
            java.lang.String r4 = r1.a()
            wj0 r0 = (defpackage.wj0) r0
            r0.getClass()
            r0 = 1
            android.graphics.Point r4 = defpackage.o5a.m(r4, r0)
            int r0 = r4.x
            int r4 = r4.y
            java.lang.Object r5 = r17.getValue()
            ou8 r5 = (defpackage.ou8) r5
            wj0 r5 = (defpackage.wj0) r5
            r5.getClass()
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>(r0, r4)
            bud r0 = r5.c
            akd r0 = (defpackage.akd) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f47imagewidth
            r5 = 1920(0x780, float:2.69E-42)
            long r7 = (long) r5
            long r4 = r0.r(r4, r7)
            int r4 = (int) r4
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.f44imageheight
            long r7 = r0.r(r5, r7)
            int r0 = (int) r7
            int r0 = defpackage.o5a.q(r6, r4, r0)
            android.graphics.Point r4 = new android.graphics.Point
            int r5 = r6.x
            int r5 = r5 / r0
            int r6 = r6.y
            int r6 = r6 / r0
            r4.<init>(r5, r6)
            int r0 = r4.x
            int r4 = r4.y
            java.lang.String r5 = r12.d
            boolean r5 = defpackage.cvg.A(r5)
            if (r5 != 0) goto L_0x0432
            java.lang.String r5 = r12.d
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = "gif"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x0432
            r10 = 1
        L_0x0432:
            w10 r5 = new w10
            r5.<init>()
            r5.c = r0
            r5.d = r4
            r5.e = r10
            x10 r0 = new x10
            r0.<init>(r5)
            j10 r4 = new j10
            r4.<init>()
            r4.b = r0
            r4.a = r2
            r4.i = r3
            java.lang.String r0 = r1.a()
            r4.m = r0
            l20 r0 = r4.a()
            goto L_0x0491
        L_0x0458:
            r0 = r1
            df5 r0 = (defpackage.df5) r0
            w10 r3 = new w10
            r3.<init>()
            int r4 = r0.c
            r3.c = r4
            int r4 = r0.o
            r3.d = r4
            r4 = 1
            r3.e = r4
            java.lang.String r4 = r0.b
            r3.i = r4
            java.lang.String r4 = r0.w
            r3.j = r4
            java.lang.String r4 = r0.x
            r3.b = r4
            x10 r4 = new x10
            r4.<init>(r3)
            j10 r3 = new j10
            r3.<init>()
            r3.b = r4
            r3.a = r2
            d20 r2 = defpackage.d20.c
            r3.i = r2
            java.lang.String r0 = r0.v
            r3.m = r0
            l20 r0 = r3.a()
        L_0x0491:
            u7b r2 = new u7b
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kvb.b(n2, boolean):u7b");
    }
}

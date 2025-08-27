package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* renamed from: gga  reason: default package */
public final class gga implements hq2, zi6, fc3, qk3, nsb, Provider, sd8, mla {
    public static final gga X = new gga(4);
    public static final gga Y = new gga(6);
    public static final gga b = new gga(1);
    public static final ws0 c;
    public static final ws0 o;
    public static final a93 v;
    public static final nnf w = new nnf(new mnf(-14803164, -1, 352321535, -16745729, 1728053247, 184549375, -1728021761), new qnf(-855638017, 1895825407, -15921907, -16745729, -1548240711, -1548240711, -1559425779, 2063597567), new onf(-855638017, 1895825407, -8815492, -11579312, -15921907, -16745729, 352321535, -1548240711, -1548240711, -1548240711, -1548240711, -1559425779, 2063597567, -1728021761, 184549375), new pnf(536870911, 268435455));
    public static final zqg x = new zqg(new yqg(-14803164, -14803164, -15198184, 401074151), new crg(-1, -2130706433, -2130706433, -1108875289, 1474815975, -1579033, -16745729), new arg(-16745729, -855638017, 1895825407, -8815492, 1895825407), new brg(-16745729, 15198183, 266856423));
    public static final gga y = new gga(2);
    public static final gga z = new gga(3);
    public final /* synthetic */ int a;

    static {
        vs0 vs0 = new vs0(-16745729, 704643071, -16745729, 704643071);
        c = new ws0(new qs0(new ps0(-1303424355, -1722854755, 1716474525), new rs0(new ss0(6907365, 694773221), new ts0(6907365, 1030317541), new us0(6909352, 1382641064)), vs0, -14471622, -3158065, -2133864497, 536870911, 536870911, 704643071, 536870911, 704643071, new int[]{-12894370, -13157810, -13487043}), new zs0(new at0(-1, -520093697, -1, -520093697), -12542721, -520093697, -520093697, -2046820353, -2130706433, -1, -520093697, -2130706433, -2130706433, -1107296257), new xs0(-520093697, -520093697, -13487042, -1191182337, -2130706433, -1543503873, -1543503873, -36771, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ys0(1728053247, -14078413, 352321535));
        vs0 vs02 = new vs0(-1, 704643071, -16745729, 704643071);
        o = new ws0(new qs0(new ps0(-1722117017, -1722117017, 1717212263), new rs0(new ss0(16777215, 704643071), new ts0(6907365, 1030317541), new us0(6909352, 1382641064)), vs02, -9869851, -520093697, -2130706433, 704643071, 536870911, 704643071, 704643071, 1040187391, new int[]{-7845452, -9217331, -10655003}), new zs0(new at0(-10655003, -520093697, -1, -520093697), -520093697, -1191182337, -520093697, -2130706433, -1543503873, -1, -520093697, -2130706433, -2130706433, -520093697), new xs0(-520093697, -520093697, -9869851, -520093697, -2130706433, -520093697, -520093697, -36771, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ys0(-2046820353, -9217331, 452984831));
        r63 r63 = new r63(new p63(452984831, new int[]{16777215, 285212671, 553648127}), new q63(452984831, new int[]{16777215, 285212671, 553648127}), new t63(new s63(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new v63(new u63(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}));
        v = new a93(new n63(new m63(0, -15461356, -15461356, 1297112007), new o63(-2405632, 721429580, 1305464783, 1946157055, 721429580, 1305464783, -4703924, 721429580, 1305464783, -15166245, 721429580, 1305464783, 721429580, 1305464783, -13290047, 721429580, 1305464783, 721429580, 1305464783, 721429580, 1305464783, -10669092, 721429580, 1305464783), r63, -15461356, 1932407608, -868400310, 352321535, -12762294, -12500154, new int[]{-1304740002, -1305332675}, new int[]{-12894370, -13487043}, new int[]{-650625467, -1304936891, -1942471099}, new int[]{-15856111, -15856111}), new o93(-855638017, -855638017), new b93(-16745729), new n93(1882734149, -855638017, 536870911), new l63(-16745729, -5058310, -1579033, -48049, -16745729, -1, 1895825407), new h93(855638016, 637534208, 687865856, 687865856), new k93(new j93(new i93(-16751924)), new l93(1207959551, -1728021761), new m93(1207959551, -1728021761)));
    }

    public /* synthetic */ gga(int i) {
        this.a = i;
    }

    private final void k(Object obj) {
    }

    public static xtd m() {
        return xtd.b;
    }

    public static p01 n(z35 z35, j28 j28) {
        int i;
        IOException iOException = j28.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).c) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (z35.a(1)) {
            return new p01(1, 2, 300000);
        }
        if (z35.a(2)) {
            return new p01(2, 2, 60000);
        }
        return null;
    }

    public static long p(j28 j28) {
        Throwable th = j28.a;
        if (!(th instanceof ParserException) && !(th instanceof FileNotFoundException) && !(th instanceof HttpDataSource$CleartextNotPermittedException) && !(th instanceof Loader$UnexpectedLoaderException)) {
            int i = DataSourceException.b;
            while (th != null) {
                if (!(th instanceof DataSourceException) || ((DataSourceException) th).a != 2008) {
                    th = th.getCause();
                }
            }
            return (long) Math.min((j28.b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: l04} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void q(android.content.Context r15, defpackage.frg r16, java.io.File r17, java.lang.String r18, java.lang.Long r19, java.util.Map r20, int r21) {
        /*
            r0 = r21 & 16
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0009
        L_0x0007:
            r0 = r18
        L_0x0009:
            r2 = r21 & 64
            if (r2 == 0) goto L_0x0012
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x0014
        L_0x0012:
            r2 = r20
        L_0x0014:
            android.content.pm.PackageManager r3 = r15.getPackageManager()
            java.lang.String r4 = r15.getPackageName()
            android.content.pm.PackageInfo r3 = defpackage.ld8.M(r3, r4)
            long r3 = r3.getLongVersionCode()
            xv1 r5 = new xv1
            r6 = 15
            r5.<init>((int) r6)
            java.lang.String r6 = "tracer_feature_name"
            r7 = r16
            java.lang.String r7 = r7.b
            r5.A(r6, r7)
            java.lang.String r6 = "tracer_feature_uze_gzip"
            r7 = 1
            r5.y(r6, r7)
            java.lang.String r6 = "tracer_sample_file_path"
            java.lang.String r8 = r17.getPath()
            r5.A(r6, r8)
            java.lang.String r6 = "tracer_feature_tag"
            r5.A(r6, r0)
            java.lang.String r0 = "tracer_has_attr1"
            r5.y(r0, r7)
            java.lang.Object r0 = r5.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r6 = "tracer_attr1"
            r7 = r19
            r0.put(r6, r7)
            java.util.Set r0 = r2.keySet()
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r0 = r0.toArray(r6)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r6 = r5.b
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.String r7 = "tracer_custom_properties_keys"
            r6.put(r7, r0)
            r5.x(r2)
            java.lang.String r0 = "tracer_version_code"
            r5.z(r3, r0)
            t64 r0 = r5.m()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            kof r3 = defpackage.kof.a
            java.util.Map r3 = defpackage.kof.c()
            frg r4 = defpackage.iq.c
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof defpackage.l04
            if (r4 == 0) goto L_0x0092
            r1 = r3
            l04 r1 = (defpackage.l04) r1
        L_0x0092:
            if (r1 != 0) goto L_0x009e
            xe8 r1 = new xe8
            r3 = 9
            r1.<init>((int) r3)
            r1.f()
        L_0x009e:
            java.util.Set r14 = kotlin.collections.CollectionsKt.toSet(r2)
            wj3 r1 = new wj3
            r10 = -1
            r12 = -1
            r5 = 3
            r6 = 0
            r7 = 1
            r8 = 1
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r14)
            v3b r2 = new v3b
            java.lang.Class<ru.ok.tracer.upload.SampleUploadWorker> r3 = ru.ok.tracer.upload.SampleUploadWorker.class
            r2.<init>(r3)
            androidx.work.WorkRequest$Builder r1 = r2.setConstraints(r1)
            v3b r1 = (defpackage.v3b) r1
            androidx.work.WorkRequest$Builder r0 = r1.setInputData(r0)
            v3b r0 = (defpackage.v3b) r0
            androidx.work.WorkRequest r0 = r0.build()
            w3b r0 = (defpackage.w3b) r0
            dpg r1 = defpackage.dpg.d(r15)
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gga.q(android.content.Context, frg, java.io.File, java.lang.String, java.lang.Long, java.util.Map, int):void");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                hga.d.getClass();
                z68.b(hga.f, "getAnalyticsEntries: failed", (Throwable) obj);
                return;
            default:
                return;
        }
    }

    public Object apply(Object obj) {
        p4g a2;
        cu4 cu4 = (cu4) obj;
        tt4 tt4 = cu4.a;
        st4 st4 = new st4(tt4.a, tt4.b);
        i20 i20 = cu4.e;
        if (i20 == null) {
            a2 = null;
        } else {
            i20 i202 = new i20(1);
            i202.a = i20.a;
            i202.c = i20.c;
            i202.b = i20.b;
            i202.d = i20.d;
            a2 = i202.a();
        }
        p4g p4g = a2;
        return new au4(st4, cu4.b, cu4.c, cu4.d, p4g);
    }

    public snd b() {
        return new me0(-9223372036854775807L);
    }

    public void c(long j) {
    }

    public Map d(Map map) {
        return map == null ? new LinkedHashMap() : map;
    }

    public ws0 e() {
        return c;
    }

    public zqg f() {
        return x;
    }

    public Object g(soc soc) {
        return new y95((Executor) soc.g(new pac(cvf.class, Executor.class)));
    }

    public Object get() {
        switch (this.a) {
            case 11:
                return Integer.valueOf(agd.o);
            default:
                return new lzf(0);
        }
    }

    public long h(hf4 hf4) {
        return -1;
    }

    public ws0 i() {
        return o;
    }

    public nnf j() {
        return w;
    }

    public a93 l() {
        return v;
    }

    public int o(int i) {
        return i == 7 ? 6 : 3;
    }

    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "EmptyConsumer";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ gga(boolean z2) {
        this.a = 10;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: di3  reason: default package */
public final class di3 {
    public static final di3 e;
    public static final di3 f = new di3(false, false, (String[]) null, (String[]) null);
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        x03 x03 = x03.q;
        x03 x032 = x03.r;
        x03 x033 = x03.s;
        x03 x034 = x03.k;
        x03 x035 = x03.m;
        x03 x036 = x03.l;
        x03 x037 = x03.n;
        x03 x038 = x03.p;
        x03 x039 = x03.o;
        x03 x0310 = x03;
        x03 x0311 = x032;
        x03 x0312 = x033;
        x03 x0313 = x034;
        x03 x0314 = x035;
        x03 x0315 = x036;
        x03 x0316 = x037;
        x03 x0317 = x038;
        x03[] x03Arr = {x0310, x0311, x0312, x0313, x0314, x0315, x0316, x0317, x039, x03.i, x03.j, x03.g, x03.h, x03.e, x03.f, x03.d};
        ci3 ci3 = new ci3(0);
        ci3.b((x03[]) Arrays.copyOf(new x03[]{x0310, x0311, x0312, x0313, x0314, x0315, x0316, x0317, x039}, 9));
        ylf ylf = ylf.TLS_1_3;
        ylf ylf2 = ylf.TLS_1_2;
        ci3.e(ylf, ylf2);
        ci3.d();
        ci3.a();
        ci3 ci32 = new ci3(0);
        ci32.b((x03[]) Arrays.copyOf(x03Arr, 16));
        ci32.e(ylf, ylf2);
        ci32.d();
        e = ci32.a();
        ci3 ci33 = new ci3(0);
        ci33.b((x03[]) Arrays.copyOf(x03Arr, 16));
        ci33.e(ylf, ylf2, ylf.TLS_1_1, ylf.TLS_1_0);
        ci33.d();
        ci33.a();
    }

    public di3(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String j : strArr) {
            arrayList.add(x03.t.j(j));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !u0g.i(strArr, sSLSocket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || u0g.i(strArr2, sSLSocket.getEnabledCipherSuites(), x03.b);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String J : strArr) {
            arrayList.add(tf6.J(J));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof di3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        di3 di3 = (di3) obj;
        boolean z = di3.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, di3.c) && Arrays.equals(this.d, di3.d) && this.b == di3.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        int i = 0;
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(a(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return wzf.l(sb, this.b, ')');
    }
}

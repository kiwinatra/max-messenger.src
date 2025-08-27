package defpackage;

import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: oj4  reason: default package */
public final /* synthetic */ class oj4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ oj4(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        w93 w93 = y93.a;
        int i = 1;
        switch (this.a) {
            case 0:
                return qj4.c((qj4) obj, (qj4) obj2);
            case 1:
                pj4 pj4 = (pj4) obj;
                pj4 pj42 = (pj4) obj2;
                f5b b = (!pj4.v || !pj4.y) ? rj4.f.b() : rj4.f;
                int i2 = pj4.z;
                return w93.c(Integer.valueOf(i2), Integer.valueOf(pj42.z), pj4.w.E0 ? rj4.f.b() : rj4.g).c(Integer.valueOf(pj4.X), Integer.valueOf(pj42.X), b).c(Integer.valueOf(i2), Integer.valueOf(pj42.z), b).f();
            case 2:
                qj4 qj4 = (qj4) obj;
                qj4 qj42 = (qj4) obj2;
                f5b b2 = (!qj4.v || !qj4.y) ? sj4.j.b() : sj4.j;
                boolean z = qj4.w.y;
                int i3 = qj4.X;
                y93 y93 = w93;
                if (z) {
                    y93 = w93.c(Integer.valueOf(i3), Integer.valueOf(qj42.X), sj4.j.b());
                }
                return y93.c(Integer.valueOf(qj4.Y), Integer.valueOf(qj42.Y), b2).c(Integer.valueOf(i3), Integer.valueOf(qj42.X), b2).f();
            case 3:
                long j = ((rr4) obj).c;
                long j2 = ((rr4) obj2).c;
                int i4 = v0g.a;
                int i5 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i5 < 0) {
                    return -1;
                }
                return i5 == 0 ? 0 : 1;
            case 4:
                return kne.l(((kx0) obj).c, ((kx0) obj2).c);
            case 5:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b3 = bArr[i6];
                    byte b4 = bArr2[i6];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case 6:
                int i7 = (((wvd) obj).a > ((wvd) obj2).a ? 1 : (((wvd) obj).a == ((wvd) obj2).a ? 0 : -1));
                if (i7 > 0) {
                    return -1;
                }
                return i7 == 0 ? 0 : 1;
            case 7:
                return Intrinsics.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 8:
                xx0 xx0 = (xx0) obj;
                xx0 xx02 = (xx0) obj2;
                long j3 = xx0.w;
                long j4 = xx02.w;
                if (j3 - j4 == 0) {
                    return xx0.compareTo(xx02);
                }
                if (j3 < j4) {
                    i = -1;
                }
                return i;
            case 9:
                yx0 yx0 = (yx0) obj;
                yx0 yx02 = (yx0) obj2;
                long j5 = yx0.w;
                long j6 = yx02.w;
                if (j5 - j6 == 0) {
                    return yx0.compareTo(yx02);
                }
                if (j5 < j6) {
                    i = -1;
                }
                return i;
            case 10:
                int i8 = (((t58) obj).b > ((t58) obj2).b ? 1 : (((t58) obj).b == ((t58) obj2).b ? 0 : -1));
                if (i8 < 0) {
                    return 1;
                }
                return i8 == 0 ? 0 : -1;
            case 11:
                int i9 = (((v10) obj).b > ((v10) obj2).b ? 1 : (((v10) obj).b == ((v10) obj2).b ? 0 : -1));
                if (i9 < 0) {
                    return 1;
                }
                return i9 == 0 ? 0 : -1;
            case 12:
                ald ald = (ald) obj;
                ald ald2 = (ald) obj2;
                if (ald2 == null) {
                    ald.getClass();
                } else {
                    a32 a32 = ald.o;
                    a32 a322 = ald2.o;
                    if (a32 != null && a322 != null) {
                        return Long.compare(a322.n(), a32.n());
                    }
                    if (a32 != null && a322 == null) {
                        return -1;
                    }
                }
                return 0;
            case 13:
                return kne.l(((a89) obj).h(), ((a89) obj2).h());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                wd9 wd9 = (wd9) obj;
                wd9 wd92 = (wd9) obj2;
                int compare = Intrinsics.compare(wd92.b, wd9.b);
                if (compare != 0) {
                    return compare;
                }
                return wd9.a.b.a.toString().compareTo(wd92.a.b.a.toString());
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 16:
                return Intrinsics.compare(((Long) obj2).longValue(), ((Long) obj).longValue());
            case LangUtils.HASH_SEED /*17*/:
                gz6 gz6 = (gz6) obj;
                gz6 gz62 = (gz6) obj2;
                int compareValues = ComparisonsKt.compareValues(Long.valueOf(gz62.h()), Long.valueOf(gz6.h()));
                return compareValues != 0 ? compareValues : ComparisonsKt.compareValues(Long.valueOf(gz6.getId()), Long.valueOf(gz62.getId()));
            case 18:
                return ((la0) obj).a.compareTo(((la0) obj2).a);
            case 19:
                return Intrinsics.compare(((rac) obj).a.ordinal(), ((rac) obj2).a.ordinal());
            case 20:
                nqc nqc = (nqc) obj;
                nqc nqc2 = (nqc) obj2;
                if (nqc == null || nqc2 == null) {
                    return 0;
                }
                return nqc2.getCount() - nqc.getCount();
            case 21:
                return kne.l(((a32) obj2).b.Z, ((a32) obj).b.Z);
            case 22:
                n72 n72 = (n72) obj;
                n72 n722 = (n72) obj2;
                long j7 = n72.c.a().e;
                long j8 = n722.c.a().e;
                if (j7 == 0) {
                    j7 = Long.MAX_VALUE;
                }
                if (j8 == 0) {
                    j8 = Long.MAX_VALUE;
                }
                int compare2 = Intrinsics.compare(j8, j7);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Intrinsics.compare(n722.c.k, n72.c.k);
                if (compare3 != 0) {
                    return compare3;
                }
                int compare4 = Intrinsics.compare(n722.b, n72.b);
                return compare4 != 0 ? compare4 : Intrinsics.compare(n722.hashCode(), n72.hashCode());
            case 23:
                return ((bee) obj).a - ((bee) obj2).a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return ((cee) obj).a - ((cee) obj2).a;
            case 25:
                return Float.compare(((bee) obj).c, ((bee) obj2).c);
            case 26:
                return Float.compare(((cee) obj).c, ((cee) obj2).c);
            case 27:
                fee fee = (fee) obj;
                fee fee2 = (fee) obj2;
                return w93.b(fee.a, fee2.a).b(fee.b, fee2.b).a(fee.c, fee2.c).f();
            case 28:
                hge hge = (hge) obj;
                hge hge2 = (hge) obj2;
                int compare5 = Integer.compare(hge2.b, hge.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compareTo = hge.c.compareTo(hge2.c);
                return compareTo != 0 ? compareTo : hge.d.compareTo(hge2.d);
            default:
                hge hge3 = (hge) obj;
                hge hge4 = (hge) obj2;
                int compare6 = Integer.compare(hge4.a, hge3.a);
                if (compare6 != 0) {
                    return compare6;
                }
                int compareTo2 = hge4.c.compareTo(hge3.c);
                return compareTo2 != 0 ? compareTo2 : hge4.d.compareTo(hge3.d);
        }
    }
}

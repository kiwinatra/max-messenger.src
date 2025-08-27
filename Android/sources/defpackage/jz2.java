package defpackage;

import android.util.SparseLongArray;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jz2  reason: default package */
public final class jz2 implements p64, q64, uye, w5g, uf5, vf5, wf5, xf5, cn8 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ jz2(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public boolean A() {
        switch (this.a) {
            case 2:
                return true;
            default:
                return true;
        }
    }

    public ypf B(int i, int i2) {
        return ((wf5) this.c).B(i, i2);
    }

    public long C() {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    public long D(long j) {
        switch (this.a) {
            case 2:
                return (long) ((o03) this.c).a;
            default:
                return (long) ((p03) this.c).a;
        }
    }

    public long E(long j, long j2) {
        switch (this.a) {
            case 2:
                return (long) ((o03) this.c).a;
            default:
                return (long) ((p03) this.c).a;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void F(long j) {
        cce cce = (cce) this.c;
        if (cce.Z) {
            a(new Exception("onOutputFrameAvailableForRendering() received after onEnded()"));
            return;
        }
        if (j == 0) {
            cce.w0 = true;
        }
        this.b = j;
        ((cce) this.c).w.execute(new z60(this, j, 9));
    }

    public void I() {
    }

    public void K(rnd rnd) {
        ((wf5) this.c).K(new yle(this, rnd));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.media3.common.VideoFrameProcessingException, java.lang.Exception] */
    public void L() {
        cce cce = (cce) this.c;
        if (cce.Z) {
            a(new Exception("onEnded() received multiple times"));
            return;
        }
        cce.Z = true;
        cce.w.execute(new mgd(11, this));
    }

    public void M(snd snd) {
        ((xf5) this.c).M(new zle(this, snd, snd));
    }

    public void P(int i) {
        if (i >= 64) {
            jz2 jz2 = (jz2) this.c;
            if (jz2 != null) {
                jz2.P(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    public int Q(int i) {
        jz2 jz2 = (jz2) this.c;
        if (jz2 == null) {
            if (i >= 64) {
                return Long.bitCount(this.b);
            }
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else {
            return Long.bitCount(this.b) + jz2.Q(i - 64);
        }
    }

    public void R() {
        if (((jz2) this.c) == null) {
            this.c = new jz2(0);
        }
    }

    public boolean S(int i) {
        if (i >= 64) {
            R();
            return ((jz2) this.c).S(i - 64);
        }
        return ((1 << i) & this.b) != 0;
    }

    public int T(long j) {
        long U = U();
        long j2 = 0;
        int i = (U > 0 ? 1 : (U == 0 ? 0 : -1));
        int i2 = 0;
        og ogVar = (og) this.c;
        if (i == 0) {
            long j3 = 0;
            while (true) {
                j3 += (long) ogVar.j(i2);
                int i3 = i2 + 1;
                if (0 < j3) {
                    return i2;
                }
                i2 = i3;
            }
        } else if (ogVar.t() != 0 && j / U >= ((long) ogVar.t())) {
            return -1;
        } else {
            long j4 = j % U;
            while (true) {
                j2 += (long) ogVar.j(i2);
                int i4 = i2 + 1;
                if (j4 < j2) {
                    return i2;
                }
                i2 = i4;
            }
        }
    }

    public long U() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0;
        og ogVar = (og) this.c;
        int e = ogVar.e();
        for (int i = 0; i < e; i++) {
            this.b += (long) ogVar.j(i);
        }
        return this.b;
    }

    public long V(long j) {
        long U = U();
        long j2 = 0;
        if (U == 0) {
            return -1;
        }
        og ogVar = (og) this.c;
        if (!(ogVar.t() == 0) && j / U >= ((long) ogVar.t())) {
            return -1;
        }
        long j3 = j % U;
        int e = ogVar.e();
        for (int i = 0; i < e && j2 <= j3; i++) {
            j2 += (long) ogVar.j(i);
        }
        return (j2 - j3) + j;
    }

    public void W(int i, boolean z) {
        if (i >= 64) {
            R();
            ((jz2) this.c).W(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            b0(i);
        } else {
            P(i);
        }
        if (z2 || ((jz2) this.c) != null) {
            R();
            ((jz2) this.c).W(0, z2);
        }
    }

    public void X(String str) {
        long nanoTime = System.nanoTime() - this.b;
        long seconds = TimeUnit.NANOSECONDS.toSeconds(nanoTime);
        float nanos = ((float) (nanoTime - TimeUnit.SECONDS.toNanos(seconds))) / ((float) TimeUnit.MILLISECONDS.toNanos(1));
        ((voc) this.c).log("OKRTCCall", g63.i(str, " completed in ", seconds == 0 ? String.format(Locale.ROOT, "%.1f ms", new Object[]{Float.valueOf(nanos)}) : String.format(Locale.ROOT, "%d seconds and %.1f ms", new Object[]{Long.valueOf(seconds), Float.valueOf(nanos)})));
    }

    public lx6 Y() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String H = ((xu0) this.c).H(this.b);
            this.b -= (long) H.length();
            if (H.length() == 0) {
                break;
            }
            int k = StringsKt__StringsKt.indexOf$default((CharSequence) H, ':', 1, false, 4, (Object) null);
            if (k != -1) {
                String substring = H.substring(0, k);
                String substring2 = H.substring(k + 1);
                arrayList.add(substring);
                arrayList.add(StringsKt.trim((CharSequence) substring2).toString());
            } else if (H.charAt(0) == ':') {
                String substring3 = H.substring(1);
                arrayList.add("");
                arrayList.add(StringsKt.trim((CharSequence) substring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(StringsKt.trim((CharSequence) H).toString());
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new lx6((String[]) array);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public boolean Z(int i) {
        if (i >= 64) {
            R();
            return ((jz2) this.c).Z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        jz2 jz2 = (jz2) this.c;
        if (jz2 != null) {
            if (jz2.S(0)) {
                b0(63);
            }
            ((jz2) this.c).Z(0);
        }
        return z;
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ((cce) this.c).w.execute(new s6e(2, this, videoFrameProcessingException));
    }

    public void a0() {
        this.b = 0;
        jz2 jz2 = (jz2) this.c;
        if (jz2 != null) {
            jz2.a0();
        }
    }

    public long b(long j) {
        switch (this.a) {
            case 2:
                return ((o03) this.c).e[(int) j] - this.b;
            default:
                return ((p03) this.c).v[(int) j] - this.b;
        }
    }

    public void b0(int i) {
        if (i >= 64) {
            R();
            ((jz2) this.c).b0(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    public gob c() {
        return gob.d;
    }

    public void c0(int i, long j) {
        SparseLongArray sparseLongArray = (SparseLongArray) this.c;
        long j2 = sparseLongArray.get(i, -9223372036854775807L);
        int i2 = (j2 > -9223372036854775807L ? 1 : (j2 == -9223372036854775807L ? 0 : -1));
        if (i2 == 0 || j > j2) {
            sparseLongArray.put(i, j);
            if (i2 == 0 || j2 == this.b) {
                int i3 = v0g.a;
                if (sparseLongArray.size() != 0) {
                    long j3 = LongCompanionObject.MAX_VALUE;
                    for (int i4 = 0; i4 < sparseLongArray.size(); i4++) {
                        j3 = Math.min(j3, sparseLongArray.valueAt(i4));
                    }
                    this.b = j3;
                    return;
                }
                throw new NoSuchElementException();
            }
        }
    }

    public int d(long j) {
        return this.b > j ? 0 : -1;
    }

    public long e() {
        return this.b;
    }

    public void f(gob gob) {
    }

    public void g(int i, int i2) {
        ((cce) this.c).w.execute(new wt0(this, i, i2, 4));
    }

    public long h() {
        switch (this.a) {
            case 11:
                return ((uf5) this.c).h() - this.b;
            default:
                return ((vf5) this.c).h() - this.b;
        }
    }

    public long i(long j, long j2) {
        switch (this.a) {
            case 2:
                return ((o03) this.c).d[(int) j];
            default:
                return ((p03) this.c).o[(int) j];
        }
    }

    public boolean j(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((uf5) this.c).j(bArr, i, i2, z);
            default:
                return ((vf5) this.c).j(bArr, i, i2, z);
        }
    }

    public long k(int i) {
        y64.g(i == 0);
        return this.b;
    }

    public long l(long j, long j2) {
        switch (this.a) {
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    public void m(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 11:
                ((uf5) this.c).m(i, bArr, i2);
                return;
            default:
                ((vf5) this.c).m(i, bArr, i2);
                return;
        }
    }

    public long n(long j, long j2) {
        switch (this.a) {
            case 2:
                return -9223372036854775807L;
            default:
                return -9223372036854775807L;
        }
    }

    public cpc o(long j) {
        o03 o03 = (o03) this.c;
        int i = (int) j;
        return new cpc(o03.c[i], (String) null, (long) o03.b[i]);
    }

    public List p(long j) {
        if (j >= this.b) {
            return (tb7) this.c;
        }
        lx5 lx5 = tb7.b;
        return k0d.v;
    }

    public boolean q(byte[] bArr, int i, int i2, boolean z) {
        switch (this.a) {
            case 11:
                return ((uf5) this.c).q(bArr, i, i2, z);
            default:
                return ((vf5) this.c).q(bArr, i, i2, z);
        }
    }

    public long r() {
        switch (this.a) {
            case 11:
                return ((uf5) this.c).r() - this.b;
            default:
                return ((vf5) this.c).r() - this.b;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                return ((uf5) this.c).read(bArr, i, i2);
            default:
                return ((vf5) this.c).read(bArr, i, i2);
        }
    }

    public void readFully(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 11:
                ((uf5) this.c).readFully(bArr, i, i2);
                return;
            default:
                ((vf5) this.c).readFully(bArr, i, i2);
                return;
        }
    }

    public void s(int i) {
        switch (this.a) {
            case 11:
                ((uf5) this.c).s(i);
                return;
            default:
                ((vf5) this.c).s(i);
                return;
        }
    }

    public int t() {
        return 1;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((jz2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((jz2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public long u(long j, long j2) {
        switch (this.a) {
            case 2:
                return (long) t0g.f(((o03) this.c).e, j + this.b, true);
            default:
                return (long) v0g.f(((p03) this.c).v, j + this.b, true);
        }
    }

    public void v() {
        switch (this.a) {
            case 13:
                ((wf5) this.c).v();
                return;
            default:
                ((xf5) this.c).v();
                return;
        }
    }

    public long w() {
        switch (this.a) {
            case 11:
                return ((uf5) this.c).w() - this.b;
            default:
                return ((vf5) this.c).w() - this.b;
        }
    }

    public void y() {
        switch (this.a) {
            case 11:
                ((uf5) this.c).y();
                return;
            default:
                ((vf5) this.c).y();
                return;
        }
    }

    public void z(int i) {
        switch (this.a) {
            case 11:
                ((uf5) this.c).z(i);
                return;
            default:
                ((vf5) this.c).z(i);
                return;
        }
    }

    public /* synthetic */ jz2(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    /* renamed from: B  reason: collision with other method in class */
    public zpf m16B(int i, int i2) {
        return ((xf5) this.c).B(i, i2);
    }

    /* renamed from: o  reason: collision with other method in class */
    public dpc m17o(long j) {
        p03 p03 = (p03) this.c;
        int i = (int) j;
        return new dpc(p03.c[i], (String) null, (long) p03.b[i]);
    }

    public /* synthetic */ jz2(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public jz2(ifb ifb, y3a y3a) {
        this.a = 9;
        this.c = new AtomicInteger(0);
        int intValue = ((Number) ifb.invoke()).intValue() + 1;
        ((qjd) y3a.b).j(intValue, "request_id");
        this.b = ((long) intValue) << 32;
    }

    public jz2(eg egVar) {
        this.a = 4;
        this.c = egVar;
        this.b = -1;
    }

    public jz2(xu0 xu0) {
        this.a = 7;
        this.c = xu0;
        this.b = (long) 262144;
    }

    public jz2(gf4 gf4, long j) {
        this.a = 11;
        this.c = gf4;
        y64.g(gf4.o >= j);
        this.b = j;
    }

    public jz2(hf4 hf4, long j) {
        this.a = 12;
        this.c = hf4;
        n79.g(hf4.o >= j);
        this.b = j;
    }

    public jz2(int i) {
        this.a = i;
        switch (i) {
            case 6:
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.c = new SparseLongArray();
                return;
            default:
                this.b = 0;
                return;
        }
    }
}

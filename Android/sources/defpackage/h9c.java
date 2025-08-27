package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: h9c  reason: default package */
public final class h9c extends ad9 {
    public static volatile h9c[] o;
    public long a = 0;
    public String b = "";
    public String c = "";
    public int d = 0;
    public long e = 0;
    public String f = "";
    public long g = 0;
    public String h = "";
    public int i = 0;
    public int[] j = ct.d;
    public String k = "";
    public g9c l = null;
    public e9c m = null;
    public Protos.Attaches.Attach n = null;

    public h9c() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int[] iArr;
        long j2 = this.a;
        int i2 = 0;
        int h2 = j2 != 0 ? j43.h(1, j2) : 0;
        if (!this.b.equals("")) {
            h2 += j43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += j43.l(3, this.c);
        }
        int i3 = this.d;
        if (i3 != 0) {
            h2 += j43.f(4, i3);
        }
        long j3 = this.e;
        if (j3 != 0) {
            h2 += j43.h(5, j3);
        }
        if (!this.f.equals("")) {
            h2 += j43.l(6, this.f);
        }
        long j4 = this.g;
        if (j4 != 0) {
            h2 += j43.h(7, j4);
        }
        if (!this.h.equals("")) {
            h2 += j43.l(8, this.h);
        }
        int i4 = this.i;
        if (i4 != 0) {
            h2 += j43.f(9, i4);
        }
        int[] iArr2 = this.j;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            while (true) {
                iArr = this.j;
                if (i2 >= iArr.length) {
                    break;
                }
                i5 += j43.g(iArr[i2]);
                i2++;
            }
            h2 = h2 + i5 + iArr.length;
        }
        if (!this.k.equals("")) {
            h2 += j43.l(12, this.k);
        }
        g9c g9c = this.l;
        if (g9c != null) {
            h2 += j43.i(13, g9c);
        }
        e9c e9c = this.m;
        if (e9c != null) {
            h2 += j43.i(14, e9c);
        }
        Protos.Attaches.Attach attach = this.n;
        return attach != null ? h2 + j43.i(15, attach) : h2;
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [g9c, ad9] */
    /* JADX WARNING: type inference failed for: r0v22, types: [ad9, e9c] */
    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            switch (s) {
                case 0:
                    break;
                case 8:
                    this.a = i43.q();
                    continue;
                case 18:
                    this.b = i43.r();
                    continue;
                case 26:
                    this.c = i43.r();
                    continue;
                case 32:
                    this.d = i43.p();
                    continue;
                case SavedMessagesIconDrawable.SMALL_SIZE /*40*/:
                    this.e = i43.q();
                    continue;
                case 50:
                    this.f = i43.r();
                    continue;
                case 56:
                    this.g = i43.q();
                    continue;
                case 66:
                    this.h = i43.r();
                    continue;
                case 72:
                    this.i = i43.p();
                    continue;
                case 88:
                    int q = ct.q(i43, 88);
                    int[] iArr = this.j;
                    int length = iArr == null ? 0 : iArr.length;
                    int i2 = q + length;
                    int[] iArr2 = new int[i2];
                    if (length != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        iArr2[length] = i43.p();
                        i43.s();
                        length++;
                    }
                    iArr2[length] = i43.p();
                    this.j = iArr2;
                    continue;
                case 90:
                    int e2 = i43.e(i43.p());
                    int c2 = i43.c();
                    int i3 = 0;
                    while (i43.b() > 0) {
                        i43.p();
                        i3++;
                    }
                    i43.t(c2);
                    int[] iArr3 = this.j;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i4 = i3 + length2;
                    int[] iArr4 = new int[i4];
                    if (length2 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    }
                    while (length2 < i4) {
                        iArr4[length2] = i43.p();
                        length2++;
                    }
                    this.j = iArr4;
                    i43.d(e2);
                    continue;
                case 98:
                    this.k = i43.r();
                    continue;
                case 106:
                    if (this.l == null) {
                        ? ad9 = new ad9();
                        ad9.a = c44.DEFAULT_ASPECT_RATIO;
                        ad9.b = c44.DEFAULT_ASPECT_RATIO;
                        ad9.c = 0;
                        ad9.d = false;
                        ad9.cachedSize = -1;
                        this.l = ad9;
                    }
                    i43.j(this.l);
                    continue;
                case 114:
                    if (this.m == null) {
                        ? ad92 = new ad9();
                        ad92.a = "";
                        ad92.b = "";
                        ad92.c = "";
                        ad92.d = null;
                        ad92.e = "";
                        ad92.f = null;
                        ad92.cachedSize = -1;
                        this.m = ad92;
                    }
                    i43.j(this.m);
                    continue;
                case 122:
                    if (this.n == null) {
                        this.n = new Protos.Attaches.Attach();
                    }
                    i43.j(this.n);
                    continue;
                default:
                    if (!i43.u(s)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        long j2 = this.a;
        if (j2 != 0) {
            j43.x(1, j2);
        }
        if (!this.b.equals("")) {
            j43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            j43.E(3, this.c);
        }
        int i2 = this.d;
        if (i2 != 0) {
            j43.w(4, i2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            j43.x(5, j3);
        }
        if (!this.f.equals("")) {
            j43.E(6, this.f);
        }
        long j4 = this.g;
        if (j4 != 0) {
            j43.x(7, j4);
        }
        if (!this.h.equals("")) {
            j43.E(8, this.h);
        }
        int i3 = this.i;
        if (i3 != 0) {
            j43.w(9, i3);
        }
        int[] iArr = this.j;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.j;
                if (i4 >= iArr2.length) {
                    break;
                }
                j43.w(11, iArr2[i4]);
                i4++;
            }
        }
        if (!this.k.equals("")) {
            j43.E(12, this.k);
        }
        g9c g9c = this.l;
        if (g9c != null) {
            j43.y(13, g9c);
        }
        e9c e9c = this.m;
        if (e9c != null) {
            j43.y(14, e9c);
        }
        Protos.Attaches.Attach attach = this.n;
        if (attach != null) {
            j43.y(15, attach);
        }
    }
}

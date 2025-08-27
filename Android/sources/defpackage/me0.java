package defpackage;

/* renamed from: me0  reason: default package */
public class me0 implements snd {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ me0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final qnd e(long j) {
        switch (this.a) {
            case 0:
                ne0 ne0 = (ne0) this.c;
                qnd b2 = ne0.z[0].b(j);
                int i = 1;
                while (true) {
                    q03[] q03Arr = ne0.z;
                    if (i >= q03Arr.length) {
                        return b2;
                    }
                    qnd b3 = q03Arr[i].b(j);
                    if (b3.a.b < b2.a.b) {
                        b2 = b3;
                    }
                    i++;
                }
            case 1:
                uq5 uq5 = (uq5) this.c;
                n79.o((fj) uq5.l);
                fj fjVar = (fj) uq5.l;
                long[] jArr = (long[]) fjVar.b;
                int f = v0g.f(jArr, v0g.k((((long) uq5.f) * j) / 1000000, 0, uq5.k - 1), false);
                long j2 = 0;
                long j3 = f == -1 ? 0 : jArr[f];
                long[] jArr2 = (long[]) fjVar.c;
                if (f != -1) {
                    j2 = jArr2[f];
                }
                int i2 = uq5.f;
                long j4 = (j3 * 1000000) / ((long) i2);
                long j5 = this.b;
                wnd wnd = new wnd(j4, j2 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new qnd(wnd, wnd);
                }
                int i3 = f + 1;
                return new qnd(wnd, new wnd((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (qnd) this.c;
        }
    }

    public final long f() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((uq5) this.c).c();
            default:
                return this.b;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public me0(long j) {
        this(j, 0);
        this.a = 2;
    }

    public me0(long j, long j2) {
        this.a = 2;
        this.b = j;
        wnd wnd = j2 == 0 ? wnd.c : new wnd(0, j2);
        this.c = new qnd(wnd, wnd);
    }
}

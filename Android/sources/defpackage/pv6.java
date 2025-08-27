package defpackage;

/* renamed from: pv6  reason: default package */
public final class pv6 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;
    public final Object i;

    public /* synthetic */ pv6(int i2, Object obj) {
        this.a = i2;
        this.i = obj;
    }

    public final void a(int i2, byte[] bArr, int i3) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    int i4 = this.f;
                    int i5 = (i2 + 1) - i4;
                    if (i5 < i3) {
                        this.d = ((bArr[i5] & 192) >> 6) == 0;
                        this.c = false;
                        return;
                    }
                    this.f = (i3 - i2) + i4;
                    return;
                }
                return;
            default:
                if (this.c) {
                    int i6 = this.f;
                    int i7 = (i2 + 1) - i6;
                    if (i7 < i3) {
                        this.d = ((bArr[i7] & 192) >> 6) == 0;
                        this.c = false;
                        return;
                    }
                    this.f = (i3 - i2) + i6;
                    return;
                }
                return;
        }
    }

    public void b(int i2, long j, boolean z) {
        n79.n(this.h != -9223372036854775807L);
        if (this.e == 182 && z && this.b) {
            boolean z2 = this.d;
            ((zpf) this.i).a(this.h, z2 ? 1 : 0, (int) (j - this.g), i2, (xpf) null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}

package defpackage;

import kotlin.collections.ArraysKt;
import kotlin.io.ConstantsKt;

/* renamed from: hod  reason: default package */
public final class hod {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public hod f;
    public hod g;

    public hod() {
        this.a = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        this.e = true;
        this.d = false;
    }

    public final hod a() {
        hod hod = this.f;
        hod hod2 = hod != this ? hod : null;
        hod hod3 = this.g;
        hod3.f = hod;
        this.f.g = hod3;
        this.f = null;
        this.g = null;
        return hod2;
    }

    public final void b(hod hod) {
        hod.g = this;
        hod.f = this.f;
        this.f.g = hod;
        this.f = hod;
    }

    public final hod c() {
        this.d = true;
        return new hod(this.a, this.b, this.c, true, false);
    }

    public final void d(hod hod, int i) {
        if (hod.e) {
            int i2 = hod.c;
            int i3 = i2 + i;
            byte[] bArr = hod.a;
            if (i3 > 8192) {
                if (!hod.d) {
                    int i4 = hod.b;
                    if (i3 - i4 <= 8192) {
                        ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i4, i2, 2, (Object) null);
                        hod.c -= hod.b;
                        hod.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = hod.c;
            int i6 = this.b;
            ArraysKt.copyInto(this.a, bArr, i5, i6, i6 + i);
            hod.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public hod(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}

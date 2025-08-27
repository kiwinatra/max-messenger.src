package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: e37  reason: default package */
public final class e37 {
    public final ArrayList a = new ArrayList();
    public final gtc b;
    public zw6[] c;
    public int d;
    public int e;
    public int f;
    public int g = ConstantsKt.DEFAULT_BLOCK_SIZE;

    public e37(c47 c47) {
        this.b = new gtc(c47);
        this.c = new zw6[8];
        this.d = 7;
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.c.length;
            while (true) {
                length--;
                i2 = this.d;
                if (length < i2 || i <= 0) {
                    zw6[] zw6Arr = this.c;
                    System.arraycopy(zw6Arr, i2 + 1, zw6Arr, i2 + 1 + i3, this.e);
                    this.d += i3;
                } else {
                    int i4 = this.c[length].a;
                    i -= i4;
                    this.f -= i4;
                    this.e--;
                    i3++;
                }
            }
            zw6[] zw6Arr2 = this.c;
            System.arraycopy(zw6Arr2, i2 + 1, zw6Arr2, i2 + 1 + i3, this.e);
            this.d += i3;
        }
        return i3;
    }

    public final vw0 b(int i) {
        if (i >= 0) {
            zw6[] zw6Arr = g37.a;
            if (i <= zw6Arr.length - 1) {
                return zw6Arr[i].b;
            }
        }
        int length = this.d + 1 + (i - g37.a.length);
        if (length >= 0) {
            zw6[] zw6Arr2 = this.c;
            if (length < zw6Arr2.length) {
                return zw6Arr2[length].b;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(zw6 zw6) {
        this.a.add(zw6);
        int i = this.g;
        int i2 = zw6.a;
        if (i2 > i) {
            ArraysKt___ArraysJvmKt.fill$default((Object[]) this.c, (Object) null, 0, 0, 6, (Object) null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            return;
        }
        a((this.f + i2) - i);
        int i3 = this.e + 1;
        zw6[] zw6Arr = this.c;
        if (i3 > zw6Arr.length) {
            zw6[] zw6Arr2 = new zw6[(zw6Arr.length * 2)];
            System.arraycopy(zw6Arr, 0, zw6Arr2, zw6Arr.length, zw6Arr.length);
            this.d = this.c.length - 1;
            this.c = zw6Arr2;
        }
        int i4 = this.d;
        this.d = i4 - 1;
        this.c[i4] = zw6;
        this.e++;
        this.f += i2;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, rt0] */
    public final vw0 d() {
        int i;
        gtc gtc = this.b;
        byte readByte = gtc.readByte();
        byte[] bArr = u0g.a;
        byte b2 = readByte & UByte.MAX_VALUE;
        int i2 = 0;
        boolean z = (readByte & ByteCompanionObject.MIN_VALUE) == 128;
        long e2 = (long) e(b2, 127);
        if (!z) {
            return gtc.f(e2);
        }
        ? obj = new Object();
        ila ila = t57.c;
        ila ila2 = ila;
        int i3 = 0;
        for (long j = 0; j < e2; j++) {
            int readByte2 = gtc.readByte();
            byte[] bArr2 = u0g.a;
            i2 = (i2 << 8) | (readByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = i3 - 8;
                ila2 = ((ila[]) ila2.o)[(i2 >>> i4) & KotlinVersion.MAX_COMPONENT_VALUE];
                if (((ila[]) ila2.o) == null) {
                    obj.u0(ila2.b);
                    i3 -= ila2.c;
                    ila2 = ila;
                } else {
                    i3 = i4;
                }
            }
        }
        while (i3 > 0) {
            ila ila3 = ((ila[]) ila2.o)[(i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE];
            if (((ila[]) ila3.o) != null || (i = ila3.c) > i3) {
                break;
            }
            obj.u0(ila3.b);
            i3 -= i;
            ila2 = ila;
        }
        return obj.f(obj.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.b.readByte();
            byte[] bArr = u0g.a;
            byte b2 = readByte & UByte.MAX_VALUE;
            if ((readByte & ByteCompanionObject.MIN_VALUE) == 0) {
                return i2 + (b2 << i4);
            }
            i2 += (readByte & ByteCompanionObject.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}

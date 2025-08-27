package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: a0e  reason: default package */
public final class a0e {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & Uuid.SIZE_BITS) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final void b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
    }
}

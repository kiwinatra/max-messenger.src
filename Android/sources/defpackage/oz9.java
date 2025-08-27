package defpackage;

import java.util.Arrays;

/* renamed from: oz9  reason: default package */
public final class oz9 extends gha {
    public oz9() {
        this.a = new Object[16];
    }

    public final void b(int i, cxf cxf) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            StringBuilder o = wj6.o(i, "Index ", " must be in 0..");
            o.append(this.b);
            throw new IndexOutOfBoundsException(o.toString());
        }
        int i3 = i2 + 1;
        Object[] objArr = this.a;
        if (objArr.length < i3) {
            this.a = Arrays.copyOf(objArr, Math.max(i3, (objArr.length * 3) / 2));
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        if (i != i4) {
            ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, i + 1, i, i4);
        }
        objArr2[i] = cxf;
        this.b++;
    }

    public final void c(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            StringBuilder o = wj6.o(i, "Index ", " must be in 0..");
            o.append(this.b - 1);
            throw new IndexOutOfBoundsException(o.toString());
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
    }
}

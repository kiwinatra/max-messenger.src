package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: lj7  reason: default package */
public final class lj7 extends AbstractList implements RandomAccess, Serializable {
    public final int[] a;
    public final int b;
    public final int c;

    public lj7(int[] iArr, int i, int i2) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (cvg.y(((Integer) obj).intValue(), this.b, this.c, this.a) != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lj7)) {
            return super.equals(obj);
        }
        lj7 lj7 = (lj7) obj;
        int size = size();
        if (lj7.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != lj7.a[lj7.b + i]) {
                return false;
            }
        }
        return true;
    }

    public final Object get(int i) {
        b0h.g(i, size());
        return Integer.valueOf(this.a[this.b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = ((java.lang.Integer) r3).intValue();
        r0 = r2.a;
        r1 = r2.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int indexOf(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0018
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int[] r0 = r2.a
            int r1 = r2.b
            int r2 = r2.c
            int r2 = defpackage.cvg.y(r3, r1, r2, r0)
            if (r2 < 0) goto L_0x0018
            int r2 = r2 - r1
            return r2
        L_0x0018:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj7.indexOf(java.lang.Object):int");
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.c;
            while (true) {
                i2--;
                i = this.b;
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (this.a[i2] == intValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        b0h.g(i, size());
        int i2 = this.b + i;
        int[] iArr = this.a;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    public final int size() {
        return this.c - this.b;
    }

    public final List subList(int i, int i2) {
        b0h.j(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int i3 = this.b;
        return new lj7(this.a, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.a;
        int i = this.b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i < this.c) {
                sb.append(", ");
                sb.append(iArr[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}

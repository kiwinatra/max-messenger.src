package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: r0h  reason: default package */
public final class r0h extends bzg implements RandomAccess, u0h, g2h {
    public static final r0h o = new r0h(new int[0], 0, false);
    public int[] b;
    public int c;

    public r0h(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(g63.h("Index:", i, this.c, ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i3, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = intValue;
        this.c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        b();
        Charset charset = y0h.a;
        collection.getClass();
        if (!(collection instanceof r0h)) {
            return super.addAll(collection);
        }
        r0h r0h = (r0h) collection;
        int i = r0h.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (IntCompanionObject.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.b;
            if (i3 > iArr.length) {
                this.b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(r0h.b, 0, this.b, this.c, r0h.c);
            this.c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final x0h c(int i) {
        if (i >= this.c) {
            return new r0h(Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i) {
        b();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0h)) {
            return super.equals(obj);
        }
        r0h r0h = (r0h) obj;
        if (this.c != r0h.c) {
            return false;
        }
        int[] iArr = r0h.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(g63.h("Index:", i, this.c, ", Size:"));
        }
    }

    public final /* synthetic */ Object get(int i) {
        f(i);
        return Integer.valueOf(this.b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        f(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        int i3 = this.c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final void removeRange(int i, int i2) {
        b();
        if (i2 >= i) {
            int[] iArr = this.b;
            System.arraycopy(iArr, i2, iArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        f(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}

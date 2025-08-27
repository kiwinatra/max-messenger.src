package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: i2h  reason: default package */
public final class i2h extends bzg implements RandomAccess {
    public static final i2h o = new i2h(new Object[0], 0, false);
    public Object[] b;
    public int c;

    public i2h(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(g63.h("Index:", i, this.c, ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ x0h c(int i) {
        if (i >= this.c) {
            return new i2h(Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(g63.h("Index:", i, this.c, ", Size:"));
        }
    }

    public final Object get(int i) {
        e(i);
        return this.b[i];
    }

    public final Object remove(int i) {
        b();
        e(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        int i2 = this.c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        b();
        e(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.c;
    }

    public final boolean add(Object obj) {
        b();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}

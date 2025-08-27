package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: dc7  reason: default package */
public abstract class dc7 extends kb7 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient tb7 b;

    public static int n(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static dc7 o(int i, Object... objArr) {
        if (i == 0) {
            return q0d.X;
        }
        if (i != 1) {
            int n = n(i);
            Object[] objArr2 = new Object[n];
            int i2 = n - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int c0 = iq.c0(hashCode);
                    while (true) {
                        int i6 = c0 & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            c0++;
                        }
                    }
                    i3++;
                } else {
                    throw new NullPointerException(wj6.h(i3, "at index "));
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new mde(obj3);
            } else if (n(i5) < n / 2) {
                return o(i5, objArr);
            } else {
                int length = objArr.length;
                if (i5 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i5);
                }
                return new q0d(objArr, objArr2, i4, i2, i5);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new mde(obj4);
        }
    }

    public static dc7 p(Collection collection) {
        if ((collection instanceof dc7) && !(collection instanceof SortedSet)) {
            dc7 dc7 = (dc7) collection;
            if (!dc7.l()) {
                return dc7;
            }
        }
        Object[] array = collection.toArray();
        return o(array.length, array);
    }

    public tb7 b() {
        tb7 tb7 = this.b;
        if (tb7 != null) {
            return tb7;
        }
        tb7 q = q();
        this.b = q;
        return q;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc7) || !r() || !((dc7) obj).r() || hashCode() == obj.hashCode()) {
            return ryg.l(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return ryg.B(this);
    }

    public tb7 q() {
        Object[] array = toArray(kb7.a);
        lx5 lx5 = tb7.b;
        return tb7.n(array.length, array);
    }

    public boolean r() {
        return this instanceof q0d;
    }
}

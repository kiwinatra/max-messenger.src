package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qae  reason: default package */
public class qae {
    public int[] a;
    public Object[] b;
    public int c;

    public qae() {
        this(0);
    }

    public final int a(Object obj) {
        int i = this.c * 2;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, i);
            this.b = Arrays.copyOf(this.b, i * 2);
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0) {
            return -1;
        }
        int h = ld9.h(this.a, i2, i);
        if (h < 0 || Intrinsics.areEqual(obj, this.b[h << 1])) {
            return h;
        }
        int i3 = h + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (Intrinsics.areEqual(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = h - 1;
        while (i4 >= 0 && this.a[i4] == i) {
            if (Intrinsics.areEqual(obj, this.b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final void clear() {
        if (this.c > 0) {
            this.a = ld9.a;
            this.b = ld9.c;
            this.c = 0;
        }
        if (this.c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        int h = ld9.h(this.a, i, 0);
        if (h < 0 || this.b[h << 1] == null) {
            return h;
        }
        int i2 = h + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = h - 1;
        while (i3 >= 0 && this.a[i3] == 0) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof qae) {
                int i = this.c;
                if (i != ((qae) obj).c) {
                    return false;
                }
                qae qae = (qae) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object f = f(i2);
                    Object i3 = i(i2);
                    Object obj2 = qae.get(f);
                    if (i3 == null) {
                        if (obj2 != null || !qae.containsKey(f)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(i3, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.c != ((Map) obj).size()) {
                return false;
            } else {
                int i4 = this.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object f2 = f(i5);
                    Object i6 = i(i5);
                    Object obj3 = ((Map) obj).get(f2);
                    if (i6 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(i6, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i << 1];
        }
        throw new IllegalArgumentException(wj6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object g(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.c)) {
            throw new IllegalArgumentException(wj6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.a;
            int i5 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i, i6, i2);
                    Object[] objArr2 = this.b;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, i3, i6 << 1, i2 << 1);
                }
                Object[] objArr3 = this.b;
                int i7 = i4 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                if (i2 > 8) {
                    i5 = i2 + (i2 >> 1);
                }
                this.a = Arrays.copyOf(iArr, i5);
                this.b = Arrays.copyOf(this.b, i5 << 1);
                if (i2 == this.c) {
                    if (i > 0) {
                        ArraysKt___ArraysJvmKt.copyInto(iArr, this.a, 0, 0, i);
                        ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) this.b, 0, 0, i3);
                    }
                    if (i < i4) {
                        int i8 = i + 1;
                        ArraysKt___ArraysJvmKt.copyInto(iArr, this.a, i, i8, i2);
                        ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) this.b, i3, i8 << 1, i2 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i2 == this.c) {
                this.c = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.b[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        return d >= 0 ? this.b[(d << 1) + 1] : obj2;
    }

    public final Object h(int i, Object obj) {
        if (i < 0 || i >= this.c) {
            throw new IllegalArgumentException(wj6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final Object i(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[(i << 1) + 1];
        }
        throw new IllegalArgumentException(wj6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.c;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int c2 = obj != null ? c(hashCode, obj) : e();
        if (c2 >= 0) {
            int i2 = (c2 << 1) + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~c2;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.a = Arrays.copyOf(iArr, i4);
            this.b = Arrays.copyOf(this.b, i4 << 1);
            if (i != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.b;
            ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, i5 << 1, i3 << 1, this.c << 1);
        }
        int i6 = this.c;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = hashCode;
                Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return g(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return h(d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != sb) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public qae(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = ld9.a;
        } else {
            iArr = new int[i];
        }
        this.a = iArr;
        if (i == 0) {
            objArr = ld9.c;
        } else {
            objArr = new Object[(i << 1)];
        }
        this.b = objArr;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !Intrinsics.areEqual(obj2, i(d))) {
            return false;
        }
        g(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !Intrinsics.areEqual(obj2, i(d))) {
            return false;
        }
        h(d, obj3);
        return true;
    }
}

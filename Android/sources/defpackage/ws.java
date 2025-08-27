package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: ws  reason: default package */
public final class ws implements Collection, Set, KMutableCollection, KMutableSet {
    public int[] a;
    public Object[] b;
    public int c;

    public ws(int i) {
        this.a = ld9.a;
        this.b = ld9.c;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public final boolean add(Object obj) {
        int i;
        int i2;
        int i3 = this.c;
        boolean z = false;
        if (obj == null) {
            i2 = n54.r(this, (Object) null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = n54.r(this, obj, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i4 = ~i2;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i5];
            this.a = iArr2;
            this.b = new Object[i5];
            if (i3 == this.c) {
                if (iArr2.length == 0) {
                    z = true;
                }
                if (!z) {
                    ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, iArr.length, 6, (Object) null);
                    ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.b, 0, 0, objArr.length, 6, (Object) null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.a;
            int i6 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr3, i6, i4, i3);
            Object[] objArr2 = this.b;
            ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, i6, i4, i3);
        }
        int i7 = this.c;
        if (i3 == i7) {
            int[] iArr4 = this.a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                this.b[i4] = obj;
                this.c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        d(collection.size() + this.c);
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void b(ws wsVar) {
        int i = wsVar.c;
        d(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(wsVar.b[i2]);
            }
        } else if (i > 0) {
            ArraysKt___ArraysJvmKt.copyInto$default(wsVar.a, this.a, 0, 0, i, 6, (Object) null);
            ArraysKt___ArraysJvmKt.copyInto$default(wsVar.b, this.b, 0, 0, i, 6, (Object) null);
            if (this.c == 0) {
                this.c = i;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        if (this.c != 0) {
            this.a = ld9.a;
            this.b = ld9.c;
            this.c = 0;
        }
        if (this.c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        return (obj == null ? n54.r(this, (Object) null, 0) : n54.r(this, obj, obj.hashCode())) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[i];
            this.a = iArr2;
            this.b = new Object[i];
            if (i2 > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, i2, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.b, 0, 0, this.c, 6, (Object) null);
            }
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void e(ws wsVar) {
        int i = wsVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            remove(wsVar.b[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.c == ((Set) obj).size()) {
            try {
                int i = this.c;
                int i2 = 0;
                while (i2 < i) {
                    if (((Set) obj).contains(this.b[i2])) {
                        i2++;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final Object f(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.a;
            int i4 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i5 = i + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i, i5, i2);
                    Object[] objArr2 = this.b;
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr2, (T[]) objArr2, i, i5, i2);
                }
                this.b[i3] = null;
            } else {
                if (i2 > 8) {
                    i4 = i2 + (i2 >> 1);
                }
                int[] iArr2 = new int[i4];
                this.a = iArr2;
                this.b = new Object[i4];
                if (i > 0) {
                    ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, i, 6, (Object) null);
                    ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.b, 0, 0, i, 6, (Object) null);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    ArraysKt___ArraysJvmKt.copyInto(iArr, this.a, i, i6, i2);
                    ArraysKt___ArraysJvmKt.copyInto((T[]) objArr, (T[]) this.b, i, i6, i2);
                }
            }
            if (i2 == this.c) {
                this.c = i3;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.c <= 0;
    }

    public final Iterator iterator() {
        return new ps(this);
    }

    public final boolean remove(Object obj) {
        int r = obj == null ? n54.r(this, (Object) null, 0) : n54.r(this, obj, obj.hashCode());
        if (r < 0) {
            return false;
        }
        f(r);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!CollectionsKt.contains(collection, this.b[i])) {
                f(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.c;
    }

    public final Object[] toArray() {
        return ArraysKt.copyOfRange((T[]) this.b, 0, this.c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Object[] toArray(Object[] objArr) {
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ArraysKt___ArraysJvmKt.copyInto((T[]) this.b, (T[]) objArr, 0, 0, this.c);
        return objArr;
    }

    public /* synthetic */ ws(Object obj) {
        this(0);
    }

    public ws(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}

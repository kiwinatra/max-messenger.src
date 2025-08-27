package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: i04  reason: default package */
public final class i04 implements List, RandomAccess, Cloneable, Serializable {
    public final transient ReentrantLock a = new ReentrantLock();
    public volatile transient Object[] b = new Object[0];

    public static void b(i04 i04, int i, int i2) {
        ReentrantLock reentrantLock = i04.a;
        reentrantLock.lock();
        try {
            Object[] objArr = i04.b;
            int length = objArr.length;
            if (i < 0 || i2 > length || i2 < i) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = length - (i2 - i);
            int i4 = length - i2;
            if (i4 == 0) {
                i04.b = Arrays.copyOf(objArr, i3);
            } else {
                Object[] objArr2 = new Object[i3];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i2, objArr2, i, i4);
                i04.b = objArr2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static int d(Object obj, Object[] objArr, int i) {
        int i2 = 0;
        if (obj == null) {
            while (i2 < i) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < i) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public final boolean add(Object obj) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            Object[] copyOf = Arrays.copyOf(objArr, length + 1);
            copyOf[length] = obj;
            this.b = copyOf;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean addAll(Collection collection) {
        Object[] array = collection.toArray();
        if (array.length == 0) {
            return false;
        }
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            Object[] copyOf = Arrays.copyOf(objArr, array.length + length);
            System.arraycopy(array, 0, copyOf, length, array.length);
            this.b = copyOf;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void clear() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b = new Object[0];
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object clone() {
        try {
            i04 i04 = (i04) super.clone();
            i04.getClass();
            return i04;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.b;
        return d(obj, objArr, objArr.length) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Object[] objArr = this.b;
        int length = objArr.length;
        for (Object d : collection) {
            if (d(d, objArr, length) < 0) {
                return false;
            }
        }
        return true;
    }

    public final void e(Comparator comparator) {
        synchronized (this.a) {
            int length = this.b.length;
            Object[] objArr = (Object[]) this.b.clone();
            Arrays.sort(objArr, 0, length, comparator);
            this.b = objArr;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        Object[] objArr = this.b;
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (it.hasNext()) {
                Object obj2 = objArr[i];
                Object next = it.next();
                if (obj2 == null ? next == null : obj2.equals(next)) {
                    i++;
                }
            }
            return false;
        }
        return !it.hasNext();
    }

    public final Object get(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int length = objArr.length;
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            i = (i * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i;
    }

    public final int indexOf(Object obj) {
        Object[] objArr = this.b;
        return d(obj, objArr, objArr.length);
    }

    public final boolean isEmpty() {
        return this.b.length == 0;
    }

    public final Iterator iterator() {
        return new f04(this.b, 0);
    }

    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        int length = objArr.length - 1;
        if (obj == null) {
            while (length >= 0) {
                if (objArr[length] == null) {
                    return length;
                }
                length--;
            }
        } else {
            while (length >= 0) {
                if (obj.equals(objArr[length])) {
                    return length;
                }
                length--;
            }
        }
        return -1;
    }

    public final ListIterator listIterator(int i) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i >= 0 && i <= length) {
            return new f04(objArr, i);
        }
        throw new IndexOutOfBoundsException(wj6.h(i, "Index: "));
    }

    public final Object remove(int i) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            Object obj = objArr[i];
            int i2 = (length - i) - 1;
            if (i2 == 0) {
                this.b = Arrays.copyOf(objArr, length - 1);
            } else {
                Object[] objArr2 = new Object[(length - 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i + 1, objArr2, i, i2);
                this.b = objArr2;
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean removeAll(Collection collection) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (r2 != 0) {
                Object[] objArr = new Object[r2];
                int i = 0;
                for (Object obj : this.b) {
                    if (!collection.contains(obj)) {
                        objArr[i] = obj;
                        i++;
                    }
                }
                if (i != r2) {
                    this.b = Arrays.copyOf(objArr, i);
                    reentrantLock.unlock();
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean retainAll(Collection collection) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (r2 != 0) {
                Object[] objArr = new Object[r2];
                int i = 0;
                for (Object obj : this.b) {
                    if (collection.contains(obj)) {
                        objArr[i] = obj;
                        i++;
                    }
                }
                if (i != r2) {
                    this.b = Arrays.copyOf(objArr, i);
                    reentrantLock.unlock();
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Object set(int i, Object obj) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            Object obj2 = objArr[i];
            if (obj2 != obj) {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[i] = obj;
                this.b = copyOf;
            } else {
                this.b = objArr;
            }
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int size() {
        return this.b.length;
    }

    public final void sort(Comparator comparator) {
        e(comparator);
    }

    public final List subList(int i, int i2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            int length = this.b.length;
            if (i >= 0 && i2 <= length && i <= i2) {
                return new g04(this, i, i2);
            }
            throw new IndexOutOfBoundsException();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object[] toArray() {
        Object[] objArr = this.b;
        return Arrays.copyOf(objArr, objArr.length);
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }

    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2 = this.b;
        int length = objArr2.length;
        if (objArr.length < length) {
            return Arrays.copyOf(objArr2, length, objArr.getClass());
        }
        System.arraycopy(objArr2, 0, objArr, 0, length);
        if (objArr.length > length) {
            objArr[length] = null;
        }
        return objArr;
    }

    public final void add(int i, Object obj) {
        Object[] objArr;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr2 = this.b;
            int length = objArr2.length;
            if (i > length || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + length);
            }
            int i2 = length - i;
            if (i2 == 0) {
                objArr = Arrays.copyOf(objArr2, length + 1);
            } else {
                Object[] objArr3 = new Object[(length + 1)];
                System.arraycopy(objArr2, 0, objArr3, 0, i);
                System.arraycopy(objArr2, i, objArr3, i + 1, i2);
                objArr = objArr3;
            }
            objArr[i] = obj;
            this.b = objArr;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ListIterator listIterator() {
        return new f04(this.b, 0);
    }

    public final boolean addAll(int i, Collection collection) {
        Object[] objArr;
        Object[] array = collection.toArray();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr2 = this.b;
            int length = objArr2.length;
            if (i > length || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + length);
            } else if (array.length == 0) {
                reentrantLock.unlock();
                return false;
            } else {
                int i2 = length - i;
                if (i2 == 0) {
                    objArr = Arrays.copyOf(objArr2, length + array.length);
                } else {
                    Object[] objArr3 = new Object[(length + array.length)];
                    System.arraycopy(objArr2, 0, objArr3, 0, i);
                    System.arraycopy(objArr2, i, objArr3, array.length + i, i2);
                    objArr = objArr3;
                }
                System.arraycopy(array, 0, objArr, i, array.length);
                this.b = objArr;
                reentrantLock.unlock();
                return true;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean remove(Object obj) {
        boolean z;
        boolean z2;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (length != 0) {
                int i = length - 1;
                Object[] objArr2 = new Object[i];
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = objArr[i2];
                    if (obj == null) {
                        z2 = obj2 == null;
                    } else {
                        z2 = obj.equals(obj2);
                    }
                    if (z2) {
                        for (int i3 = i2 + 1; i3 < length; i3++) {
                            objArr2[i3 - 1] = objArr[i3];
                        }
                        this.b = objArr2;
                        reentrantLock.unlock();
                        return true;
                    }
                    objArr2[i2] = objArr[i2];
                }
                Object obj3 = objArr[i];
                if (obj == null) {
                    z = obj3 == null;
                } else {
                    z = obj.equals(obj3);
                }
                if (z) {
                    this.b = objArr2;
                    reentrantLock.unlock();
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

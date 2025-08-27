package defpackage;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jb7  reason: default package */
public abstract class jb7 {
    public boolean a;
    public int b = 0;
    public Object[] c;

    public jb7(int i) {
        m5a.m(i, "initialCapacity");
        this.c = new Object[i];
    }

    public static int h(int i, int i2) {
        if (i2 >= 0) {
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                i3 = Integer.highestOneBit(i2 - 1) << 1;
            }
            return i3 < 0 ? IntCompanionObject.MAX_VALUE : i3;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public void a(Object obj) {
        obj.getClass();
        i(this.b + 1);
        Object[] objArr = this.c;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public void b(Object... objArr) {
        int length = objArr.length;
        f6e.g(length, objArr);
        i(this.b + length);
        System.arraycopy(objArr, 0, this.c, this.b, length);
        this.b += length;
    }

    public abstract jb7 c(Object obj);

    public void d(Object obj) {
        a(obj);
    }

    public void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            i(collection.size() + this.b);
            if (collection instanceof kb7) {
                this.b = ((kb7) collection).d(this.b, this.c);
                return;
            }
        }
        for (Object c2 : iterable) {
            c(c2);
        }
    }

    public void f(Iterable iterable) {
        e(iterable);
    }

    public abstract void g(ql qlVar, qdf qdf);

    public void i(int i) {
        Object[] objArr = this.c;
        if (objArr.length < i) {
            this.c = Arrays.copyOf(objArr, h(objArr.length, i));
            this.a = false;
        } else if (this.a) {
            this.c = (Object[]) objArr.clone();
            this.a = false;
        }
    }
}

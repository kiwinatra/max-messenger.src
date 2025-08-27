package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: ow5  reason: default package */
public final class ow5 extends zl0 {
    public final Object[] a;
    public int b;
    public volatile boolean c;
    public final pye o;

    public ow5(pye pye, Object[] objArr) {
        this.a = objArr;
        this.o = pye;
    }

    public final void cancel() {
        this.c = true;
    }

    public final void clear() {
        this.b = this.a.length;
    }

    public final void g(long j) {
        if (tye.d(j) && h88.c(this, j) == 0) {
            if (j == LongCompanionObject.MAX_VALUE) {
                Object[] objArr = this.a;
                int length = objArr.length;
                pye pye = this.o;
                int i = this.b;
                while (i != length) {
                    if (!this.c) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            pye.onError(new NullPointerException(a81.j(i, "The element at index ", " is null")));
                            return;
                        } else {
                            pye.d(obj);
                            i++;
                        }
                    } else {
                        return;
                    }
                }
                if (!this.c) {
                    pye.b();
                    return;
                }
                return;
            }
            Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = this.b;
            pye pye2 = this.o;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == length2) {
                        if (i2 != length2) {
                            j = get();
                            if (j2 == j) {
                                this.b = i2;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.c) {
                            pye2.b();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.c) {
                        Object obj2 = objArr2[i2];
                        if (obj2 == null) {
                            pye2.onError(new NullPointerException(a81.j(i2, "The element at index ", " is null")));
                            return;
                        }
                        pye2.d(obj2);
                        j2++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public final boolean isEmpty() {
        return this.b == this.a.length;
    }

    public final int p(int i) {
        return 1;
    }

    public final Object poll() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return null;
        }
        this.b = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "array element is null");
        return obj;
    }
}

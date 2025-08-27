package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: eqf  reason: default package */
public final class eqf implements jv0 {
    public static final xff c = new xff(11);
    public final rpf a;
    public final tb7 b;

    public eqf(rpf rpf) {
        this.a = rpf;
        m5a.m(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < rpf.a) {
            Integer valueOf = Integer.valueOf(i);
            int i3 = i2 + 1;
            if (objArr.length < i3) {
                objArr = Arrays.copyOf(objArr, jb7.h(objArr.length, i3));
            }
            objArr[i2] = valueOf;
            i++;
            i2 = i3;
        }
        this.b = tb7.n(i2, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eqf.class != obj.getClass()) {
            return false;
        }
        eqf eqf = (eqf) obj;
        return this.a.equals(eqf.a) && this.b.equals(eqf.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public eqf(rpf rpf, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < rpf.a)) {
            this.a = rpf;
            this.b = tb7.p(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

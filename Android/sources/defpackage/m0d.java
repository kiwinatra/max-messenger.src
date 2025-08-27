package defpackage;

import java.util.Map;

/* renamed from: m0d  reason: default package */
public final class m0d extends dc7 {
    public final transient wb7 o;
    public final transient Object[] v;
    public final transient int w;
    public final transient int x;

    public m0d(wb7 wb7, Object[] objArr, int i, int i2) {
        this.o = wb7;
        this.v = objArr;
        this.w = i;
        this.x = i2;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.o.get(key));
    }

    public final int d(int i, Object[] objArr) {
        return b().d(i, objArr);
    }

    public final boolean l() {
        return true;
    }

    public final wvf m() {
        return b().listIterator(0);
    }

    public final tb7 q() {
        return new l0d(this);
    }

    public final int size() {
        return this.x;
    }
}

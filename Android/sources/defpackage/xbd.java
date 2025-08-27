package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: xbd  reason: default package */
public class xbd implements Iterable {
    public ubd a;
    public ubd b;
    public final WeakHashMap c = new WeakHashMap();
    public int o = 0;

    public ubd b(Object obj) {
        ubd ubd = this.a;
        while (ubd != null && !ubd.a.equals(obj)) {
            ubd = ubd.c;
        }
        return ubd;
    }

    public Object d(Object obj, Object obj2) {
        ubd b2 = b(obj);
        if (b2 != null) {
            return b2.b;
        }
        ubd ubd = new ubd(obj, obj2);
        this.o++;
        ubd ubd2 = this.b;
        if (ubd2 == null) {
            this.a = ubd;
            this.b = ubd;
            return null;
        }
        ubd2.c = ubd;
        ubd.o = ubd2;
        this.b = ubd;
        return null;
    }

    public Object e(Object obj) {
        ubd b2 = b(obj);
        if (b2 == null) {
            return null;
        }
        this.o--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            for (wbd a2 : weakHashMap.keySet()) {
                a2.a(b2);
            }
        }
        ubd ubd = b2.o;
        if (ubd != null) {
            ubd.c = b2.c;
        } else {
            this.a = b2.c;
        }
        ubd ubd2 = b2.c;
        if (ubd2 != null) {
            ubd2.o = ubd;
        } else {
            this.b = ubd;
        }
        b2.c = null;
        b2.o = null;
        return b2.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r1.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((defpackage.tbd) r6).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.xbd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xbd r6 = (defpackage.xbd) r6
            int r1 = r5.o
            int r3 = r6.o
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            r1 = r5
            tbd r1 = (defpackage.tbd) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0044
            r3 = r6
            tbd r3 = (defpackage.tbd) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L_0x003b
            if (r3 != 0) goto L_0x0043
        L_0x003b:
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x0053
            tbd r6 = (defpackage.tbd) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            tbd tbd = (tbd) it;
            if (!tbd.hasNext()) {
                return i;
            }
            i += ((Map.Entry) tbd.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        tbd tbd = new tbd(this.a, this.b, 0);
        this.c.put(tbd, Boolean.FALSE);
        return tbd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            tbd tbd = (tbd) it;
            if (tbd.hasNext()) {
                sb.append(((Map.Entry) tbd.next()).toString());
                if (tbd.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}

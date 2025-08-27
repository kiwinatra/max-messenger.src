package defpackage;

/* renamed from: gc7  reason: default package */
public final class gc7 extends dc7 {
    public final /* synthetic */ hc7 o;

    public gc7(hc7 hc7) {
        this.o = hc7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = (java.util.Map.Entry) r3;
        r2 = r2.o.get(r3.getKey());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L_0x001e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            hc7 r2 = r2.o
            java.lang.Object r2 = r2.get(r0)
            if (r2 == 0) goto L_0x001e
            java.lang.Object r3 = r3.getValue()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001e
            r1 = 1
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc7.contains(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final boolean l() {
        return this.o.g();
    }

    public final wvf m() {
        return b().listIterator(0);
    }

    public final tb7 q() {
        return new fc7(this);
    }

    public final boolean r() {
        this.o.getClass();
        return false;
    }

    public final int size() {
        return this.o.w.size();
    }
}

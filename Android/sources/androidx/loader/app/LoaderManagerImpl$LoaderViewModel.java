package androidx.loader.app;

class LoaderManagerImpl$LoaderViewModel extends yag {
    public static final a e = new Object();
    public final kge c = new kge();
    public boolean d = false;

    public final void i() {
        kge kge = this.c;
        int i = kge.c;
        int i2 = 0;
        while (i2 < i) {
            z28 z28 = (z28) kge.b[i2];
            j0h j0h = z28.n;
            j0h.a();
            j0h.d = true;
            a38 a38 = z28.p;
            if (a38 != null) {
                z28.j(a38);
                if (a38.b) {
                    a38.a.getClass();
                }
            }
            z28 z282 = j0h.b;
            if (z282 == null) {
                throw new IllegalStateException("No listener register");
            } else if (z282 == z28) {
                j0h.b = null;
                if (a38 != null) {
                    boolean z = a38.b;
                }
                j0h.e = true;
                j0h.c = false;
                j0h.d = false;
                j0h.f = false;
                i2++;
            } else {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
        }
        int i3 = kge.c;
        Object[] objArr = kge.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        kge.c = 0;
    }
}

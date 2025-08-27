package defpackage;

/* renamed from: se0  reason: default package */
public final class se0 implements bw1 {
    public final re0[] a;

    public se0(re0[] re0Arr) {
        this.a = re0Arr;
    }

    public final void a() {
        for (re0 re0 : this.a) {
            pq4 pq4 = re0.w;
            if (pq4 == null) {
                pq4 = null;
            }
            pq4.dispose();
        }
    }

    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}

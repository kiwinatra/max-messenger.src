package defpackage;

/* renamed from: zm7  reason: default package */
public abstract class zm7 {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else if (this.b != i) {
            StringBuilder o = wj6.o(i, "Given job ID ", " is different than previous ");
            o.append(this.b);
            throw new IllegalArgumentException(o.toString());
        }
    }

    public void b() {
    }
}

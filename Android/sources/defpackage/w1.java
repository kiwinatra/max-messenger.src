package defpackage;

/* renamed from: w1  reason: default package */
public abstract class w1 {
    public f2a a;

    public w1(f2a f2a) {
        this.a = f2a;
    }

    public boolean U() {
        return this.a != null;
    }

    public void V(tk3 tk3) {
        f2a f2a = this.a;
        if (f2a != null) {
            tk3.accept(f2a);
        }
    }
}

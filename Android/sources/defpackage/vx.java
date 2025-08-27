package defpackage;

/* renamed from: vx  reason: default package */
public final class vx extends qk4 {
    public final wx c;

    public vx(cla cla, wx wxVar) {
        super(cla);
        this.c = wxVar;
    }

    public final void dispose() {
        if (getAndSet(4) != 4) {
            this.c.H(this);
        }
    }
}

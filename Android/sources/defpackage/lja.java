package defpackage;

/* renamed from: lja  reason: default package */
public final class lja extends r2 {
    public final lfd b;
    public final int c;

    public lja(oka oka, lfd lfd, int i) {
        super(oka);
        this.b = lfd;
        this.c = i;
    }

    public final void w(cla cla) {
        lfd lfd = this.b;
        boolean z = lfd instanceof vqf;
        oka oka = this.a;
        if (z) {
            oka.a(cla);
        } else {
            oka.a(new kja(cla, lfd.b(), this.c));
        }
    }
}

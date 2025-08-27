package defpackage;

/* renamed from: hu  reason: default package */
public final class hu extends ibf {
    public boolean c;
    public long o;

    public hu(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("success")) {
            this.c = ryg.Y(pf9);
        } else if (!str.equals("updateTime")) {
            pf9.A();
        } else {
            this.o = ryg.d0(pf9, 0);
        }
    }

    public final String toString() {
        boolean z = this.c;
        long j = this.o;
        return "Response{success=" + z + ", updateTime=" + j + "}";
    }
}

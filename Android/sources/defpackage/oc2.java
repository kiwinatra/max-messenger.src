package defpackage;

/* renamed from: oc2  reason: default package */
public final class oc2 extends ibf {
    public long c;
    public Integer o;

    public final void c(pf9 pf9, String str) {
        str.getClass();
        if (str.equals("unread")) {
            this.o = Integer.valueOf(pf9.w0());
        } else if (!str.equals("mark")) {
            pf9.A();
        } else {
            this.c = pf9.x0();
        }
    }

    public final String toString() {
        long j = this.c;
        Integer num = this.o;
        return "{mark=" + j + ", unread=" + num + "}";
    }
}

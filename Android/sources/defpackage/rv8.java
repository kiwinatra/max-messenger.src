package defpackage;

/* renamed from: rv8  reason: default package */
public final class rv8 {
    public final Object a;
    public final int b;

    public rv8(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else if (obj instanceof rw8) {
            this.b = 2;
        } else {
            this.b = 0;
        }
    }
}

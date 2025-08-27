package defpackage;

/* renamed from: vxg  reason: default package */
public final class vxg {
    public final Object a;
    public final Object b;
    public final Object c;

    public vxg(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.b);
        return new IllegalArgumentException(rae.q(rae.r("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.c)));
    }
}

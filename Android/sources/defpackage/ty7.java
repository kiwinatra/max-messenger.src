package defpackage;

/* renamed from: ty7  reason: default package */
public final /* synthetic */ class ty7 implements nsb {
    public final /* synthetic */ int a;
    public final /* synthetic */ fz7 b;

    public /* synthetic */ ty7(fz7 fz7, int i) {
        this.a = i;
        this.b = fz7;
    }

    public final boolean test(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                return this.b.j.equalsIgnoreCase(str);
            default:
                return this.b.m.equalsIgnoreCase(str);
        }
    }
}

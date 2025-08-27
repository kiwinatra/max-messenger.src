package defpackage;

/* renamed from: z55  reason: default package */
public final /* synthetic */ class z55 implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c65 b;

    public /* synthetic */ z55(c65 c65, int i) {
        this.a = i;
        this.b = c65;
    }

    public final Object r(do1 do1) {
        switch (this.a) {
            case 0:
                c65 c65 = this.b;
                c65.o.h.execute(new a65(c65, do1, 0));
                return "fetchData";
            default:
                c65 c652 = this.b;
                c652.o.h.execute(new a65(c652, do1, 1));
                return "acquireBuffer";
        }
    }
}

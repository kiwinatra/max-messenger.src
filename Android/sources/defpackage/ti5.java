package defpackage;

/* renamed from: ti5  reason: default package */
public final /* synthetic */ class ti5 implements t2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new oa3(4, ((rh5) ((vi5) this.b).a.get()).a(), new lw4(18));
            default:
                ipg ipg = (ipg) this.b;
                String str = ipg.o;
                z68.c(str, "getWorkManager: enable = " + ipg.e.J(), new Object[0]);
                om0 om0 = ipg.e;
                Boolean bool = (Boolean) om0.J();
                if (bool != null && bool.booleanValue()) {
                    return jha.q(Boolean.TRUE);
                }
                z68.c(str, "waiting for enable ...", new Object[0]);
                return om0;
        }
    }
}

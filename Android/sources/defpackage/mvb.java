package defpackage;

/* renamed from: mvb  reason: default package */
public final /* synthetic */ class mvb implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pvb b;

    public /* synthetic */ mvb(pvb pvb, int i) {
        this.a = i;
        this.b = pvb;
    }

    public final void accept(Object obj) {
        int i = this.a;
        vb0 vb0 = (vb0) obj;
        pvb pvb = this.b;
        pvb.getClass();
        switch (i) {
            case 0:
                if (vb0.a.f.g) {
                    vb0.b.close();
                    return;
                }
                pvb.a.execute(new nvb(pvb, vb0, 1));
                return;
            default:
                if (vb0.a.f.g) {
                    vb0.b.close();
                    return;
                }
                pvb.a.execute(new nvb(pvb, vb0, 0));
                return;
        }
    }
}

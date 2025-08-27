package defpackage;

/* renamed from: qo0  reason: default package */
public final /* synthetic */ class qo0 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ so0 b;

    public /* synthetic */ qo0(so0 so0, int i) {
        this.a = i;
        this.b = so0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                so0 so0 = this.b;
                if (so0.o.isEmpty()) {
                    z1d z1d = so0.x;
                    z1d.getClass();
                    ((kj0) z1d).c();
                    p94.a();
                    return;
                }
                so0.X = true;
                return;
            case 1:
                so0 so02 = this.b;
                so02.z++;
                so02.Z();
                return;
            default:
                so0 so03 = this.b;
                gs6 gs6 = so03.y;
                if (gs6 != null) {
                    gs6.a();
                }
                so03.o.clear();
                return;
        }
    }
}

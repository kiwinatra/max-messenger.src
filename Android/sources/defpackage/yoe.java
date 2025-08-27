package defpackage;

import java.util.List;

/* renamed from: yoe  reason: default package */
public final /* synthetic */ class yoe implements zi6, qk3, yhd {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpe b;

    public /* synthetic */ yoe(cpe cpe, int i) {
        this.a = i;
        this.b = cpe;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                this.b.P0.G((List) obj);
                return;
            case 4:
                this.b.P0.G((List) obj);
                return;
            default:
                cpe cpe = this.b;
                cpe.getClass();
                cpe.U0 = !((Boolean) obj).booleanValue();
                List list = ((ov) cpe.P0.o).f;
                cpe.O(list, list);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                return this.b.H0.a();
            case 1:
                return jha.q(this.b.P((List) obj));
            default:
                cpe cpe = this.b;
                o54.k(cpe.S0);
                return cpe.P((List) obj);
        }
    }
}

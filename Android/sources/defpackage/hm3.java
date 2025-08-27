package defpackage;

/* renamed from: hm3  reason: default package */
public final /* synthetic */ class hm3 implements qk3, h08, pk3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hm3(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                nm3 nm3 = (nm3) obj;
                int i = nm3.m;
                boolean z = this.c;
                int i2 = this.b;
                nm3.m = z ? i2 | i : (~i2) & i;
                return;
            default:
                ((ypb) obj).C(this.b, this.c);
                return;
        }
    }

    public void invoke(Object obj) {
        ((rob) obj).i(this.b, this.c);
    }

    public /* synthetic */ hm3(boolean z) {
        this.c = z;
        this.b = 1;
    }

    public /* synthetic */ hm3(boolean z, int i) {
        this.c = z;
        this.b = i;
    }
}

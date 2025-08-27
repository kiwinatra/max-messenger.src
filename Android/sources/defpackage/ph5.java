package defpackage;

import java.util.List;

/* renamed from: ph5  reason: default package */
public final /* synthetic */ class ph5 implements zi6, uu {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ ph5(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new qa3(1, new qh5((xi5) obj, this.b, this.c, 0));
            case 1:
                return new na3(4, ((fi5) obj).a(), new ph5(this.c, 2, this.b));
            default:
                return new qa3(1, new qh5((oi5) obj, this.b, this.c, 1));
        }
    }

    public /* synthetic */ ph5(int i, long j) {
        this.a = 3;
        this.c = i;
        this.b = j;
    }

    /* renamed from: apply  reason: collision with other method in class */
    public zz7 m1575apply(Object obj) {
        return o5a.F(new dx8(this.c, this.b, (List) obj));
    }
}

package defpackage;

/* renamed from: zb5  reason: default package */
public final /* synthetic */ class zb5 implements h08, i08, pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ zb5(float f, int i) {
        this.a = i;
        this.b = f;
    }

    public void accept(Object obj) {
        ypb ypb = (ypb) obj;
        switch (this.a) {
            case 3:
                ypb.setPlaybackSpeed(this.b);
                return;
            default:
                ypb.g(this.b);
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((rob) obj).f(this.b);
                return;
            case 1:
                ((sob) obj).f(this.b);
                return;
            default:
                ((sob) obj).f(this.b);
                return;
        }
    }
}

package defpackage;

/* renamed from: c62  reason: default package */
public final /* synthetic */ class c62 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk3 b;

    public /* synthetic */ c62(qk3 qk3, int i) {
        this.a = i;
        this.b = qk3;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                a32 a32 = (a32) obj;
                if (a32 != null && a32.a > 0) {
                    this.b.accept(a32);
                    return;
                }
                return;
            default:
                m20 m20 = (m20) obj;
                zf7 zf7 = m20.b;
                if (zf7 != null) {
                    yf7 yf7 = new yf7();
                    yf7.a = zf7.a;
                    yf7.b = zf7.b;
                    this.b.accept(yf7);
                    m20.b = new zf7(yf7);
                    return;
                }
                return;
        }
    }
}

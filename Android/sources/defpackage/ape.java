package defpackage;

/* renamed from: ape  reason: default package */
public final /* synthetic */ class ape implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpe b;

    public /* synthetic */ ape(cpe cpe, int i) {
        this.a = i;
        this.b = cpe;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                cpe cpe = this.b;
                bpe bpe = cpe.G0;
                if (bpe != null) {
                    bpe.m0();
                    cpe.G0.f0();
                    return;
                }
                return;
            default:
                bpe bpe2 = this.b.G0;
                if (bpe2 != null) {
                    bpe2.l();
                    return;
                }
                return;
        }
    }
}

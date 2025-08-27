package defpackage;

import java.io.IOException;

/* renamed from: stc  reason: default package */
public final class stc extends mdf {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ ttc f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public stc(String str, ttc ttc) {
        super(str, true);
        this.f = ttc;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                ttc ttc = this.f;
                try {
                    return ttc.h() ? 0 : -1;
                } catch (IOException e2) {
                    ttc.c(e2);
                }
            default:
                this.f.b.e();
                return -1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public stc(ttc ttc) {
        super(wj6.n(new StringBuilder(), ttc.g, " writer"), true);
        this.f = ttc;
    }
}

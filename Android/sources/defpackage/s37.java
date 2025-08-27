package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: s37  reason: default package */
public final class s37 extends mdf {
    public final /* synthetic */ h47 e;
    public final /* synthetic */ fb1 f;
    public final /* synthetic */ List g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s37(String str, h47 h47, fb1 fb1, List list) {
        super(str, true);
        this.e = h47;
        this.f = fb1;
        this.g = list;
    }

    public final long a() {
        try {
            ((a47) this.f.c).b.b(this.e);
            return -1;
        } catch (IOException e2) {
            wnb wnb = wnb.a;
            wnb.a.getClass();
            wnb.i(4, "Http2Connection.Listener failure for " + ((a47) this.f.c).o, e2);
            try {
                this.e.c(2, e2);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}

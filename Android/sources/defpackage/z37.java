package defpackage;

import java.io.IOException;

/* renamed from: z37  reason: default package */
public final class z37 extends mdf {
    public final /* synthetic */ a47 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z37(String str, a47 a47, int i, long j) {
        super(str, true);
        this.e = a47;
        this.f = i;
        this.g = j;
    }

    public final long a() {
        a47 a47 = this.e;
        try {
            a47.H0.n(this.f, this.g);
            return -1;
        } catch (IOException e2) {
            a47.b(e2);
            return -1;
        }
    }
}

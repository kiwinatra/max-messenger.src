package defpackage;

import java.io.IOException;

/* renamed from: t37  reason: default package */
public final class t37 extends mdf {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t37(String str, int i, int i2, int i3, Object obj) {
        super(str, true);
        this.e = i3;
        this.h = obj;
        this.f = i;
        this.g = i2;
    }

    public final long a() {
        switch (this.e) {
            case 0:
                a47 a47 = (a47) ((fb1) this.h).c;
                int i = this.f;
                int i2 = this.g;
                a47.getClass();
                try {
                    a47.H0.j(i, i2, true);
                    return -1;
                } catch (IOException e2) {
                    a47.a(2, 2, e2);
                    return -1;
                }
            default:
                a47 a472 = (a47) this.h;
                try {
                    a472.H0.m(this.f, this.g);
                    return -1;
                } catch (IOException e3) {
                    a472.a(2, 2, e3);
                    return -1;
                }
        }
    }
}

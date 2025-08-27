package defpackage;

import java.util.List;

/* renamed from: te2  reason: default package */
public final /* synthetic */ class te2 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye2 b;
    public final /* synthetic */ ee2 c;

    public /* synthetic */ te2(ye2 ye2, ee2 ee2, int i) {
        this.a = i;
        this.b = ye2;
        this.c = ee2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ye2 ye2 = this.b;
                ye2.getClass();
                ee2 ee2 = this.c;
                ye2.f(new ve2((List) obj, true, false, ee2.c, ee2.o, ee2.v));
                return;
            default:
                ye2 ye22 = this.b;
                ye22.getClass();
                ee2 ee22 = this.c;
                ye22.f(new ve2((List) obj, false, false, ee22.c, ee22.o, ee22.v));
                return;
        }
    }
}

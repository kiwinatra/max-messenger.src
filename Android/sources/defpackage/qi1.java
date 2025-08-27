package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: qi1  reason: default package */
public final /* synthetic */ class qi1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj1 b;
    public final /* synthetic */ aj8 c;
    public final /* synthetic */ aj8 o;

    public /* synthetic */ qi1(jj1 jj1, aj8 aj8, aj8 aj82, int i) {
        this.a = i;
        this.b = jj1;
        this.c = aj8;
        this.o = aj82;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                aj8.a.getClass();
                boolean r = nfd.r(this.c);
                boolean r2 = nfd.r(this.o);
                ap1 ap1 = this.b.c;
                ((o01) ap1.b).e(r);
                if (r) {
                    ((sz9) ap1.p.getValue()).d(Boolean.FALSE);
                }
                ap1.d(r2);
                return Unit.INSTANCE;
            default:
                aj8.a.getClass();
                boolean r3 = nfd.r(this.c);
                boolean r4 = nfd.r(this.o);
                ap1 ap12 = this.b.c;
                ((o01) ap12.b).e(r3);
                if (r3) {
                    ((sz9) ap12.p.getValue()).d(Boolean.FALSE);
                }
                ap12.d(r4);
                return Unit.INSTANCE;
        }
    }
}

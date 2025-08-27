package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: zqb  reason: default package */
public final /* synthetic */ class zqb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ orb b;

    public /* synthetic */ zqb(orb orb, int i) {
        this.a = i;
        this.b = orb;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                frb frb = this.b.a;
                if (frb != null) {
                    frb.k();
                }
                return Unit.INSTANCE;
            case 1:
                frb frb2 = this.b.a;
                if (frb2 != null) {
                    frb2.h();
                }
                return Unit.INSTANCE;
            case 2:
                return new yqb(this.b.a);
            case 3:
                frb frb3 = this.b.a;
                return Unit.INSTANCE;
            default:
                frb frb4 = this.b.a;
                if (frb4 != null) {
                    frb4.k();
                }
                return Unit.INSTANCE;
        }
    }
}

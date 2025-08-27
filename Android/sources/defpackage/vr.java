package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: vr  reason: default package */
public final /* synthetic */ class vr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ as b;
    public final /* synthetic */ y32 c;

    public /* synthetic */ vr(as asVar, y32 y32, int i) {
        this.a = i;
        this.b = asVar;
        this.c = y32;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                as asVar = this.b;
                asVar.x0 = this.c.b;
                asVar.q();
                return Unit.INSTANCE;
            default:
                as asVar2 = this.b;
                asVar2.w0 = this.c.b;
                asVar2.r();
                return Unit.INSTANCE;
        }
    }
}

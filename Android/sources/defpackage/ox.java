package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* renamed from: ox  reason: default package */
public final /* synthetic */ class ox implements Function0 {
    public final /* synthetic */ ux a;
    public final /* synthetic */ a32 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Ref.IntRef o;
    public final /* synthetic */ Ref.LongRef v;
    public final /* synthetic */ Ref.IntRef w;
    public final /* synthetic */ Ref.LongRef x;
    public final /* synthetic */ ma2 y;

    public /* synthetic */ ox(ux uxVar, a32 a32, long j, Ref.IntRef intRef, Ref.LongRef longRef, Ref.IntRef intRef2, Ref.LongRef longRef2, ma2 ma2) {
        this.a = uxVar;
        this.b = a32;
        this.c = j;
        this.o = intRef;
        this.v = longRef;
        this.w = intRef2;
        this.x = longRef2;
        this.y = ma2;
    }

    public final Object invoke() {
        ux uxVar = this.a;
        uxVar.e.a(0, this.b.a, this.c, this.o.element, this.v.element, this.w.element, this.x.element, this.y, uxVar.b);
        return Unit.INSTANCE;
    }
}

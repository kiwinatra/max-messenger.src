package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: s8a  reason: default package */
public final /* synthetic */ class s8a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8a b;

    public /* synthetic */ s8a(x8a x8a, int i) {
        this.a = i;
        this.b = x8a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                xag.h(this.b.y, v7a.b);
                return Unit.INSTANCE;
            default:
                xag.h(this.b.y, p33.b);
                return Unit.INSTANCE;
        }
    }
}

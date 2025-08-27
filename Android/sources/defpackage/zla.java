package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: zla  reason: default package */
public final class zla extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fma b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zla(fma fma, int i) {
        super(0);
        this.a = i;
        this.b = fma;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.d();
                return Unit.INSTANCE;
            case 1:
                this.b.c();
                return Unit.INSTANCE;
            default:
                this.b.d();
                return Unit.INSTANCE;
        }
    }
}

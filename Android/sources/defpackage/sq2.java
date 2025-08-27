package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: sq2  reason: default package */
public final class sq2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ h2b b;
    public /* synthetic */ k2b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.a = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h2b h2b = (h2b) obj;
        k2b k2b = (k2b) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.a) {
            case 0:
                sq2 sq2 = new sq2(3, continuation, 0);
                sq2.b = h2b;
                sq2.c = k2b;
                return sq2.invokeSuspend(Unit.INSTANCE);
            case 1:
                sq2 sq22 = new sq2(3, continuation, 1);
                sq22.b = h2b;
                sq22.c = k2b;
                return sq22.invokeSuspend(Unit.INSTANCE);
            default:
                sq2 sq23 = new sq2(3, continuation, 2);
                sq23.b = h2b;
                sq23.c = k2b;
                return sq23.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                this.b.onThemeChanged(this.c);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                this.b.onThemeChanged(this.c);
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                this.b.onThemeChanged(this.c);
                return Unit.INSTANCE;
        }
    }
}

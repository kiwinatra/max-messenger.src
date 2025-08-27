package defpackage;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: yr  reason: default package */
public final class yr extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ y32 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ as o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr(y32 y32, boolean z, as asVar, Continuation continuation) {
        super(2, continuation);
        this.b = y32;
        this.c = z;
        this.o = asVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yr(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yr) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            y32 y32 = this.b;
            String str = y32.b.a;
            KProperty[] kPropertyArr = as.H0;
            as asVar = this.o;
            nf0.e(str, this.c, ((ltb) asVar.n()).a);
            n28 n28 = (n28) asVar.z0.getValue();
            Context m = asVar.m();
            this.a = 1;
            if (ev0.I(((osa) ((gaf) n28.a.getValue())).b(), new m28(n28, y32.b, m, true, (Continuation) null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;

/* renamed from: kx  reason: default package */
public final class kx extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ nx c;
    public final /* synthetic */ a32 o;
    public ha9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kx(Object obj, Continuation continuation, nx nxVar, a32 a32) {
        super(2, continuation);
        this.b = obj;
        this.c = nxVar;
        this.o = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kx(this.b, continuation, this.c, this.o);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kx) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable th;
        ha9 ha9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        nx nxVar = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ha9 ha92 = (ha9) this.b;
            try {
                a32 a32 = this.o;
                this.v = ha92;
                this.a = 1;
                Object g = ((msa) nxVar.h.getValue()).g(a32, ha92, this);
                if (g == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ha9 ha93 = ha92;
                obj = g;
                ha9 = ha93;
            } catch (Throwable th2) {
                ha9 ha94 = ha92;
                th = th2;
                ha9 = ha94;
                ((uta) ((m95) nxVar.j.getValue())).c(new RuntimeException("Error during mapping message=" + ha9, th), true);
                return null;
            }
        } else if (i == 1) {
            ha9 = this.v;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (MessageModel) obj;
    }
}

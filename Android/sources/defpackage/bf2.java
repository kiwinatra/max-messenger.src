package defpackage;

import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;

/* renamed from: bf2  reason: default package */
public final class bf2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ pp0 c;
    public final /* synthetic */ a32 o;
    public ha9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf2(Object obj, Continuation continuation, pp0 pp0, a32 a32) {
        super(2, continuation);
        this.b = obj;
        this.c = pp0;
        this.o = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bf2(this.b, continuation, this.c, this.o);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bf2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Exception e;
        ha9 ha9;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        pp0 pp0 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ha9 ha92 = (ha9) this.b;
            try {
                a32 a32 = this.o;
                this.v = ha92;
                this.a = 1;
                Object g = ((msa) ((Lazy) pp0.e).getValue()).g(a32, ha92, this);
                if (g == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ha9 ha93 = ha92;
                obj = g;
                ha9 = ha93;
            } catch (Exception e2) {
                ha9 ha94 = ha92;
                e = e2;
                ha9 = ha94;
                ((uta) ((m95) ((Lazy) pp0.f).getValue())).c(new RuntimeException("Error during mapping message=" + ha9, e), true);
                return null;
            }
        } else if (i == 1) {
            ha9 = this.v;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (MessageModel) obj;
    }
}

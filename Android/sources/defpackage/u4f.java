package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u4f  reason: default package */
public final class u4f extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h5f c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u4f(h5f h5f, Continuation continuation) {
        super(2, continuation);
        this.c = h5f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        u4f u4f = new u4f(this.c, continuation);
        u4f.b = obj;
        return u4f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u4f) create((bxf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        bs5 bs5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bxf bxf = (bxf) this.b;
            if (bxf.a()) {
                String str = this.c.b;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, "No need for uploading due it already finished", (Throwable) null);
                }
                return new fs5(3, bxf);
            }
            String str2 = this.c.b;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.o, str2, "Requested upload to server", (Throwable) null);
            }
            h5f h5f = this.c;
            this.a = 1;
            h5f.getClass();
            bs5 = new ps5(bs0.D(new ps5(new d5f(new ps5(new d5f(new d5f(new fs5(3, bxf), h5f, 0), h5f, 1), new zqa(13, (Object) h5f), 5), h5f, 2), new zqa(14, (Object) h5f), 5), new p2c(2, h5f, h5f.class, "uploadFile", "uploadFile(Lone/me/sdk/transfer/domain/Upload;)Lkotlinx/coroutines/flow/Flow;", 4, 19)), new g5f(h5f, (Continuation) null), 5);
            if (bs5 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            bs5 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return bs5;
    }
}

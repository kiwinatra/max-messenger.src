package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousByteChannel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: blf  reason: default package */
public final class blf extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rlf b;
    public final /* synthetic */ ByteBuffer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public blf(rlf rlf, ByteBuffer byteBuffer, Continuation continuation) {
        super(2, continuation);
        this.b = rlf;
        this.c = byteBuffer;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new blf(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((blf) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AsynchronousByteChannel asynchronousByteChannel = this.b.b;
            this.a = 1;
            lw1 lw1 = new lw1(1, IntrinsicsKt.intercepted(this));
            lw1.u();
            asynchronousByteChannel.read(this.c, lw1, ev.b);
            obj = lw1.t();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}

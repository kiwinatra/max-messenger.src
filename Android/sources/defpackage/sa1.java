package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: sa1  reason: default package */
public final class sa1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;

    /* JADX WARNING: type inference failed for: r1v1, types: [sa1, kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.SuspendLambda] */
    public final Continuation create(Object obj, Continuation continuation) {
        ? suspendLambda = new SuspendLambda(2, continuation);
        suspendLambda.a = obj;
        return suspendLambda;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sa1) create((vk3[]) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vk3[] vk3Arr = (vk3[]) this.a;
        int length = vk3Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                vk3 vk3 = vk3Arr[i];
                if (vk3 == null || vk3.B()) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return Boxing.boxBoolean(z);
    }
}

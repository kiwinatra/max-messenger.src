package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: vk9  reason: default package */
public final class vk9 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ en9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vk9(en9 en9, Continuation continuation) {
        super(2, continuation);
        this.c = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        vk9 vk9 = new vk9(this.c, continuation);
        vk9.b = obj;
        return vk9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vk9) create((jo9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object I;
        Object I2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            jo9 jo9 = (jo9) this.b;
            boolean z = jo9 instanceof ho9;
            en9 en9 = this.c;
            if (z) {
                ho9 ho9 = (ho9) jo9;
                this.a = 1;
                ConcurrentHashMap concurrentHashMap = en9.u1;
                String str = ho9.b;
                Object obj2 = Unit.INSTANCE;
                if (concurrentHashMap.remove(str, obj2) && (I2 = ev0.I(((osa) en9.w).c(), new fl9(en9, ho9, (Continuation) null), this)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj2 = I2;
                }
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (jo9 instanceof io9) {
                io9 io9 = (io9) jo9;
                this.a = 2;
                ConcurrentHashMap concurrentHashMap2 = en9.u1;
                String str2 = io9.b;
                Object obj3 = Unit.INSTANCE;
                if (concurrentHashMap2.remove(str2, obj3) && (I = ev0.I(((osa) en9.w).c(), new gl9(en9, io9, (Continuation) null), this)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    obj3 = I;
                }
                if (obj3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

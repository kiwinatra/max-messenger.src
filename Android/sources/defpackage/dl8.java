package defpackage;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dl8  reason: default package */
public final class dl8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ il8 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dl8(il8 il8, Continuation continuation) {
        super(2, continuation);
        this.b = il8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dl8(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dl8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            il8 il8 = this.b;
            CharSequence charSequence = il8.j(il8).f.j;
            Lazy lazy = il8.o;
            ((h48) lazy.getValue()).f.j = null;
            xme xme = il8.y;
            int ordinal = ((n00) xme.getValue()).ordinal();
            if (ordinal == 0) {
                z = false;
            } else if (ordinal == 1) {
                z = true;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            sqd sqd = ((h48) lazy.getValue()).f;
            int ordinal2 = ((n00) xme.getValue()).ordinal();
            if (ordinal2 == 0) {
                i = 3;
            } else if (ordinal2 == 1) {
                i = 2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            sqd.s(i);
            xag.h(il8.Z, new vk8(charSequence, ((h48) lazy.getValue()).f.e(), z));
            mj8 mj8 = new mj8(true);
            this.a = 1;
            if (il8.z.t(mj8, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}

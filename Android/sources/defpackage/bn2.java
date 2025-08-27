package defpackage;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;

/* renamed from: bn2  reason: default package */
public final class bn2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ChatScreen c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.c = chatScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bn2 bn2 = new bn2(continuation, this.c);
        bn2.b = obj;
        return bn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bn2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = ChatScreen.d1;
            ChatScreen chatScreen = this.c;
            v0f v0f = (v0f) chatScreen.z0.getValue();
            Context context = chatScreen.getContext();
            this.a = 1;
            Object I = ev0.I(((osa) ((gaf) v0f.y.getValue())).a(), new s0f((l72) this.b, v0f, context, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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

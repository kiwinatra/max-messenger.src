package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.startconversation.StartConversationScreen;

/* renamed from: kle  reason: default package */
public final class kle extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ StartConversationScreen b;
    public final /* synthetic */ qs6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kle(StartConversationScreen startConversationScreen, qs6 qs6, Continuation continuation) {
        super(2, continuation);
        this.b = startConversationScreen;
        this.c = qs6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kle(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kle) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        qs6 qs6 = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            KProperty[] kPropertyArr = StartConversationScreen.E0;
            rle d0 = this.b.d0();
            fo3 fo3 = qs6.w;
            this.a = 1;
            Object I = ev0.I(((osa) ((gaf) d0.o.getValue())).b(), new ple(d0, fo3, (Continuation) null), this);
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
        ble ble = ble.b;
        long j = qs6.a;
        ble.getClass();
        String str = ":profile?id=" + j + "&type=contact";
        Unit unit = Unit.INSTANCE;
        ble.W0().b(str, (Bundle) null);
        return Unit.INSTANCE;
    }
}

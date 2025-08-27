package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.startconversation.StartConversationScreen;

/* renamed from: hle  reason: default package */
public final class hle extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StartConversationScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hle(StartConversationScreen startConversationScreen, Continuation continuation) {
        super(2, continuation);
        this.b = startConversationScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        hle hle = new hle(this.b, continuation);
        hle.a = obj;
        return hle;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hle) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        List list = (List) this.a;
        KProperty[] kPropertyArr = StartConversationScreen.E0;
        StartConversationScreen startConversationScreen = this.b;
        CharSequence c0 = startConversationScreen.c0();
        if (!(c0 == null || c0.length() == 0)) {
            return Unit.INSTANCE;
        }
        startConversationScreen.v0.G(list);
        return Unit.INSTANCE;
    }
}

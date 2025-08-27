package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: dg2  reason: default package */
public final class dg2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaTabWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dg2(Continuation continuation, ChatMediaTabWidget chatMediaTabWidget) {
        super(2, continuation);
        this.b = chatMediaTabWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dg2 dg2 = new dg2(continuation, this.b);
        dg2.a = obj;
        return dg2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dg2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zf2 zf2 = (zf2) this.a;
        KProperty[] kPropertyArr = ChatMediaTabWidget.Z;
        ChatMediaTabWidget chatMediaTabWidget = this.b;
        chatMediaTabWidget.getClass();
        KProperty kProperty = ChatMediaTabWidget.Z[0];
        h3b h3b = (h3b) chatMediaTabWidget.v.getValue();
        h3b.setTitle(zf2.b);
        h3b.setAvatar(zf2.a);
        return Unit.INSTANCE;
    }
}

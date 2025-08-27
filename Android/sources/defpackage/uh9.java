package defpackage;

import android.view.View;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: uh9  reason: default package */
public final class uh9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessageWriteWidget b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uh9(Continuation continuation, MessageWriteWidget messageWriteWidget, View view) {
        super(2, continuation);
        this.b = messageWriteWidget;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uh9 uh9 = new uh9(continuation, this.b, this.c);
        uh9.a = obj;
        return uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uh9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = MessageWriteWidget.C0;
        this.b.d0().setInputHint(((ngf) this.a).a(this.c.getContext()));
        return Unit.INSTANCE;
    }
}

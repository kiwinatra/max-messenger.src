package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* renamed from: ob  reason: default package */
public final class ob extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AdminsFromContactsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ob(Continuation continuation, AdminsFromContactsScreen adminsFromContactsScreen) {
        super(2, continuation);
        this.b = adminsFromContactsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ob obVar = new ob(continuation, this.b);
        obVar.a = obj;
        return obVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ob) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = AdminsFromContactsScreen.X;
        ((xb) this.b.c.getValue()).y.setValue((String) this.a);
        return Unit.INSTANCE;
    }
}

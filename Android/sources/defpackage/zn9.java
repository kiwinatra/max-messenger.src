package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: zn9  reason: default package */
public final class zn9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zn9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zn9 zn9 = new zn9(continuation, this.b);
        zn9.a = obj;
        return zn9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zn9) create((lk9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        lk9 lk9 = (lk9) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) lk9, (Object) kk9.a);
        MessagesListWidget messagesListWidget = this.b;
        if (areEqual) {
            KProperty[] kPropertyArr = MessagesListWidget.R0;
            messagesListWidget.h0().z0(messagesListWidget.v0.j() - 1);
        } else if (Intrinsics.areEqual((Object) lk9, (Object) hk9.a)) {
            KProperty[] kPropertyArr2 = MessagesListWidget.R0;
            messagesListWidget.k0().v().a();
        } else if (lk9 instanceof jk9) {
            KProperty[] kPropertyArr3 = MessagesListWidget.R0;
            cx9 v = messagesListWidget.k0().v();
            int i = ((jk9) lk9).a;
            Collection list = CollectionsKt.toList(((ww9) v.f.getValue()).a);
            if (list.isEmpty()) {
                v.a();
            } else {
                Integer valueOf = Integer.valueOf(i);
                v.d.invoke((List) list, valueOf);
                v.a();
            }
        } else if (lk9 instanceof ik9) {
            e55 e55 = messagesListWidget.P0;
            if (e55 != null) {
                e55.q = true;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

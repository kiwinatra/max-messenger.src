package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.android.MainActivity;
import one.me.android.join.JoinChatWidget;

/* renamed from: tn7  reason: default package */
public final class tn7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ JoinChatWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tn7(JoinChatWidget joinChatWidget, Continuation continuation) {
        super(2, continuation);
        this.b = joinChatWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        tn7 tn7 = new tn7(this.b, continuation);
        tn7.a = obj;
        return tn7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tn7) create((zn7) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zn7 zn7 = (zn7) this.a;
        KProperty[] kPropertyArr = JoinChatWidget.v0;
        JoinChatWidget joinChatWidget = this.b;
        if (joinChatWidget.requireActivity() instanceof t7d) {
            joinChatWidget.getRouter().C();
            yn7 yn7 = yn7.b;
            long longValue = ((Number) zn7.a).longValue();
            ta4 W0 = yn7.W0();
            zqd zqd = new zqd(9);
            zqd.b = ":chats";
            zqd.z(Long.valueOf(longValue), "id");
            zqd.z("local", "type");
            W0.c(zqd.p(), (Bundle) null);
        } else {
            int i = MainActivity.E0;
            js9.l(joinChatWidget.requireActivity(), ox2.n1(ox2.b, ((Number) zn7.a).longValue(), "local", (Long) null, (Long) null, (List) null, (String) null, (Boolean) null, false, 508), (z0b) null, (iz1) null, 12);
        }
        joinChatWidget.i0(false);
        return Unit.INSTANCE;
    }
}

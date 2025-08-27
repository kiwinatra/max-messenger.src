package defpackage;

import android.view.View;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;

/* renamed from: x49  reason: default package */
public final class x49 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MembersListWidget a;
    public final /* synthetic */ long b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x49(MembersListWidget membersListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.a = membersListWidget;
        this.b = j;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new x49(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x49) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = MembersListWidget.B0;
        MembersListWidget membersListWidget = this.a;
        i49 e0 = membersListWidget.e0();
        long j = this.b;
        List list = (List) e0.b.invoke(Long.valueOf(j));
        if (!membersListWidget.c0().c || list.isEmpty()) {
            return Unit.INSTANCE;
        }
        Long boxLong = Boxing.boxLong(j);
        KProperty kProperty = MembersListWidget.B0[2];
        membersListWidget.x.b(membersListWidget, boxLong);
        m58.b(ix3.b).h(list).o(this.c).k(vo4.c().getDisplayMetrics().density * 12.0f).build().o(membersListWidget);
        return Unit.INSTANCE;
    }
}

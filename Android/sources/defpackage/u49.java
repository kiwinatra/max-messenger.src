package defpackage;

import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;

/* renamed from: u49  reason: default package */
public final class u49 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MembersListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u49(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.b = membersListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        u49 u49 = new u49(continuation, this.b);
        u49.a = obj;
        return u49;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u49) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Set set = (Set) this.a;
        KProperty[] kPropertyArr = MembersListWidget.B0;
        MembersListWidget membersListWidget = this.b;
        if (!membersListWidget.e0().k()) {
            fz2 fz2 = membersListWidget.z0;
            if (fz2 != null) {
                membersListWidget.d0().r0(fz2);
            }
            membersListWidget.z0 = null;
            ia4 ia4 = membersListWidget.A0;
            if (ia4 != null) {
                membersListWidget.d0().t0(ia4);
            }
            membersListWidget.A0 = null;
        } else if (membersListWidget.z0 == null) {
            vq7 vq7 = new vq7(13, (Object) membersListWidget);
            fz2 fz22 = new fz2(new s49(membersListWidget, 0), new wk(21, vq7, membersListWidget), new v12(2, (Function1) vq7), new v12(3, (Function1) vq7));
            membersListWidget.d0().j(fz22);
            membersListWidget.z0 = fz22;
            ia4 ia42 = new ia4(membersListWidget.d0());
            membersListWidget.d0().l(ia42);
            membersListWidget.A0 = ia42;
        }
        membersListWidget.d0().a0();
        return Unit.INSTANCE;
    }
}

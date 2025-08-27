package defpackage;

import android.view.View;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;

/* renamed from: t49  reason: default package */
public final class t49 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MembersListWidget b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t49(Continuation continuation, MembersListWidget membersListWidget, View view) {
        super(2, continuation);
        this.b = membersListWidget;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t49 t49 = new t49(continuation, this.b, this.c);
        t49.a = obj;
        return t49;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t49) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        j49 j49 = (j49) this.a;
        boolean z = j49.d;
        MembersListWidget membersListWidget = this.b;
        List list = j49.a;
        if (z) {
            membersListWidget.X.G(CollectionsKt.emptyList());
            membersListWidget.Y.G(CollectionsKt.emptyList());
            membersListWidget.v0.G(list.isEmpty() ? CollectionsKt.listOf(x45.a) : CollectionsKt.emptyList());
        } else {
            membersListWidget.X.G(j49.b);
            membersListWidget.v0.G(CollectionsKt.emptyList());
            membersListWidget.Y.G(j49.c);
        }
        KProperty[] kPropertyArr = MembersListWidget.B0;
        membersListWidget.d0().setOverScrollMode(membersListWidget.o != null ? 2 : 1);
        membersListWidget.z.G(list);
        if (this.c != null) {
            membersListWidget.d0().setRefreshingNext(j49.e);
        }
        return Unit.INSTANCE;
    }
}

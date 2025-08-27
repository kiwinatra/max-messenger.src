package defpackage;

import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;

/* renamed from: w49  reason: default package */
public final class w49 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MembersListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w49(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.b = membersListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        w49 w49 = new w49(continuation, this.b);
        w49.a = obj;
        return w49;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w49) create((z39) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        z39 z39 = (z39) this.a;
        boolean z = z39 instanceof x39;
        MembersListWidget membersListWidget = this.b;
        if (z) {
            KProperty[] kPropertyArr = MembersListWidget.B0;
            r49 f0 = membersListWidget.f0();
            Collection collection = ((x39) z39).a;
            aje aje = f0.Z;
            if (aje == null || !aje.isActive()) {
                f0.Z = xag.g(f0, ((osa) ((gaf) f0.y.getValue())).a(), (f14) null, new p49(f0, collection, (Continuation) null), 2);
            }
        } else if (z39 instanceof y39) {
            KProperty[] kPropertyArr2 = MembersListWidget.B0;
            r49 f02 = membersListWidget.f0();
            k39 k39 = new k39(f02.b, f02.c, f02.Y);
            t39 t39 = f02.x;
            t39.getClass();
            ev0.v(t39.b, (CoroutineContext) null, (f14) null, new s39(t39, k39, (Continuation) null), 3);
            f02.Y = SetsKt.emptySet();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

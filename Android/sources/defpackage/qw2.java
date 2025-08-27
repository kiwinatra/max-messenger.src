package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: qw2  reason: default package */
public final class qw2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ tw2 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qw2(tw2 tw2, Continuation continuation) {
        super(2, continuation);
        this.b = tw2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qw2 qw2 = new qw2(this.b, continuation);
        qw2.a = obj;
        return qw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qw2) create((jz9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        jz9 jz9 = (jz9) this.a;
        is9 is9 = (is9) this.b.z0.getValue();
        is9.getClass();
        if (!jz9.b()) {
            List b2 = is9.b(jz9);
            if (!b2.isEmpty()) {
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, "MissedContactsController", wj6.k("requestForChatListScreen: ids=[", CollectionsKt___CollectionsKt.joinToString$default(b2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null), "]"), (Throwable) null);
                }
                is9.j().d(b2);
            }
        }
        return Unit.INSTANCE;
    }
}

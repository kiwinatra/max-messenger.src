package defpackage;

import android.os.Bundle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: ou2  reason: default package */
public final class ou2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListSearchScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ou2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.b = chatsListSearchScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ou2 ou2 = new ou2(continuation, this.b);
        ou2.a = obj;
        return ou2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ou2) create((v5a) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        kr7.z(this.b);
        if (v5a instanceof a4b) {
            ox2 ox2 = ox2.b;
            long longValue = ((Number) ((a4b) v5a).a).longValue();
            ta4 W0 = ox2.W0();
            W0.b(":settings/folder/by-chat?id=" + longValue, (Bundle) null);
        } else if (v5a instanceof rt9) {
            ox2.b.W0().b(wj6.j(((Number) ((rt9) v5a).a).longValue(), ":profile/pick-admin?id=", "&type=channel"), (Bundle) null);
        } else if (v5a instanceof pa4) {
            ox2.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}

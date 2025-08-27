package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: nu2  reason: default package */
public final /* synthetic */ class nu2 extends AdaptedFunctionReference implements Function3, SuspendFunction {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        Continuation continuation = (Continuation) obj3;
        KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
        ((ChatsListSearchScreen) this.receiver).getClass();
        return iu2.$EnumSwitchMapping$1[((vu2) obj2).a.ordinal()] == 2 ? list : CollectionsKt.emptyList();
    }
}

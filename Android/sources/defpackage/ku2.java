package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.search.ChatsListSearchScreen;

/* renamed from: ku2  reason: default package */
public final class ku2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListSearchScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ku2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.b = chatsListSearchScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ku2 ku2 = new ku2(continuation, this.b);
        ku2.a = obj;
        return ku2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ku2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        vu2 vu2 = (vu2) this.a;
        ChatsListSearchScreen chatsListSearchScreen = this.b;
        KProperty[] kPropertyArr = ChatsListSearchScreen.F0;
        chatsListSearchScreen.getClass();
        Class<ChatsListSearchScreen> cls = ChatsListSearchScreen.class;
        String name = cls.getName();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            a67.d(w78, name, "updateState " + vu2, (Throwable) null);
        }
        int ordinal = vu2.a.ordinal();
        if (ordinal == 0) {
            chatsListSearchScreen.c0();
            chatsListSearchScreen.w0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.y0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.x0.G(CollectionsKt.listOf(e38.a));
        } else if (ordinal == 2) {
            z77 z77 = vu2.c;
            boolean z = vu2.e;
            chatsListSearchScreen.x0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.w0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.y0.G(CollectionsKt.emptyList());
            String name2 = cls.getName();
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                a672.d(w78.o, name2, a81.m("idleSearchData.recentContacts = ", CollectionsKt___CollectionsKt.joinToString$default(z77.a, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)), (Throwable) null);
            }
            chatsListSearchScreen.z.H(CollectionsKt.listOf(z77.a), new hu2(z, chatsListSearchScreen, z77));
            z5a.g((z5a) chatsListSearchScreen.b.getValue(), jgd.CHATS_LIST_SEARCH_INITIAL);
        } else if (ordinal == 3) {
            List list = vu2.d;
            boolean z2 = vu2.e;
            chatsListSearchScreen.x0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.c0();
            chatsListSearchScreen.y0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.w0.H(list, new c70(z2, (Object) chatsListSearchScreen, 8));
            z5a.g((z5a) chatsListSearchScreen.b.getValue(), jgd.CHATS_LIST_SEARCH_RESULT);
        } else if (ordinal == 4) {
            chatsListSearchScreen.x0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.c0();
            chatsListSearchScreen.w0.G(CollectionsKt.emptyList());
            chatsListSearchScreen.y0.H(CollectionsKt.listOf(y45.a), new pr1(15, chatsListSearchScreen));
            z5a.g((z5a) chatsListSearchScreen.b.getValue(), jgd.CHATS_LIST_SEARCH_RESULT);
        }
        return Unit.INSTANCE;
    }
}

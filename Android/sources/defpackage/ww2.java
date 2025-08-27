package defpackage;

import android.view.View;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import one.me.chats.list.ChatsListWidget;

/* renamed from: ww2  reason: default package */
public final class ww2 extends SuspendLambda implements Function5 {
    public /* synthetic */ ss2 a;
    public /* synthetic */ List b;
    public /* synthetic */ List c;
    public /* synthetic */ List o;
    public final /* synthetic */ ChatsListWidget v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ww2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(5, continuation);
        this.v = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ww2 ww2 = new ww2((Continuation) obj5, this.v);
        ww2.a = (ss2) obj;
        ww2.b = (List) obj2;
        ww2.c = (List) obj3;
        ww2.o = (List) obj4;
        return ww2.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ss2 ss2 = this.a;
        List list = this.b;
        List list2 = this.c;
        List list3 = this.o;
        ss2 ss22 = ss2.c;
        ChatsListWidget chatsListWidget = this.v;
        if (ss2 == ss22) {
            chatsListWidget.y0.G(CollectionsKt.emptyList());
        } else {
            chatsListWidget.y0.G(list);
        }
        chatsListWidget.x0.G(ss2.a);
        View view = chatsListWidget.getView();
        boolean z = ss2.b;
        if (view != null) {
            chatsListWidget.e0().setRefreshingNext(z);
        }
        chatsListWidget.z0.G(list2);
        t56 t56 = chatsListWidget.A0;
        if (z) {
            t56.G(CollectionsKt.emptyList());
        } else if (Intrinsics.areEqual((Object) chatsListWidget.b, (Object) "all.chat.folder")) {
            t56.G(list3);
        }
        return Unit.INSTANCE;
    }
}

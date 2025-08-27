package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: wj2  reason: default package */
public final class wj2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMembersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wj2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.b = chatMembersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wj2 wj2 = new wj2(continuation, this.b);
        wj2.a = obj;
        return wj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wj2) create((rj2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        rj2 rj2 = (rj2) this.a;
        KProperty[] kPropertyArr = ChatMembersScreen.X;
        ChatMembersScreen chatMembersScreen = this.b;
        chatMembersScreen.f0().setTitle(rj2.a);
        chatMembersScreen.f0().setSubtitle(rj2.b.a(chatMembersScreen.getContext()));
        chatMembersScreen.f0().setRightActions(rj2.c ? new u2b(new c3b(chatMembersScreen), new a3b(cad.G, new vj2(chatMembersScreen, 2))) : new u2b((d3b) null, new c3b(chatMembersScreen)));
        String str = (String) chatMembersScreen.e0().X.a.getValue();
        if (str != null) {
            pza searchView = chatMembersScreen.f0().getSearchView();
            if (searchView != null) {
                searchView.setExpandWithAnimation(false);
            }
            pza searchView2 = chatMembersScreen.f0().getSearchView();
            if (searchView2 != null && searchView2.z) {
                searchView2.c();
                Lazy lazy = searchView2.A0;
                if (lazy.isInitialized()) {
                    ((AppCompatEditText) lazy.getValue()).setText(str);
                }
            }
            pza searchView3 = chatMembersScreen.f0().getSearchView();
            if (searchView3 != null) {
                searchView3.setExpandWithAnimation(true);
            }
        }
        return Unit.INSTANCE;
    }
}

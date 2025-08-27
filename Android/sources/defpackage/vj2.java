package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: vj2  reason: default package */
public final /* synthetic */ class vj2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ vj2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    public final Object invoke(Object obj) {
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                KProperty[] kPropertyArr = ChatMembersScreen.X;
                chatMembersScreen.getRouter().C();
                return Unit.INSTANCE;
            case 1:
                ((Long) obj).getClass();
                KProperty[] kPropertyArr2 = ChatMembersScreen.X;
                return chatMembersScreen.d0().k();
            default:
                View view2 = (View) obj;
                KProperty[] kPropertyArr3 = ChatMembersScreen.X;
                i49 e0 = chatMembersScreen.e0();
                e0.x.setValue(SetsKt.emptySet());
                return Unit.INSTANCE;
        }
    }
}

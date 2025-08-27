package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: uj2  reason: default package */
public final /* synthetic */ class uj2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ uj2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    public final Object invoke() {
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMembersScreen.X;
                return new lk2(62, chatMembersScreen.c0(), false);
            case 1:
                KProperty[] kPropertyArr2 = ChatMembersScreen.X;
                s01 s01 = new s01(chatMembersScreen.d0(), 6);
                long c0 = chatMembersScreen.c0();
                jxb jxb = jxb.a;
                return new i49((Function1) new vj2(chatMembersScreen, 1), (gh4) new z9(c0, jxb.c(), jxb.getAccessor().h(ptb.class), jxb.d(), jxb.getAccessor().h(ttb.class), 1), (Function0) s01);
            default:
                KProperty[] kPropertyArr3 = ChatMembersScreen.X;
                String str = chatMembersScreen.o;
                long c02 = chatMembersScreen.c0();
                String string = chatMembersScreen.getArgs().getString("profile:memberslist:type");
                if (string == null) {
                    string = "";
                }
                return new MembersListWidget(str, new w39(c02, ij2.valueOf(string), (Integer) null, 12), (DefaultConstructorMarker) null);
        }
    }
}

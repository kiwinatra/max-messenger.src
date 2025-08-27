package defpackage;

import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* renamed from: lj2  reason: default package */
public final /* synthetic */ class lj2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ lj2(AdaptedFunctionReference adaptedFunctionReference, int i) {
        this.a = i;
        this.b = (Function1) adaptedFunctionReference;
    }

    public final void accept(Object obj) {
        Function1 function1 = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMembersCompactWidget.x;
                function1.invoke(obj);
                return;
            case 1:
                KProperty[] kPropertyArr2 = ChatsListSearchScreen.F0;
                function1.invoke(obj);
                return;
            case 2:
                KProperty[] kPropertyArr3 = ChatsListWidget.I0;
                function1.invoke(obj);
                return;
            case 3:
                KProperty[] kPropertyArr4 = ChatsListWidget.I0;
                function1.invoke(obj);
                return;
            case 4:
                KProperty[] kPropertyArr5 = ContactListWidget.N0;
                function1.invoke(obj);
                return;
            case 5:
                KProperty[] kPropertyArr6 = MessagesListWidget.R0;
                function1.invoke(obj);
                return;
            case 6:
                KProperty[] kPropertyArr7 = MessagesListWidget.R0;
                function1.invoke(obj);
                return;
            case 7:
                function1.invoke(obj);
                return;
            case 8:
                function1.invoke(obj);
                return;
            case 9:
                function1.invoke(obj);
                return;
            case 10:
                KProperty[] kPropertyArr8 = StickersScreen.Y;
                function1.invoke(obj);
                return;
            default:
                KProperty[] kPropertyArr9 = StickersSettingsScreen.w;
                function1.invoke(obj);
                return;
        }
    }
}

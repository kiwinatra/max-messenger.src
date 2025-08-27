package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* renamed from: kj2  reason: default package */
public final /* synthetic */ class kj2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersCompactWidget b;

    public /* synthetic */ kj2(ChatMembersCompactWidget chatMembersCompactWidget, int i) {
        this.a = i;
        this.b = chatMembersCompactWidget;
    }

    public final Object invoke() {
        ChatMembersCompactWidget chatMembersCompactWidget = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMembersCompactWidget.x;
                return new lk2(60, chatMembersCompactWidget.c0(), true);
            default:
                KProperty[] kPropertyArr2 = ChatMembersCompactWidget.x;
                s01 s01 = new s01(chatMembersCompactWidget.d0(), 5);
                long c0 = chatMembersCompactWidget.c0();
                jxb jxb = jxb.a;
                return new i49((Function1) new l(24, chatMembersCompactWidget), (gh4) new z9(c0, jxb.c(), jxb.getAccessor().h(ptb.class), jxb.d(), jxb.getAccessor().h(ttb.class), 1), (Function0) s01);
        }
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* renamed from: zj2  reason: default package */
public final class zj2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatMembersScreen.X;
                ((ChatMembersScreen) obj).e0().j();
                return Unit.INSTANCE;
            case 1:
                wn2.b.n1(((do2) ((eo2) obj)).a, false);
                return Unit.INSTANCE;
            case 2:
                return (js2) obj;
            case 3:
                return (Boolean) ((lg3) obj).W1.invoke();
            case 4:
                return Class.forName((String) obj);
            default:
                KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                en9 k0 = ((MessagesListWidget) obj).k0();
                gpe gpe = (gpe) k0.y1.getValue();
                if (gpe != null) {
                    ((jqg) k0.S0.getValue()).a(new yud(new xud(1, k0.b.a, gpe.a)));
                }
                qc7 qc7 = (qc7) vi9.a.getAccessor().j(qc7.class);
                if (qc7 != null) {
                    qc7.f(SetsKt.setOf(new pc7(nc7.SEND_5_MESSAGES, 1), new pc7(nc7.SEND_3_STICKERS, 1)), jgd.CHAT);
                }
                return Unit.INSTANCE;
        }
    }
}

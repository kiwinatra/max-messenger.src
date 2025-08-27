package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: w11  reason: default package */
public final /* synthetic */ class w11 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ w11(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public final Object invoke() {
        long j = this.b;
        switch (this.a) {
            case 0:
                return new xg1(j);
            case 1:
                return new gk1(j);
            case 2:
                return new w31(j);
            case 3:
                KProperty[] kPropertyArr = ChatScreen.d1;
                wn2.b.n1(j, true);
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                return new vsc(j);
        }
    }
}

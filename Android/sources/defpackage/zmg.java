package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: zmg  reason: default package */
public final /* synthetic */ class zmg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zmg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Widget.binding$lambda$8((Function0) obj2, obj);
            default:
                ChatsListWidget chatsListWidget = (ChatsListWidget) obj2;
                Long l = (Long) obj;
                long longValue = l.longValue();
                KProperty[] kPropertyArr = ChatsListWidget.I0;
                if (longValue >= 0 && !chatsListWidget.f0().Q0.d(l)) {
                    String name = tw2.class.getName();
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.w, name, wj6.i(longValue, "drop chat #"), (Throwable) null);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: mn9  reason: default package */
public final class mn9 implements mj9 {
    public final /* synthetic */ MessagesListWidget a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hid d;
    public final /* synthetic */ Ref.ObjectRef e;

    public mn9(MessagesListWidget messagesListWidget, AtomicInteger atomicInteger, int i, hid hid, Ref.ObjectRef objectRef) {
        this.a = messagesListWidget;
        this.b = atomicInteger;
        this.c = i;
        this.d = hid;
        this.e = objectRef;
    }

    public final void b() {
        KProperty[] kPropertyArr = MessagesListWidget.R0;
        MessagesListWidget messagesListWidget = this.a;
        if (messagesListWidget.e0().w() != 0) {
            int i = this.c;
            if (this.b.compareAndSet(i, i + 1)) {
                MessagesListWidget.c0(messagesListWidget, this.d);
                ra3 ra3 = (ra3) this.e.element;
                if (ra3 != null) {
                    ((sa3) ra3).R(Unit.INSTANCE);
                }
            }
            messagesListWidget.e0().I.f(this);
        }
    }

    public final String getTag() {
        return "ScrollButton";
    }
}

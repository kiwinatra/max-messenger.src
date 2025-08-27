package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import one.me.sdk.arch.Widget;

/* renamed from: r5d  reason: default package */
public final /* synthetic */ class r5d implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ r5d(c6d c6d, String str, int i) {
        this.c = c6d;
        this.o = str;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                c6d c6d = (c6d) this.c;
                c6d.getClass();
                return c6d.h(c6d, (String) this.o, this.b, (Continuation) obj);
            default:
                return Widget.childRouter$lambda$10((Widget) this.c, this.b, (Function1) this.o, (e9d) obj);
        }
    }

    public /* synthetic */ r5d(Widget widget, int i, Function1 function1) {
        this.c = widget;
        this.b = i;
        this.o = function1;
    }
}

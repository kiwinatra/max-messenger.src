package defpackage;

import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: b99  reason: default package */
public final /* synthetic */ class b99 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ t89 b;
    public final /* synthetic */ d99 c;

    public /* synthetic */ b99(t89 t89, d99 d99) {
        this.b = t89;
        this.c = d99;
    }

    public final Object invoke(Object obj) {
        osc osc;
        qc7 qc7;
        qqc qqc;
        t89 t89 = this.b;
        d99 d99 = this.c;
        switch (this.a) {
            case 0:
                d99.V(t89, (String) obj);
                return Unit.INSTANCE;
            default:
                hqc hqc = (hqc) obj;
                long j = d99.H0;
                pn9 pn9 = (pn9) t89;
                pn9.getClass();
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                MessagesListWidget messagesListWidget = pn9.a;
                MessageModel d = ((wj9) messagesListWidget.k0().l1.getValue()).d(j);
                hqc hqc2 = null;
                if (d == null) {
                    osc = null;
                } else {
                    osc = new osc(hqc, d.a, d.b, d.y0);
                }
                if (osc != null) {
                    messagesListWidget.g0().j().p(osc);
                    xd9 xd9 = osc.d;
                    if (!(xd9 == null || (qqc = xd9.c) == null)) {
                        hqc2 = qqc.b;
                    }
                    if (!Intrinsics.areEqual((Object) hqc2, (Object) hqc) && (qc7 = (qc7) vi9.a.getAccessor().j(qc7.class)) != null) {
                        qc7.f(SetsKt.setOf(new pc7(nc7.ADD_2_REACTIONS, 1)), jgd.CHAT);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b99(d99 d99, t89 t89) {
        this.c = d99;
        this.b = t89;
    }
}

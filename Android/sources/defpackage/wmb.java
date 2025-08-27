package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: wmb  reason: default package */
public final class wmb implements al1 {
    public final dq1 a;
    public final umb b;
    public final Lazy c;
    public rf1 o;
    public final xme v;
    public final etc w;
    public final Lazy x;

    /* JADX WARNING: type inference failed for: r4v6, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public wmb(h9b h9b, dp1 dp1, dq1 dq1, umb umb, Lazy lazy) {
        dq1 dq12 = dq1;
        Lazy h = m21.a.getAccessor().h(cp1.class);
        Lazy h2 = oh1.a.getAccessor().h(ap1.class);
        this.a = dq12;
        this.b = umb;
        this.c = h;
        xme a2 = f6e.a(new v4b((zd0) null, (String) null, (ze1) null, false, false, true, (o0g) null, p0g.o, false, (CharSequence) null));
        this.v = a2;
        this.w = new etc(a2);
        Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lgb(17));
        this.x = lazy2;
        dq12.c(this);
        bs0.K(new ps5(((p6g) lazy2.getValue()).d, new SuspendLambda(2, (Continuation<Object>) null), 5), (d14) h.getValue());
        bs0.K(new i21(new i21(new ql8(((ap1) h2.getValue()).m, 27), ((v9b) h9b).Y, new sa(3, (Continuation) null, 29), 4), ((mp1) dp1).K, new ce1((Object) this, lazy, (Continuation) null, 6), 4), (d14) h.getValue());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        this.b.c();
        this.o = null;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: fn9  reason: default package */
public final /* synthetic */ class fn9 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ MessagesListWidget c;

    public /* synthetic */ fn9(Bundle bundle, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = bundle;
        this.c = messagesListWidget;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [gy8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v23, types: [java.lang.Object, we8] */
    public final Object invoke() {
        a07 a07;
        MessagesListWidget messagesListWidget = this.c;
        Bundle bundle = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                long j = bundle.getLong("ARG_CHAT_ID");
                long j2 = bundle.getLong("ARG_LOAD_MARK");
                long j3 = bundle.getLong("ARG_LOAD_MESSAGE_ID");
                Object obj = bundle.get("ARG_HIGHLIGHTS");
                List list = obj instanceof List ? (List) obj : null;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                go9 go9 = new go9(j, j2, j3, list, bundle.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle.getBoolean("ARG_SKIP_UNREAD_DECOR"));
                vi9 vi9 = vi9.a;
                zj9 zj9 = (zj9) vi9.getAccessor().g(zj9.class);
                bl4 bl4 = bl4.REGULAR;
                zj9.getClass();
                int ordinal = bl4.ordinal();
                if (ordinal == 0) {
                    a07 = ece.o;
                } else if (ordinal == 1) {
                    a07 = dbe.o;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                a07 a072 = a07;
                q4 q4Var = zj9.a;
                Context context = (Context) q4Var.g(Context.class);
                gaf gaf = (gaf) q4Var.g(gaf.class);
                Class<qx2> cls = qx2.class;
                Lazy h = q4Var.h(cls);
                Lazy h2 = q4Var.h(to9.class);
                Lazy h3 = q4Var.h(esb.class);
                Lazy h4 = q4Var.h(msa.class);
                Lazy h5 = q4Var.h(eu3.class);
                ? obj2 = new Object();
                obj2.o = j;
                obj2.a = bl4;
                obj2.b = a072;
                Lazy lazy = h5;
                Lazy lazy2 = h3;
                obj2.c = LazyKt.lazy(new j35(29, (Object) h, (Object) obj2));
                obj2.v = LazyKt.lazy(new sz0((Object) h, (Object) h2, (Object) obj2, 6));
                ez6 ez6 = obj2;
                kn5 kn5 = new kn5(wj6.i(j, "MessagesListLoader#"), (byte) 0);
                Lazy lazy3 = LazyKt.lazy(new sc2(context, q4Var, 3));
                Lazy lazy4 = LazyKt.lazy(new sc2(context, q4Var, 2));
                Class<cjd> cls2 = cjd.class;
                go9 go92 = go9;
                MessagesListWidget messagesListWidget2 = messagesListWidget;
                Lazy lazy5 = lazy3;
                Lazy lazy6 = lazy;
                vi9 vi92 = vi9;
                Lazy lazy7 = lazy4;
                Lazy lazy8 = lazy2;
                Lazy lazy9 = h2;
                Class<qx2> cls3 = cls;
                Lazy h6 = q4Var.h(m95.class);
                Lazy lazy10 = lazy5;
                gaf gaf2 = gaf;
                long j4 = j;
                nx nxVar = new nx(j, gaf, bl4, a072, h, h6, h4, lazy9, q4Var.h(br6.class), (cjd) q4Var.g(cls2));
                Lazy lazy11 = h;
                ux uxVar = new ux(j4, bl4, (ocf) q4Var.g(ocf.class), new yj9(lazy11), (sa2) q4Var.g(sa2.class), (is9) q4Var.g(is9.class), nxVar, (cjd) q4Var.g(cls2));
                long j5 = j4;
                Lazy lazy12 = lazy10;
                gx gxVar = new gx(lazy11, lazy9, h4, q4Var.h(mq6.class), j5, gaf2, kn5, new cj9(j5, (sv0) q4Var.g(sv0.class), gaf2), lazy12, lazy7, (s04) q4Var.g(s04.class), new esa(lazy12, lazy7, lazy8, lazy6), ez6, nxVar, uxVar, (xe3) q4Var.g(xe3.class), 40, 15);
                Lazy h7 = vi92.getAccessor().h(ysc.class);
                Lazy h8 = vi92.getAccessor().h(cls3);
                Lazy lazyOf = LazyKt.lazyOf((fa9) vi92.getAccessor().g(fa9.class));
                Lazy h9 = vi92.getAccessor().h(qwa.class);
                ? obj3 = new Object();
                obj3.a = j5;
                obj3.b = we8.class.getName();
                obj3.c = h7;
                obj3.d = h8;
                obj3.e = lazyOf;
                obj3.f = h9;
                return new en9(go92, (lf1) messagesListWidget2.y.getValue(), gxVar, obj3);
            default:
                KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                return messagesListWidget.createViewModelLazy(vsc.class, new i76(26, new w11(bundle.getLong("ARG_CHAT_ID"), 4))).getValue();
        }
    }
}

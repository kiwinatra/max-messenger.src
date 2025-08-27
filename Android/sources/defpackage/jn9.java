package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: jn9  reason: default package */
public final class jn9 extends fzc {
    public int a = -1;
    public int b = -1;
    public final /* synthetic */ MessagesListWidget c;

    public jn9(MessagesListWidget messagesListWidget) {
        this.c = messagesListWidget;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        gid gid;
        LinearLayoutManager v = y7e.v(recyclerView);
        if (v != null) {
            int V0 = v.V0();
            int X0 = v.X0();
            if (V0 != -1 && X0 != -1) {
                if (V0 != this.a || X0 != this.b) {
                    this.a = V0;
                    this.b = X0;
                    KProperty[] kPropertyArr = MessagesListWidget.R0;
                    MessagesListWidget messagesListWidget = this.c;
                    en9 k0 = messagesListWidget.k0();
                    xj9 xj9 = messagesListWidget.v0;
                    lz7 lz7 = (lz7) CollectionsKt.getOrNull(((ov) xj9.o).f, V0);
                    MessageModel N = lz7 instanceof MessageModel ? (MessageModel) lz7 : lz7 instanceof x72 ? xj9.N(V0 + 1) : null;
                    MessageModel N2 = xj9.N(X0);
                    k0.getClass();
                    if (N != null && N2 != null && (gid = ((hid) k0.p1.a.getValue()).d) != null) {
                        long j = N.c;
                        long j2 = gid.b;
                        if (j <= j2 && j2 <= N2.c) {
                            ev0.v(k0.a, ((osa) k0.w).b(), (f14) null, new rl9(k0, (Continuation) null), 2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Only linear layout manger supported");
    }
}

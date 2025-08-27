package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;

/* renamed from: v9b  reason: default package */
public final class v9b implements h9b, al1 {
    public pm7 X;
    public final etc Y;
    public final cp1 a;
    public final um1 b;
    public final nc1 c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final AtomicReference x;
    public final n6e y;
    public pm7 z;

    public v9b(Lazy lazy, Lazy lazy2, cp1 cp1, ym1 ym1, nc1 nc1, Lazy lazy3, Lazy lazy4) {
        this.a = cp1;
        this.b = ym1;
        this.c = nc1;
        this.o = lazy;
        this.v = lazy4;
        this.w = lazy2;
        AtomicReference atomicReference = new AtomicReference(new i9b(y8b.c));
        this.x = atomicReference;
        n6e a2 = m5a.a(1, 1, cu0.b);
        this.y = a2;
        ((dq1) lazy3.getValue()).c(this);
        this.Y = bs0.X(new n9b(bs0.w(new n9b(new ql8(new on2(bs0.b0(a2, new b03(3, (Continuation) null, 5)), 28), 18), this, 1)), this, 2), cp1, z6e.b, atomicReference.get());
    }

    public final void a() {
        pm7 pm7 = this.z;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        this.z = null;
        pm7 pm72 = this.X;
        if (pm72 != null) {
            pm72.b((CancellationException) null);
        }
        this.X = null;
        if (this.x.get() != null) {
            e(new i9b(c()));
        }
    }

    public final y8b c() {
        return ((i9b) this.x.get()).a;
    }

    public final void d() {
        this.y.d(((jz3) this.o.getValue()).a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0006 A[LOOP:0: B:1:0x0006->B:4:0x0011, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.i9b r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.x
            java.lang.Object r0 = r2.get()
        L_0x0006:
            boolean r1 = r2.compareAndSet(r0, r3)
            if (r1 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.Object r1 = r2.get()
            if (r1 == r0) goto L_0x0006
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.e(i9b):void");
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        a();
    }

    public final void onCallParticipantsNetworkStatusChanged(List list) {
        d();
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        a();
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            d();
        }
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    public final void onParticipantsAdded(List list) {
        d();
    }

    public final void onParticipantsChanged(List list) {
        d();
    }

    public final void onParticipantsRemoved(List list) {
        d();
    }

    public final void onParticipantsUpdated(Collection collection) {
        d();
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        d();
    }
}

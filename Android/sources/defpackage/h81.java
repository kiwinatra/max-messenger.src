package defpackage;

import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: h81  reason: default package */
public final class h81 extends xag implements al1 {
    public final xme X;
    public final boolean b;
    public final long c;
    public final a21 o;
    public final dp1 v;
    public final dq1 w;
    public final hl1 x;
    public final m01 y;
    public final xme z;

    public h81(boolean z2, long j, String str, String str2, a21 a21, dp1 dp1, dq1 dq1, yva yva, hl1 hl1, m01 m01) {
        this.b = z2;
        this.c = j;
        this.o = a21;
        this.v = dp1;
        this.w = dq1;
        this.x = hl1;
        this.y = m01;
        xme a = f6e.a(new d81(new l21((Long) null, str, new zd0(new gd0(vua.a(str, yva), j), str2 != null ? new String(Base64.decode(str2, 0), StandardCharsets.UTF_8) : null)), z2, hl1.a(z2)));
        this.z = a;
        this.X = a;
        dq1.c(this);
        ev0.v(this.a, (CoroutineContext) null, (f14) null, new g81(this, (Continuation) null), 3);
    }

    public final void j() {
        xme xme;
        Object value;
        ((mp1) this.v).d();
        ((o01) this.y).e(true);
        id1.b.W0().b(":call-active?place=".concat(""), (Bundle) null);
        do {
            xme = this.z;
            value = xme.getValue();
            f81 f81 = (f81) value;
        } while (!xme.b(value, new e81(true)));
    }

    public final void onCallAccepted() {
        xme xme;
        Object value;
        super.onCallAccepted();
        do {
            xme = this.z;
            value = xme.getValue();
            f81 f81 = (f81) value;
        } while (!xme.b(value, new e81(true)));
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        xme xme;
        Object value;
        do {
            xme = this.z;
            value = xme.getValue();
            f81 f81 = (f81) value;
        } while (!xme.b(value, new e81(false)));
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        xme xme;
        Object value;
        do {
            xme = this.z;
            value = xme.getValue();
            f81 f81 = (f81) value;
        } while (!xme.b(value, new e81(true)));
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }
}

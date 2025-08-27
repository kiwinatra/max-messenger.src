package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;

/* renamed from: hp1  reason: default package */
public final class hp1 implements al1 {
    public final /* synthetic */ mp1 a;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ Lazy c;
    public final /* synthetic */ Lazy o;
    public final /* synthetic */ Lazy v;

    public hp1(mp1 mp1, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = mp1;
        this.b = lazy;
        this.c = lazy2;
        this.o = lazy3;
        this.v = lazy4;
    }

    public final void onCallAccepted() {
        Object value;
        s44 i;
        super.onCallAccepted();
        ((h5d) this.b.getValue()).b();
        ((o01) ((m01) this.c.getValue())).a(CallsAudioManager.State.CONVERSATION);
        mp1 mp1 = this.a;
        xme xme = mp1.J;
        do {
            value = xme.getValue();
            s44 s44 = (s44) value;
            i = mp1.i();
            if (!i.f) {
                mp1.z(true);
            }
        } while (!xme.b(value, s44.a(i, (ld9) null, System.currentTimeMillis(), (String) null, (String) null, false, false, false, (oub) null, (me5) null, 1021)));
        if (mp1.j().f) {
            for (fk1 onCallAccepted : mp1.I) {
                onCallAccepted.onCallAccepted();
            }
            ((nj1) this.o.getValue()).getClass();
            nj1.d((Context) this.v.getValue());
        }
    }

    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        mp1.b(this.a, conversationEndInfo.getReason());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        mp1 mp1 = this.a;
        me5 me5 = mp1.i().j;
        if (!(me5 instanceof he5) && !(me5 instanceof ge5) && !(me5 instanceof ie5)) {
            mp1.b(mp1, conversationDestroyedInfo.getReason());
        }
        mp1.x();
        for (fk1 b2 : mp1.I) {
            b2.b();
        }
    }

    public final void onJoinLinkUpdated(String str) {
        Object value;
        Object value2;
        mp1 mp1 = this.a;
        ld9 ld9 = mp1.i().a;
        if (ld9 != null) {
            boolean z = ld9 instanceof el1;
            xme xme = mp1.J;
            if (z) {
                do {
                    value2 = xme.getValue();
                    s44 s44 = (s44) value2;
                } while (!xme.b(value2, s44.a(mp1.i(), new el1(str, ((el1) ld9).s), 0, (String) null, str, false, false, false, (oub) null, (me5) null, 1014)));
                return;
            }
            do {
                value = xme.getValue();
                s44 s442 = (s44) value;
            } while (!xme.b(value, s44.a(mp1.i(), (ld9) null, 0, (String) null, str, false, false, false, (oub) null, (me5) null, 1015)));
        }
    }

    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        this.a.z(connectedInfo.isFirstConnection());
    }

    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Object value;
        mp1 mp1 = this.a;
        xme xme = mp1.J;
        do {
            value = xme.getValue();
            s44 s44 = (s44) value;
        } while (!xme.b(value, s44.a(mp1.i(), (ld9) null, 0, (String) null, (String) null, false, false, false, (oub) null, le5.b, 511)));
        Unit unit = Unit.INSTANCE;
        h5d t = mp1.t();
        t.getClass();
        t.c = g5d.CONNECTING;
        tg1 a2 = t.a();
        if (((Boolean) a2.f.getValue()).booleanValue()) {
            a2.a(a2.b.d, true);
        }
    }

    public final void onParticipantsAdded(List list) {
        mp1.c(this.a);
    }

    public final void onParticipantsChanged(List list) {
        mp1.c(this.a);
    }

    public final void onParticipantsRemoved(List list) {
        mp1.c(this.a);
    }

    public final void onParticipantsUpdated(Collection collection) {
        mp1.c(this.a);
    }
}

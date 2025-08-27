package defpackage;

import kotlin.reflect.KProperty;

/* renamed from: qfa  reason: default package */
public final class qfa implements s98 {
    public static final /* synthetic */ KProperty[] y;
    public static final String z;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 o;
    public final hs7 v;
    public final hs7 w;
    public final ifg x = new ifg();

    static {
        Class<qfa> cls = qfa.class;
        y = new KProperty[]{wj6.p(cls, "notificationsReadMarksRepository", "getNotificationsReadMarksRepository()Lru/ok/tamtam/android/notifications/messages/newpush/readmarks/NotificationsReadMarksRepository;", 0), wj6.p(cls, "singleScheduler", "getSingleScheduler()Lio/reactivex/rxjava3/core/Scheduler;", 0), wj6.p(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0), wj6.p(cls, "clientPrefs", "getClientPrefs()Lru/ok/tamtam/prefs/ClientPrefs;", 0), wj6.p(cls, "notificationsListener", "getNotificationsListener()Lru/ok/tamtam/notifications/NotificationsListener;", 0), wj6.p(cls, "notificationsTracker", "getNotificationsTracker()Lru/ok/tamtam/android/notifications/messages/tracker/NotificationsTracker;", 0)};
        z = cls.getName();
    }

    public qfa(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.o = hs74;
        this.v = hs75;
        this.w = hs76;
    }

    public final void a() {
        this.x.d();
    }

    public final wbe b(long j, long j2) {
        KProperty kProperty = y[0];
        mfa mfa = (mfa) this.a.get();
        uea uea = new uea(j, j2);
        mfa.getClass();
        KProperty kProperty2 = mfa.c[0];
        return new wbe(((j6d) mfa.a.get()).n().i(u9a.w), new ch2(19, uea), 0);
    }

    public final r62 c() {
        KProperty kProperty = y[2];
        return (r62) this.c.get();
    }

    public final void d(long j, long j2) {
        StringBuilder n = tr1.n(j, "onSelfReadMarkChanged: chatId=", ", mark=");
        n.append(j2);
        z68.c(z, n.toString(), new Object[0]);
        bi8 bi8 = new bi8(new ofa(this, j, 1));
        wh5 wh5 = new wh5(j, 7);
        gga gga = m58.f;
        wh8 wh8 = new wh8(1, new si8(bi8, gga, gga, wh5), new pfa(this, j2, 0));
        pfa pfa = new pfa(this, j2, 1);
        dj6 dj6 = m58.e;
        fi8 fi8 = new fi8(new si8(wh8, pfa, gga, dj6));
        KProperty kProperty = y[1];
        xa3 l = fi8.l((lfd) this.b.get());
        ao1 ao1 = new ao1(0, new yl4(j, 11), dj6);
        l.j(ao1);
        this.x.a(ao1);
    }

    public final void g(long j, long j2) {
        StringBuilder n = tr1.n(j, "onSelfReadMarkChangedByServerId: chatServerId=", ", mark=");
        n.append(j2);
        z68.c(z, n.toString(), new Object[0]);
        qi8 qi8 = new qi8(new wh8(1, new bi8(new ofa(this, j, 0)), new pfa(this, j2, 2)), new sh8(1, new ji5(j, this, j2)));
        pfa pfa = new pfa(this, j2, 3);
        gga gga = m58.f;
        dj6 dj6 = m58.e;
        fi8 fi8 = new fi8(new si8(qi8, pfa, gga, dj6));
        KProperty kProperty = y[1];
        xa3 l = fi8.l((lfd) this.b.get());
        ao1 ao1 = new ao1(0, new yl4(j, 13), dj6);
        l.j(ao1);
        this.x.a(ao1);
    }
}

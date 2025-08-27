package defpackage;

import java.util.Objects;

/* renamed from: n0g  reason: default package */
public final class n0g {
    public final Boolean a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final int o;
    public final int p;
    public final m0g q;
    public final int r;
    public final int s;
    public final Boolean t;
    public final Boolean u;
    public final int v;

    public n0g(l0g l0g) {
        this.a = l0g.a;
        this.b = l0g.b;
        this.c = l0g.c;
        this.d = l0g.d;
        this.e = l0g.e;
        this.f = l0g.f;
        this.g = l0g.g;
        this.h = l0g.h;
        this.i = l0g.i;
        this.j = l0g.j;
        this.k = l0g.k;
        this.l = l0g.l;
        this.m = l0g.m;
        this.n = l0g.n;
        this.o = l0g.o;
        this.p = l0g.p;
        this.q = l0g.q;
        this.r = l0g.r;
        this.s = l0g.s;
        this.t = l0g.t;
        this.u = l0g.u;
        this.v = l0g.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0g.class != obj.getClass()) {
            return false;
        }
        n0g n0g = (n0g) obj;
        return Objects.equals(this.a, n0g.a) && Objects.equals(this.b, n0g.b) && Objects.equals(this.c, n0g.c) && Objects.equals(this.d, n0g.d) && Objects.equals(this.e, n0g.e) && Objects.equals(this.f, n0g.f) && Objects.equals(this.g, n0g.g) && Objects.equals(this.h, n0g.h) && Objects.equals(this.i, n0g.i) && Objects.equals(this.j, n0g.j) && Objects.equals(this.k, n0g.k) && Objects.equals(this.l, n0g.l) && Objects.equals(this.m, n0g.m) && Objects.equals(this.n, n0g.n) && this.o == n0g.o && this.p == n0g.p && this.q == n0g.q && this.r == n0g.r && this.s == n0g.s && Objects.equals(this.t, n0g.t) && Objects.equals(this.u, n0g.u) && this.v == n0g.v;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, tr1.a(this.o), tr1.a(this.p), this.q, tr1.a(this.r), tr1.a(this.s), this.t, this.u, tr1.a(this.v)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSettings{pushNewContacts=");
        sb.append(this.a);
        sb.append(", dontDustirbUntil=");
        sb.append(this.b);
        sb.append(", dialogsPushNotification='");
        sb.append(this.c);
        sb.append("', chatsPushNotification='");
        sb.append(this.d);
        sb.append("', pushSound='");
        sb.append(this.e);
        sb.append("', dialogsPushSound='");
        sb.append(this.f);
        sb.append("', chatsPushSound='");
        sb.append(this.g);
        sb.append("', hiddenOnline=");
        sb.append(this.h);
        sb.append(", led=");
        sb.append(this.i);
        sb.append(", dialogsLed=");
        sb.append(this.j);
        sb.append(", chatsLed=");
        sb.append(this.k);
        sb.append(", vibration=");
        sb.append(this.l);
        sb.append(", dialogsVibration=");
        sb.append(this.m);
        sb.append(", chatsVibration=");
        sb.append(this.n);
        sb.append(", chatsInvite=");
        sb.append(wzf.q(this.o));
        sb.append(", incomingCall=");
        sb.append(wzf.q(this.p));
        sb.append(", inactiveTtl=");
        sb.append(this.q);
        sb.append(", groupChatCallNotificationStatus=");
        int i2 = this.r;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "OFF" : "ON");
        sb.append(", suggestStickersStatus=");
        int i3 = this.s;
        sb.append(i3 != 1 ? i3 != 2 ? "null" : "OFF" : "ON");
        sb.append(", audioTranscriptionEnabled=");
        sb.append(this.t);
        sb.append(", safeMode=");
        sb.append(this.u);
        sb.append(", searchByPhone=");
        sb.append(wzf.q(this.v));
        sb.append("}");
        return sb.toString();
    }
}

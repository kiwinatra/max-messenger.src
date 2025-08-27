package defpackage;

import javax.inject.Provider;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: l46  reason: default package */
public final /* synthetic */ class l46 implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ m46 b;

    public /* synthetic */ l46(m46 m46, int i) {
        this.a = i;
        this.b = m46;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return (j16) this.b.j.getValue();
            case 1:
                return (tld) this.b.m.getValue();
            case 2:
                return (u82) this.b.n.getValue();
            case 3:
                return (u82) this.b.n.getValue();
            case 4:
                return (jua) this.b.o.getValue();
            case 5:
                return (nd) this.b.q.getValue();
            case 6:
                return (gaf) this.b.r.getValue();
            case 7:
                return this.b.b;
            case 8:
                return (u82) this.b.n.getValue();
            case 9:
                return (nd) this.b.q.getValue();
            case 10:
                return (gaf) this.b.r.getValue();
            case 11:
                return (yva) this.b.d.getValue();
            case 12:
                return (jua) this.b.o.getValue();
            case 13:
                return (fq) this.b.p.getValue();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return (nd) this.b.q.getValue();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return (gaf) this.b.r.getValue();
            case 16:
                return (u82) this.b.n.getValue();
            case LangUtils.HASH_SEED /*17*/:
                return (nd) this.b.q.getValue();
            case 18:
                return (gaf) this.b.r.getValue();
            case 19:
                return (j16) this.b.j.getValue();
            case 20:
                return (rtb) this.b.g.getValue();
            case 21:
                return (jua) this.b.o.getValue();
            case 22:
                return (u82) this.b.n.getValue();
            case 23:
                return (nd) this.b.q.getValue();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return (gaf) this.b.r.getValue();
            case 25:
                return (j16) this.b.j.getValue();
            case 26:
                return (my6) this.b.l.getValue();
            default:
                return (r62) this.b.e.getValue();
        }
    }
}

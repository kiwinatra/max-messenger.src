package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: c10  reason: default package */
public final /* synthetic */ class c10 implements qk3, nsb, zi6, pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ c10() {
        this.a = 23;
        this.b = 0;
    }

    public void accept(Object obj) {
        long j = this.b;
        switch (this.a) {
            case 0:
                kr7.Q((j10) obj, d20.o, j);
                return;
            case 1:
                w62 w62 = (w62) obj;
                w62.L = j;
                w62.M = false;
                return;
            case 2:
                w62 w622 = (w62) obj;
                c72 a2 = w622.c().a();
                a2.a = j;
                w622.p = a2.b();
                return;
            case 3:
                w62 w623 = (w62) obj;
                c72 a3 = w623.c().a();
                a3.e = j;
                w623.p = a3.b();
                return;
            case 4:
                ((w62) obj).x = j;
                return;
            case 5:
                w62 w624 = (w62) obj;
                if (w624.Y < j || j == 0) {
                    w624.Y = j;
                    return;
                }
                return;
            case 6:
                w62 w625 = (w62) obj;
                g72 g72 = w625.n;
                bl4 bl4 = bl4.REGULAR;
                ArrayList j2 = hd8.j(g72, j, bl4);
                w625.n.d(bl4).clear();
                g72.e(bl4);
                w625.n.d(bl4).addAll(j2);
                g72.e(bl4);
                w625.Z = 0;
                z62 z62 = z62.f;
                w625.q = z62;
                w625.r = z62;
                w625.s = z62;
                w625.t = z62;
                w625.u = z62;
                w625.v = z62;
                w625.w = z62;
                l72 l72 = w625.b;
                if (l72 == l72.b || (l72 == l72.a && j == w625.k)) {
                    w625.j = 0;
                    w625.m = 0;
                    w625.q = null;
                    w625.r = null;
                    w625.u = null;
                    w625.t = null;
                    w625.s = null;
                    w625.v = null;
                    w625.w = null;
                    return;
                }
                return;
            case 7:
                w62 w626 = (w62) obj;
                if (w626.Z < j) {
                    w626.Z = j;
                    return;
                }
                return;
            case 8:
                ((w62) obj).f = j;
                return;
            case 9:
                ((w62) obj).A = j;
                return;
            case 10:
                w62 w627 = (w62) obj;
                c72 a4 = w627.c().a();
                a4.d = j;
                w627.p = a4.b();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((nm3) obj).t = j;
                return;
            case 16:
                ((nm3) obj).r = j;
                return;
            case LangUtils.HASH_SEED /*17*/:
                nm3 nm3 = (nm3) obj;
                nm3.j = 2;
                nm3.s = j;
                return;
            case 21:
                Locale locale = Locale.ENGLISH;
                z68.f("ai5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                return;
            case 22:
                Locale locale2 = Locale.ENGLISH;
                z68.f("mi5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                return;
            case 23:
                Locale locale3 = Locale.ENGLISH;
                z68.f("qi5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                return;
            case 26:
                Locale locale4 = Locale.ENGLISH;
                z68.f("vi5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                return;
            case 27:
                Throwable th = (Throwable) obj;
                Locale locale5 = Locale.ENGLISH;
                z68.e("j18", "Can't stop my location messageId = " + j);
                return;
            default:
                ((ypb) obj).seekTo(j);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                jc2 jc2 = (jc2) obj;
                jc2.getClass();
                return new qa3(2, new hc2(jc2, this.b, 1));
            case 13:
                jc2 jc22 = (jc2) obj;
                jc22.getClass();
                d7d a2 = d7d.a(1, "SELECT * FROM chat_location WHERE message_id=? ORDER BY message_time DESC");
                a2.k(1, this.b);
                return new bi8(new gc2(jc22, a2, 0));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                jc2 jc23 = (jc2) obj;
                jc23.getClass();
                return new qa3(2, new hc2(jc23, this.b, 0));
            case 18:
                return new na3(4, ((fi5) obj).a(), new lh5(3, this.b, true));
            case 19:
                List list = (List) obj;
                return list.isEmpty() ? lbe.h(Boolean.FALSE) : new oha(new oa3(4, lbe.h(list), new q0a(0)), new c10(this.b, 20));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                List list2 = (List) obj;
                return list2.isEmpty() ? lbe.h(Boolean.FALSE) : new oha(new oa3(4, lbe.h(list2), new q0a(0)), new c10(this.b, 25));
            default:
                xf9 xf9 = (xf9) obj;
                xf9.getClass();
                d7d a3 = d7d.a(1, "SELECT * FROM message_uploads WHERE message_id = ?");
                a3.k(1, this.b);
                return new bi8(new wf9(xf9, a3, 1));
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 11:
                return ((ov9) ((tdf) obj).f).x == this.b;
            case 20:
                return ((bqe) obj).a == this.b;
            default:
                return ((boe) obj).a == this.b;
        }
    }

    public /* synthetic */ c10(long j, int i) {
        this.a = i;
        this.b = j;
    }
}

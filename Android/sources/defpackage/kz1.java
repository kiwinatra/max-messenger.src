package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: kz1  reason: default package */
public final class kz1 extends gud implements hdb {
    public final long b;
    public final String c;
    public final long o;
    public final a20 v;
    public final long w;
    public final String x = kz1.class.getName();
    public kc3 y;

    public kz1(long j, String str, long j2, a20 a20, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.v = a20;
        this.w = j3;
    }

    public final void A() {
        kc3 kc3 = this.y;
        if (kc3 != null) {
            kc3.dispose();
        }
        this.y = null;
    }

    public final void B() {
        r62 e = e();
        long j = this.o;
        a32 G = e.G(j);
        if (G != null) {
            e().g0(j, x62.b);
            ((jna) a()).l(G.b.a);
        }
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        t().d(this.b);
        A();
    }

    public final byte[] d() {
        Tasks.ChangeChatPhoto changeChatPhoto = new Tasks.ChangeChatPhoto();
        changeChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeChatPhoto.file = str;
        changeChatPhoto.chatId = this.o;
        a20 a20 = this.v;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            changeChatPhoto.crop = rect;
        }
        changeChatPhoto.lastModified = this.w;
        return ad9.toByteArray(changeChatPhoto);
    }

    public final long getId() {
        return this.b;
    }

    public final idb getType() {
        return idb.TYPE_CHANGE_CHAT_PHOTO;
    }

    public final void y() {
        A();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, u05] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kc3] */
    public final void z() {
        ? obj = new Object();
        obj.b = this.c;
        obj.a = this.w;
        obj.c = xyf.PROFILE_PHOTO;
        kxf kxf = new kxf(obj);
        A();
        this.y = new Object();
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        jha e = ((jxf) hud.S.getValue()).e(kxf);
        jbf r = r();
        r.getClass();
        lja s = e.s(((kbf) r).a());
        or7 or7 = new or7(new xv1(11, (Object) this), new y35(11, (Object) this), m58.e);
        s.a(or7);
        kc3 kc3 = this.y;
        if (kc3 != null) {
            kc3.a(or7);
        }
    }
}

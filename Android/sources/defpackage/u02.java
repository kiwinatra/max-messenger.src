package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* renamed from: u02  reason: default package */
public final class u02 extends gud implements hdb {
    public final long b;
    public final String c;
    public final long o;
    public final a20 v;
    public final long w;
    public final String x;
    public or7 y;

    public u02(long j, String str, long j2, a20 a20, long j3) {
        this.b = j;
        this.c = str;
        this.o = j2;
        this.v = a20;
        this.w = j3;
        this.x = u02.class.getName();
    }

    public final int b() {
        return 1;
    }

    public final void c() {
    }

    public final byte[] d() {
        Tasks.ChangeProfileOrChatPhoto changeProfileOrChatPhoto = new Tasks.ChangeProfileOrChatPhoto();
        changeProfileOrChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeProfileOrChatPhoto.file = str;
        changeProfileOrChatPhoto.chatId = this.o;
        a20 a20 = this.v;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            changeProfileOrChatPhoto.crop = rect;
        }
        changeProfileOrChatPhoto.lastModified = this.w;
        return ad9.toByteArray(changeProfileOrChatPhoto);
    }

    public final int f() {
        return 1;
    }

    public final long getId() {
        return this.b;
    }

    public final idb getType() {
        return idb.TYPE_CHANGE_PROFILE_OR_CHAT_PHOTO;
    }

    public final void y() {
        or7 or7 = this.y;
        if (or7 != null) {
            qq4.a(or7);
        }
        this.y = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, u05] */
    public final void z() {
        ? obj = new Object();
        obj.b = this.c;
        obj.a = this.w;
        obj.c = xyf.PROFILE_PHOTO;
        kxf kxf = new kxf(obj);
        or7 or7 = this.y;
        if (or7 != null) {
            qq4.a(or7);
        }
        hud hud = this.a;
        if (hud == null) {
            hud = null;
        }
        jha e = ((jxf) hud.S.getValue()).e(kxf);
        jbf r = r();
        r.getClass();
        lja s = e.s(((kbf) r).a());
        or7 or72 = new or7(new er7(11, (Object) this), new wie(10, (Object) this), m58.e);
        s.a(or72);
        this.y = or72;
    }

    public /* synthetic */ u02(long j, String str, long j2, a20 a20) {
        this(j, str, j2, a20, cjf.C(str));
    }
}

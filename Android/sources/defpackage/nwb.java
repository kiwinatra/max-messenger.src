package defpackage;

import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: nwb  reason: default package */
public final class nwb extends qm implements lcf, hdb {
    public final String X;
    public final he0 Y;
    public final String o;
    public final String v;
    public final String w;
    public final long x;
    public final a20 y;
    public final String z;

    public nwb(long j, String str, String str2, String str3, long j2, a20 a20, String str4, String str5, he0 he0) {
        super(j);
        this.o = str;
        this.v = str2;
        this.w = str3;
        this.x = j2;
        this.y = a20;
        this.z = str4;
        this.X = str5;
        this.Y = he0;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.Profile profile = new Tasks.Profile();
        profile.requestId = this.a;
        profile.photoId = this.x;
        String str = this.o;
        if (!(str == null || str.length() == 0)) {
            profile.firstName = str;
        }
        String str2 = this.v;
        if (!(str2 == null || str2.length() == 0)) {
            profile.lastName = str2;
        }
        String str3 = this.w;
        if (!(str3 == null || str3.length() == 0)) {
            profile.photoToken = str3;
        }
        String str4 = this.z;
        if (!(str4 == null || str4.length() == 0)) {
            profile.description = str4;
        }
        String str5 = this.X;
        if (!(str5 == null || str5.length() == 0)) {
            profile.link = str5;
        }
        he0 he0 = this.Y;
        String str6 = he0.a;
        if (!(str6 == null || str6.length() == 0)) {
            profile.avatarType = he0.a;
        }
        a20 a20 = this.y;
        if (a20 != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = a20.b;
            rect.top = a20.c;
            rect.right = a20.d;
            rect.bottom = a20.e;
            profile.crop = rect;
        }
        return ad9.toByteArray(profile);
    }

    public final void e(ibf ibf) {
        ixb ixb = (ixb) ibf;
        ((ltb) q()).a.l("user.deviceAvatarPath", (String) null);
        m().D(CollectionsKt.listOf(ixb.c));
        sv0 k = k();
        fo3 fo3 = ixb.c;
        long j = this.a;
        k.c(new o1c(j, fo3));
        if (this.x != 0) {
            k().c(new pwb(j, ixb.c.w));
        }
    }

    public final fbf g() {
        jw9 jw9 = new jw9((x3b) null, 5);
        String str = this.o;
        if (str != null) {
            jw9.t("firstName", str);
        }
        String str2 = this.v;
        if (str2 != null) {
            jw9.t("lastName", str2);
        }
        String str3 = this.w;
        if (str3 != null) {
            jw9.t("photoToken", str3);
        }
        long j = this.x;
        if (j != 0) {
            jw9.p(j, "photoId");
        }
        a20 a20 = this.y;
        if (a20 != null) {
            jw9.s("crop", a20.a());
        }
        String str4 = this.z;
        String str5 = "";
        if (!cvg.A(str4)) {
            if (str4.equals("$REMOVE$")) {
                str4 = str5;
            }
            jw9.t("description", str4);
        }
        String str6 = this.X;
        if (!cvg.A(str6)) {
            if (!str6.equals("$REMOVE$")) {
                str5 = str6;
            }
            jw9.t("link", str5);
        }
        jw9.t("avatarType", this.Y.a);
        return jw9;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_PROFILE;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
        k().c(new hj0(qaf));
    }
}

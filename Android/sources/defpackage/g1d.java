package defpackage;

import kotlin.collections.CollectionsKt;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: g1d  reason: default package */
public final class g1d extends qm implements lcf, hdb {
    public final long o;

    public g1d(long j, long j2) {
        super(j);
        this.o = j2;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        long s = ((ltb) q()).a.s();
        if (s > 0) {
            ((jna) i()).x(s);
        }
        s().d(this.a);
    }

    public final byte[] d() {
        Tasks.RemoveContactPhoto removeContactPhoto = new Tasks.RemoveContactPhoto();
        removeContactPhoto.requestId = this.a;
        removeContactPhoto.photoId = this.o;
        return ad9.toByteArray(removeContactPhoto);
    }

    public final void e(ibf ibf) {
        h1d h1d = (h1d) ibf;
        ((ltb) q()).a.l("user.deviceAvatarPath", (String) null);
        m().D(CollectionsKt.listOf(h1d.c));
        k().c(new i1d(this.a, h1d.c));
    }

    public final fbf g() {
        jw9 jw9 = new jw9((x3b) null, 7);
        long j = this.o;
        if (j != 0) {
            jw9.p(j, "photoId");
            return jw9;
        }
        throw new IllegalArgumentException("photoId must not be 0");
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_REMOVE_CONTACT_PHOTO;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
        k().c(new hj0(this.a, qaf));
    }
}

package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: iw9  reason: default package */
public final class iw9 extends qm implements lcf, hdb {
    public final String o;
    public final long v;

    public iw9(long j, String str, long j2) {
        super(j);
        this.o = str;
        this.v = j2;
    }

    public final int b() {
        return 1;
    }

    public final void c() {
        s().d(this.a);
        ((a74) o().a).c.d().m(new iwf(this.v, (w28) null, 0));
    }

    public final byte[] d() {
        Tasks.MsgSharePreview msgSharePreview = new Tasks.MsgSharePreview();
        msgSharePreview.requestId = this.a;
        msgSharePreview.text = this.o;
        msgSharePreview.messageId = this.v;
        return ad9.toByteArray(msgSharePreview);
    }

    public final void e(ibf ibf) {
        kw9 kw9 = (kw9) ibf;
        long j = this.v;
        if (j != -1) {
            ha9 r = o().r(j);
            boolean isEmpty = kw9.c.isEmpty();
            rm rmVar = null;
            String str = this.o;
            if (isEmpty || r == null) {
                ((a74) o().a).c.d().m(new iwf(j, (w28) null, 0));
                if (r != null) {
                    String str2 = r.y;
                    if (!Intrinsics.areEqual((Object) str2, (Object) str) && str2 != null && str != null && !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                        o().B(this.v, g63.i(str2, "\n", str), (List) null, l(), qe9.ACTIVE);
                    }
                }
            } else {
                a00 a00 = kw9.c;
                rm rmVar2 = this.c;
                if (rmVar2 == null) {
                    rmVar2 = null;
                }
                o().y(r, qe8.g(a00, (bjd) rmVar2.I.getValue()));
                if (Intrinsics.areEqual((Object) r.y, (Object) str)) {
                    o().B(this.v, (String) null, (List) null, l(), qe9.ACTIVE);
                }
            }
            rm rmVar3 = this.c;
            if (rmVar3 != null) {
                rmVar = rmVar3;
            }
            rvd.A((jqg) rmVar.g.getValue());
        } else if (!kw9.c.isEmpty()) {
            k().c(new hr3(this.a, kw9.c));
        }
    }

    public final fbf g() {
        jw9 jw9 = new jw9((x3b) null, 0);
        jw9.t("text", this.o);
        return jw9;
    }

    public final long getId() {
        return this.a;
    }

    public final idb getType() {
        return idb.TYPE_MSG_SHARE_PREVIEW;
    }

    public final void h(qaf qaf) {
        if (!m58.A(qaf.b)) {
            c();
        }
    }
}

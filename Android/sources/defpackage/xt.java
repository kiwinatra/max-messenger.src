package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: xt  reason: default package */
public final class xt extends oi0 {
    public final long v;

    public xt(int i, long j, long j2) {
        super(j, i);
        this.v = j2;
    }

    public final byte[] d() {
        Tasks.AssetsAdd assetsAdd = new Tasks.AssetsAdd();
        assetsAdd.assetType = b.o(this.o);
        assetsAdd.id = this.v;
        assetsAdd.requestId = this.a;
        return ad9.toByteArray(assetsAdd);
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 0);
        int i = this.o;
        if (i != 0) {
            long j = this.v;
            if (j != 0) {
                ytVar.t("type", tr1.d(i));
                ytVar.p(j, "id");
                return ytVar;
            }
            throw new IllegalArgumentException("id must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final idb getType() {
        return idb.TYPE_ASSETS_ADD;
    }

    public final void t(ibf ibf) {
        zt ztVar = (zt) ibf;
        rm rmVar = null;
        if (ztVar.c) {
            u(ztVar.o);
            rm rmVar2 = this.c;
            if (rmVar2 != null) {
                rmVar = rmVar2;
            }
            rmVar.b().c(new ij0(this.a));
            return;
        }
        h(new qaf("asset.task.failed", "failed to add asset", (String) null));
    }
}

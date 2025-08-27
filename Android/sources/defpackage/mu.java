package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: mu  reason: default package */
public final class mu extends oi0 {
    public final long[] v;

    public mu(long[] jArr, int i, long j) {
        super(j, i);
        this.v = jArr;
    }

    public final byte[] d() {
        Tasks.AssetsRemove assetsRemove = new Tasks.AssetsRemove();
        assetsRemove.assetType = b.o(this.o);
        assetsRemove.ids = this.v;
        assetsRemove.requestId = this.a;
        return ad9.toByteArray(assetsRemove);
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 5);
        int i = this.o;
        if (i != 0) {
            long[] jArr = this.v;
            if (jArr == null || jArr.length == 0) {
                throw new IllegalArgumentException("ids must not be null or empty");
            }
            ytVar.t("type", tr1.d(i));
            ytVar.j("ids", jArr);
            return ytVar;
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final idb getType() {
        return idb.TYPE_ASSETS_REMOVE;
    }

    public final void t(ibf ibf) {
        nu nuVar = (nu) ibf;
        rm rmVar = null;
        if (nuVar.c) {
            u(nuVar.o);
            rm rmVar2 = this.c;
            if (rmVar2 != null) {
                rmVar = rmVar2;
            }
            rmVar.b().c(new ij0(this.a));
            return;
        }
        h(new qaf("asset.task.failed", "failed to remove asset", (String) null));
    }
}

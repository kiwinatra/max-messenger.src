package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: gu  reason: default package */
public final class gu extends oi0 {
    public final long[] v;
    public final long w;

    public gu(long j, int i, long[] jArr, long j2) {
        super(j, i);
        this.v = jArr;
        this.w = j2;
    }

    public final byte[] d() {
        Tasks.AssetsListModify assetsListModify = new Tasks.AssetsListModify();
        assetsListModify.assetType = b.o(this.o);
        assetsListModify.requestId = this.a;
        assetsListModify.ids = this.v;
        assetsListModify.modifyTime = this.w;
        return ad9.toByteArray(assetsListModify);
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 3);
        int i = this.o;
        if (i != 0) {
            long[] jArr = this.v;
            if (jArr != null) {
                ytVar.t("type", tr1.d(i));
                ytVar.j("ids", jArr);
                long j = this.w;
                if (j >= 0) {
                    ytVar.p(j, "updateTime");
                }
                return ytVar;
            }
            throw new IllegalArgumentException("ids must not be null");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final idb getType() {
        return idb.TYPE_ASSETS_LIST_MODIFY;
    }

    public final void t(ibf ibf) {
        hu huVar = (hu) ibf;
        rm rmVar = null;
        if (huVar.c) {
            u(huVar.o);
            rm rmVar2 = this.c;
            if (rmVar2 != null) {
                rmVar = rmVar2;
            }
            rmVar.b().c(new ij0(this.a));
            return;
        }
        h(new qaf("asset.task.failed", "failed to modify asset list", (String) null));
    }
}

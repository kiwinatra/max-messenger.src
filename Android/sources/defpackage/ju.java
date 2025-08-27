package defpackage;

import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: ju  reason: default package */
public final class ju extends oi0 {
    public final long v;
    public final long w;
    public final int x;

    public ju(long j, int i, long j2, long j3, int i2) {
        super(j, i);
        this.v = j2;
        this.w = j3;
        this.x = i2;
    }

    public final byte[] d() {
        Tasks.AssetsMove assetsMove = new Tasks.AssetsMove();
        assetsMove.assetType = b.o(this.o);
        assetsMove.id = this.v;
        assetsMove.requestId = this.a;
        assetsMove.prevId = this.w;
        assetsMove.position = this.x;
        return ad9.toByteArray(assetsMove);
    }

    public final fbf g() {
        yt ytVar = new yt((x3b) null, 4);
        int i = this.o;
        if (i != 0) {
            long j = this.v;
            if (j != 0) {
                long j2 = this.w;
                int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                int i3 = this.x;
                if (i2 > 0 || i3 >= 0) {
                    ytVar.t("type", tr1.d(i));
                    ytVar.p(j, "id");
                    if (i2 > 0) {
                        ytVar.p(j2, "prevId");
                    } else {
                        ytVar.h(i3, "position");
                    }
                    return ytVar;
                }
                throw new IllegalArgumentException("prevId or position must be set");
            }
            throw new IllegalArgumentException("id must not be null or empty");
        }
        throw new IllegalArgumentException("type must not be null");
    }

    public final idb getType() {
        return idb.TYPE_ASSETS_MOVE;
    }

    public final void t(ibf ibf) {
        ku kuVar = (ku) ibf;
        rm rmVar = null;
        if (kuVar.c) {
            u(kuVar.o);
            rm rmVar2 = this.c;
            if (rmVar2 != null) {
                rmVar = rmVar2;
            }
            rmVar.b().c(new ij0(this.a));
            return;
        }
        h(new qaf("asset.task.failed", "failed to move asset", (String) null));
    }
}

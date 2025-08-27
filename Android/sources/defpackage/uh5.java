package defpackage;

import java.util.List;

/* renamed from: uh5  reason: default package */
public final /* synthetic */ class uh5 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ uh5(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final void run() {
        List list = this.b;
        switch (this.a) {
            case 0:
                z68.c("ai5", "onListUpdated: success store stickers sets=%s", list);
                return;
            case 1:
                z68.c("ai5", "onNotifRemoved: removed sticker sets %s from cache", list);
                return;
            case 2:
                z68.c("vi5", "onListUpdated: success store stickers %s", list);
                return;
            case 3:
                z68.c("vi5", "removeFromFavorites: ids=%s", list);
                return;
            case 4:
                z68.c("vi5", "onAssetsUpdate: success store stickers %s", list);
                return;
            case 5:
                z68.c("vi5", "onNotifRemoved: removed stickers %s from cache", list);
                return;
            case 6:
                z68.c("vqe", "storeStickerSets: success for sets = %s", list);
                return;
            default:
                z68.c("eef", "awaitNoTasksByTypes: finished for types=%s", list);
                return;
        }
    }
}

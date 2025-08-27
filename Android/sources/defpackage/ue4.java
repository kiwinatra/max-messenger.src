package defpackage;

import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ue4  reason: default package */
public final /* synthetic */ class ue4 implements x6 {
    public final /* synthetic */ int a;

    public /* synthetic */ ue4(int i) {
        this.a = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z68.a("ve4", "putEmoji: success store emoji");
                return;
            case 1:
                z68.a("ve4", "clear: cleared repository");
                return;
            case 2:
                z68.a("oh4", "loadRecentStickersAndGifs: completed");
                return;
            case 3:
                z68.a("oh4", "loadRecentEmojis: completed");
                return;
            case 4:
                z68.a("oh4", "loadFavoriteStickerSetsPages: completed");
                return;
            case 5:
                z68.a("oh4", "loadFavoriteStickersPage: completed");
                return;
            case 6:
                z68.a("ai5", "clear: cleared fav stickers repository");
                return;
            case 7:
                z68.a("ai5", "onAssetsUpdate: stored fav sticker sets");
                return;
            case 8:
                z68.a("vi5", "clear: cleared repository");
                return;
            case 9:
                z68.a("ruc", "clearRecentSearch: success");
                return;
            case 10:
                z68.c("gvc", "RECENT ADDED update handle success", new Object[0]);
                return;
            case 11:
                z68.c("gvc", "RECENT REMOVED update handle success", new Object[0]);
                return;
            case 12:
                z68.c("gvc", "Add to recents success", new Object[0]);
                return;
            case 13:
                nob nob = jbd.a;
                return;
            case Protos.Attaches.Attach.LOCATION:
                z68.a("moe", "Success update recents");
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                z68.a("moe", "clear: cleared repository");
                return;
            case 16:
                z68.a("vqe", "clear: repository cleared");
                return;
            case LangUtils.HASH_SEED:
                z68.a("jxf", "clear: cleared upload repository");
                return;
            default:
                z68.a("t4g", "clear: success");
                return;
        }
    }
}

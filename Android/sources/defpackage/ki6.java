package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.Locale;
import ru.ok.messages.stickers.FrgStickerPreview;
import ru.ok.messages.views.dialogs.FrgDlgFavoriteStickersLimit;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.stickers.favorite.FavoriteStickersController$MaxFavoriteStickersException;

/* renamed from: ki6  reason: default package */
public final /* synthetic */ class ki6 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgStickerPreview b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ki6(FrgStickerPreview frgStickerPreview, boolean z, int i) {
        this.a = i;
        this.b = frgStickerPreview;
        this.c = z;
    }

    public final void accept(Object obj) {
        boolean z = this.c;
        FrgStickerPreview frgStickerPreview = this.b;
        int i = this.a;
        Throwable th = (Throwable) obj;
        frgStickerPreview.getClass();
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                bqe bqe = frgStickerPreview.k2;
                z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Can't mark as favorite " + bqe, th);
                frgStickerPreview.l2 = z;
                frgStickerPreview.q3();
                frgStickerPreview.u2.r(th, frgStickerPreview.l2);
                return;
            default:
                Locale locale2 = Locale.ENGLISH;
                long j = frgStickerPreview.g2.a;
                z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Can't mark as favorite " + j, th);
                Context O1 = frgStickerPreview.O1();
                if (O1 != null) {
                    if (th instanceof FavoriteStickersController$MaxFavoriteStickersException ? true : !(th instanceof TamErrorException) ? false : "favorite.stickers.limit".equals(((TamErrorException) th).a.b)) {
                        int i2 = pad.h;
                        cud cud = ((qra) ((id3) frgStickerPreview.p1.b)).y().b;
                        cud.getClass();
                        String s = ghf.s(i2, (int) cud.r(PmsKey.f67maxfavoritestickers, (long) 100), O1);
                        FrgDlgFavoriteStickersLimit frgDlgFavoriteStickersLimit = new FrgDlgFavoriteStickersLimit();
                        Bundle bundle = new Bundle();
                        bundle.putString("ru.ok.tamtam.extra.TEXT", s);
                        frgDlgFavoriteStickersLimit.L2(bundle);
                        frgDlgFavoriteStickersLimit.d3(frgStickerPreview);
                        return;
                    }
                    String c2 = th instanceof TamErrorException ? fhf.c(O1, ((TamErrorException) th).a) : null;
                    if (TextUtils.isEmpty(c2)) {
                        c2 = frgStickerPreview.S1(z ? qad.F9 : qad.H9);
                    }
                    Toast makeText = Toast.makeText(O1, c2, 0);
                    frgStickerPreview.o2 = makeText;
                    makeText.show();
                    return;
                }
                return;
        }
    }
}

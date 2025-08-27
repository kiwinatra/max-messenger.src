package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.b;
import org.apache.http.HttpStatus;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.messages.stickers.FrgStickerPreview;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* renamed from: ji6  reason: default package */
public final /* synthetic */ class ji6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgStickerPreview b;

    public /* synthetic */ ji6(FrgStickerPreview frgStickerPreview, int i) {
        this.a = i;
        this.b = frgStickerPreview;
    }

    public final void onClick(View view) {
        FrgStickerPreview frgStickerPreview = this.b;
        switch (this.a) {
            case 0:
                frgStickerPreview.getClass();
                z68.a("ru.ok.messages.stickers.FrgStickerPreview", "On close click");
                q13 q13 = frgStickerPreview.a2;
                if (q13 != null) {
                    q13.i();
                    return;
                }
                return;
            case 1:
                frgStickerPreview.getClass();
                z68.a("ru.ok.messages.stickers.FrgStickerPreview", "On click draw sticker");
                ((nd) frgStickerPreview.r2.b).e("draw_sticker_promo_tap");
                b M1 = frgStickerPreview.M1();
                if (M1 == null) {
                    z68.e("ru.ok.messages.stickers.FrgStickerPreview", "Activity can't be null");
                    return;
                }
                q13 q132 = frgStickerPreview.a2;
                if (q132 != null) {
                    q132.i();
                }
                boolean z = frgStickerPreview.D2;
                int i = ActPhotoEditor.E0;
                Intent intent = new Intent(M1, ActPhotoEditor.class);
                intent.putExtra("photo_editor:draw_sticker_enabled", true);
                intent.putExtra("photo_editor:start_from_draw_sticker", true);
                intent.putExtra("photo_editor:is_drawing", true);
                intent.putExtra("photo_editor:regular_sending", z);
                M1.startActivityForResult(intent, 113);
                return;
            case 2:
                frgStickerPreview.getClass();
                z68.a("ru.ok.messages.stickers.FrgStickerPreview", "On close click");
                q13 q133 = frgStickerPreview.a2;
                if (q133 != null) {
                    q133.i();
                    return;
                }
                return;
            case 3:
                frgStickerPreview.getClass();
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "onFavoriteClick: ", new Object[0]);
                jbd.c(frgStickerPreview.m2);
                Toast toast = frgStickerPreview.o2;
                if (toast != null) {
                    toast.cancel();
                }
                z9f h = tr1.h((qra) ((id3) frgStickerPreview.p1.b));
                boolean z2 = !frgStickerPreview.q2;
                if (z2) {
                    d6a d6a = frgStickerPreview.r2;
                    ype ype = frgStickerPreview.Y1;
                    d6a.getClass();
                    String q = d6a.q(ype);
                    boolean isEmpty = TextUtils.isEmpty(q);
                    nd ndVar = (nd) d6a.b;
                    if (isEmpty) {
                        ndVar.e("STICKER_ADD_TO_FAVORITE");
                    } else {
                        ndVar.f("STICKER_ADD_TO_FAVORITE", q);
                    }
                } else {
                    d6a d6a2 = frgStickerPreview.r2;
                    ype ype2 = frgStickerPreview.Y1;
                    d6a2.getClass();
                    String q2 = d6a.q(ype2);
                    boolean isEmpty2 = TextUtils.isEmpty(q2);
                    nd ndVar2 = (nd) d6a2.b;
                    if (isEmpty2) {
                        ndVar2.e("STICKER_REMOVE_FROM_FAVORITE");
                    } else {
                        ndVar2.f("STICKER_REMOVE_FROM_FAVORITE", q2);
                    }
                }
                sjd sjd = (sjd) h;
                bb3 c = ((vi5) sjd.getAccessor().g(vi5.class)).c(frgStickerPreview.g2.a, z2);
                jbf z3 = sjd.z();
                z3.getClass();
                xa3 i2 = c.l(((kbf) z3).a()).i(((kbf) sjd.z()).c());
                ao1 ao1 = new ao1(0, new ki6(frgStickerPreview, z2, 1), new li6(frgStickerPreview, z2));
                i2.j(ao1);
                frgStickerPreview.m2 = ao1;
                return;
            case 4:
                if (frgStickerPreview.D2) {
                    z68.c("ru.ok.messages.stickers.FrgStickerPreview", "On send click", new Object[0]);
                    frgStickerPreview.p3((cl4) null);
                    return;
                }
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "onScheduledSendClick", new Object[0]);
                ScheduledSendPickerDialogFragment.f3(frgStickerPreview.Q1(), "ru.ok.messages.stickers.FrgStickerPreview");
                return;
            case 5:
                frgStickerPreview.getClass();
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "On forward click", new Object[0]);
                ((nd) frgStickerPreview.r2.b).e("STICKER_PREVIEW_FORWARD_CLICK");
                boe boe = frgStickerPreview.g2;
                int i3 = u5.z0;
                Intent intent2 = new Intent(frgStickerPreview.O1(), u5.class);
                if (boe != null) {
                    intent2.putExtra("ru.ok.tamtam.extra.STICKER", new kpe(boe));
                }
                frgStickerPreview.S2(intent2, HttpStatus.SC_SWITCHING_PROTOCOLS, (Bundle) null);
                return;
            case 6:
                frgStickerPreview.getClass();
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "onScheduledSendClick", new Object[0]);
                ScheduledSendPickerDialogFragment.f3(frgStickerPreview.Q1(), "ru.ok.messages.stickers.FrgStickerPreview");
                return;
            case 7:
                frgStickerPreview.getClass();
                z68.a("ru.ok.messages.stickers.FrgStickerPreview", "On click sticker set header");
                if (frgStickerPreview.O1() != null && frgStickerPreview.k2 != null) {
                    frgStickerPreview.X2();
                    v6.U(frgStickerPreview.O1(), frgStickerPreview.k2.a, frgStickerPreview.b2, ype.SET, frgStickerPreview.D2);
                    return;
                }
                return;
            default:
                frgStickerPreview.getClass();
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "On add click", new Object[0]);
                jbd.c(frgStickerPreview.n2);
                if (frgStickerPreview.k2 != null) {
                    boolean z4 = frgStickerPreview.l2;
                    frgStickerPreview.l2 = !z4;
                    frgStickerPreview.q3();
                    Toast toast2 = frgStickerPreview.o2;
                    if (toast2 != null) {
                        toast2.cancel();
                    }
                    if (frgStickerPreview.l2) {
                        frgStickerPreview.r2.n(frgStickerPreview.Y1);
                    } else {
                        frgStickerPreview.r2.o(frgStickerPreview.Y1);
                    }
                    xa3 i4 = frgStickerPreview.d2.h(frgStickerPreview.k2.a, frgStickerPreview.l2).i(((kbf) frgStickerPreview.e2).c());
                    jbf jbf = frgStickerPreview.e2;
                    jbf.getClass();
                    xa3 l = i4.l(((kbf) jbf).a());
                    ao1 ao12 = new ao1(0, new ki6(frgStickerPreview, z4, 0), new b5(20, frgStickerPreview));
                    l.j(ao12);
                    frgStickerPreview.n2 = ao12;
                    return;
                }
                return;
        }
    }
}

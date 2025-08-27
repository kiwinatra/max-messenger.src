package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ru.ok.messages.stickers.FrgStickerPreview;

/* renamed from: mi6  reason: default package */
public final /* synthetic */ class mi6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgStickerPreview b;

    public /* synthetic */ mi6(FrgStickerPreview frgStickerPreview, int i) {
        this.a = i;
        this.b = frgStickerPreview;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FrgStickerPreview frgStickerPreview = this.b;
                if (!frgStickerPreview.h2) {
                    z68.a("ru.ok.messages.stickers.FrgStickerPreview", "Setup bottom sheet size");
                    Context O1 = frgStickerPreview.O1();
                    if (O1 != null) {
                        float y = frgStickerPreview.I1.getVisibility() == 0 ? frgStickerPreview.I1.getY() : frgStickerPreview.F1.getY();
                        float y2 = frgStickerPreview.D1.getY();
                        int i = ((qra) ((id3) frgStickerPreview.p1.b)).C().a.a;
                        wz3 wz3 = (wz3) frgStickerPreview.K1.getLayoutParams();
                        frgStickerPreview.m1.getClass();
                        int b2 = vo4.b((int) 61.0f);
                        int height = frgStickerPreview.B1.getHeight();
                        if (hn4.i(O1)) {
                            float f = (float) (height - frgStickerPreview.m1.b);
                            if (((float) b2) > ((float) height) - y) {
                                frgStickerPreview.L1.J((int) f);
                            } else {
                                frgStickerPreview.L1.J(b2);
                            }
                            wz3.height = (int) f;
                            wz3.width = frgStickerPreview.B1.getWidth() / 2;
                            wz3.c |= 8388613;
                            iq.M(frgStickerPreview.K1, frgStickerPreview.m1.b);
                        } else {
                            frgStickerPreview.L1.J((int) ((((double) i) * 1.5d) + ((double) b2)));
                            wz3.height = (int) ((((float) height) - (y - y2)) - ((float) (frgStickerPreview.m1.q * 2)));
                            wz3.width = -1;
                            iq.M(frgStickerPreview.K1, 0);
                        }
                        frgStickerPreview.K1.setLayoutParams(wz3);
                    }
                    if (frgStickerPreview.i2) {
                        int i2 = frgStickerPreview.j2;
                        if (i2 >= 0) {
                            d23 d23 = frgStickerPreview.T1;
                            List<qq7> list = ((ov) ((gv) d23.a).o).f;
                            tq7 tq7 = (tq7) d23.v;
                            Objects.requireNonNull(tq7);
                            ArrayList arrayList = new ArrayList(list.size());
                            for (qq7 a2 : list) {
                                try {
                                    arrayList.add(tq7.a(a2));
                                } catch (Throwable th) {
                                    throw new RuntimeException(th);
                                }
                            }
                            if (i2 < arrayList.size()) {
                                frgStickerPreview.R1.z0(frgStickerPreview.j2);
                            }
                        }
                    } else {
                        frgStickerPreview.L1.K(4);
                        frgStickerPreview.T2(y64.C(300, new mi6(frgStickerPreview, 1)));
                    }
                    frgStickerPreview.h2 = true;
                    return;
                }
                return;
            default:
                this.b.L1.I(false);
                return;
        }
    }
}

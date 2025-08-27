package defpackage;

import android.content.Context;
import android.os.Handler;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import ru.ok.messages.stickers.FrgStickerPreview;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ii6  reason: default package */
public final /* synthetic */ class ii6 implements qk3, zi6, u2f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgStickerPreview b;

    public /* synthetic */ ii6(FrgStickerPreview frgStickerPreview, int i) {
        this.a = i;
        this.b = frgStickerPreview;
    }

    public void accept(Object obj) {
        FrgStickerPreview frgStickerPreview = this.b;
        switch (this.a) {
            case 0:
                frgStickerPreview.E1.setEnabled(true);
                frgStickerPreview.q2 = ((Boolean) obj).booleanValue();
                frgStickerPreview.s3();
                return;
            case 2:
                frgStickerPreview.getClass();
                frgStickerPreview.B2 = ((Boolean) obj).booleanValue();
                return;
            case 3:
                Throwable th = (Throwable) obj;
                frgStickerPreview.B2 = false;
                return;
            case 4:
                frgStickerPreview.getClass();
                z68.f("ru.ok.messages.stickers.FrgStickerPreview", "setupFavoriteStickerObs: failed", (Throwable) obj);
                frgStickerPreview.E1.setEnabled(false);
                frgStickerPreview.q2 = false;
                frgStickerPreview.s3();
                return;
            case 5:
                List list = (List) obj;
                frgStickerPreview.k3();
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.add(0, frgStickerPreview.x2);
                    list = arrayList;
                }
                d23 d23 = frgStickerPreview.T1;
                ((tq7) d23.v).a = list;
                d23.t();
                frgStickerPreview.r3();
                frgStickerPreview.R1.setRefreshingNext(false);
                if (list.isEmpty() && frgStickerPreview.b2 > 0) {
                    frgStickerPreview.X2();
                    ConstraintLayout constraintLayout = frgStickerPreview.U1;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                frgStickerPreview.getClass();
                z68.f("ru.ok.messages.stickers.FrgStickerPreview", "load sticker suggest failed", (Throwable) obj);
                frgStickerPreview.k3();
                if (frgStickerPreview.b2 > 0) {
                    frgStickerPreview.X2();
                    ConstraintLayout constraintLayout2 = frgStickerPreview.U1;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                frgStickerPreview.Q1.setEnabled(true);
                frgStickerPreview.l2 = ((Boolean) obj).booleanValue();
                frgStickerPreview.q3();
                return;
            case 9:
                frgStickerPreview.getClass();
                Locale locale = Locale.ENGLISH;
                bqe bqe = frgStickerPreview.k2;
                z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Can't check isFavourite " + bqe, (Throwable) obj);
                frgStickerPreview.Q1.setEnabled(false);
                frgStickerPreview.l2 = false;
                frgStickerPreview.q3();
                return;
            case 10:
                bqe bqe2 = (bqe) obj;
                frgStickerPreview.getClass();
                long j = bqe2.d;
                ((ltb) frgStickerPreview.q1.u()).a.s();
                frgStickerPreview.k2 = bqe2;
                frgStickerPreview.X2();
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "Show sticker set %s", frgStickerPreview.k2);
                frgStickerPreview.O1.setText(frgStickerPreview.k2.b);
                int size = frgStickerPreview.k2.h.size();
                if (frgStickerPreview.k2.d <= 0) {
                    TextView textView = frgStickerPreview.P1;
                    textView.setText(String.format(textView.getContext().getResources().getQuantityString(pad.k, size), new Object[]{Integer.valueOf(size)}));
                } else {
                    TextView textView2 = frgStickerPreview.P1;
                    textView2.setText(String.format(textView2.getContext().getResources().getQuantityString(pad.l, size), new Object[]{Integer.valueOf(size), frgStickerPreview.f2.p(frgStickerPreview.k2.d, true).f()}));
                }
                d23 d232 = frgStickerPreview.T1;
                ((tq7) d232.v).a = frgStickerPreview.k2.h;
                d232.t();
                if (frgStickerPreview.k2.i) {
                    frgStickerPreview.q3();
                } else {
                    jbd.c(frgStickerPreview.t2);
                    lja s = frgStickerPreview.d2.d(frgStickerPreview.k2.a).s(((kbf) frgStickerPreview.e2).c());
                    jbf jbf = frgStickerPreview.e2;
                    jbf.getClass();
                    pka x = s.x(((kbf) jbf).a());
                    or7 or7 = new or7(new ii6(frgStickerPreview, 7), new ii6(frgStickerPreview, 9), m58.e);
                    x.a(or7);
                    frgStickerPreview.t2 = or7;
                }
                frgStickerPreview.r3();
                ConstraintLayout constraintLayout3 = frgStickerPreview.U1;
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(4);
                }
                frgStickerPreview.k3();
                vqe vqe = frgStickerPreview.c2;
                vqe.getClass();
                fce n = new mka(2, new hi5(vqe, bqe2.a, 2)).n(vqe.v);
                jbf jbf2 = frgStickerPreview.e2;
                jbf2.getClass();
                fce j2 = n.n(((kbf) jbf2).a()).j(((kbf) frgStickerPreview.e2).c());
                ao1 ao1 = new ao1(3, new ii6(frgStickerPreview, 14), new ii6(frgStickerPreview, 15));
                j2.l(ao1);
                frgStickerPreview.A2 = ao1;
                return;
            case 11:
                Throwable th2 = (Throwable) obj;
                frgStickerPreview.getClass();
                z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Failed to load sticker set", th2);
                if (th2 instanceof TamErrorException) {
                    hi7.b0(0, frgStickerPreview.G2(), fhf.c(frgStickerPreview.O1(), ((TamErrorException) th2).a));
                } else {
                    Context G2 = frgStickerPreview.G2();
                    int i = qad.u1;
                    Handler handler = hi7.j;
                    hi7.b0(0, G2, G2.getString(i));
                }
                frgStickerPreview.k3();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                frgStickerPreview.getClass();
                frgStickerPreview.C2 = ((Boolean) obj).booleanValue();
                return;
            default:
                Throwable th3 = (Throwable) obj;
                frgStickerPreview.C2 = false;
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return Boolean.valueOf(((List) obj).contains(Long.valueOf(this.b.g2.a)));
            default:
                bqe bqe = (bqe) obj;
                FrgStickerPreview frgStickerPreview = this.b;
                frgStickerPreview.getClass();
                if (bqe.d == 0) {
                    return jha.q(bqe);
                }
                ir3 ir3 = (ir3) ((sjd) tr1.h((qra) ((id3) frgStickerPreview.p1.b))).getAccessor().g(ir3.class);
                km3 km3 = ir3.a;
                km3.getClass();
                long j = bqe.d;
                return new oa3(0, new qa3(3, new wbe(new mka(1, new rj0(km3, j)).n(xfd.b()), new dr1((Object) ir3, j, 3), 2)), jha.q(bqe));
        }
    }

    public Object get() {
        int i = this.a;
        FrgStickerPreview frgStickerPreview = this.b;
        frgStickerPreview.getClass();
        switch (i) {
            case 12:
                return new ure(frgStickerPreview.x2.a, frgStickerPreview.q1.d(), frgStickerPreview.q1.x(), frgStickerPreview.e2, (gcf) frgStickerPreview.q1.getAccessor().g(gcf.class));
            default:
                return new ure(frgStickerPreview.x2.a, frgStickerPreview.q1.d(), frgStickerPreview.q1.x(), frgStickerPreview.e2, (gcf) frgStickerPreview.q1.getAccessor().g(gcf.class));
        }
    }
}

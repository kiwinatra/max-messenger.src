package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.reflect.KProperty;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.calls.views.CallGridView;
import ru.ok.messages.gallery.GalleryFragment;
import ru.ok.messages.stickers.FrgStickerPreview;

/* renamed from: k61  reason: default package */
public final class k61 extends fzc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    l61.k((l61) this.b);
                    return;
                }
                return;
            case 1:
                if (i == 0) {
                    ((sb0) this.b).e();
                    return;
                }
                return;
            case 3:
                for (fzc a2 : ((EndlessRecyclerView) this.b).X1) {
                    a2.a(recyclerView, i);
                }
                return;
            default:
                return;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        GridLayoutManager gridLayoutManager;
        int i3;
        i7b i7b;
        bpe bpe;
        lae listener;
        i7b i7b2;
        bpe bpe2;
        i7b i7b3;
        bpe bpe3;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                l61 l61 = (l61) obj;
                CallGridView callGridView = (CallGridView) l61.j;
                if (recyclerView.getScrollState() == 0) {
                    callGridView.getClass();
                    if (i == 0 && i2 == 0) {
                        l61.k(l61);
                        return;
                    }
                    return;
                }
                callGridView.b.getAdapterController();
                throw null;
            case 1:
                ((sb0) obj).e();
                return;
            case 2:
                r25 r25 = (r25) obj;
                if (r25.O0 != null && (gridLayoutManager = (GridLayoutManager) r25.J0.getLayoutManager()) != null) {
                    int S0 = gridLayoutManager.S0();
                    if (r25.M0.l(S0) == tic.view_type_emoji) {
                        pzc O = r25.J0.O(S0, false);
                        if ((O instanceof i15) && (i3 = ((e15) O.a.getTag()).a) != -1 && r25.I0.getSelectedTabPosition() != i3) {
                            r25.I0.m((o8f) r25.O0.get(i3), true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                for (fzc b2 : ((EndlessRecyclerView) obj).X1) {
                    b2.b(recyclerView, i, i2);
                }
                return;
            case 4:
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                jh5 jh5 = (jh5) obj;
                int computeVerticalScrollRange = jh5.B0.computeVerticalScrollRange();
                int i4 = jh5.A0;
                int i5 = computeVerticalScrollRange - i4;
                int i6 = jh5.a;
                jh5.C0 = i5 > 0 && i4 >= i6;
                int computeHorizontalScrollRange = jh5.B0.computeHorizontalScrollRange();
                int i7 = jh5.z0;
                boolean z = computeHorizontalScrollRange - i7 > 0 && i7 >= i6;
                jh5.D0 = z;
                boolean z2 = jh5.C0;
                if (z2 || z) {
                    if (z2) {
                        float f = (float) i4;
                        jh5.Z = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                        jh5.Y = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                    }
                    if (jh5.D0) {
                        float f2 = (float) i7;
                        jh5.x0 = (int) ((((f2 / 2.0f) + ((float) computeHorizontalScrollOffset)) * f2) / ((float) computeHorizontalScrollRange));
                        jh5.w0 = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
                    }
                    int i8 = jh5.E0;
                    if (i8 == 0 || i8 == 1) {
                        jh5.l(1);
                        return;
                    }
                    return;
                } else if (jh5.E0 != 0) {
                    jh5.l(0);
                    return;
                } else {
                    return;
                }
            case 5:
                if (i != 0 || i2 != 0) {
                    ((FrgStickerPreview) obj).m3();
                    return;
                }
                return;
            case 6:
                ((GalleryFragment) obj).E1.d().setTranslationY(-((float) recyclerView.computeVerticalScrollOffset()));
                return;
            case 7:
                if (i != 0 || i2 != 0) {
                    xag.h(((sr8) ((KeyboardStickersWidget) obj).b.getValue()).v, nr8.a);
                    return;
                }
                return;
            case 8:
                KProperty[] kPropertyArr = MediaGalleryWidget.x;
                om6 d0 = ((MediaGalleryWidget) obj).d0();
                d0.getClass();
                xag.h(d0.c, new mm6(-((float) recyclerView.computeVerticalScrollOffset())));
                return;
            case 9:
                jvc jvc = ((kvc) obj).P0;
                if (jvc == null) {
                    return;
                }
                if ((i != 0 || i2 != 0) && (i7b = (i7b) ((t26) jvc).z) != null && (bpe = ((cpe) i7b).G0) != null) {
                    bpe.f0();
                    return;
                }
                return;
            case 10:
                if ((i != 0 || i2 != 0) && (listener = ((nae) obj).getListener()) != null && (i7b2 = (i7b) ((t26) listener).z) != null && (bpe2 = ((cpe) i7b2).G0) != null) {
                    bpe2.f0();
                    return;
                }
                return;
            default:
                ipe ipe = ((jpe) obj).c;
                if (ipe == null) {
                    return;
                }
                if ((i != 0 || i2 != 0) && (i7b3 = (i7b) ((t26) ipe).z) != null && (bpe3 = ((cpe) i7b3).G0) != null) {
                    bpe3.f0();
                    return;
                }
                return;
        }
    }
}

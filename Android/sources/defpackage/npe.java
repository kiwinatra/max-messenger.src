package defpackage;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: npe  reason: default package */
public final /* synthetic */ class npe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ npe(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    public final Object invoke() {
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StickerPreviewScreen.v0;
                stickerPreviewScreen.getClass();
                KProperty kProperty = StickerPreviewScreen.v0[1];
                long longValue = ((Number) stickerPreviewScreen.a.a(stickerPreviewScreen)).longValue();
                sse sse = sse.a;
                return new upe(longValue, (gaf) sse.getAccessor().g(gaf.class), sse.getAccessor().h(moe.class), sse.getAccessor().h(bte.class), sse.getAccessor().h(vqe.class), sse.getAccessor().h(vi5.class), sse.getAccessor().h(ai5.class), sse.getAccessor().h(qx2.class), sse.getAccessor().h(jqg.class));
            case 1:
                KProperty[] kPropertyArr2 = StickerPreviewScreen.v0;
                hoe hoe = new hoe(stickerPreviewScreen.getContext());
                hoe.setId(h1b.f);
                int roundToInt = MathKt.roundToInt(((float) 160) * vo4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(roundToInt, roundToInt);
                layoutParams.gravity = 17;
                hoe.setLayoutParams(layoutParams);
                return hoe;
            default:
                KProperty[] kPropertyArr3 = StickerPreviewScreen.v0;
                pb8 pb8 = new pb8(stickerPreviewScreen.getContext());
                pb8.setId(h1b.e);
                int roundToInt2 = MathKt.roundToInt(((float) 160) * vo4.c().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(roundToInt2, roundToInt2);
                layoutParams2.gravity = 17;
                pb8.setLayoutParams(layoutParams2);
                return pb8;
        }
    }
}

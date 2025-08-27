package defpackage;

import android.os.Bundle;
import android.view.View;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: mpe  reason: default package */
public final /* synthetic */ class mpe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerPreviewScreen b;

    public /* synthetic */ mpe(StickerPreviewScreen stickerPreviewScreen, int i) {
        this.a = i;
        this.b = stickerPreviewScreen;
    }

    public final void onClick(View view) {
        StickerPreviewScreen stickerPreviewScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StickerPreviewScreen.v0;
                stickerPreviewScreen.getRouter().C();
                return;
            case 1:
                KProperty[] kPropertyArr2 = StickerPreviewScreen.v0;
                stickerPreviewScreen.getRouter().C();
                tse tse = tse.b;
                KProperty kProperty = StickerPreviewScreen.v0[2];
                long longValue = ((Number) stickerPreviewScreen.b.a(stickerPreviewScreen)).longValue();
                ta4 W0 = tse.W0();
                W0.b(":chats/forward?messages_ids=" + longValue, (Bundle) null);
                return;
            case 2:
                KProperty[] kPropertyArr3 = StickerPreviewScreen.v0;
                upe c0 = stickerPreviewScreen.c0();
                gpe gpe = (gpe) c0.w0.a.getValue();
                long j = c0.b;
                if (j > 0 && gpe != null && !Intrinsics.areEqual((Object) gpe, (Object) gpe.w0)) {
                    ((jqg) c0.X.getValue()).a(new yud(new xud(1, j, gpe.a)));
                    xag.h(c0.Y, p33.b);
                }
                qc7 qc7 = (qc7) sse.a.getAccessor().j(qc7.class);
                if (qc7 != null) {
                    qc7.f(SetsKt.setOf(new pc7(nc7.SEND_5_MESSAGES, 1), new pc7(nc7.SEND_3_STICKERS, 1)), jgd.CHAT);
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr4 = StickerPreviewScreen.v0;
                upe c02 = stickerPreviewScreen.c0();
                gpe gpe2 = (gpe) c02.w0.a.getValue();
                if (gpe2 != null && !Intrinsics.areEqual((Object) gpe2, (Object) gpe.w0)) {
                    aje u = ev0.u(c02.a, ((osa) c02.c).b(), f14.b, new spe(gpe2, c02, (Continuation) null));
                    c02.D0.setValue(c02, upe.F0[2], u);
                    return;
                }
                return;
        }
    }
}

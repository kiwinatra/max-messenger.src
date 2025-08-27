package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* renamed from: dqe  reason: default package */
public final /* synthetic */ class dqe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerSetBottomSheet b;

    public /* synthetic */ dqe(StickerSetBottomSheet stickerSetBottomSheet, int i) {
        this.a = i;
        this.b = stickerSetBottomSheet;
    }

    public final void onClick(View view) {
        e9d router;
        StickerSetBottomSheet stickerSetBottomSheet = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StickerSetBottomSheet.x0;
                zx3 parentController = stickerSetBottomSheet.getParentController();
                if (parentController != null && (router = parentController.getRouter()) != null) {
                    router.C();
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr2 = StickerSetBottomSheet.x0;
                upe upe = (upe) stickerSetBottomSheet.y.getValue();
                mqe mqe = (mqe) upe.A0.a.getValue();
                if (mqe != null) {
                    aje u = ev0.u(upe.a, ((osa) upe.c).b(), f14.b, new tpe(mqe, upe, (Continuation) null));
                    upe.E0.setValue(upe, upe.F0[3], u);
                    return;
                }
                return;
        }
    }
}

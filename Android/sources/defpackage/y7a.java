package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: y7a  reason: default package */
public final /* synthetic */ class y7a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ y7a(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    public final void onClick(View view) {
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
                neuroAvatarsScreen.getClass();
                OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.Z.getValue(neuroAvatarsScreen, NeuroAvatarsScreen.K0[7]);
                oneMeButton.setProgressEnabled(true);
                oneMeButton.setClickable(false);
                x8a h0 = neuroAvatarsScreen.h0();
                h0.o.b(((gqd) h0.Y.a.getValue()).a);
                return;
            default:
                KProperty[] kPropertyArr2 = NeuroAvatarsScreen.K0;
                if (neuroAvatarsScreen.e0() != null) {
                    Activity activity = neuroAvatarsScreen.getActivity();
                    if (activity != null) {
                        kr7.A(activity);
                    }
                    x8a h02 = neuroAvatarsScreen.h0();
                    h02.getClass();
                    List createListBuilder = CollectionsKt.createListBuilder();
                    int i = xgc.oneme_login_neuro_avatars_load_from_gallery_action;
                    igf igf = new igf(nlc.oneme_login_neuro_avatars_load_from_gallery_action);
                    og3 og3 = og3.c;
                    createListBuilder.add(new pg3(i, igf, og3));
                    createListBuilder.add(new pg3(xgc.oneme_login_neuro_avatars_take_photo_action, new igf(nlc.oneme_login_neuro_avatars_take_photo_action), og3));
                    if (((gqd) h02.Y.a.getValue()).a != null) {
                        createListBuilder.add(new pg3(xgc.oneme_login_neuro_avatars_remove_photo_action, new igf(nlc.oneme_login_neuro_avatars_remove_photo_action), og3.a));
                    }
                    createListBuilder.add(new pg3(xgc.oneme_login_neuro_avatars_cancel_action, new igf(nlc.oneme_login_neuro_avatars_cancel_action), og3.b));
                    List<pg3> build = CollectionsKt.build(createListBuilder);
                    e9d e9d = null;
                    ng3 a2 = b0h.a(new igf(nlc.oneme_login_neuro_avatars_bottomsheet_title), (Bundle) null, 6);
                    for (pg3 pg3 : build) {
                        a2.a(pg3);
                    }
                    KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
                    ConfirmationBottomSheet e = a2.e();
                    e.setTargetController(neuroAvatarsScreen);
                    zx3 zx3 = neuroAvatarsScreen;
                    while (zx3.getParentController() != null) {
                        zx3 = zx3.getParentController();
                    }
                    l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                    if (l9d != null) {
                        e9d = l9d.K();
                    }
                    e.p0(neuroAvatarsScreen);
                    if (e9d != null) {
                        i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                        a81.t(false, i9d, true, "BottomSheetWidget");
                        e9d.G(i9d);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

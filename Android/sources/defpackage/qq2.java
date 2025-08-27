package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: qq2  reason: default package */
public final /* synthetic */ class qq2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ qq2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    public final void onClick(View view) {
        String str;
        e9d e9d = null;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ChatTitleIconScreen.x0;
                Activity activity = chatTitleIconScreen.getActivity();
                if (activity != null) {
                    kr7.A(activity);
                }
                chatTitleIconScreen.h0().getClass();
                int i = f1b.b;
                igf igf = new igf(g1b.j);
                og3 og3 = og3.c;
                List<pg3> listOf = CollectionsKt.listOf(new pg3(i, igf, og3), new pg3(f1b.c, new igf(g1b.k), og3), new pg3(f1b.a, new igf(g1b.i), og3.b));
                KProperty[] kPropertyArr2 = BottomSheetWidget.v0;
                ng3 a2 = b0h.a(new igf(g1b.h), (Bundle) null, 6);
                for (pg3 pg3 : listOf) {
                    a2.a(pg3);
                }
                ConfirmationBottomSheet e = a2.e();
                e.setTargetController(chatTitleIconScreen);
                zx3 zx3 = chatTitleIconScreen;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e.p0(chatTitleIconScreen);
                if (e9d != null) {
                    i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr3 = ChatTitleIconScreen.x0;
                Activity activity2 = chatTitleIconScreen.getActivity();
                if (activity2 != null) {
                    kr7.A(activity2);
                }
                chatTitleIconScreen.f0().setProgressEnabled(true);
                fr2 h0 = chatTitleIconScreen.h0();
                int ordinal = h0.c.ordinal();
                if (ordinal == 0) {
                    r62 r62 = (r62) h0.z.getValue();
                    List<Long> list = ArraysKt.toList(h0.b);
                    String str2 = h0.F0;
                    String str3 = ((yq2) h0.x0.getValue()).b;
                    if (str3 == null || (str = o5a.z(str3)) == null) {
                        str = null;
                    }
                    ms1 ms1 = new ms1(17, h0);
                    r62.getClass();
                    jbd.b(new p62(r62, list, str2, str), xfd.b(), ms1, (qk3) null, r62.u);
                    return;
                } else if (ordinal == 1) {
                    h0.C0.setValue(h0, fr2.H0[0], xag.g(h0, ((osa) ((gaf) h0.x.getValue())).b(), (f14) null, new dr2(h0, (Continuation) null), 2));
                    return;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
        }
    }
}

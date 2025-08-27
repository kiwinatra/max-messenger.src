package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import java.util.Collections;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: a5  reason: default package */
public final /* synthetic */ class a5 implements qk3, vla {
    public final /* synthetic */ ActAttachesView a;

    public /* synthetic */ a5(ActAttachesView actAttachesView) {
        this.a = actAttachesView;
    }

    public void accept(Object obj) {
        ActAttachesView actAttachesView = this.a;
        s20 s20 = actAttachesView.A0;
        s20.k.clear();
        s20.j.clear();
        actAttachesView.A0.p(Collections.singletonList((a89) obj), true);
        actAttachesView.f0(0);
    }

    public iog z(View view, iog iog) {
        ActAttachesView actAttachesView = this.a;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actAttachesView.C0.getLayoutParams();
        layoutParams.bottomMargin = iog.a();
        actAttachesView.C0.setLayoutParams(layoutParams);
        actAttachesView.C0.setPadding(iog.b(), actAttachesView.C0.getPaddingTop(), iog.c(), actAttachesView.C0.getPaddingBottom());
        iq.O(actAttachesView.S0, iog.d());
        iq.M(actAttachesView.S0, iog.c());
        return iog;
    }
}

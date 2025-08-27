package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: cve  reason: default package */
public final /* synthetic */ class cve implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersShowcaseScreen b;

    public /* synthetic */ cve(StickersShowcaseScreen stickersShowcaseScreen, int i) {
        this.a = i;
        this.b = stickersShowcaseScreen;
    }

    public final Object invoke() {
        StickersShowcaseScreen stickersShowcaseScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StickersShowcaseScreen.Y;
                stickersShowcaseScreen.getClass();
                KProperty kProperty = StickersShowcaseScreen.Y[0];
                long longValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
                ave ave = ave.a;
                Class<gaf> cls = gaf.class;
                return new mve(longValue, (due) ave.getAccessor().h(due.class).getValue(), (gaf) ave.getAccessor().g(cls), new iue((gaf) ave.getAccessor().g(cls), ave.getAccessor().h(vqe.class), ave.getAccessor().h(bte.class)), ave.getAccessor().h(ai5.class), ave.getAccessor().h(jqg.class));
            case 1:
                KProperty[] kPropertyArr2 = StickersShowcaseScreen.Y;
                aya aya = new aya(stickersShowcaseScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                aya.setLayoutParams(layoutParams);
                aya.setAppearance(sxa.a);
                aya.setSize(vxa.a);
                return aya;
            default:
                KProperty[] kPropertyArr3 = StickersShowcaseScreen.Y;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(stickersShowcaseScreen.getContext(), (AttributeSet) null);
                oneMeEmptyView.setIcon(cad.R0);
                oneMeEmptyView.setTitle(new igf(ead.d));
                oneMeEmptyView.setSubtitle(new igf(ead.c));
                return oneMeEmptyView;
        }
    }
}

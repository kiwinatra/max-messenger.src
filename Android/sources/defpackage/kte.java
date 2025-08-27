package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import one.me.stickerssearch.StickersSearchScreen;

/* renamed from: kte  reason: default package */
public final /* synthetic */ class kte implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSearchScreen b;

    public /* synthetic */ kte(StickersSearchScreen stickersSearchScreen, int i) {
        this.a = i;
        this.b = stickersSearchScreen;
    }

    public final Object invoke() {
        StickersSearchScreen stickersSearchScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StickersSearchScreen.X;
                stickersSearchScreen.getClass();
                KProperty kProperty = StickersSearchScreen.X[0];
                long longValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
                ite ite = ite.a;
                return new ute(longValue, ite.getAccessor().h(bte.class), new z8e(ite.getAccessor().h(moe.class), ite.getAccessor().h(due.class)), ite.getAccessor().h(jqg.class), (gaf) ite.getAccessor().g(gaf.class));
            case 1:
                KProperty[] kPropertyArr2 = StickersSearchScreen.X;
                aya aya = new aya(stickersSearchScreen.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                aya.setLayoutParams(layoutParams);
                aya.setAppearance(sxa.a);
                aya.setSize(uxa.a);
                return aya;
            default:
                KProperty[] kPropertyArr3 = StickersSearchScreen.X;
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(stickersSearchScreen.getContext(), (AttributeSet) null);
                oneMeEmptyView.setIcon(cad.R0);
                oneMeEmptyView.setTitle(new igf(ead.d));
                oneMeEmptyView.setSubtitle(new igf(ead.c));
                return oneMeEmptyView;
        }
    }
}

package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function0;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;

/* renamed from: qt3  reason: default package */
public final class qt3 extends kbe {
    /* renamed from: P */
    public final void M(pt3 pt3) {
        OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) this.a;
        pt3.getClass();
        oneMeEmptyView.setIcon(cad.M0);
        oneMeEmptyView.setTitle(new igf(sra.r));
        oneMeEmptyView.setSubtitle(new igf(pt3.a));
    }

    public final void Q(Integer num, Function0 function0) {
        View view = this.a;
        if (num != null) {
            OneMeEmptyView oneMeEmptyView = (OneMeEmptyView) view;
            oneMeEmptyView.M(oneMeEmptyView.getContext().getString(num.intValue()), new e7(7, function0));
            return;
        }
        OneMeButton oneMeButton = ((OneMeEmptyView) view).H0;
        oneMeButton.setText((CharSequence) null);
        oneMeButton.setOnClickListener((View.OnClickListener) null);
        oneMeButton.setVisibility(8);
    }
}

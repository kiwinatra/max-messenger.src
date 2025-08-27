package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;
import one.me.sdk.uikit.common.emptyview.OneMeEmptyView;
import one.me.sdk.uikit.common.views.EmptySearchView;

/* renamed from: kx2  reason: default package */
public final class kx2 extends pae implements w65 {
    public final /* synthetic */ int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx2(Executor executor, int i) {
        super(executor);
        this.v = i;
    }

    public void J(kbe kbe, int i) {
        switch (this.v) {
            case 4:
                h7e h7e = (h7e) ((lz7) E(i));
                g7e g7e = ((e7e) ((i7e) kbe).a).o;
                g7e.c = true;
                g7e.b.c();
                return;
            default:
                super.s(kbe, i);
                return;
        }
    }

    public void e() {
        G(CollectionsKt.listOf(lx2.a));
    }

    public void f() {
        G((List) null);
    }

    public int l(int i) {
        switch (this.v) {
            case 2:
                ((y45) ((lz7) E(i))).getClass();
                return y45.b;
            case 3:
                ((e38) ((lz7) E(i))).getClass();
                return e38.b;
            default:
                return super.l(i);
        }
    }

    public void s(pzc pzc, int i) {
        switch (this.v) {
            case 4:
                h7e h7e = (h7e) ((lz7) E(i));
                g7e g7e = ((e7e) ((i7e) pzc).a).o;
                g7e.c = true;
                g7e.b.c();
                return;
            default:
                super.s(pzc, i);
                return;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.v) {
            case 0:
                return new b61(new nx2(viewGroup.getContext()), 3);
            case 1:
                return new b61(new EmptySearchView(viewGroup.getContext(), (AttributeSet) null), 4);
            case 2:
                OneMeEmptyView oneMeEmptyView = new OneMeEmptyView(viewGroup.getContext(), (AttributeSet) null);
                b61 b61 = new b61(oneMeEmptyView, 5);
                oneMeEmptyView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                oneMeEmptyView.setIcon(cad.R0);
                oneMeEmptyView.setTitle(new igf(ead.d0));
                oneMeEmptyView.setSubtitle(new igf(ead.b0));
                return b61;
            case 3:
                Context context = viewGroup.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                ProgressBar progressBar = new ProgressBar(context);
                float f = (float) 48;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                progressBar.setLayoutParams(layoutParams);
                iq.b0(progressBar, fu4.k.e(progressBar.getContext()).f().getIcon().h);
                frameLayout.addView(progressBar);
                return new b61(frameLayout, 6);
            default:
                return new pzc(new e7e(viewGroup.getContext()));
        }
    }
}

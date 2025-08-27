package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pcg  reason: default package */
public final /* synthetic */ class pcg extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ View b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pcg(ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, qcg qcg) {
        super(0, qcg, Intrinsics.Kotlin.class, "dispose", "doOnGlobalLayout$dispose(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver;Landroid/view/View;)V", 0);
        this.a = viewTreeObserver;
        this.b = viewGroup;
    }

    public final Object invoke() {
        rcg.a((ViewTreeObserver.OnGlobalLayoutListener) this.receiver, this.a, (ViewGroup) this.b);
        return Unit.INSTANCE;
    }
}

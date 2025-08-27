package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zcg  reason: default package */
public final /* synthetic */ class zcg extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ adg a;
    public final /* synthetic */ View b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zcg(adg adg, View view, ViewTreeObserver viewTreeObserver) {
        super(0, viewTreeObserver, Intrinsics.Kotlin.class, "dispose", "attach$dispose(Landroid/view/ViewTreeObserver;Lone/me/sdk/contextmenu/helper/ViewWatcher$attach$listener$1;Landroid/view/View;)V", 0);
        this.a = adg;
        this.b = view;
    }

    public final Object invoke() {
        bs6.a(this.a, this.b, (ViewTreeObserver) this.receiver);
        return Unit.INSTANCE;
    }
}

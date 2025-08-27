package defpackage;

import android.graphics.drawable.Animatable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: pta  reason: default package */
public final class pta implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeDraweeView b;
    public final /* synthetic */ k97 c;
    public final /* synthetic */ Animatable o;

    public /* synthetic */ pta(OneMeDraweeView oneMeDraweeView, String str, k97 k97, Animatable animatable, int i) {
        this.a = i;
        this.b = oneMeDraweeView;
        this.c = k97;
        this.o = animatable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                OneMeDraweeView oneMeDraweeView = this.b;
                oneMeDraweeView.p(this.c, this.o);
                oneMeDraweeView.requestLayout();
                oneMeDraweeView.invalidate();
                return;
            default:
                OneMeDraweeView oneMeDraweeView2 = this.b;
                oneMeDraweeView2.p(this.c, this.o);
                oneMeDraweeView2.requestLayout();
                oneMeDraweeView2.invalidate();
                return;
        }
    }
}

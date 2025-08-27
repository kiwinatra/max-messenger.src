package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: fig  reason: default package */
public final class fig extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ WebAppRootScreen b;
    public final /* synthetic */ jid c;
    public final /* synthetic */ FrameLayout o;
    public final /* synthetic */ LinearLayout v;
    public final /* synthetic */ aya w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fig(WebAppRootScreen webAppRootScreen, jid jid, FrameLayout frameLayout, LinearLayout linearLayout, aya aya, Continuation continuation) {
        super(2, continuation);
        this.b = webAppRootScreen;
        this.c = jid;
        this.o = frameLayout;
        this.v = linearLayout;
        this.w = aya;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fig fig = new fig(this.b, this.c, this.o, this.v, this.w, continuation);
        fig.a = obj;
        return fig;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fig) create((mjg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        mjg mjg = (mjg) this.a;
        KProperty[] kPropertyArr = WebAppRootScreen.D0;
        WebAppRootScreen webAppRootScreen = this.b;
        webAppRootScreen.o0().setTitle((CharSequence) mjg.a);
        WebAppRootScreen.s0(webAppRootScreen.o0(), mjg.b);
        jjg jjg = jjg.a;
        ijg ijg = mjg.c;
        boolean areEqual = Intrinsics.areEqual((Object) ijg, (Object) jjg);
        jid jid = this.c;
        FrameLayout frameLayout = this.o;
        if (areEqual) {
            jid.setVisibility(8);
            int childCount = frameLayout.getChildCount();
            LinearLayout linearLayout = this.v;
            if (childCount <= 1 || frameLayout.getChildAt(1) != linearLayout) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(linearLayout, 1);
            }
            webAppRootScreen.u0(false);
        } else if (Intrinsics.areEqual((Object) ijg, (Object) kjg.a)) {
            jid.setVisibility(8);
            int childCount2 = frameLayout.getChildCount();
            aya aya = this.w;
            if (childCount2 <= 1 || frameLayout.getChildAt(1) != aya) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(aya, 1);
            }
            webAppRootScreen.u0(false);
        } else if (ijg instanceof ljg) {
            jid.setVisibility(0);
            if (frameLayout.getChildCount() > 1) {
                frameLayout.removeViewAt(1);
            }
            webAppRootScreen.u0(((ljg) ijg).a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}

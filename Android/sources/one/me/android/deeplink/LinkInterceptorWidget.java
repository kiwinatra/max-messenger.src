package one.me.android.deeplink;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorWidget;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Landroid/net/Uri;", "uri", "(Landroid/net/Uri;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLinkInterceptorWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInterceptorWidget.kt\none/me/android/deeplink/LinkInterceptorWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,383:1\n235#2,10:384\n8#3:394\n189#4:395\n*S KotlinDebug\n*F\n+ 1 LinkInterceptorWidget.kt\none/me/android/deeplink/LinkInterceptorWidget\n*L\n46#1:384,10\n48#1:394\n83#1:395\n*E\n"})
public final class LinkInterceptorWidget extends Widget implements qg3 {
    public static final /* synthetic */ int o = 0;
    public final Lazy a;
    public final Lazy b;
    public final boolean c;

    public LinkInterceptorWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = createViewModelLazy(cy7.class, new i76(10, new ck7(12)));
        this.b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new dy7(this, 0));
        this.c = true;
    }

    public final void g(int i, Bundle bundle) {
        ((lf1) this.b.getValue()).g(i);
    }

    public final boolean isDialog() {
        return this.c;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(viewGroup.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(dgc.link_interceptor_widget_view);
        coordinatorLayout.setBackgroundColor(0);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((lf1) this.b.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        fma onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            b0h.b(onBackPressedDispatcher, getViewLifecycleOwner(), new vq7(1, (Object) this));
        }
        cy7 cy7 = (cy7) this.a.getValue();
        Parcelable parcelable = getArgs().getParcelable("uri");
        if (parcelable != null) {
            bs0.K(new ps5(bs0.b0(((by7) cy7.b.getValue()).e((Uri) parcelable), new b03(3, (Continuation) null, 3)), new fy7(this, (Continuation) null), 5), getViewLifecycleScope());
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public LinkInterceptorWidget(Uri uri) {
        this(o54.f(TuplesKt.to("uri", uri)));
    }
}

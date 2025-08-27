package one.me.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/webview/FaqWebViewWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "webview_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaqWebViewWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaqWebViewWidget.kt\none/me/webview/FaqWebViewWidget\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Tag.kt\nru/ok/tamtam/logger/TagKt\n*L\n1#1,137:1\n1#2:138\n5#3:139\n*S KotlinDebug\n*F\n+ 1 FaqWebViewWidget.kt\none/me/webview/FaqWebViewWidget\n*L\n124#1:139\n*E\n"})
@SuppressLint({"ValidController"})
public final class FaqWebViewWidget extends Widget {
    public static final /* synthetic */ KProperty[] x;
    public final ReadOnlyProperty a = viewBinding(s3b.a);
    public final yh7 b = yh7.d;
    public final wie c = o5a.U();
    public final Lazy o;
    public final bk5 v;
    public final nk4 w;

    static {
        Class<FaqWebViewWidget> cls = FaqWebViewWidget.class;
        x = new KProperty[]{wj6.p(cls, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), rae.s(cls, "urlJob", "getUrlJob()Lkotlinx/coroutines/Job;", 0)};
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public FaqWebViewWidget() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        qlg qlg = qlg.a;
        this.o = qlg.getAccessor().h(cm.class);
        this.v = new bk5(qlg.getAccessor().h(fn4.class), qlg.getAccessor().h(doa.class), qlg.getAccessor().h(eu3.class), qlg.getAccessor().h(x23.class), qlg.getAccessor().h(bud.class), qlg.getAccessor().h(Context.class));
        this.w = ev0.d(getLifecycleScope(), ((osa) ((gaf) qlg.getAccessor().g(gaf.class))).a(), new SuspendLambda(2, (Continuation<Object>) null), 2);
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setTitle(t3b.b);
        d.setForm(z2b.a);
        d.setLeftActions(new p2b(new rx2(11, this)));
        linearLayout.addView(d);
        n3b n3b = new n3b(linearLayout.getContext(), (AttributeSet) null, 0, 14);
        n3b.setId(s3b.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        n3b.setLayoutParams(layoutParams);
        n3b.getSettings().setJavaScriptEnabled(true);
        n3b.setWebViewClient(new bh5(this));
        linearLayout.addView(n3b);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        KProperty[] kPropertyArr = x;
        KProperty kProperty = kPropertyArr[1];
        wie wie = this.c;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[1], (Object) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new ch5(this, (Continuation) null), 3);
    }
}

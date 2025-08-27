package one.me.sdk.arch.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/sdk/arch/activity/ActivityWrapperWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "", "activityName", "Lkotlin/Function1;", "Landroid/content/Context;", "", "startActivity", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "arch_release"}, k = 1, mv = {2, 0, 0})
public final class ActivityWrapperWidget extends Widget implements Application.ActivityLifecycleCallbacks {
    public final String a;
    public final Function1 b;

    public ActivityWrapperWidget() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (Intrinsics.areEqual((Object) Reflection.getOrCreateKotlinClass(activity.getClass()).getSimpleName(), (Object) this.a)) {
            getRouter().B(this);
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Application) viewGroup.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this);
        Function1 function1 = this.b;
        if (function1 != null) {
            function1.invoke(viewGroup.getContext());
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(ihc.arch_activity_wrapper_view_id);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        ((Application) view.getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        super.onDestroyView(view);
    }

    public ActivityWrapperWidget(String str, Function1<? super Context, Unit> function1) {
        this();
        this.a = str;
        this.b = function1;
    }
}

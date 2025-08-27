package one.me.android.logout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/logout/LogoutScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLogoutScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogoutScreen.kt\none/me/android/logout/LogoutScreen\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
@SuppressLint({"ValidController"})
public final class LogoutScreen extends Widget {
    public final boolean a = true;

    public LogoutScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final boolean handleBack() {
        return true;
    }

    public final boolean isDialog() {
        return this.a;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundColor(j4b.l0(0.5f, -7829368));
        aya aya = new aya(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        aya.setLayoutParams(layoutParams);
        aya.setAppearance(sxa.a);
        aya.setSize(vxa.a);
        frameLayout.addView(aya);
        return frameLayout;
    }
}

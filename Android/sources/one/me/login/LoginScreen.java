package one.me.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/LoginScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLoginScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginScreen.kt\none/me/login/LoginScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n*L\n1#1,47:1\n235#2,10:48\n*S KotlinDebug\n*F\n+ 1 LoginScreen.kt\none/me/login/LoginScreen\n*L\n25#1:48,10\n*E\n"})
@SuppressLint({"ValidController"})
public final class LoginScreen extends Widget {
    public static final /* synthetic */ KProperty[] o = {wj6.p(LoginScreen.class, "loginRouter", "getLoginRouter()Lcom/bluelinelabs/conductor/Router;", 0)};
    public final ReadOnlyProperty a = Widget.childRouter$default(this, xgc.oneme_login_conductor, (Function1) null, 2, (Object) null);
    public final String b = "LoginScope";
    public final Lazy c = createViewModelLazy(k98.class, new i76(11, new ck7(18)));

    public LoginScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1552getScopeIdIluPPks() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(xgc.oneme_login_conductor);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        KProperty[] kPropertyArr = o;
        KProperty kProperty = kPropertyArr[0];
        ReadOnlyProperty readOnlyProperty = this.a;
        if (!((e9d) readOnlyProperty.getValue(this, kProperty)).n()) {
            ((e9d) readOnlyProperty.getValue(this, kPropertyArr[0])).e = 1;
            ((e9d) readOnlyProperty.getValue(this, kPropertyArr[0])).R(new i9d(new InputPhoneScreen(), (String) null, (ey3) null, (ey3) null, false, -1));
        }
    }
}

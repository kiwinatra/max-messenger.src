package defpackage;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;

/* renamed from: f3e  reason: default package */
public final /* synthetic */ class f3e implements ya4, FunctionAdapter {
    public static final f3e b = new f3e(0);
    public static final f3e c = new f3e(1);
    public static final f3e o = new f3e(2);
    public static final f3e v = new f3e(3);
    public final /* synthetic */ int a;

    public /* synthetic */ f3e(int i) {
        this.a = i;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingsPrivacyScreen();
            case 1:
                return new SettingsBlacklistScreen();
            case 2:
                return new SafeModeOnboardingScreen();
            default:
                return new SetupPinCodeScreen();
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof ya4) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
            case 1:
                if (!(obj instanceof ya4) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
            case 2:
                if (!(obj instanceof ya4) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof ya4) || !(obj instanceof FunctionAdapter)) {
                    return false;
                }
                return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((FunctionAdapter) obj).getFunctionDelegate());
        }
    }

    public final Function getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(0, SettingsPrivacyScreen.class, "<init>", "<init>()V", 0);
            case 1:
                return new FunctionReferenceImpl(0, SettingsBlacklistScreen.class, "<init>", "<init>()V", 0);
            case 2:
                return new FunctionReferenceImpl(0, SafeModeOnboardingScreen.class, "<init>", "<init>()V", 0);
            default:
                return new FunctionReferenceImpl(0, SetupPinCodeScreen.class, "<init>", "<init>()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            case 1:
                return getFunctionDelegate().hashCode();
            case 2:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}

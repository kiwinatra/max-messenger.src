package defpackage;

import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.profile.ProfileScreen;

/* renamed from: n5c  reason: default package */
public final /* synthetic */ class n5c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileScreen b;

    public /* synthetic */ n5c(ProfileScreen profileScreen, int i) {
        this.a = i;
        this.b = profileScreen;
    }

    public final Object invoke() {
        ProfileScreen profileScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ProfileScreen.D0;
                return new lf1(LazyKt.lazy(new n5c(profileScreen, 1)), new eng(profileScreen, 0));
            default:
                KProperty[] kPropertyArr2 = ProfileScreen.D0;
                return profileScreen.getRouter();
        }
    }
}

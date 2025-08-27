package defpackage;

import android.view.View;
import kotlin.reflect.KProperty;
import one.me.profileedit.ProfileEditScreen;

/* renamed from: o0c  reason: default package */
public final /* synthetic */ class o0c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ o0c(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    public final void onClick(View view) {
        ProfileEditScreen profileEditScreen = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ProfileEditScreen.w0;
                xz4 xz4 = profileEditScreen.d0().b;
                if (xz4.d()) {
                    xz4.k();
                    return;
                }
                return;
            default:
                KProperty[] kPropertyArr2 = ProfileEditScreen.w0;
                profileEditScreen.d0().n();
                return;
        }
    }
}

package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* renamed from: tyb  reason: default package */
public final /* synthetic */ class tyb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    public /* synthetic */ tyb(ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget, int i) {
        this.a = i;
        this.b = profileEditAdminPermissionsWidget;
    }

    public final Object invoke(Object obj) {
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        View view = (View) obj;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = ProfileEditAdminPermissionsWidget.v0;
                profileEditAdminPermissionsWidget.e0().q();
                return Unit.INSTANCE;
            default:
                KProperty[] kPropertyArr2 = ProfileEditAdminPermissionsWidget.v0;
                profileEditAdminPermissionsWidget.e0().k();
                return Unit.INSTANCE;
        }
    }
}

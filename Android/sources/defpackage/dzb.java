package defpackage;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;

/* renamed from: dzb  reason: default package */
public final /* synthetic */ class dzb implements ya4 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ dzb(long j, String str, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final Object a() {
        eyb.b.getClass();
        for (eyb eyb : eyb.w) {
            if (Intrinsics.areEqual((Object) eyb.a, (Object) this.c)) {
                return new ProfileEditAdminPermissionsWidget(this.a, this.b, eyb);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

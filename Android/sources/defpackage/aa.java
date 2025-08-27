package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* renamed from: aa  reason: default package */
public final class aa extends e54 {
    public final long Z;
    public final String v0;
    public final List w0;

    public aa(long j, String str, List list, zx3 zx3) {
        super(zx3, 1);
        this.Z = j;
        this.v0 = str;
        this.w0 = list;
    }

    public final void G(e9d e9d, int i) {
        zx3 membersListWidget;
        if (!e9d.n()) {
            int ordinal = ((da) this.w0.get(i)).c.ordinal();
            String str = this.v0;
            if (ordinal == 0) {
                membersListWidget = new MembersListWidget(str, new w39(this.Z, ij2.MEMBER, (Integer) null, 12), (DefaultConstructorMarker) null);
            } else if (ordinal == 1) {
                membersListWidget = new AdminsFromContactsScreen(str, this.Z, (DefaultConstructorMarker) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            zx3 zx3 = membersListWidget;
            zx3.setRetainViewMode(yx3.b);
            e9d.R(new i9d(zx3, (String) null, (ey3) null, (ey3) null, false, -1));
        }
    }

    public final int j() {
        return this.w0.size();
    }
}

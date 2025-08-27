package defpackage;

import android.view.MenuItem;
import android.widget.PopupMenu;

/* renamed from: gj2  reason: default package */
public final /* synthetic */ class gj2 implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ we8 a;

    public /* synthetic */ gj2(we8 we8) {
        this.a = we8;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        we8 we8 = this.a;
        hj2 hj2 = (hj2) we8.d;
        if (hj2 == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        int i = lic.menu_chat_member_make_admin;
        nd ndVar = (nd) we8.c;
        if (itemId == i) {
            hj2.C1(we8.a);
            ndVar.f("ACTION_CHAT_MEMBER_MAKE_ADMIN", "MEMBER");
        } else if (itemId == lic.menu_chat_member_make_non_admin) {
            hj2.R0(we8.a, (String) we8.b);
            ndVar.f("ACTION_CHAT_MEMBER_MAKE_NON_ADMIN", "MEMBER");
        } else if (itemId == lic.menu_chat_member_delete) {
            hj2.L(we8.a, (String) we8.b, false);
            ndVar.f("ACTION_CHAT_MEMBER_DELETE", "MEMBER");
        } else if (itemId == lic.menu_chat_member_delete_and_block) {
            hj2.L(we8.a, (String) we8.b, true);
            ndVar.f("ACTION_CHAT_MEMBER_BLOCK", "MEMBER");
        } else if (itemId == lic.menu_chat_member_unblock) {
            hj2.a1(we8.a, (String) we8.b);
            ndVar.f("ACTION_CHAT_MEMBER_UNBLOCK", "MEMBER");
        } else if (itemId == lic.menu_chat_member_setup_admin_permissions) {
            hj2.z0(we8.a);
            ndVar.f("ACTION_CHAT_MEMBER_SETUP_PERMISSIONS", "MEMBER");
        }
        return true;
    }
}

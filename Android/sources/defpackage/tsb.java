package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

/* renamed from: tsb  reason: default package */
public final class tsb implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    public final Preference a;

    public tsb(Preference preference) {
        this.a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.a;
        CharSequence f = preference.f();
        if (preference.L0 && !TextUtils.isEmpty(f)) {
            contextMenu.setHeaderTitle(f);
            contextMenu.add(0, 0, 0, hmc.copy).setOnMenuItemClickListener(this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.a;
        CharSequence f = preference.f();
        ((ClipboardManager) preference.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", f));
        Context context = preference.a;
        Toast.makeText(context, context.getString(hmc.preference_copied, new Object[]{f}), 0).show();
        return true;
    }
}

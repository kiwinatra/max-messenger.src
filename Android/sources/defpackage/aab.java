package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.functions.Function1;

/* renamed from: aab  reason: default package */
public final class aab implements ActionMode.Callback {
    public final Context a;
    public final Function1 b;

    public aab(Context context, vq7 vq7) {
        this.a = context;
        this.b = vq7;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 16908322) {
            return false;
        }
        return ((Boolean) this.b.invoke(b59.R(this.a))).booleanValue();
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MenuItem findItem = menu.findItem(16908322);
        if (findItem == null) {
            return false;
        }
        menu.clear();
        menu.add(0, 16908322, 0, findItem.getTitle());
        return true;
    }
}

package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: r3a  reason: default package */
public final class r3a implements ActionMode.Callback {
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        return false;
    }
}

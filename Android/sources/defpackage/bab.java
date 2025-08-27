package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: bab  reason: default package */
public final class bab implements ActionMode.Callback {
    public final Context a;
    public final fg7 b;
    public final int c;
    public final int d;

    public bab(Context context, fg7 fg7, int i, int i2) {
        this.a = context;
        this.b = fg7;
        this.c = i;
        this.d = i2;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        CharSequence R;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 16908322 || (R = b59.R(this.a)) == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int length = R.length();
        for (int i = 0; i < length; i++) {
            char charAt = R.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String obj = StringsKt___StringsKt.take((CharSequence) sb, this.d).toString();
        ((lg3) this.b).L0(this.c, obj);
        return obj.length() > 0;
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

package defpackage;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: ing  reason: default package */
public abstract class ing {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}

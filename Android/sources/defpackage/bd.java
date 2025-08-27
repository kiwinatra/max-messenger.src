package defpackage;

import android.widget.ArrayAdapter;

/* renamed from: bd  reason: default package */
public final class bd extends ArrayAdapter {
    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean hasStableIds() {
        return true;
    }
}

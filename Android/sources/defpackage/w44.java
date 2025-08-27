package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* renamed from: w44  reason: default package */
public abstract class w44 extends BaseAdapter implements Filterable, x44 {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int o;
    public u44 v;
    public v44 w;
    public y44 x;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                u44 u44 = this.v;
                if (u44 != null) {
                    cursor2.unregisterContentObserver(u44);
                }
                v44 v44 = this.w;
                if (v44 != null) {
                    cursor2.unregisterDataSetObserver(v44);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                u44 u442 = this.v;
                if (u442 != null) {
                    cursor.registerContentObserver(u442);
                }
                v44 v442 = this.w;
                if (v442 != null) {
                    cursor.registerDataSetObserver(v442);
                }
                this.o = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.o = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            n0f n0f = (n0f) this;
            view = n0f.X.inflate(n0f.z, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [y44, android.widget.Filter] */
    public final Filter getFilter() {
        if (this.x == null) {
            ? filter = new Filter();
            filter.a = this;
            this.x = filter;
        }
        return this.x;
    }

    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.c.getLong(this.o);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.c.moveToPosition(i)) {
            if (view == null) {
                view = d(viewGroup);
            }
            a(view, this.c);
            return view;
        } else {
            throw new IllegalStateException(wj6.h(i, "couldn't move cursor to position "));
        }
    }
}

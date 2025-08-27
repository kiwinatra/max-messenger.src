package defpackage;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: uo  reason: default package */
public final class uo implements ListAdapter, SpinnerAdapter {
    public SpinnerAdapter a;
    public ListAdapter b;

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    public final Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    public final long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            return -1;
        }
        return spinnerAdapter.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.a;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}

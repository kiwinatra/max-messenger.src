package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int m1;
    public ly0 n1;

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        if (bundle == null) {
            bundle = this.x;
        }
        this.m1 = bundle.getInt("THEME_RES_ID_KEY");
        wj6.s(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.n1 = (ly0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(O1(), this.m1));
        throw null;
    }

    public final void x2(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m1);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.n1);
    }
}

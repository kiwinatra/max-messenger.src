package ru.ok.messages.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBase;

public abstract class FrgBaseSettings extends FrgBase implements b0e {
    public List B1;
    public lf0 C1;
    public RecyclerView D1;

    public final void c3(m5 m5Var) {
        this.n1 = false;
        if (!(m5Var instanceof i2e)) {
            throw new IllegalStateException("FrgBaseSettings must be attach to activity that implements SettingsListener");
        }
    }

    public final i2e h3() {
        if (X2() != null) {
            return (i2e) X2();
        }
        return null;
    }

    public abstract ArrayList i3();

    public abstract String j3();

    public View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b33 Y2 = Y2();
        if (Y2 != null) {
            Y2.l(j3());
        }
        View inflate = layoutInflater.inflate(ujc.frg_settings_base, viewGroup, false);
        inflate.setBackgroundColor(this.r1.n);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(lic.frg_settings__rv_content);
        this.D1 = recyclerView;
        O1();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.B1 = i3();
        lf0 lf0 = new lf0((Context) M1(), this.B1, (b0e) this);
        this.C1 = lf0;
        this.D1.setAdapter(lf0);
        return inflate;
    }

    public final void k3() {
        this.B1.clear();
        this.B1.addAll(i3());
        if (this.D1.b0()) {
            this.D1.post(new y86(5, (Object) this));
        } else {
            this.C1.m();
        }
    }

    public void x() {
        k3();
    }
}

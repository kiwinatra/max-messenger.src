package ru.ok.messages.views.dialogs;

import androidx.fragment.app.a;

public abstract class FrgDlgChecked<T> extends FrgDlgBase {
    public final void Z2(m5 m5Var) {
        this.B1 = false;
        Object obj = this.G0;
        if (obj == null) {
            obj = M1();
        }
        String str = "activity";
        if (obj == null) {
            String name = getClass().getName();
            a aVar = this.G0;
            if (aVar != null) {
                str = "fragment";
            }
            throw new IllegalStateException(wj6.n(rae.r("Class ", name, " should be call from ", str, ", but "), aVar != null ? "getParentFragment()" : "getActivity()", " is null"));
        } else if (!c3().isAssignableFrom(obj.getClass())) {
            String name2 = getClass().getName();
            if (this.G0 != null) {
                str = "fragment";
            }
            String name3 = c3().getName();
            StringBuilder r = rae.r("Class ", name2, " must be attach to ", str, " that implements ");
            r.append(name3);
            throw new IllegalStateException(r.toString());
        }
    }

    public final Object b3() {
        return this.G0 != null ? c3().cast(this.G0) : c3().cast(M1());
    }

    public abstract Class c3();

    public final void d3(a aVar) {
        Y2(aVar.N1(), e3());
    }

    public abstract String e3();
}

package defpackage;

import android.text.Editable;

/* renamed from: oee  reason: default package */
public final class oee extends pzc implements lg7 {
    public final int D0;
    public final fg7 E0;
    public final gg3 F0;
    public final /* synthetic */ pee G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oee(pee pee, int i, fg7 fg7, gg3 gg3) {
        super(gg3);
        this.G0 = pee;
        this.D0 = i;
        this.E0 = fg7;
        this.F0 = gg3;
    }

    public final String M() {
        Editable text = this.F0.getText();
        String obj = text != null ? text.toString() : null;
        return obj == null ? "" : obj;
    }

    public final void N(String str) {
        gg3 gg3 = this.F0;
        gg3.setText(str);
        gg3.setSelection(gg3.length());
    }
}

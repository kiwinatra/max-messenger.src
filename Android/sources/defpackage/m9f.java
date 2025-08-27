package defpackage;

import android.content.Context;
import android.widget.Button;
import androidx.appcompat.widget.TamAlertDialogLayout;
import kotlin.Lazy;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: m9f  reason: default package */
public final class m9f extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ TamAlertDialogLayout b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9f(TamAlertDialogLayout tamAlertDialogLayout, int i) {
        super(null);
        this.a = i;
        this.b = tamAlertDialogLayout;
    }

    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        Button e;
        scf scf;
        Button c;
        scf scf2;
        TamAlertDialogLayout tamAlertDialogLayout = this.b;
        switch (this.a) {
            case 0:
                if (((rcf) obj) != ((rcf) obj2) && (e = tamAlertDialogLayout.getButtonNeutral()) != null) {
                    if (tamAlertDialogLayout.isInEditMode()) {
                        scf = vi4.f0;
                    } else {
                        Context context = tamAlertDialogLayout.getContext();
                        Lazy lazy = scf.b0;
                        scf = j4b.k0(context);
                    }
                    tamAlertDialogLayout.g(e, scf);
                    return;
                }
                return;
            default:
                if (((rcf) obj) != ((rcf) obj2) && (c = tamAlertDialogLayout.getButtonNegative()) != null) {
                    if (tamAlertDialogLayout.isInEditMode()) {
                        scf2 = vi4.f0;
                    } else {
                        Context context2 = tamAlertDialogLayout.getContext();
                        Lazy lazy2 = scf.b0;
                        scf2 = j4b.k0(context2);
                    }
                    tamAlertDialogLayout.f(c, scf2);
                    return;
                }
                return;
        }
    }
}

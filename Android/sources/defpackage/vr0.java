package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import ru.ok.messages.utils.context_actions.dialog.ContextActionsDialog;
import ru.ok.tamtam.calls.CallDialogFragment;

/* renamed from: vr0  reason: default package */
public final class vr0 extends sr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }

    public final void b(View view) {
        int i = this.a;
    }

    public final void c(View view, int i) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                if (i == 5) {
                    ((xr0) obj).cancel();
                    return;
                }
                return;
            case 1:
                if (i == 5) {
                    ((BottomSheetDialogFragment) obj).Z2();
                    return;
                }
                return;
            case 2:
                if (i == 5) {
                    ((CallDialogFragment) obj).d3(y31.a);
                    return;
                }
                return;
            default:
                ContextActionsDialog contextActionsDialog = (ContextActionsDialog) obj;
                if (i == 3) {
                    aw3 aw3 = aw3.a;
                    String str = ContextActionsDialog.G1;
                    contextActionsDialog.c3(aw3);
                    return;
                } else if (i == 5) {
                    try {
                        zv3 zv3 = zv3.a;
                        String str2 = ContextActionsDialog.G1;
                        contextActionsDialog.c3(zv3);
                        return;
                    } catch (Throwable th) {
                        String str3 = ContextActionsDialog.G1;
                        boolean a2 = contextActionsDialog.a2();
                        boolean d2 = contextActionsDialog.d2();
                        boolean z = contextActionsDialog.L0;
                        z68.f(str3, "isAdded = " + a2 + ", isVisible = " + d2 + ", isDetached = " + z, th);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}

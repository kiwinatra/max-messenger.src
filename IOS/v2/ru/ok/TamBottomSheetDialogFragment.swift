package ru.ok;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/TamBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lwcf;", "ui-utils_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTamBottomSheetDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TamBottomSheetDialogFragment.kt\nru/ok/TamBottomSheetDialogFragment\n+ 2 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n*L\n1#1,80:1\n54#2:81\n45#2:82\n*S KotlinDebug\n*F\n+ 1 TamBottomSheetDialogFragment.kt\nru/ok/TamBottomSheetDialogFragment\n*L\n75#1:81\n75#1:82\n*E\n"})
public abstract class TamBottomSheetDialogFragment extends BottomSheetDialogFragment implements wcf {
    public final int C1;

    public TamBottomSheetDialogFragment(int i) {
        this.C1 = i;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public void A2(View view, Bundle bundle) {
        bs0.K(new ps5(bs0.v(new on2(new ps5(scf.e0, new SuspendLambda(2, (Continuation<Object>) null)), 28), 100), new q9f(this, (Continuation) null), 5), fqc.p(X1()));
    }

    public int U2() {
        return cnc.UiUtils_LightBottomSheetDialog;
    }

    public Dialog V2(Bundle bundle) {
        xr0 xr0 = (xr0) super.V2(bundle);
        xr0.X = true;
        xr0.h().K(3);
        xr0.h().I(true);
        xr0.h().J = true;
        b3(xr0);
        return xr0;
    }

    public abstract void b3(xr0 xr0);

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.w1;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable((Drawable) null);
        }
        return layoutInflater.inflate(this.C1, viewGroup, false);
    }
}

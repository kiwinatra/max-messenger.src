package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: efe  reason: default package */
public final class efe extends il0 {
    public static final int[] C = {edc.snackbarButtonStyle, edc.snackbarTextViewStyle};
    public final AccessibilityManager A;
    public boolean B;

    public efe(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}

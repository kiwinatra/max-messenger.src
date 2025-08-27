package defpackage;

import android.app.Dialog;
import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import ru.ok.messages.views.dialogs.InputDialog;

/* renamed from: mg7  reason: default package */
public final /* synthetic */ class mg7 implements TextView.OnEditorActionListener {
    public final /* synthetic */ InputDialog a;
    public final /* synthetic */ TextInputEditText b;

    public /* synthetic */ mg7(InputDialog inputDialog, TextInputEditText textInputEditText) {
        this.a = inputDialog;
        this.b = textInputEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        InputDialog inputDialog = this.a;
        inputDialog.getClass();
        TextInputEditText textInputEditText = this.b;
        if (textView != textInputEditText || i != 6 || textInputEditText.length() < inputDialog.C1 || textInputEditText.length() > inputDialog.B1) {
            return false;
        }
        inputDialog.a3(textInputEditText);
        Dialog dialog = inputDialog.w1;
        if (dialog != null) {
            dialog.dismiss();
        }
        return true;
    }
}

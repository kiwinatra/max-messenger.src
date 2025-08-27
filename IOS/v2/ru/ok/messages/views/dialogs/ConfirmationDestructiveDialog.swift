package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ok/messages/views/dialogs/ConfirmationDestructiveDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "q8", "tg3", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class ConfirmationDestructiveDialog extends DialogFragment {
    public static final String B1 = Reflection.getOrCreateKotlinClass(ConfirmationDestructiveDialog.class).getSimpleName();

    public final Dialog V2(Bundle bundle) {
        cg8 q = new cg8(G2()).q(F2().getString("destructive:title"));
        q.a.f = F2().getString("destructive:message");
        q.m(F2().getString("destructive:neutral"), new sg3(this, 0));
        q.k(F2().getString("destructive:negative"), new sg3(this, 1));
        return q.create();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Q1().f0("CONFIRMATION_DESTRUCTIVE_REQUEST_KEY", o54.f(TuplesKt.to("ConfirmationDestructiveDialogResult:key", new vg3(F2().getBundle("destructive:data")))));
    }
}

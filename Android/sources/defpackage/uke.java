package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import ru.ok.tamtam.calls.CallDialogFragment;

/* renamed from: uke  reason: default package */
public abstract class uke {
    public static final CallDialogFragment a(c cVar) {
        a E = cVar.E("CallDialog");
        if (E instanceof CallDialogFragment) {
            return (CallDialogFragment) E;
        }
        return null;
    }
}

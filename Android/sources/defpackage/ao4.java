package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import java.util.Objects;
import kotlin.Result;

/* renamed from: ao4  reason: default package */
public final class ao4 implements dla {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ao4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                if (((jv7) obj) != null) {
                    DialogFragment dialogFragment = (DialogFragment) this.b;
                    if (dialogFragment.s1) {
                        View I2 = dialogFragment.I2();
                        if (I2.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        } else if (dialogFragment.w1 != null) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(dialogFragment.w1);
                            }
                            dialogFragment.w1.setContentView(I2);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                o85 o85 = (o85) obj;
                if (o85 != null) {
                    Object a2 = o85.a();
                    if (Result.m26exceptionOrNullimpl(a2) == null) {
                        ((q85) ((lc5) this.b).b).d(a2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

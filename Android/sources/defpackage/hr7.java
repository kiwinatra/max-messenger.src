package defpackage;

import android.view.View;
import java.util.Objects;
import org.apache.http.HttpStatus;

/* renamed from: hr7  reason: default package */
public final class hr7 implements ng4 {
    public final View a;
    public final gr7 b;
    public int c = 0;

    public hr7(int i, View view, fr7 fr7) {
        int i2;
        this.a = view;
        if (i == 1) {
            i2 = 150;
        } else if (i == 2) {
            i2 = HttpStatus.SC_BAD_REQUEST;
        } else {
            throw null;
        }
        Objects.requireNonNull(view);
        this.b = new gr7(i2, fr7, new h6(5, view));
    }

    public final void onPause(jv7 jv7) {
        z68.a("hr7", "onPause: unregisterGlobalLayoutListener");
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
    }

    public final void onResume(jv7 jv7) {
        z68.a("hr7", "onResume: registerGlobalLayoutListener");
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }
}

package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: o3a  reason: default package */
public final /* synthetic */ class o3a implements View.OnKeyListener {
    public final /* synthetic */ s3a a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ o3a(s3a s3a, boolean z) {
        this.a = s3a;
        this.b = z;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        s3a s3a = this.a;
        s3a.getClass();
        if ((this.b || s3a.H0) && i == 66 && keyEvent.getAction() == 0) {
            s3a.N(new l3a(0));
            return true;
        }
        boolean z = false;
        if (i != 113 && i != 114) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            z = true;
        }
        s3a.H0 = z;
        return true;
    }
}

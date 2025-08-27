package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

/* renamed from: n3a  reason: default package */
public final /* synthetic */ class n3a implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n3a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                s3a s3a = (s3a) this.b;
                s3a.getClass();
                if (i != 4 && (keyEvent == null || i != 0 || keyEvent.getAction() != 0)) {
                    return false;
                }
                s3a.N(new l3a(0));
                return true;
            default:
                if (i != 3) {
                    return false;
                }
                kr7.C((AppCompatEditText) this.b);
                return true;
        }
    }
}

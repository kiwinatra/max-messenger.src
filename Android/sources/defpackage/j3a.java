package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

/* renamed from: j3a  reason: default package */
public final /* synthetic */ class j3a implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3a b;

    public /* synthetic */ j3a(s3a s3a, int i) {
        this.a = i;
        this.b = s3a;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                soc soc = this.b.L0;
                EditText editText = (EditText) soc.c;
                soc.m(editText.getText().toString(), editText.hasSelection(), ((ClipboardManager) ((Context) soc.b).getSystemService("clipboard")).hasPrimaryClip(), true);
                return false;
            case 1:
                this.b.N(new k2a(29));
                return true;
            default:
                this.b.N(new k2a(26));
                return true;
        }
    }
}

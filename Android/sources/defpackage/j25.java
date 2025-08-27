package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: j25  reason: default package */
public final class j25 implements KeyListener {
    public final KeyListener a;
    public final s9a b;

    public j25(KeyListener keyListener) {
        s9a s9a = new s9a(11, (byte) 0);
        this.a = keyListener;
        this.b = s9a;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.b.getClass();
        if (i != 67 ? i != 112 ? false : pv0.a(editable, keyEvent, true) : pv0.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.a.onKeyDown(view, editable, i, keyEvent);
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}

package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: n69  reason: default package */
public final class n69 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, h79 {
    public m69 a;
    public ed b;
    public nz7 c;

    public final boolean a0(m69 m69) {
        return false;
    }

    public final void m(m69 m69, boolean z) {
        ed edVar;
        if ((z || m69 == this.a) && (edVar = this.b) != null) {
            edVar.dismiss();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        nz7 nz7 = this.c;
        if (nz7.x == null) {
            nz7.x = new mz7(nz7);
        }
        this.a.q(nz7.x.getItem(i), (i79) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.m(this.a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        m69 m69 = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                m69.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return m69.performShortcut(i, keyEvent, 0);
    }
}

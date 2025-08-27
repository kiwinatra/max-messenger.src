package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: jmf  reason: default package */
public final class jmf extends b59 {
    public boolean A;
    public boolean B;
    public final ArrayList C = new ArrayList();
    public final haf D = new haf(6, (Object) this);
    public final omf w;
    public final Window.Callback x;
    public final z3a y;
    public boolean z;

    public jmf(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        ch2 ch2 = new ch2(25, this);
        toolbar.getClass();
        omf omf = new omf(toolbar, false);
        this.w = omf;
        callback.getClass();
        this.x = callback;
        omf.k = callback;
        toolbar.setOnMenuItemClickListener(ch2);
        if (!omf.g) {
            omf.h = charSequence;
            if ((omf.b & 8) != 0) {
                Toolbar toolbar2 = omf.a;
                toolbar2.setTitle(charSequence);
                if (omf.g) {
                    gag.k(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.y = new z3a(12, this);
    }

    public final int E() {
        return this.w.b;
    }

    public final Context G() {
        return this.w.a.getContext();
    }

    public final boolean I() {
        omf omf = this.w;
        Toolbar toolbar = omf.a;
        haf haf = this.D;
        toolbar.removeCallbacks(haf);
        Toolbar toolbar2 = omf.a;
        WeakHashMap weakHashMap = gag.a;
        toolbar2.postOnAnimation(haf);
        return true;
    }

    public final void M() {
    }

    public final void N() {
        this.w.a.removeCallbacks(this.D);
    }

    public final boolean O(int i, KeyEvent keyEvent) {
        Menu h0 = h0();
        if (h0 == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        h0.setQwertyMode(z2);
        return h0.performShortcut(i, keyEvent, 0);
    }

    public final boolean P(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            Q();
        }
        return true;
    }

    public final boolean Q() {
        return this.w.a.w();
    }

    public final void W(boolean z2) {
    }

    public final void X(boolean z2) {
    }

    public final void Y(CharSequence charSequence) {
        omf omf = this.w;
        if (!omf.g) {
            omf.h = charSequence;
            if ((omf.b & 8) != 0) {
                Toolbar toolbar = omf.a;
                toolbar.setTitle(charSequence);
                if (omf.g) {
                    gag.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final Menu h0() {
        boolean z2 = this.A;
        omf omf = this.w;
        if (!z2) {
            qr0 qr0 = new qr0((Object) this);
            p3a p3a = new p3a((Object) this);
            Toolbar toolbar = omf.a;
            toolbar.Z0 = qr0;
            toolbar.a1 = p3a;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.w = qr0;
                actionMenuView.x = p3a;
            }
            this.A = true;
        }
        return omf.a.getMenu();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i() {
        /*
            r0 = this;
            omf r0 = r0.w
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L_0x0014
            w7 r0 = r0.v
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmf.i():boolean");
    }

    public final boolean j() {
        u69 u69;
        fmf fmf = this.w.a.Y0;
        if (fmf == null || (u69 = fmf.b) == null) {
            return false;
        }
        if (fmf == null) {
            u69 = null;
        }
        if (u69 == null) {
            return true;
        }
        u69.collapseActionView();
        return true;
    }

    public final void t(boolean z2) {
        if (z2 != this.B) {
            this.B = z2;
            ArrayList arrayList = this.C;
            if (arrayList.size() > 0) {
                rae.w(arrayList.get(0));
                throw null;
            }
        }
    }
}

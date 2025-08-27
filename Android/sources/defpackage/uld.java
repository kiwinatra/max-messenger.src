package defpackage;

import android.database.Cursor;

/* renamed from: uld  reason: default package */
public final class uld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gmd b;

    public /* synthetic */ uld(gmd gmd, int i) {
        this.a = i;
        this.b = gmd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                w44 w44 = this.b.mSuggestionsAdapter;
                if (w44 instanceof n0f) {
                    w44.b((Cursor) null);
                    return;
                }
                return;
            default:
                this.b.updateFocusedState();
                return;
        }
    }
}

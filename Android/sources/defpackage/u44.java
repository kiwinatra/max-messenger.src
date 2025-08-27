package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: u44  reason: default package */
public final class u44 extends ContentObserver {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u44(meb meb, Handler handler) {
        super(handler);
        this.b = meb;
    }

    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            case 2:
                return false;
            default:
                return super.deliverSelfNotifications();
        }
    }

    public final void onChange(boolean z) {
        Cursor cursor;
        Object value;
        switch (this.a) {
            case 0:
                w44 w44 = (w44) this.b;
                if (w44.b && (cursor = w44.c) != null && !cursor.isClosed()) {
                    w44.a = w44.c.requery();
                    return;
                }
                return;
            case 1:
                z68.c(yd7.C0, "ContentObserver: on content changed", new Object[0]);
                ((yd7) this.b).f();
                return;
            default:
                z68.c("Phonebook", "contact observer onChange", new Object[0]);
                meb meb = (meb) this.b;
                xme xme = meb.z;
                do {
                    value = xme.getValue();
                    ((Number) value).intValue();
                } while (!xme.b(value, Integer.valueOf(meb.y.incrementAndGet())));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u44(w44 w44) {
        super(new Handler());
        this.b = w44;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u44(yd7 yd7) {
        super((Handler) null);
        this.b = yd7;
    }
}

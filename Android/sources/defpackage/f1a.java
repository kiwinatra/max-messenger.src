package defpackage;

import android.database.Cursor;
import java.util.Locale;

/* renamed from: f1a  reason: default package */
public final /* synthetic */ class f1a implements qk3, lbd, nsb, zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ f1a(long j, int i) {
        this.a = i;
        this.b = j;
    }

    public void accept(Object obj) {
        Locale locale = Locale.ENGLISH;
        z68.f("g1a", "Can't load track for message " + this.b, (Throwable) obj);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new wjf(cursor.getLong(0), this.b);
            default:
                dzf dzf = (dzf) obj;
                dzf.getClass();
                return new qa3(2, new aj5(dzf, this.b, 3));
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                ald ald = (ald) obj;
                a32 a32 = ald.o;
                return a32 != null && a32.N() && ald.o.m().r() == this.b;
            default:
                return ((vyf) obj).b == this.b;
        }
    }
}

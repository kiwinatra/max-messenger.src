package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: o13  reason: default package */
public final class o13 {
    public static final o13 b = new o13(0);
    public final /* synthetic */ int a;

    public /* synthetic */ o13(int i) {
        this.a = i;
    }

    public final void a(af6 af6) {
        switch (this.a) {
            case 0:
                af6.m();
                try {
                    af6.V("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - sog.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    af6.s0();
                    return;
                } finally {
                    af6.U();
                }
            default:
                if (((SQLiteDatabase) af6.b).isWriteAheadLoggingEnabled()) {
                    af6.V("PRAGMA synchronous = NORMAL");
                    return;
                }
                return;
        }
    }
}

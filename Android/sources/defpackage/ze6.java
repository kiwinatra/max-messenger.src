package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

/* renamed from: ze6  reason: default package */
public final class ze6 extends Lambda implements Function4 {
    public final /* synthetic */ h3f a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ze6(h3f h3f) {
        super(4);
        this.a = h3f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        this.a.n(new ff6(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}

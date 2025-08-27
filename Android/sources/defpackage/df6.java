package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: df6  reason: default package */
public final class df6 extends SQLiteOpenHelper {
    public static final /* synthetic */ int y = 0;
    public final Context a;
    public final rt6 b;
    public final ty c;
    public final boolean o;
    public boolean v;
    public final jvb w;
    public boolean x;

    public df6(Context context, String str, rt6 rt6, ty tyVar, boolean z) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, tyVar.b, new bf6(tyVar, rt6));
        this.a = context;
        this.b = rt6;
        this.c = tyVar;
        this.o = z;
        this.w = new jvb(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    public final af6 a(boolean z) {
        jvb jvb = this.w;
        try {
            jvb.a(!this.x && getDatabaseName() != null);
            this.v = false;
            SQLiteDatabase d = d(z);
            if (this.v) {
                close();
                af6 a2 = a(z);
                jvb.b();
                return a2;
            }
            af6 b2 = b(d);
            jvb.b();
            return b2;
        } catch (Throwable th) {
            jvb.b();
            throw th;
        }
    }

    public final af6 b(SQLiteDatabase sQLiteDatabase) {
        rt6 rt6 = this.b;
        af6 af6 = (af6) rt6.b;
        if (af6 != null && Intrinsics.areEqual((Object) (SQLiteDatabase) af6.b, (Object) sQLiteDatabase)) {
            return af6;
        }
        af6 af62 = new af6(0, sQLiteDatabase);
        rt6.b = af62;
        return af62;
    }

    public final void close() {
        jvb jvb = this.w;
        try {
            jvb.a(jvb.a);
            super.close();
            this.b.b = null;
            this.x = false;
        } finally {
            jvb.b();
        }
    }

    public final SQLiteDatabase d(boolean z) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.x;
        Context context = this.a;
        if (!(databaseName == null || z2 || (parentFile = context.getDatabasePath(databaseName).getParentFile()) == null)) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        if (!z) {
            return getReadableDatabase();
        }
        try {
            return getWritableDatabase();
        } catch (Throwable th) {
            super.close();
            if (th instanceof cf6) {
                cf6 cf6 = th;
                int y2 = tr1.y(cf6.a);
                Throwable th2 = cf6.b;
                if (y2 == 0 || y2 == 1 || y2 == 2 || y2 == 3) {
                    throw th2;
                } else if (!(th2 instanceof SQLiteException)) {
                    throw th2;
                }
            } else if (!(th instanceof SQLiteException)) {
                throw th;
            } else if (databaseName == null || !this.o) {
                throw th;
            }
            context.deleteDatabase(databaseName);
            if (!z) {
                return getReadableDatabase();
            }
            try {
                return getWritableDatabase();
            } catch (cf6 e) {
                throw e.b;
            }
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.v;
        ty tyVar = this.c;
        if (!z && tyVar.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            b(sQLiteDatabase);
            tyVar.getClass();
        } catch (Throwable th) {
            throw new cf6(th, 1);
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.q(b(sQLiteDatabase));
        } catch (Throwable th) {
            throw new cf6(th, 2);
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.v = true;
        try {
            this.c.r(b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new cf6(th, 4);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.v) {
            try {
                this.c.s(b(sQLiteDatabase));
            } catch (Throwable th) {
                throw new cf6(th, 5);
            }
        }
        this.x = true;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.v = true;
        try {
            this.c.v(b(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new cf6(th, 3);
        }
    }
}

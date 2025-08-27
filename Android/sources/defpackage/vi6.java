package defpackage;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vi6  reason: default package */
public final class vi6 {
    public static final String[] d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String a;
    public final Set b;
    public final Set c;

    public vi6(String str, Set set, Set set2) {
        this.a = str;
        this.b = set;
        this.c = set2;
    }

    public static final vi6 a(af6 af6, String str) {
        Set createSetBuilder = SetsKt.createSetBuilder();
        Cursor r0 = af6.r0("PRAGMA table_info(`" + str + "`)");
        try {
            if (r0.getColumnCount() > 0) {
                int columnIndex = r0.getColumnIndex("name");
                while (r0.moveToNext()) {
                    createSetBuilder.add(r0.getString(columnIndex));
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(r0, (Throwable) null);
            Set build = SetsKt.build(createSetBuilder);
            Cursor r02 = af6.r0("SELECT * FROM sqlite_master WHERE `name` = '" + str + '\'');
            try {
                String string = r02.moveToFirst() ? r02.getString(r02.getColumnIndexOrThrow("sql")) : "";
                CloseableKt.closeFinally(r02, (Throwable) null);
                return new vi6(str, build, ui6.a(string));
            } catch (Throwable th) {
                CloseableKt.closeFinally(r02, th);
                throw th;
            }
        } catch (Throwable th2) {
            CloseableKt.closeFinally(r0, th);
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi6)) {
            return false;
        }
        vi6 vi6 = (vi6) obj;
        if (Intrinsics.areEqual((Object) this.a, (Object) vi6.a) && Intrinsics.areEqual((Object) this.b, (Object) vi6.b)) {
            return Intrinsics.areEqual((Object) this.c, (Object) vi6.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.a + "', columns=" + this.b + ", options=" + this.c + "'}";
    }

    public vi6(String str, HashSet hashSet, String str2) {
        this(str, (Set) hashSet, ui6.a(str2));
    }
}

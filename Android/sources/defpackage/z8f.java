package defpackage;

import android.database.Cursor;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z8f  reason: default package */
public final class z8f {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public z8f(String str, Map map, Set set, Set set2) {
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    /* JADX INFO: finally extract failed */
    public static final z8f a(af6 af6, String str) {
        Throwable th;
        Map map;
        Throwable th2;
        Throwable th3;
        Set set;
        Throwable th4;
        int i;
        int i2;
        String str2;
        y8f y8f;
        Throwable th5;
        af6 af62 = af6;
        String str3 = str;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str3);
        String str4 = "`)";
        sb.append(str4);
        Cursor r0 = af62.r0(sb.toString());
        try {
            String str5 = "name";
            if (r0.getColumnCount() <= 0) {
                map = MapsKt.emptyMap();
                CloseableKt.closeFinally(r0, (Throwable) null);
            } else {
                int columnIndex = r0.getColumnIndex(str5);
                int columnIndex2 = r0.getColumnIndex("type");
                int columnIndex3 = r0.getColumnIndex("notnull");
                int columnIndex4 = r0.getColumnIndex("pk");
                int columnIndex5 = r0.getColumnIndex("dflt_value");
                Map createMapBuilder = MapsKt.createMapBuilder();
                while (r0.moveToNext()) {
                    String string = r0.getString(columnIndex);
                    createMapBuilder.put(string, new v8f(string, r0.getInt(columnIndex4), 2, r0.getString(columnIndex2), r0.getInt(columnIndex3) != 0, r0.getString(columnIndex5)));
                }
                map = MapsKt.build(createMapBuilder);
                CloseableKt.closeFinally(r0, (Throwable) null);
            }
            Cursor r02 = af62.r0("PRAGMA foreign_key_list(`" + str3 + str4);
            try {
                int columnIndex6 = r02.getColumnIndex("id");
                int columnIndex7 = r02.getColumnIndex("seq");
                int columnIndex8 = r02.getColumnIndex("table");
                int columnIndex9 = r02.getColumnIndex("on_delete");
                int columnIndex10 = r02.getColumnIndex("on_update");
                int columnIndex11 = r02.getColumnIndex("id");
                int columnIndex12 = r02.getColumnIndex("seq");
                int columnIndex13 = r02.getColumnIndex("from");
                int columnIndex14 = r02.getColumnIndex("to");
                List createListBuilder = CollectionsKt.createListBuilder();
                while (r02.moveToNext()) {
                    createListBuilder.add(new x8f(r02.getString(columnIndex13), r02.getInt(columnIndex11), r02.getInt(columnIndex12), r02.getString(columnIndex14)));
                    map = map;
                    str5 = str5;
                    columnIndex11 = columnIndex11;
                    columnIndex12 = columnIndex12;
                    columnIndex13 = columnIndex13;
                }
                Map map2 = map;
                String str6 = str5;
                List sorted = CollectionsKt.sorted(CollectionsKt.build(createListBuilder));
                r02.moveToPosition(-1);
                Set createSetBuilder = SetsKt.createSetBuilder();
                while (r02.moveToNext()) {
                    if (r02.getInt(columnIndex7) == 0) {
                        int i3 = r02.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object next : sorted) {
                            List list = sorted;
                            int i4 = columnIndex6;
                            if (((x8f) next).a == i3) {
                                arrayList3.add(next);
                            }
                            sorted = list;
                            columnIndex6 = i4;
                        }
                        List list2 = sorted;
                        int i5 = columnIndex6;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            x8f x8f = (x8f) it.next();
                            arrayList.add(x8f.c);
                            arrayList2.add(x8f.o);
                        }
                        createSetBuilder.add(new w8f(r02.getString(columnIndex8), r02.getString(columnIndex9), r02.getString(columnIndex10), arrayList, arrayList2));
                        sorted = list2;
                        columnIndex6 = i5;
                    }
                }
                Set build = SetsKt.build(createSetBuilder);
                CloseableKt.closeFinally(r02, (Throwable) null);
                Cursor r03 = af62.r0("PRAGMA index_list(`" + str3 + str4);
                String str7 = str6;
                try {
                    int columnIndex15 = r03.getColumnIndex(str7);
                    int columnIndex16 = r03.getColumnIndex(HasExtraData.KEY_ORIGIN);
                    int columnIndex17 = r03.getColumnIndex("unique");
                    if (columnIndex15 != -1 && columnIndex16 != -1 && columnIndex17 != -1) {
                        Set createSetBuilder2 = SetsKt.createSetBuilder();
                        while (true) {
                            if (!r03.moveToNext()) {
                                Set build2 = SetsKt.build(createSetBuilder2);
                                CloseableKt.closeFinally(r03, (Throwable) null);
                                set = build2;
                                break;
                            } else if (Intrinsics.areEqual((Object) "c", (Object) r03.getString(columnIndex16))) {
                                String string2 = r03.getString(columnIndex15);
                                boolean z = r03.getInt(columnIndex17) == 1;
                                Cursor r04 = af62.r0("PRAGMA index_xinfo(`" + string2 + str4);
                                try {
                                    int columnIndex18 = r04.getColumnIndex("seqno");
                                    int columnIndex19 = r04.getColumnIndex("cid");
                                    int columnIndex20 = r04.getColumnIndex(str7);
                                    int columnIndex21 = r04.getColumnIndex("desc");
                                    String str8 = str7;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        str2 = str4;
                                        i2 = columnIndex15;
                                        i = columnIndex16;
                                        th5 = null;
                                        CloseableKt.closeFinally(r04, (Throwable) null);
                                        y8f = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        str2 = str4;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (r04.moveToNext()) {
                                            if (r04.getInt(columnIndex19) >= 0) {
                                                int i6 = r04.getInt(columnIndex18);
                                                int i7 = columnIndex15;
                                                String string3 = r04.getString(columnIndex20);
                                                int i8 = columnIndex21;
                                                String str9 = r04.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i9 = columnIndex16;
                                                treeMap.put(Integer.valueOf(i6), string3);
                                                treeMap2.put(Integer.valueOf(i6), str9);
                                                columnIndex15 = i7;
                                                columnIndex16 = i9;
                                                columnIndex21 = i8;
                                            }
                                        }
                                        i2 = columnIndex15;
                                        i = columnIndex16;
                                        y8f = new y8f(string2, z, CollectionsKt.toList(treeMap.values()), CollectionsKt.toList(treeMap2.values()));
                                        CloseableKt.closeFinally(r04, (Throwable) null);
                                        th5 = null;
                                    }
                                    if (y8f == null) {
                                        CloseableKt.closeFinally(r03, th5);
                                        set = null;
                                        break;
                                    }
                                    createSetBuilder2.add(y8f);
                                    af62 = af6;
                                    str7 = str8;
                                    str4 = str2;
                                    columnIndex15 = i2;
                                    columnIndex16 = i;
                                } catch (Throwable th6) {
                                    Throwable th7 = th6;
                                    CloseableKt.closeFinally(r04, th4);
                                    throw th7;
                                }
                            }
                        }
                    } else {
                        CloseableKt.closeFinally(r03, (Throwable) null);
                        set = null;
                    }
                    return new z8f(str3, map2, build, set);
                } catch (Throwable th8) {
                    Throwable th9 = th8;
                    CloseableKt.closeFinally(r03, th3);
                    throw th9;
                }
            } catch (Throwable th10) {
                Throwable th11 = th10;
                CloseableKt.closeFinally(r02, th2);
                throw th11;
            }
        } catch (Throwable th12) {
            Throwable th13 = th12;
            CloseableKt.closeFinally(r0, th);
            throw th13;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8f)) {
            return false;
        }
        z8f z8f = (z8f) obj;
        if (!Intrinsics.areEqual((Object) this.a, (Object) z8f.a) || !Intrinsics.areEqual((Object) this.b, (Object) z8f.b) || !Intrinsics.areEqual((Object) this.c, (Object) z8f.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = z8f.d) == null) {
            return true;
        }
        return Intrinsics.areEqual((Object) set2, (Object) set);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

package defpackage;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;

/* renamed from: guf  reason: default package */
public enum guf {
    STRING(3),
    STRINGS_SET(4),
    BIG_STRING(16),
    BIG_STRINGS_SET(17);
    
    public static final bk3 b = null;
    public static final LinkedHashMap c = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, bk3] */
    static {
        guf[] gufArr;
        EnumEntries enumEntries = EnumEntriesKt.enumEntries((E[]) gufArr);
        z = enumEntries;
        b = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntries, 10)), 16));
        for (Object next : enumEntries) {
            linkedHashMap.put(Integer.valueOf(((guf) next).a), next);
        }
        c = linkedHashMap;
    }

    /* access modifiers changed from: public */
    guf(int i) {
        this.a = i;
    }

    public final int a() {
        return this == BIG_STRINGS_SET ? BIG_STRING.a() : this.a;
    }
}

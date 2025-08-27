package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: g72  reason: default package */
public final class g72 implements Serializable {
    public final /* synthetic */ int a = 0;
    public final Serializable b;
    public final ArrayList c;

    public g72(zqd zqd) {
        this.b = (String) zqd.b;
        this.c = (a00) zqd.c;
    }

    public static void e(bl4 bl4) {
        int ordinal = bl4.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            throw new IllegalStateException("Unexpected value: " + bl4);
        }
    }

    public void a(f72 f72, bl4 bl4) {
        d(bl4).add(f72);
        e(bl4);
    }

    public g72 b(boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        List unmodifiableList = z ? Collections.unmodifiableList(arrayList) : new ArrayList(arrayList);
        ArrayList arrayList2 = this.c;
        return new g72(unmodifiableList, z ? Collections.unmodifiableList(arrayList2) : new ArrayList(arrayList2));
    }

    public int c(bl4 bl4) {
        return d(bl4).size();
    }

    public ArrayList d(bl4 bl4) {
        int ordinal = bl4.ordinal();
        if (ordinal == 0) {
            return (ArrayList) this.b;
        }
        if (ordinal == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unexpected value: " + bl4);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Message{text='" + ((String) this.b) + "', attaches=" + ((a00) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public g72() {
        this(new ArrayList(), new ArrayList());
    }

    public g72(List list, List list2) {
        this.b = new ArrayList(list);
        this.c = new ArrayList(list2);
    }
}

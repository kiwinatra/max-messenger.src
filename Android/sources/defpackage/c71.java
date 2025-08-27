package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c71  reason: default package */
public final class c71 extends o5a {
    public final /* synthetic */ int j;
    public final List k;
    public final List l;

    public /* synthetic */ c71(int i, List list, List list2) {
        this.j = i;
        this.k = list;
        this.l = list2;
    }

    public final boolean c(int i, int i2) {
        switch (this.j) {
            case 0:
                return Intrinsics.areEqual(this.k.get(i), this.l.get(i2));
            case 1:
                return Intrinsics.areEqual(this.k.get(i), this.l.get(i2));
            case 2:
                return Intrinsics.areEqual(this.k.get(i), this.l.get(i2));
            case 3:
                return Intrinsics.areEqual(this.k.get(i), this.l.get(i2));
            default:
                return this.k.get(i) == this.l.get(i2);
        }
    }

    public final boolean d(int i, int i2) {
        switch (this.j) {
            case 0:
                return ((y71) this.k.get(i)).c == ((y71) this.l.get(i2)).c;
            case 1:
                return Intrinsics.areEqual((Object) ((x16) this.k.get(i)).a, (Object) ((x16) this.l.get(i2)).a);
            case 2:
                return ((qo5) this.k.get(i)).b == ((qo5) this.l.get(i2)).b;
            case 3:
                return Intrinsics.areEqual((Object) ((y16) this.k.get(i)).a, (Object) ((y16) this.l.get(i2)).a);
            default:
                return ((ar7) this.k.get(i)).c == ((ar7) this.l.get(i2)).c;
        }
    }

    public final int s() {
        switch (this.j) {
            case 0:
                return this.l.size();
            case 1:
                return this.l.size();
            case 2:
                return this.l.size();
            case 3:
                return this.l.size();
            default:
                return this.l.size();
        }
    }

    public final int t() {
        switch (this.j) {
            case 0:
                return this.k.size();
            case 1:
                return this.k.size();
            case 2:
                return this.k.size();
            case 3:
                return this.k.size();
            default:
                return this.k.size();
        }
    }
}

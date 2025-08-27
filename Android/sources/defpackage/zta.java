package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* renamed from: zta  reason: default package */
public final class zta {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final /* synthetic */ aua d;

    public zta(aua aua, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = aua;
                tw8 tw8 = aua.a;
                this.b = tw8.o;
                this.c = tw8.c;
                return;
            default:
                this.d = aua;
                tw8 tw82 = aua.a;
                this.b = tw82.o;
                this.c = tw82.c;
                return;
        }
    }

    public final long a() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final long b() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 0:
                ((Function1) this.d.a.v).invoke(arrayList);
                return;
            default:
                ((Function1) this.d.a.v).invoke(arrayList);
                return;
        }
    }

    public final void d(Collection collection) {
        switch (this.a) {
            case 0:
                ((Function1) this.d.a.w).invoke(collection);
                return;
            default:
                ((Function1) this.d.a.w).invoke(collection);
                return;
        }
    }
}

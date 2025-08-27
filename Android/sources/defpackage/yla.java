package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: yla  reason: default package */
public final class yla extends Lambda implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fma b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yla(fma fma, int i) {
        super(1);
        this.a = i;
        this.b = fma;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.a) {
            case 0:
                we0 we0 = (we0) obj;
                fma fma = this.b;
                ArrayDeque arrayDeque = fma.b;
                ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((xla) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                xla xla = (xla) obj2;
                if (fma.c != null) {
                    fma.c();
                }
                fma.c = xla;
                if (xla != null) {
                    xla.d();
                }
                return Unit.INSTANCE;
            default:
                we0 we02 = (we0) obj;
                fma fma2 = this.b;
                xla xla2 = fma2.c;
                if (xla2 == null) {
                    ArrayDeque arrayDeque2 = fma2.b;
                    ListIterator listIterator2 = arrayDeque2.listIterator(arrayDeque2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((xla) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    xla2 = (xla) obj3;
                }
                if (xla2 != null) {
                    xla2.c(we02);
                }
                return Unit.INSTANCE;
        }
    }
}

package defpackage;

import android.view.View;
import kotlin.collections.CollectionsKt;

/* renamed from: du2  reason: default package */
public final class du2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu2 b;

    public /* synthetic */ du2(View view, eu2 eu2, int i) {
        this.a = i;
        this.b = eu2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                cs2.a.c().b(CollectionsKt.listOf(new zbb(1)));
                eu2 eu2 = this.b;
                eu2.a.s0(eu2);
                return;
            default:
                eu2 eu22 = this.b;
                if (((Boolean) eu22.b.invoke()).booleanValue()) {
                    cs2.a.c().b(CollectionsKt.listOf(new zbb(1)));
                    eu22.a.s0(eu22);
                    return;
                }
                return;
        }
    }
}

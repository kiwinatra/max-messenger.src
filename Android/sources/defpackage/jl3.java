package defpackage;

import android.view.View;
import kotlin.collections.CollectionsKt;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.arch.Widget;

/* renamed from: jl3  reason: default package */
public final /* synthetic */ class jl3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl3 b;

    public /* synthetic */ jl3(kl3 kl3, int i) {
        this.a = i;
        this.b = kl3;
    }

    public final void onClick(View view) {
        kl3 kl3 = this.b;
        switch (this.a) {
            case 0:
                er7 er7 = kl3.N0;
                if (er7 != null) {
                    long j = kl3.P0;
                    s9a s9a = CallHistoryPageScreen.X;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) er7.b;
                    if (((t71) callHistoryPageScreen.e0().x.getValue()).a) {
                        mz6 j2 = callHistoryPageScreen.f0().j(j);
                        if (j2 != null) {
                            callHistoryPageScreen.e0().j(j, j2);
                            return;
                        }
                        return;
                    }
                    mz6 j3 = callHistoryPageScreen.f0().j(j);
                    if (j3 != null) {
                        if (j3 instanceof kz6) {
                            kz6 kz6 = (kz6) j3;
                            b71.b.o1(kz6.b, ((Number) CollectionsKt.first(kz6.c)).longValue());
                            return;
                        } else if (!((Boolean) callHistoryPageScreen.e0().v.getValue()).booleanValue()) {
                            igf igf = new igf(lqa.l);
                            e0b e0b = new e0b((Widget) callHistoryPageScreen);
                            e0b.h(igf);
                            e0b.j();
                            return;
                        } else if (j3 instanceof iz6) {
                            iz6 iz6 = (iz6) j3;
                            b71.b.o1(iz6.b, ((Number) CollectionsKt.first(iz6.d)).longValue());
                            return;
                        } else if (j3 instanceof jz6) {
                            jz6 jz6 = (jz6) j3;
                            b71.b.n1(Long.valueOf(jz6.b), jz6.a, jz6.c);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                er7 er72 = kl3.N0;
                if (er72 != null) {
                    er72.Q(kl3.P0, false);
                    return;
                }
                return;
            default:
                er7 er73 = kl3.N0;
                if (er73 != null) {
                    er73.Q(kl3.P0, true);
                    return;
                }
                return;
        }
    }
}

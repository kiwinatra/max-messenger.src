package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import kotlin.jvm.functions.Function0;
import ru.ok.messages.calls.utils.StartCallsViewModel;
import ru.ok.tamtam.calls.CallDialogFragment;
import ru.ok.tamtam.calls.CallDialogViewModel;

/* renamed from: mq1  reason: default package */
public final class mq1 {
    public final a a;
    public final d19 b;
    public boolean c;
    public int d = 0;

    public mq1(a aVar, d19 d19) {
        this.a = aVar;
        this.b = d19;
        this.c = false;
    }

    public final boolean a(boolean z) {
        a aVar = this.a;
        boolean e = n54.e(aVar.G2(), n54.f);
        boolean e2 = n54.e(aVar.G2(), n54.e);
        boolean z2 = !this.c || n54.e(aVar.O1(), n54.m);
        if (e && e2 && z2) {
            this.d = 6;
            return true;
        } else if (z) {
            this.d = 4;
            boolean z3 = this.c;
            n54.J(aVar, z3 ? n54.j : n54.h, z3 ? qad.H6 : qad.G6);
            return false;
        } else if (!e || !z2) {
            this.d = 3;
            boolean z4 = this.c;
            n54.J(aVar, z4 ? n54.i : n54.g, z4 ? e ? qad.F6 : qad.B6 : qad.E6);
            return false;
        } else {
            this.d = 5;
            return true;
        }
    }

    public final void b() {
        if (this.d == 0) {
            a aVar = this.a;
            boolean e = n54.e(aVar.O1(), n54.f);
            boolean e2 = n54.e(aVar.O1(), n54.e);
            if (e && e2) {
                this.d = 6;
            } else if (e) {
                this.d = 5;
            }
        }
    }

    public final void c(gdb gdb) {
        CallDialogFragment a2;
        gdb gdb2 = gdb;
        int i = gdb2.a;
        js9 js9 = js9.a;
        int i2 = 6;
        d19 d19 = this.b;
        String[] strArr = gdb2.b;
        int[] iArr = gdb2.c;
        if (i == 164) {
            int i3 = this.d;
            boolean z = true;
            if (i3 == 3 || i3 == 4) {
                boolean z2 = i3 == 4;
                if (i3 != 3) {
                    z = false;
                }
                if (n54.X(this.a, strArr, iArr, z2 ? n54.h : n54.g, z2 ? qad.I6 : qad.C6, z2 ? qad.J6 : qad.D6)) {
                    this.d = z2 ? 6 : 5;
                    c cVar = (c) d19.b;
                    CallDialogFragment a3 = uke.a(cVar);
                    if (a3 != null) {
                        CallDialogViewModel callDialogViewModel = (CallDialogViewModel) a3.D1.getValue();
                        if (!z || q8.d(callDialogViewModel.c, "android.permission.RECORD_AUDIO") == 0) {
                            Boolean valueOf = Boolean.valueOf(z);
                            xme xme = callDialogViewModel.m;
                            xme.getClass();
                            xme.m((Object) null, valueOf);
                        } else {
                            o85 o85 = new o85(wc8.a);
                            xme xme2 = callDialogViewModel.o;
                            xme2.getClass();
                            xme2.m((Object) null, o85);
                        }
                    }
                    if (z2 && (a2 = uke.a(cVar)) != null) {
                        CallDialogViewModel callDialogViewModel2 = (CallDialogViewModel) a2.D1.getValue();
                        if (q8.d(callDialogViewModel2.c, "android.permission.CAMERA") == 0) {
                            Boolean bool = Boolean.TRUE;
                            xme xme3 = callDialogViewModel2.n;
                            xme3.getClass();
                            xme3.m((Object) null, bool);
                        } else {
                            o85 o852 = new o85(js9);
                            xme xme4 = callDialogViewModel2.o;
                            xme4.getClass();
                            xme4.m((Object) null, o852);
                        }
                    }
                    Function0 function0 = (Function0) d19.a;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    d19.a = null;
                    return;
                }
                this.d = 0;
                d19.getClass();
                boolean U = n54.U(strArr, iArr, "android.permission.CAMERA");
                StartCallsViewModel startCallsViewModel = (StartCallsViewModel) d19.c;
                c cVar2 = (c) d19.b;
                if (!U) {
                    CallDialogFragment a4 = uke.a(cVar2);
                    if (a4 != null) {
                        Boolean bool2 = Boolean.FALSE;
                        xme xme5 = ((CallDialogViewModel) a4.D1.getValue()).m;
                        xme5.getClass();
                        xme5.m((Object) null, bool2);
                    }
                    startCallsViewModel.g.f("ACTION_ACTION_CALL_ACCESS_DENIED", "CAMERA");
                }
                if (!n54.U(strArr, iArr, "android.permission.RECORD_AUDIO")) {
                    CallDialogFragment a5 = uke.a(cVar2);
                    if (a5 != null) {
                        Boolean bool3 = Boolean.FALSE;
                        xme xme6 = ((CallDialogViewModel) a5.D1.getValue()).n;
                        xme6.getClass();
                        xme6.m((Object) null, bool3);
                    }
                    startCallsViewModel.g.f("ACTION_ACTION_CALL_ACCESS_DENIED", "MIC");
                }
            } else if (i3 == 2 || i3 == 1) {
                if (i3 != 1) {
                    z = false;
                }
                if (n54.X(this.a, strArr, iArr, z ? n54.h : n54.g, z ? qad.I6 : qad.C6, z ? qad.J6 : qad.D6)) {
                    if (!z) {
                        i2 = 5;
                    }
                    this.d = i2;
                    d19.getClass();
                    return;
                }
                this.d = 0;
                d19.getClass();
            }
        } else if (i == 166) {
            if (n54.X(this.a, strArr, iArr, n54.h, qad.K6, qad.L6)) {
                this.d = 6;
                CallDialogFragment a6 = uke.a((c) d19.b);
                if (a6 != null) {
                    CallDialogViewModel callDialogViewModel3 = (CallDialogViewModel) a6.D1.getValue();
                    if (q8.d(callDialogViewModel3.c, "android.permission.CAMERA") == 0) {
                        Boolean bool4 = Boolean.TRUE;
                        xme xme7 = callDialogViewModel3.n;
                        xme7.getClass();
                        xme7.m((Object) null, bool4);
                        return;
                    }
                    o85 o853 = new o85(js9);
                    xme xme8 = callDialogViewModel3.o;
                    xme8.getClass();
                    xme8.m((Object) null, o853);
                }
            }
        }
    }
}

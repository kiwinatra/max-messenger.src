package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: dve  reason: default package */
public final class dve implements mza {
    public final /* synthetic */ StickersShowcaseScreen a;

    public dve(StickersShowcaseScreen stickersShowcaseScreen) {
        this.a = stickersShowcaseScreen;
    }

    public final void C(CharSequence charSequence) {
        aje aje;
        KProperty[] kPropertyArr = StickersShowcaseScreen.Y;
        mve d0 = this.a.d0();
        iue iue = d0.v;
        if (!iue.a() && (aje = d0.c.g) != null) {
            aje.b((CancellationException) null);
        }
        String valueOf = String.valueOf(charSequence);
        AtomicReference atomicReference = iue.g;
        if (!Intrinsics.areEqual((Object) valueOf, (Object) ((eue) atomicReference.get()).b)) {
            aje aje2 = iue.h;
            if (aje2 != null) {
                aje2.b((CancellationException) null);
            }
            int length = valueOf.length();
            xme xme = iue.d;
            xme xme2 = iue.f;
            if (length == 0) {
                pm7 pm7 = (pm7) iue.i.getValue(iue, iue.j[0]);
                if (pm7 != null) {
                    pm7.b((CancellationException) null);
                }
                xme.setValue(iue.k);
                atomicReference.set(new eue((String) null, 3));
                xme2.setValue((Object) null);
                return;
            }
            fue fue = new fue(1, true, (List) null);
            xme.getClass();
            xme.m((Object) null, fue);
            xme2.getClass();
            xme2.m((Object) null, valueOf);
        }
    }
}

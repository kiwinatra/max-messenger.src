package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: kj9  reason: default package */
public final class kj9 extends jj9 {
    public final ch t;
    public final LinkedHashMap u = new LinkedHashMap();

    public kj9(ch chVar) {
        this.t = chVar;
        this.g = false;
    }

    public final boolean a(pzc pzc, ft ftVar, ft ftVar2) {
        h(pzc);
        return false;
    }

    public final boolean b(pzc pzc, pzc pzc2, ft ftVar, ft ftVar2) {
        pzc pzc3 = pzc2;
        ft ftVar3 = ftVar;
        mi9 mi9 = null;
        if ((ftVar3 instanceof gj9) && (pzc3 instanceof mb9) && ((mb9) pzc3).d()) {
            for (ni9 ni9 : ((gj9) ftVar3).d) {
                boolean z = ni9.a;
                mi9 mi92 = ni9.c;
                if (mi92 != null) {
                    mi9 = mi92;
                }
            }
            if (mi9 == null) {
                h(pzc3);
                return false;
            }
        }
        mi9 mi93 = mi9;
        if (mi93 == null || (!(pzc3 instanceof le7) && !(pzc3 instanceof dk3))) {
            h(pzc3);
            return false;
        }
        z70 z70 = (z70) pzc3.a.findViewById(lic.view_audio_attach__transcription);
        LinkedHashMap linkedHashMap = this.u;
        boolean z2 = mi93.a;
        ch chVar = this.t;
        String str = mi93.b;
        if (z2) {
            if (chVar.q()) {
                ValueAnimator valueAnimator = (ValueAnimator) linkedHashMap.get(pzc3);
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                z70.b(str, true);
                z70.measure(View.MeasureSpec.makeMeasureSpec(z70.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = z70.getMeasuredHeight();
                z70.b(str, true);
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{z70.getCollapsedHeight(), measuredHeight});
                ug ugVar = chVar.a;
                ofInt.setInterpolator(ugVar.d());
                ofInt.addUpdateListener(new fj9(z70, measuredHeight, 0));
                ofInt.addListener(new ij9(this, pzc2, z70, z70, mi93, pzc2, z70, ofInt));
                z70.b(str, true);
                ofInt.setDuration(ugVar.b()).start();
            } else {
                z70.b(str, true);
            }
        } else if (chVar.q()) {
            ValueAnimator valueAnimator2 = (ValueAnimator) linkedHashMap.get(pzc3);
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            int measuredHeight2 = z70.getMeasuredHeight();
            ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{measuredHeight2, z70.getCollapsedHeight()});
            ug ugVar2 = chVar.a;
            ofInt2.setInterpolator(ugVar2.l());
            ofInt2.addUpdateListener(new fj9(z70, measuredHeight2, 1));
            ofInt2.addListener(new hj9(this, pzc2, z70, mi93, pzc2, z70, ofInt2));
            ofInt2.setDuration(ugVar2.b()).start();
        } else {
            z70.b(str, false);
        }
        return true;
    }

    public final boolean c(pzc pzc, ft ftVar, ft ftVar2) {
        h(pzc);
        return false;
    }

    public final boolean d(pzc pzc, ft ftVar, ft ftVar2) {
        h(pzc);
        return false;
    }

    public final boolean f(pzc pzc, List list) {
        return true;
    }

    public final void j(pzc pzc) {
        super.j(pzc);
        LinkedHashMap linkedHashMap = this.u;
        ValueAnimator valueAnimator = (ValueAnimator) linkedHashMap.get(pzc);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        linkedHashMap.remove(pzc);
    }

    public final long l() {
        return 150;
    }

    public final long m() {
        return 150;
    }

    public final boolean q(pzc pzc) {
        g(pzc);
        return false;
    }

    public final boolean r(pzc pzc, pzc pzc2, int i, int i2, int i3, int i4) {
        h(pzc2);
        return false;
    }

    public final boolean s(pzc pzc, int i, int i2, int i3, int i4) {
        h(pzc);
        return false;
    }

    public final void t(pzc pzc) {
        h(pzc);
    }

    public final boolean u(pzc pzc) {
        return true;
    }
}

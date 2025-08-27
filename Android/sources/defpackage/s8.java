package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: s8  reason: default package */
public final class s8 extends e9d {
    public bv7 j;
    public final jq5 k = new jq5(10);

    public s8() {
        this.e = 1;
    }

    public final void J(int i, String str) {
        this.j.N0(i, str);
    }

    public final void M(String str, String[] strArr, int i) {
        this.j.i1(str, strArr, i);
    }

    public final void N(Bundle bundle) {
        super.N(bundle);
        jq5 jq5 = this.k;
        jq5.getClass();
        jq5.b = bundle.getInt("TransactionIndexer.currentIndex");
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("TransactionIndexer.currentIndex", this.k.b);
    }

    public final void T(Intent intent) {
        this.j.startActivity(intent);
    }

    public final void U(String str, Intent intent, int i) {
        this.j.M0(str, intent, i, (Bundle) null);
    }

    public final void V(String str, Intent intent, int i, Bundle bundle) {
        this.j.M0(str, intent, i, bundle);
    }

    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.j.R(str, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void Y(String str) {
        this.j.J(str);
    }

    public final void Z(bv7 bv7, ViewGroup viewGroup) {
        if (this.j != bv7 || this.i != viewGroup) {
            ViewGroup viewGroup2 = this.i;
            if (viewGroup2 != null && (viewGroup2 instanceof dy3)) {
                K((dy3) viewGroup2);
            }
            if (viewGroup instanceof dy3) {
                a((dy3) viewGroup);
            }
            this.j = bv7;
            this.i = viewGroup;
            viewGroup.post(new tj7(24, this));
        }
    }

    public final Activity d() {
        bv7 bv7 = this.j;
        if (bv7 != null) {
            return bv7.c();
        }
        return null;
    }

    public final e9d i() {
        return this;
    }

    public final List j() {
        return this.j.I1();
    }

    public final jq5 k() {
        return this.k;
    }

    public final void o() {
        if (this.j != null && d() != null) {
            d().invalidateOptionsMenu();
        }
    }

    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        if (!z) {
            this.j = null;
        }
    }
}

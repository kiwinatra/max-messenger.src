package com.bluelinelabs.conductor.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/bluelinelabs/conductor/internal/AndroidXLifecycleHandlerImpl;", "Landroidx/fragment/app/a;", "Lbv7;", "Ldv7;", "<init>", "()V", "conductor_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidXLifecycleHandlerImpl extends a implements bv7, dv7 {
    public final cv7 l1 = new cv7(true);

    public AndroidXLifecycleHandlerImpl() {
        O2();
        M2(true);
    }

    public final void G(String str, String[] strArr, int i) {
        j4b.P(this, str, strArr, i);
    }

    public final List I1() {
        return CollectionsKt.toList(this.l1.j.values());
    }

    public final void J(String str) {
        j4b.Q(this, str);
    }

    public final void M0(String str, Intent intent, int i, Bundle bundle) {
        U2(i, str);
        S2(intent, i, bundle);
    }

    public final void N0(int i, String str) {
        U2(i, str);
    }

    public final void R(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        we weVar = new we(this, intentSender, i, intent, i2, i3, i4, bundle, 0);
        String str2 = str;
        int i5 = i;
        U2(i, str);
        weVar.invoke();
    }

    public final void T2() {
        j4b.K(this);
    }

    public final void U2(int i, String str) {
        h().h.put(i, str);
    }

    public final Activity c() {
        return this.l1.b;
    }

    public final void f2(int i, int i2, Intent intent) {
        super.f2(i, i2, intent);
        j4b.H(this, i, i2, intent);
    }

    public final cv7 h() {
        return this.l1;
    }

    public final void h2(Context context) {
        super.h2(context);
        j4b.I(this, context);
    }

    public final void i1(String str, String[] strArr, int i) {
        j4b.P(this, str, strArr, i);
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        j4b.J(this, bundle);
    }

    public final void j2(Menu menu, MenuInflater menuInflater) {
        for (s8 v : j4b.F(this)) {
            v.v(menu, menuInflater);
        }
    }

    public final void l2() {
        this.Q0 = true;
        j4b.K(this);
    }

    public final void n2() {
        this.Q0 = true;
        h().e = false;
        Activity activity = h().b;
        if (activity != null) {
            j4b.o(this, activity.isChangingConfigurations());
        }
    }

    public final void o1(Activity activity) {
        j4b.O(this, activity, this);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        j4b.Y(this, activity);
    }

    public final void onActivityDestroyed(Activity activity) {
        ev7.a.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        j4b.Z(this, activity);
    }

    public final void onActivityPreDestroyed(Activity activity) {
        if (h().b == activity && !activity.isChangingConfigurations()) {
            T2();
        }
    }

    public final void onActivityResumed(Activity activity) {
        j4b.a0(this, activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j4b.b0(this, activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
        j4b.c0(this, activity);
    }

    public final void onActivityStopped(Activity activity) {
        j4b.d0(this, activity);
    }

    public final boolean s2(MenuItem menuItem) {
        return j4b.L(this, menuItem, new ve(this, menuItem));
    }

    public final s8 u0(ViewGroup viewGroup, Bundle bundle) {
        return j4b.E(this, viewGroup, bundle, this);
    }

    public final void u2(Menu menu) {
        for (s8 x : j4b.F(this)) {
            x.x(menu);
        }
    }

    public final void v2(int i, String[] strArr, int[] iArr) {
        j4b.M(this, i, strArr, iArr);
    }

    public final void x2(Bundle bundle) {
        j4b.N(this, bundle);
    }
}

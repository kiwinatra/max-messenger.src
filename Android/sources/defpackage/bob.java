package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: bob  reason: default package */
public final class bob extends Fragment implements bv7, dv7 {
    public final cv7 a = new cv7(false);

    public bob() {
        setRetainInstance(true);
        setHasOptionsMenu(true);
    }

    public final void G(String str, String[] strArr, int i) {
        j4b.P(this, str, strArr, i);
    }

    public final List I1() {
        return CollectionsKt.toList(this.a.j.values());
    }

    public final void J(String str) {
        j4b.Q(this, str);
    }

    public final void M0(String str, Intent intent, int i, Bundle bundle) {
        e(i, str);
        startActivityForResult(intent, i, bundle);
    }

    public final void N0(int i, String str) {
        e(i, str);
    }

    public final void R(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        we weVar = new we(this, intentSender, i, intent, i2, i3, i4, bundle, 1);
        String str2 = str;
        int i5 = i;
        e(i, str);
        weVar.invoke();
    }

    public final Activity c() {
        return this.a.b;
    }

    public final void d() {
        j4b.K(this);
    }

    public final void e(int i, String str) {
        h().h.put(i, str);
    }

    public final cv7 h() {
        return this.a;
    }

    public final void i1(String str, String[] strArr, int i) {
        j4b.P(this, str, strArr, i);
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
            d();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        j4b.H(this, i, i2, intent);
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

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        j4b.I(this, activity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j4b.J(this, bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        for (s8 v : j4b.F(this)) {
            v.v(menu, menuInflater);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        j4b.K(this);
    }

    public final void onDetach() {
        super.onDetach();
        h().e = false;
        Activity activity = h().b;
        if (activity != null) {
            j4b.o(this, activity.isChangingConfigurations());
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return j4b.L(this, menuItem, new aob(0, this, menuItem));
    }

    public final void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        for (s8 x : j4b.F(this)) {
            x.x(menu);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        j4b.M(this, i, strArr, iArr);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        j4b.N(this, bundle);
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        Boolean bool;
        aob aob = new aob(1, this, str);
        for (s8 s8Var : j4b.F(this)) {
            Iterator it = s8Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bool = null;
                    continue;
                    break;
                }
                i9d i9d = (i9d) it.next();
                if (i9d.a.didRequestPermission(str)) {
                    bool = Boolean.valueOf(i9d.a.shouldShowRequestPermissionRationale(str));
                    continue;
                    break;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return ((Boolean) aob.invoke()).booleanValue();
    }

    public final s8 u0(ViewGroup viewGroup, Bundle bundle) {
        return j4b.E(this, viewGroup, bundle, this);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        j4b.I(this, context);
    }
}

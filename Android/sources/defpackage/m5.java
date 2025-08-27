package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import one.me.android.MainActivity;
import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: m5  reason: default package */
public abstract class m5 extends hn implements xhf, vuf {
    public scf X;
    public int Y;
    public boolean Z;
    public final HashSet v0 = new HashSet();
    public l5 w0;
    public dm4 x;
    public long x0 = 0;
    public t8 y;
    public HashMap y0;
    public gdb z;

    public static void C(scf scf, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar instanceof FrgBase) {
                FrgBase frgBase = (FrgBase) aVar;
                frgBase.r1 = scf;
                View view = frgBase.S0;
                if (frgBase instanceof wcf) {
                    ((wcf) frgBase).L0(scf);
                } else if (view != null) {
                    frgBase.Z2(view);
                }
            } else if (aVar instanceof wcf) {
                ((wcf) aVar).L0(scf);
            }
            C(scf, aVar.N1().c.f());
        }
    }

    public final void D() {
        super.finish();
        if (((qra) ((id3) this.x.b)).y().c.u()) {
            overridePendingTransition(0, 17432577);
        }
    }

    public abstract String E();

    public void F() {
    }

    public final void G(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(K0().c ? 3846 : 3862);
    }

    public void H(int i, int i2, Intent intent) {
    }

    public void J() {
        z68.a("m5", "onLogout " + getLocalClassName());
        setResult(0);
        finishAffinity();
    }

    public final void K() {
        q8.M(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(sic.view_tree_view_model_store_owner, this);
        iq.V(getWindow().getDecorView(), this);
    }

    public scf K0() {
        return this.X;
    }

    public final void L(int i) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(IntCompanionObject.MIN_VALUE);
        window.setStatusBarColor(i);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    public final void M(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(K0().c ? 1792 : 1808);
    }

    public boolean Q() {
        return this instanceof MainActivity;
    }

    public final void R() {
        if (((qra) ((id3) this.x.b)).y().c.g.getBoolean("app.pinLock.screenshotEnabled", true)) {
            getWindow().clearFlags(ConstantsKt.DEFAULT_BUFFER_SIZE);
        } else {
            getWindow().addFlags(ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        super.addContentView(view, layoutParams);
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        if (configuration != null) {
            String q = ((qra) ym.e()).y().a.q();
            if (!TextUtils.isEmpty(q)) {
                Context baseContext = getBaseContext();
                int i = b0h.g;
                configuration.setTo(baseContext.getResources().getConfiguration());
                Locale locale = new Locale(q);
                Locale.setDefault(locale);
                configuration.fontScale = c44.DEFAULT_ASPECT_RATIO;
                configuration.setLocale(locale);
            }
        }
        super.applyOverrideConfiguration(configuration);
    }

    public final void attachBaseContext(Context context) {
        String q = ((qra) ym.e()).y().a.q();
        if (!TextUtils.isEmpty(q)) {
            int i = b0h.g;
            if (!cvg.A(q)) {
                Locale locale = new Locale(q);
                Locale.setDefault(locale);
                Configuration configuration = new Configuration();
                configuration.fontScale = c44.DEFAULT_ASPECT_RATIO;
                configuration.setLocale(locale);
                configuration.setLayoutDirection(locale);
                context = context.createConfigurationContext(configuration);
            }
            super.attachBaseContext(context);
            return;
        }
        super.attachBaseContext(context);
    }

    public void finish() {
        super.finish();
        if (!((qra) ((id3) this.x.b)).y().c.u()) {
            overridePendingTransition(0, 0);
        }
    }

    public final Resources.Theme getTheme() {
        int i;
        Resources.Theme theme = super.getTheme();
        scf K0 = K0();
        if (!(K0 == null || !K0.c || (i = this.Y) == rad.c || i == rad.d || i == rad.e || i == rad.f || i == rad.b)) {
            theme.applyStyle(rad.a, true);
        }
        return theme;
    }

    public final boolean isActive() {
        return this.Z;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.Z) {
            H(i, i2, intent);
        } else {
            this.y = new t8(i, i2, intent);
        }
    }

    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z2) {
        this.Y = i;
        super.onApplyThemeResource(theme, i, z2);
    }

    public void onBackPressed() {
        if (this.Z) {
            for (a aVar : v().c.f()) {
                if (aVar != null && aVar.d2() && (aVar instanceof FrgBase) && ((FrgBase) aVar).d3()) {
                    return;
                }
            }
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        bpg bpg = (bpg) ((qra) ym.e()).getAccessor().g(bpg.class);
        bpg.getClass();
        z68.c("bpg", "enableWorkManager", new Object[0]);
        bpg.b.d();
        Object lastCustomNonConfigurationInstance = getLastCustomNonConfigurationInstance();
        if (lastCustomNonConfigurationInstance == null || !(lastCustomNonConfigurationInstance instanceof Map)) {
            this.y0 = new HashMap();
        } else {
            this.y0 = (HashMap) lastCustomNonConfigurationInstance;
        }
        this.x = new dm4(ym.e());
        this.X = ((qra) ym.e()).I().c();
        ed6 v = v();
        v.p.add(new k5(this));
        R();
        super.onCreate(bundle);
        z68.c("m5", "onCreate: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (!((qra) ((id3) this.x.b)).y().c.u()) {
            overridePendingTransition(0, 0);
        }
        zq0 d = ((qra) ((id3) this.x.b)).j().d();
        if (!d.a) {
            J();
        } else if (d.b) {
            ((qra) ((id3) this.x.b)).k().getClass();
            z68.g("m5", "onCreate: %s. authorized external, no current active call, logout", getLocalClassName());
            J();
        }
        if (bundle != null) {
            ryg.L(bundle, this.v0);
        }
        ((qra) ((id3) this.x.b)).J().d(this);
        this.w0 = new l5(this);
        ((qra) ((id3) this.x.b)).J().d(this.w0);
    }

    public void onDestroy() {
        super.onDestroy();
        try {
            ((qra) ((id3) this.x.b)).J().f(this);
            ((qra) ((id3) this.x.b)).J().f(this.w0);
        } catch (Exception unused) {
        }
        z68.c("m5", "onDestroy: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (!isChangingConfigurations()) {
            for (Object next : this.y0.values()) {
                if (next instanceof m23) {
                    ((m23) next).a();
                }
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (a aVar : v().c.f()) {
            if (aVar instanceof dq7) {
                ((dq7) aVar).t(i, keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        z68.a("m5", "onNewIntent: intent =" + intent + " " + getLocalClassName() + "@" + hashCode());
        super.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        z68.c("m5", "onPause: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        ((qra) ((id3) this.x.b)).x().getClass();
        this.Z = false;
        if (!TextUtils.isEmpty(E())) {
            ((qra) ((id3) this.x.b)).c().k(SystemClock.elapsedRealtime() - this.x0, E());
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        n54.E(this, strArr, iArr);
        if (!this.Z) {
            this.z = new gdb(i, strArr, iArr);
        }
        if (Arrays.asList(strArr).contains("android.permission.READ_CONTACTS") && n54.e(this, n54.d)) {
            ((meb) ((deb) ((sjd) tr1.h((qra) ((id3) this.x.b))).getAccessor().g(deb.class))).c();
        }
    }

    public void onResume() {
        super.onResume();
        this.x0 = SystemClock.elapsedRealtime();
        ((qra) ((id3) this.x.b)).x().getClass();
        z68.c("m5", "onResume: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        if (!TextUtils.isEmpty(E())) {
            z68.c("m5", "sendScreen: onResume " + E(), new Object[0]);
        }
    }

    public final Object onRetainCustomNonConfigurationInstance() {
        return this.y0;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        HashSet hashSet = this.v0;
        int i = ryg.i;
        z68.a("ryg", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    public void onStart() {
        super.onStart();
        nlb x2 = ((qra) ((id3) this.x.b)).x();
        boolean b = x2.b(this);
        if (b) {
            Intent intent = new Intent(x2.a, x2.b);
            intent.putExtra("type", 2);
            intent.addFlags(131072);
            startActivity(intent);
        }
        if (!((udg) x2.d).c()) {
            x2.e = x2.e;
        }
        if (!x2.e && !b) {
            x2.c.k("pinLock.lastActiveTime", Long.valueOf(SystemClock.elapsedRealtime()));
        }
        z68.c("nlb", "onActivityStarted: forceCheck = %s", Boolean.valueOf(x2.e));
        z68.c("m5", "onStart: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
    }

    public void onStop() {
        super.onStop();
        z68.c("m5", "onStop: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        nlb x2 = ((qra) ((id3) this.x.b)).x();
        if (!x2.e && !x2.b(this)) {
            x2.c.k("pinLock.lastActiveTime", Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public void onUserLeaveHint() {
        for (a aVar : v().c.f()) {
            if (aVar instanceof FrgBase) {
                ((FrgBase) aVar).getClass();
            }
        }
        super.onUserLeaveHint();
    }

    public final void setContentView(int i) {
        K();
        super.setContentView(i);
    }

    public void z() {
        super.z();
        z68.c("m5", "onResumeFragments: " + getLocalClassName() + "@" + hashCode(), new Object[0]);
        this.Z = true;
        if (((qra) ((id3) this.x.b)).j().e()) {
            jd8 J = ((qra) ((id3) this.x.b)).J();
            HashSet hashSet = this.v0;
            int i = ryg.i;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                J.c((ij0) it.next());
            }
            hashSet.clear();
        } else {
            J();
        }
        if (this.z != null) {
            this.z = null;
        }
        t8 t8Var = this.y;
        if (t8Var != null) {
            H(t8Var.a, t8Var.b, t8Var.c);
            this.y = null;
        }
    }

    public void setContentView(View view) {
        K();
        super.setContentView(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        K();
        super.setContentView(view, layoutParams);
    }
}

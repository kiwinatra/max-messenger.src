package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: ong  reason: default package */
public final class ong extends b59 implements b7 {
    public static final AccelerateInterpolator U = new AccelerateInterpolator();
    public static final DecelerateInterpolator V = new DecelerateInterpolator();
    public ha4 A;
    public ActionBarContextView B;
    public final View C;
    public boolean D;
    public nng E;
    public nng F;
    public a8 G;
    public boolean H;
    public final ArrayList I = new ArrayList();
    public int J = 0;
    public boolean K = true;
    public boolean L;
    public boolean M;
    public boolean N = true;
    public nqe O;
    public boolean P;
    public boolean Q;
    public final mng R = new mng(this, 0);
    public final mng S = new mng(this, 1);
    public final p1e T = new p1e((Object) this);
    public Context w;
    public Context x;
    public ActionBarOverlayLayout y;
    public ActionBarContainer z;

    public ong(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        i0(decorView);
        if (!z2) {
            this.C = decorView.findViewById(16908290);
        }
    }

    public final int E() {
        return ((omf) this.A).b;
    }

    public final Context G() {
        if (this.x == null) {
            TypedValue typedValue = new TypedValue();
            this.w.getTheme().resolveAttribute(hdc.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.x = new ContextThemeWrapper(this.w, i);
            } else {
                this.x = this.w;
            }
        }
        return this.x;
    }

    public final void M() {
        j0(this.w.getResources().getBoolean(ndc.abc_action_bar_embed_tabs));
    }

    public final boolean O(int i, KeyEvent keyEvent) {
        m69 m69;
        nng nng = this.E;
        if (nng == null || (m69 = nng.o) == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        m69.setQwertyMode(z2);
        return m69.performShortcut(i, keyEvent, 0);
    }

    public final void W(boolean z2) {
        if (!this.D) {
            int i = z2 ? 4 : 0;
            omf omf = (omf) this.A;
            int i2 = omf.b;
            this.D = true;
            omf.a((i & 4) | (i2 & -5));
        }
    }

    public final void X(boolean z2) {
        nqe nqe;
        this.P = z2;
        if (!z2 && (nqe = this.O) != null) {
            nqe.a();
        }
    }

    public final void Y(CharSequence charSequence) {
        omf omf = (omf) this.A;
        if (!omf.g) {
            omf.h = charSequence;
            if ((omf.b & 8) != 0) {
                Toolbar toolbar = omf.a;
                toolbar.setTitle(charSequence);
                if (omf.g) {
                    gag.k(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final b8 b0(p7d p7d) {
        nng nng = this.E;
        if (nng != null) {
            nng.a();
        }
        this.y.setHideOnContentScrollEnabled(false);
        this.B.e();
        nng nng2 = new nng(this, this.B.getContext(), p7d);
        m69 m69 = nng2.o;
        m69.w();
        try {
            if (!nng2.v.k(nng2, m69)) {
                return null;
            }
            this.E = nng2;
            nng2.g();
            this.B.c(nng2);
            h0(true);
            return nng2;
        } finally {
            m69.v();
        }
    }

    public final void h0(boolean z2) {
        ecg ecg;
        ecg ecg2;
        if (z2) {
            if (!this.M) {
                this.M = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.y;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                k0(false);
            }
        } else if (this.M) {
            this.M = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.y;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            k0(false);
        }
        if (this.z.isLaidOut()) {
            if (z2) {
                omf omf = (omf) this.A;
                ecg2 = gag.a(omf.a);
                ecg2.a(c44.DEFAULT_ASPECT_RATIO);
                ecg2.c(100);
                ecg2.d(new nmf(omf, 4));
                ecg = this.B.i(0, 200);
            } else {
                omf omf2 = (omf) this.A;
                ecg a = gag.a(omf2.a);
                a.a(1.0f);
                a.c(200);
                a.d(new nmf(omf2, 0));
                ecg ecg3 = a;
                ecg2 = this.B.i(8, 100);
                ecg = ecg3;
            }
            nqe nqe = new nqe();
            ArrayList arrayList = (ArrayList) nqe.c;
            arrayList.add(ecg2);
            View view = (View) ecg2.a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) ecg.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            arrayList.add(ecg);
            nqe.b();
        } else if (z2) {
            ((omf) this.A).a.setVisibility(4);
            this.B.setVisibility(0);
        } else {
            ((omf) this.A).a.setVisibility(0);
            this.B.setVisibility(8);
        }
    }

    public final void i0(View view) {
        ha4 ha4;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(egc.decor_content_parent);
        this.y = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(egc.action_bar);
        if (findViewById instanceof ha4) {
            ha4 = (ha4) findViewById;
        } else if (findViewById instanceof Toolbar) {
            ha4 = ((Toolbar) findViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.A = ha4;
        this.B = (ActionBarContextView) view.findViewById(egc.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(egc.action_bar_container);
        this.z = actionBarContainer;
        ha4 ha42 = this.A;
        if (ha42 == null || this.B == null || actionBarContainer == null) {
            throw new IllegalStateException(ong.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((omf) ha42).a.getContext();
        this.w = context;
        if ((((omf) this.A).b & 4) != 0) {
            this.D = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.A.getClass();
        j0(context.getResources().getBoolean(ndc.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.w.obtainStyledAttributes((AttributeSet) null, koc.ActionBar, hdc.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(koc.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.y;
            if (actionBarOverlayLayout2.x) {
                this.Q = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(koc.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.z;
            WeakHashMap weakHashMap = gag.a;
            v9g.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean j() {
        fmf fmf;
        ha4 ha4 = this.A;
        if (ha4 == null || (fmf = ((omf) ha4).a.Y0) == null || fmf.b == null) {
            return false;
        }
        fmf fmf2 = ((omf) ha4).a.Y0;
        u69 u69 = fmf2 == null ? null : fmf2.b;
        if (u69 == null) {
            return true;
        }
        u69.collapseActionView();
        return true;
    }

    public final void j0(boolean z2) {
        if (!z2) {
            ((omf) this.A).getClass();
            this.z.setTabContainer((mid) null);
        } else {
            this.z.setTabContainer((mid) null);
            ((omf) this.A).getClass();
        }
        ((omf) this.A).getClass();
        ((omf) this.A).a.setCollapsible(false);
        this.y.setHasNonEmbeddedTabs(false);
    }

    public final void k0(boolean z2) {
        boolean z3 = this.M || !this.L;
        View view = this.C;
        z00 z00 = null;
        p1e p1e = this.T;
        if (z3) {
            if (!this.N) {
                this.N = true;
                nqe nqe = this.O;
                if (nqe != null) {
                    nqe.a();
                }
                this.z.setVisibility(0);
                int i = this.J;
                mng mng = this.S;
                if (i != 0 || (!this.P && !z2)) {
                    this.z.setAlpha(1.0f);
                    this.z.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    if (this.K && view != null) {
                        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    }
                    mng.c();
                } else {
                    this.z.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
                    float f = (float) (-this.z.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.z.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.z.setTranslationY(f);
                    nqe nqe2 = new nqe();
                    ecg a = gag.a(this.z);
                    a.e(c44.DEFAULT_ASPECT_RATIO);
                    View view2 = (View) a.a.get();
                    if (view2 != null) {
                        if (p1e != null) {
                            z00 = new z00(p1e, view2);
                        }
                        view2.animate().setUpdateListener(z00);
                    }
                    boolean z4 = nqe2.b;
                    ArrayList arrayList = (ArrayList) nqe2.c;
                    if (!z4) {
                        arrayList.add(a);
                    }
                    if (this.K && view != null) {
                        view.setTranslationY(f);
                        ecg a2 = gag.a(view);
                        a2.e(c44.DEFAULT_ASPECT_RATIO);
                        if (!nqe2.b) {
                            arrayList.add(a2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = V;
                    boolean z5 = nqe2.b;
                    if (!z5) {
                        nqe2.d = decelerateInterpolator;
                    }
                    if (!z5) {
                        nqe2.a = 250;
                    }
                    if (!z5) {
                        nqe2.e = mng;
                    }
                    this.O = nqe2;
                    nqe2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.y;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = gag.a;
                    t9g.c(actionBarOverlayLayout);
                }
            }
        } else if (this.N) {
            this.N = false;
            nqe nqe3 = this.O;
            if (nqe3 != null) {
                nqe3.a();
            }
            int i2 = this.J;
            mng mng2 = this.R;
            if (i2 != 0 || (!this.P && !z2)) {
                mng2.c();
                return;
            }
            this.z.setAlpha(1.0f);
            this.z.setTransitioning(true);
            nqe nqe4 = new nqe();
            float f2 = (float) (-this.z.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.z.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            ecg a3 = gag.a(this.z);
            a3.e(f2);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                if (p1e != null) {
                    z00 = new z00(p1e, view3);
                }
                view3.animate().setUpdateListener(z00);
            }
            boolean z6 = nqe4.b;
            ArrayList arrayList2 = (ArrayList) nqe4.c;
            if (!z6) {
                arrayList2.add(a3);
            }
            if (this.K && view != null) {
                ecg a4 = gag.a(view);
                a4.e(f2);
                if (!nqe4.b) {
                    arrayList2.add(a4);
                }
            }
            AccelerateInterpolator accelerateInterpolator = U;
            boolean z7 = nqe4.b;
            if (!z7) {
                nqe4.d = accelerateInterpolator;
            }
            if (!z7) {
                nqe4.a = 250;
            }
            if (!z7) {
                nqe4.e = mng2;
            }
            this.O = nqe4;
            nqe4.b();
        }
    }

    public final void t(boolean z2) {
        if (z2 != this.H) {
            this.H = z2;
            ArrayList arrayList = this.I;
            if (arrayList.size() > 0) {
                rae.w(arrayList.get(0));
                throw null;
            }
        }
    }

    public ong(Dialog dialog) {
        new ArrayList();
        i0(dialog.getWindow().getDecorView());
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import one.me.sdk.arch.Widget;

/* renamed from: zx3  reason: default package */
public abstract class zx3 {
    private static final String KEY_ARGS = "Controller.args";
    private static final String KEY_CHILD_ROUTERS = "Controller.childRouters";
    private static final String KEY_CLASS_NAME = "Controller.className";
    private static final String KEY_INSTANCE_ID = "Controller.instanceId";
    private static final String KEY_NEEDS_ATTACH = "Controller.needsAttach";
    private static final String KEY_OVERRIDDEN_POP_HANDLER = "Controller.overriddenPopHandler";
    private static final String KEY_OVERRIDDEN_PUSH_HANDLER = "Controller.overriddenPushHandler";
    private static final String KEY_REQUESTED_PERMISSIONS = "Controller.requestedPermissions";
    private static final String KEY_RETAIN_VIEW_MODE = "Controller.retainViewMode";
    private static final String KEY_SAVED_STATE = "Controller.savedState";
    private static final String KEY_TARGET_INSTANCE_ID = "Controller.target.instanceId";
    private static final String KEY_VIEW_STATE = "Controller.viewState";
    static final String KEY_VIEW_STATE_BUNDLE = "Controller.viewState.bundle";
    private static final String KEY_VIEW_STATE_HIERARCHY = "Controller.viewState.hierarchy";
    private final Bundle args;
    private boolean attached;
    private boolean attachedToUnownedParent;
    private boolean awaitingParentAttach;
    private final List<iy3> childRouters = new ArrayList();
    private boolean destroyed;
    private WeakReference<View> destroyedView;
    private boolean hasOptionsMenu;
    private boolean hasSavedViewState;
    String instanceId;
    boolean isBeingDestroyed;
    private boolean isContextAvailable;
    boolean isDetachFrozen;
    private boolean isPerformingExitTransition;
    private final List<xx3> lifecycleListeners = new ArrayList();
    public final jv7 lifecycleOwner;
    private boolean needsAttach;
    final xla onBackPressedCallback;
    boolean onBackPressedDispatcherEnabled;
    private final ArrayList<f9d> onRouterSetListeners = new ArrayList<>();
    private boolean optionsMenuHidden;
    private ey3 overriddenPopHandler;
    private ey3 overriddenPushHandler;
    private zx3 parentController;
    private final ArrayList<String> requestedPermissions = new ArrayList<>();
    private yx3 retainViewMode = yx3.a;
    e9d router;
    private Bundle savedInstanceState;
    private String targetInstanceId;
    View view;
    private m9g viewAttachHandler;
    boolean viewIsAttached;
    Bundle viewState;
    boolean viewWasDetached;

    /* JADX WARNING: type inference failed for: r6v6, types: [v6b, java.lang.Object] */
    public zx3(Bundle bundle) {
        Constructor constructor;
        Widget widget = (Widget) this;
        this.onBackPressedCallback = new wx3(widget, 0);
        this.lifecycleOwner = new tu1(widget);
        this.args = bundle == null ? new Bundle(getClass().getClassLoader()) : bundle;
        this.instanceId = UUID.randomUUID().toString();
        Constructor[] constructors = getClass().getConstructors();
        if (Q(constructors) == null) {
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i++;
            }
            if (constructor == null) {
                throw new RuntimeException(getClass() + " does not have a constructor that takes a Bundle argument or a default constructor. Controllers must have one of these in order to restore their states.");
            }
        }
        ? obj = new Object();
        obj.o = Bundle.EMPTY;
        addLifecycleListener(new t6b((v6b) obj, widget));
    }

    public static Constructor Q(Constructor[] constructorArr) {
        for (Constructor constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0] == Bundle.class) {
                return constructor;
            }
        }
        return null;
    }

    public static zx3 newInstance(Bundle bundle) {
        zx3 zx3;
        Constructor constructor;
        String string = bundle.getString(KEY_CLASS_NAME);
        Class j = ld8.j(string, false);
        Constructor[] constructors = j.getConstructors();
        Constructor Q = Q(constructors);
        Bundle bundle2 = bundle.getBundle(KEY_ARGS);
        if (bundle2 != null) {
            bundle2.setClassLoader(j.getClassLoader());
        }
        if (Q != null) {
            try {
                zx3 = (zx3) Q.newInstance(new Object[]{bundle2});
            } catch (Exception e) {
                StringBuilder p = tr1.p("An exception occurred while creating a new instance of ", string, ". ");
                p.append(e.getMessage());
                throw new RuntimeException(p.toString(), e);
            }
        } else {
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i++;
            }
            zx3 = (zx3) constructor.newInstance((Object[]) null);
            if (bundle2 != null) {
                zx3.args.putAll(bundle2);
            }
        }
        zx3.getClass();
        Bundle bundle3 = bundle.getBundle(KEY_VIEW_STATE);
        zx3.viewState = bundle3;
        if (bundle3 != null) {
            bundle3.setClassLoader(zx3.getClass().getClassLoader());
        }
        zx3.instanceId = bundle.getString(KEY_INSTANCE_ID);
        zx3.targetInstanceId = bundle.getString(KEY_TARGET_INSTANCE_ID);
        zx3.requestedPermissions.addAll(bundle.getStringArrayList(KEY_REQUESTED_PERMISSIONS));
        Bundle bundle4 = bundle.getBundle(KEY_OVERRIDDEN_PUSH_HANDLER);
        HashMap hashMap = ey3.c;
        zx3.overriddenPushHandler = ld8.z(bundle4);
        zx3.overriddenPopHandler = ld8.z(bundle.getBundle(KEY_OVERRIDDEN_POP_HANDLER));
        zx3.needsAttach = bundle.getBoolean(KEY_NEEDS_ATTACH);
        zx3.retainViewMode = yx3.values()[bundle.getInt(KEY_RETAIN_VIEW_MODE, 0)];
        for (Bundle bundle5 : bundle.getParcelableArrayList(KEY_CHILD_ROUTERS)) {
            iy3 iy3 = new iy3();
            if (iy3.j == null) {
                iy3.j = zx3;
                iy3.Q(zx3.onBackPressedDispatcherEnabled);
            }
            iy3.N(bundle5);
            zx3.childRouters.add(iy3);
        }
        Bundle bundle6 = bundle.getBundle(KEY_SAVED_STATE);
        zx3.savedInstanceState = bundle6;
        if (bundle6 != null) {
            bundle6.setClassLoader(zx3.getClass().getClassLoader());
        }
        zx3.R();
        return zx3;
    }

    private void removeViewReference(Context context) {
        View view2 = this.view;
        if (view2 != null) {
            if (context == null) {
                context = view2.getContext();
            }
            if (!this.isBeingDestroyed && !this.hasSavedViewState) {
                T(this.view);
            }
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((xx3) it.next()).s(this, this.view);
            }
            onDestroyView(this.view);
            m9g m9g = this.viewAttachHandler;
            if (m9g != null) {
                View view3 = this.view;
                view3.removeOnAttachStateChangeListener(m9g);
                if (m9g.w != null && (view3 instanceof ViewGroup)) {
                    m9g.a((ViewGroup) view3).removeOnAttachStateChangeListener(m9g.w);
                    m9g.w = null;
                }
            }
            this.viewAttachHandler = null;
            this.viewIsAttached = false;
            if (this.isBeingDestroyed) {
                this.destroyedView = new WeakReference<>(this.view);
            }
            this.view = null;
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((xx3) it2.next()).l(this);
            }
            for (iy3 Z : this.childRouters) {
                Z.Z();
            }
        }
        if (this.isBeingDestroyed) {
            if (context == null) {
                context = getActivity();
            }
            if (this.isContextAvailable) {
                onContextUnavailable(context);
            }
            if (!this.destroyed) {
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((xx3) it3.next()).r(this);
                }
                this.destroyed = true;
                onDestroy();
                this.parentController = null;
                Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
                while (it4.hasNext()) {
                    ((xx3) it4.next()).k(this);
                }
            }
        }
    }

    public final void P(boolean z) {
        this.isBeingDestroyed = true;
        e9d e9d = this.router;
        if (e9d != null) {
            e9d.Y(this.instanceId);
        }
        for (iy3 c : this.childRouters) {
            c.c(false);
        }
        if (!this.attached) {
            removeViewReference((Context) null);
        } else if (z) {
            detach(this.view, true, false);
        }
    }

    public final void R() {
        Bundle bundle = this.savedInstanceState;
        if (bundle != null && this.router != null) {
            onRestoreInstanceState(bundle);
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((xx3) it.next()).c(this, this.savedInstanceState);
            }
            this.savedInstanceState = null;
        }
    }

    public final void S() {
        for (iy3 next : this.childRouters) {
            if (next.j == null || next.i == null) {
                View findViewById = this.view.findViewById(next.k);
                if (findViewById instanceof ViewGroup) {
                    next.b0(this, (ViewGroup) findViewById);
                    next.I();
                }
            }
        }
    }

    public final void T(View view2) {
        this.hasSavedViewState = true;
        this.viewState = new Bundle(getClass().getClassLoader());
        SparseArray sparseArray = new SparseArray();
        view2.saveHierarchyState(sparseArray);
        this.viewState.putSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY, sparseArray);
        Bundle bundle = new Bundle(getClass().getClassLoader());
        onSaveViewState(view2, bundle);
        this.viewState.putBundle(KEY_VIEW_STATE_BUNDLE, bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((xx3) it.next()).f(this);
        }
    }

    public final void activityDestroyed(Activity activity) {
        if (activity.isChangingConfigurations()) {
            detach(this.view, true, false);
        } else {
            P(true);
        }
        onContextUnavailable(activity);
    }

    public final void activityPaused(Activity activity) {
        onActivityPaused(activity);
    }

    public final void activityResumed(Activity activity) {
        View view2;
        boolean z = this.attached;
        if (!z && (view2 = this.view) != null && this.viewIsAttached) {
            attach(view2);
        } else if (z) {
            this.needsAttach = false;
            this.hasSavedViewState = false;
        }
        onActivityResumed(activity);
    }

    public final void activityStarted(Activity activity) {
        m9g m9g = this.viewAttachHandler;
        if (m9g != null) {
            m9g.c = false;
            m9g.b();
        }
        onActivityStarted(activity);
    }

    public final void activityStopped(Activity activity) {
        boolean z = this.attached;
        m9g m9g = this.viewAttachHandler;
        if (m9g != null) {
            m9g.c = true;
            m9g.c(true);
        }
        if (z && activity.isChangingConfigurations()) {
            this.needsAttach = true;
        }
        onActivityStopped(activity);
    }

    public final void addLifecycleListener(xx3 xx3) {
        if (!this.lifecycleListeners.contains(xx3)) {
            this.lifecycleListeners.add(xx3);
        }
    }

    public void attach(View view2) {
        boolean z = this.router == null || view2.getParent() != this.router.i;
        this.attachedToUnownedParent = z;
        if (!z && !this.isBeingDestroyed) {
            zx3 zx3 = this.parentController;
            if (zx3 == null || zx3.attached) {
                this.awaitingParentAttach = false;
                this.hasSavedViewState = false;
                Iterator it = new ArrayList(this.lifecycleListeners).iterator();
                while (it.hasNext()) {
                    ((xx3) it.next()).n(this, view2);
                }
                this.attached = true;
                this.needsAttach = this.router.h;
                onAttach(view2);
                if (this.hasOptionsMenu && !this.optionsMenuHidden) {
                    this.router.o();
                }
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((xx3) it2.next()).g(this);
                }
                for (iy3 next : this.childRouters) {
                    Iterator it3 = next.a.iterator();
                    while (it3.hasNext()) {
                        zx3 zx32 = ((i9d) it3.next()).a;
                        if (zx32.awaitingParentAttach) {
                            zx32.attach(zx32.view);
                        }
                    }
                    if ((next.j == null || next.i == null) ? false : true) {
                        next.I();
                    }
                }
                return;
            }
            this.awaitingParentAttach = true;
        }
    }

    public final void changeEnded(ey3 ey3, fy3 fy3) {
        WeakReference<View> weakReference;
        ViewGroup viewGroup;
        if (!fy3.b) {
            this.isPerformingExitTransition = false;
            for (iy3 a0 : this.childRouters) {
                a0.a0(false);
            }
        }
        onChangeEnded(ey3, fy3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((xx3) it.next()).a(this, ey3, fy3);
        }
        if (this.isBeingDestroyed && !this.viewIsAttached && !this.attached && (weakReference = this.destroyedView) != null) {
            View view2 = weakReference.get();
            if (!(this.router.i == null || view2 == null || view2.getParent() != (viewGroup = this.router.i))) {
                viewGroup.removeView(view2);
            }
            this.destroyedView = null;
        }
        ey3.getClass();
    }

    public final void changeStarted(ey3 ey3, fy3 fy3) {
        if (!fy3.b) {
            this.isPerformingExitTransition = true;
            for (iy3 a0 : this.childRouters) {
                a0.a0(true);
            }
        }
        onChangeStarted(ey3, fy3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((xx3) it.next()).b(this, ey3, fy3);
        }
    }

    public final void createOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public final void destroy() {
        P(false);
    }

    public void detach(View view2, boolean z, boolean z2) {
        if (!this.attachedToUnownedParent) {
            for (iy3 F : this.childRouters) {
                F.F();
            }
        }
        boolean z3 = !z2 && (z || this.retainViewMode == yx3.a || this.isBeingDestroyed);
        if (this.attached) {
            if (!this.awaitingParentAttach) {
                Iterator it = new ArrayList(this.lifecycleListeners).iterator();
                while (it.hasNext()) {
                    ((xx3) it.next()).t(this);
                }
                this.attached = false;
                onDetach(view2);
                if (this.hasOptionsMenu && !this.optionsMenuHidden) {
                    this.router.o();
                }
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((xx3) it2.next()).m(this);
                }
            } else {
                this.attached = false;
            }
        }
        this.awaitingParentAttach = false;
        if (z3) {
            removeViewReference(view2 != null ? view2.getContext() : null);
        }
    }

    public final boolean didRequestPermission(String str) {
        return this.requestedPermissions.contains(str);
    }

    public final void executeWithRouter(f9d f9d) {
        if (this.router != null) {
            f9d.a();
        } else {
            this.onRouterSetListeners.add(f9d);
        }
    }

    public final zx3 findController(String str) {
        if (this.instanceId.equals(str)) {
            return this;
        }
        for (iy3 f : this.childRouters) {
            zx3 f2 = f.f(str);
            if (f2 != null) {
                return f2;
            }
        }
        return null;
    }

    public final Activity getActivity() {
        e9d e9d = this.router;
        if (e9d != null) {
            return e9d.d();
        }
        return null;
    }

    public final Context getApplicationContext() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return null;
    }

    public Bundle getArgs() {
        return this.args;
    }

    public final e9d getChildRouter(ViewGroup viewGroup) {
        return getChildRouter(viewGroup, (String) null);
    }

    public final List<e9d> getChildRouters() {
        ArrayList arrayList = new ArrayList(this.childRouters.size());
        arrayList.addAll(this.childRouters);
        return arrayList;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getNeedsAttach() {
        return this.needsAttach;
    }

    public final fma getOnBackPressedDispatcher() {
        e9d e9d = this.router;
        if (e9d != null) {
            return e9d.h();
        }
        return null;
    }

    public ey3 getOverriddenPopHandler() {
        return this.overriddenPopHandler;
    }

    public final ey3 getOverriddenPushHandler() {
        return this.overriddenPushHandler;
    }

    public final zx3 getParentController() {
        return this.parentController;
    }

    public final Resources getResources() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getResources();
        }
        return null;
    }

    public yx3 getRetainViewMode() {
        return this.retainViewMode;
    }

    public final e9d getRouter() {
        return this.router;
    }

    public final zx3 getTargetController() {
        if (this.targetInstanceId != null) {
            return this.router.i().f(this.targetInstanceId);
        }
        return null;
    }

    public final View getView() {
        return this.view;
    }

    @Deprecated
    public boolean handleBack() {
        ArrayList arrayList = new ArrayList();
        for (iy3 e : this.childRouters) {
            arrayList.addAll(e.e());
        }
        Collections.sort(arrayList, new v00(18));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zx3 zx3 = ((i9d) it.next()).a;
            if (zx3.isAttached()) {
                e9d router2 = zx3.getRouter();
                router2.getClass();
                bs0.y();
                if (router2.m()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [java.lang.Object, m9g, android.view.View$OnAttachStateChangeListener] */
    public final View inflate(ViewGroup viewGroup) {
        View view2 = this.view;
        if (!(view2 == null || view2.getParent() == null || this.view.getParent() == viewGroup)) {
            View view3 = this.view;
            detach(view3, true, false);
            removeViewReference(view3.getContext());
        }
        if (this.view == null) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((xx3) it.next()).q(this);
            }
            Bundle bundle = this.viewState;
            View onCreateView = onCreateView(LayoutInflater.from(viewGroup.getContext()), viewGroup, bundle == null ? null : bundle.getBundle(KEY_VIEW_STATE_BUNDLE));
            this.view = onCreateView;
            if (onCreateView != viewGroup) {
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((xx3) it2.next()).j(this, this.view);
                }
                View view4 = this.view;
                Bundle bundle2 = this.viewState;
                if (bundle2 != null) {
                    view4.restoreHierarchyState(bundle2.getSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY));
                    Bundle bundle3 = this.viewState.getBundle(KEY_VIEW_STATE_BUNDLE);
                    bundle3.setClassLoader(getClass().getClassLoader());
                    onRestoreViewState(view4, bundle3);
                    S();
                    Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                    while (it3.hasNext()) {
                        ((xx3) it3.next()).d(this);
                    }
                }
                if (!this.isBeingDestroyed) {
                    xv1 xv1 = new xv1(1, (Object) this);
                    ? obj = new Object();
                    obj.a = false;
                    obj.b = false;
                    obj.c = false;
                    obj.o = 1;
                    obj.v = xv1;
                    this.viewAttachHandler = obj;
                    this.view.addOnAttachStateChangeListener(obj);
                }
            } else {
                throw new IllegalStateException("Controller's onCreateView method returned the parent ViewGroup. Perhaps you forgot to pass false for LayoutInflater.inflate's attachToRoot parameter?");
            }
        } else {
            S();
        }
        return this.view;
    }

    public final boolean isAttached() {
        return this.attached;
    }

    public final boolean isBeingDestroyed() {
        return this.isBeingDestroyed;
    }

    public final boolean isDestroyed() {
        return this.destroyed;
    }

    public abstract void onActivityPaused(Activity activity);

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public abstract void onActivityResumed(Activity activity);

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAttach(View view2) {
    }

    public void onChangeEnded(ey3 ey3, fy3 fy3) {
    }

    public abstract void onChangeStarted(ey3 ey3, fy3 fy3);

    public void onContextAvailable(Context context) {
    }

    public void onContextUnavailable() {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
    }

    public void onDestroyView(View view2) {
    }

    public void onDetach(View view2) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onRestoreViewState(View view2, Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onSaveViewState(View view2, Bundle bundle) {
    }

    public final boolean optionsItemSelected(MenuItem menuItem) {
        return this.attached && this.hasOptionsMenu && !this.optionsMenuHidden && onOptionsItemSelected(menuItem);
    }

    public void overridePopHandler(ey3 ey3) {
        this.overriddenPopHandler = ey3;
    }

    public void overridePushHandler(ey3 ey3) {
        this.overriddenPushHandler = ey3;
    }

    public final void prepareForHostDetach() {
        this.needsAttach = this.needsAttach || this.attached;
        for (iy3 F : this.childRouters) {
            F.F();
        }
    }

    public final void prepareOptionsMenu(Menu menu) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onPrepareOptionsMenu(menu);
        }
    }

    public final void registerForActivityResult(int i) {
        executeWithRouter(new sx3(this, i));
    }

    public final void removeChildRouter(e9d e9d) {
        if ((e9d instanceof iy3) && this.childRouters.remove(e9d)) {
            e9d.c(true);
        }
    }

    public final void removeLifecycleListener(xx3 xx3) {
        this.lifecycleListeners.remove(xx3);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Cloneable, java.lang.Object[], java.lang.String[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void requestPermissions(java.lang.String[] r3, int r4) {
        /*
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.requestedPermissions
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.addAll(r1)
            tx3 r0 = new tx3
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            r2.executeWithRouter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx3.requestPermissions(java.lang.String[], int):void");
    }

    public final void requestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.requestedPermissions.removeAll(Arrays.asList(strArr));
        onRequestPermissionsResult(i, strArr, iArr);
    }

    public final Bundle saveInstanceState() {
        View view2;
        if (!this.hasSavedViewState && (view2 = this.view) != null) {
            T(view2);
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_CLASS_NAME, getClass().getName());
        bundle.putBundle(KEY_VIEW_STATE, this.viewState);
        bundle.putBundle(KEY_ARGS, this.args);
        bundle.putString(KEY_INSTANCE_ID, this.instanceId);
        bundle.putString(KEY_TARGET_INSTANCE_ID, this.targetInstanceId);
        bundle.putStringArrayList(KEY_REQUESTED_PERMISSIONS, this.requestedPermissions);
        bundle.putBoolean(KEY_NEEDS_ATTACH, this.needsAttach || this.attached);
        bundle.putInt(KEY_RETAIN_VIEW_MODE, this.retainViewMode.ordinal());
        ey3 ey3 = this.overriddenPushHandler;
        if (ey3 != null) {
            bundle.putBundle(KEY_OVERRIDDEN_PUSH_HANDLER, ey3.j());
        }
        ey3 ey32 = this.overriddenPopHandler;
        if (ey32 != null) {
            bundle.putBundle(KEY_OVERRIDDEN_POP_HANDLER, ey32.j());
        }
        ArrayList arrayList = new ArrayList(this.childRouters.size());
        for (iy3 O : this.childRouters) {
            Bundle bundle2 = new Bundle();
            O.O(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(KEY_CHILD_ROUTERS, arrayList);
        Bundle bundle3 = new Bundle(getClass().getClassLoader());
        onSaveInstanceState(bundle3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((xx3) it.next()).e(this, bundle3);
        }
        bundle.putBundle(KEY_SAVED_STATE, bundle3);
        return bundle;
    }

    public final void setDetachFrozen(boolean z) {
        ViewGroup viewGroup;
        if (this.isDetachFrozen != z) {
            this.isDetachFrozen = z;
            boolean z2 = !z && this.view != null && this.viewWasDetached;
            for (iy3 next : this.childRouters) {
                if (z2) {
                    next.F();
                }
                next.a0(z);
            }
            if (z2) {
                View view2 = this.view;
                detach(view2, false, false);
                if (this.view == null && view2.getParent() == (viewGroup = this.router.i)) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    public final void setHasOptionsMenu(boolean z) {
        boolean z2 = this.attached && !this.optionsMenuHidden && this.hasOptionsMenu != z;
        this.hasOptionsMenu = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setNeedsAttach(boolean z) {
        this.needsAttach = z;
    }

    public final void setOptionsMenuHidden(boolean z) {
        boolean z2 = this.attached && this.hasOptionsMenu && this.optionsMenuHidden != z;
        this.optionsMenuHidden = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setParentController(zx3 zx3) {
        this.parentController = zx3;
    }

    public void setRetainViewMode(yx3 yx3) {
        yx3 yx32 = yx3.a;
        if (yx3 == null) {
            yx3 = yx32;
        }
        this.retainViewMode = yx3;
        if (yx3 == yx32 && !this.attached) {
            removeViewReference((Context) null);
        }
    }

    public final void setRouter(e9d e9d) {
        if (this.router != e9d) {
            this.router = e9d;
            R();
            Iterator<f9d> it = this.onRouterSetListeners.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.onRouterSetListeners.clear();
            return;
        }
        R();
    }

    public void setTargetController(zx3 zx3) {
        if (this.targetInstanceId == null) {
            this.targetInstanceId = zx3 != null ? zx3.getInstanceId() : null;
            return;
        }
        throw new RuntimeException("Target controller already set. A controller's target may only be set once.");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return getActivity().shouldShowRequestPermissionRationale(str);
    }

    public final void startActivity(Intent intent) {
        executeWithRouter(new vx3(this, intent));
    }

    public final void startActivityForResult(Intent intent, int i) {
        executeWithRouter(new tx3(this, intent, i, 0));
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.router.W(this.instanceId, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final e9d getChildRouter(ViewGroup viewGroup, String str) {
        return getChildRouter(viewGroup, str, true);
    }

    public final void onContextAvailable() {
        Activity d = this.router.d();
        if (d != null && !this.isContextAvailable) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((xx3) it.next()).o(this);
            }
            boolean z = this.router.f;
            this.onBackPressedDispatcherEnabled = z;
            if (z) {
                if (d instanceof bc3) {
                    getOnBackPressedDispatcher().b(this.onBackPressedCallback);
                } else {
                    throw new IllegalStateException("Host activities must extend ComponentActivity when enabling OnBackPressedDispatcher support.");
                }
            }
            this.isContextAvailable = true;
            onContextAvailable(d);
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((xx3) it2.next()).h(this);
            }
        }
        for (iy3 u : this.childRouters) {
            u.u();
        }
    }

    public final void onContextUnavailable(Context context) {
        for (e9d next : this.childRouters) {
            Iterator it = next.a.iterator();
            while (it.hasNext()) {
                ((i9d) it.next()).a.onContextUnavailable(context);
            }
            Iterator it2 = next.d.iterator();
            while (it2.hasNext()) {
                ((zx3) it2.next()).onContextUnavailable(context);
            }
        }
        if (this.isContextAvailable) {
            Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
            while (it3.hasNext()) {
                ((xx3) it3.next()).p(this);
            }
            this.isContextAvailable = false;
            onContextUnavailable();
            if (this.onBackPressedDispatcherEnabled) {
                this.onBackPressedCallback.e();
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((xx3) it4.next()).i(this);
            }
        }
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        executeWithRouter(new ux3(this, intent, i, bundle));
    }

    public final e9d getChildRouter(ViewGroup viewGroup, String str, boolean z) {
        return getChildRouter(viewGroup, str, z, true);
    }

    public final e9d getChildRouter(ViewGroup viewGroup, String str, boolean z, boolean z2) {
        iy3 iy3;
        int id = viewGroup.getId();
        if (id != -1) {
            Iterator<iy3> it = this.childRouters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iy3 = null;
                    break;
                }
                iy3 = it.next();
                if (!iy3.n && iy3.i == null) {
                    String str2 = iy3.l;
                    if (str2 != null) {
                        if (str2.equals(str)) {
                            iy3.k = id;
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Host ID can't be variable with a null tag");
                    }
                }
                if (iy3.k == id && TextUtils.equals(str, iy3.l)) {
                    break;
                }
            }
            if (iy3 == null) {
                if (z) {
                    int id2 = viewGroup.getId();
                    iy3 = new iy3();
                    if (z2 || str != null) {
                        iy3.k = id2;
                        iy3.l = str;
                        iy3.n = z2;
                        iy3.b0(this, viewGroup);
                        this.childRouters.add(iy3);
                        if (this.isPerformingExitTransition) {
                            iy3.a0(true);
                        }
                    } else {
                        throw new IllegalStateException("ControllerHostedRouter can't be created without a tag if not bounded to its container");
                    }
                }
            } else if (iy3.j == null || iy3.i == null) {
                iy3.b0(this, viewGroup);
                iy3.I();
            }
            return iy3;
        }
        throw new IllegalStateException("You must set an id on your container.");
    }
}

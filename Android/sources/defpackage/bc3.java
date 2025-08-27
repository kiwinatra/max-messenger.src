package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: bc3  reason: default package */
public abstract class bc3 extends ac3 implements hbg, tw6, odd, gma, f9, jma, yma, oma, pma, o69 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final tb3 Companion = new Object();
    private gbg _viewModelStore;
    private final e9 activityResultRegistry;
    private int contentLayoutId;
    private final dw3 contextAwareHelper = new dw3();
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final r69 menuHostHelper = new r69(new nb3(this, 0));
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<tk3> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<tk3> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<tk3> onNewIntentListeners;
    private final CopyOnWriteArrayList<tk3> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<tk3> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    /* access modifiers changed from: private */
    public final wb3 reportFullyDrawnExecutor;
    private final ndd savedStateRegistryController;

    public bc3() {
        ndd ndd = new ndd(this);
        this.savedStateRegistryController = ndd;
        this.reportFullyDrawnExecutor = new xb3(this);
        this.fullyDrawnReporter$delegate = LazyKt.lazy(new zb3(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new yb3(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            getLifecycle().a(new ob3(0, this));
            getLifecycle().a(new ob3(1, this));
            getLifecycle().a(new qyc(1, this));
            ndd.a();
            b59.u(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new pb3(0, this));
            addOnContextAvailableListener(new qb3(this, 0));
            this.defaultViewModelProviderFactory$delegate = LazyKt.lazy(new zb3(this, 0));
            this.onBackPressedDispatcher$delegate = LazyKt.lazy(new zb3(this, 3));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
    }

    public static final void access$addObserverForBackInvoker(bc3 bc3, fma fma) {
        bc3.getLifecycle().a(new rb3(0, fma, bc3));
    }

    public static final void access$ensureViewModelStore(bc3 bc3) {
        if (bc3._viewModelStore == null) {
            vb3 vb3 = (vb3) bc3.getLastNonConfigurationInstance();
            if (vb3 != null) {
                bc3._viewModelStore = vb3.b;
            }
            if (bc3._viewModelStore == null) {
                bc3._viewModelStore = new gbg();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public static void s(bc3 bc3) {
        Bundle a = bc3.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            e9 e9Var = bc3.activityResultRegistry;
            e9Var.getClass();
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    e9Var.d.addAll(stringArrayList2);
                }
                Bundle bundle = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = e9Var.g;
                if (bundle != null) {
                    bundle2.putAll(bundle);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList.get(i);
                    LinkedHashMap linkedHashMap = e9Var.b;
                    boolean containsKey = linkedHashMap.containsKey(str);
                    LinkedHashMap linkedHashMap2 = e9Var.a;
                    if (containsKey) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i).intValue();
                    String str2 = stringArrayList.get(i);
                    linkedHashMap2.put(Integer.valueOf(intValue), str2);
                    linkedHashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    public static void t(bc3 bc3, hu7 hu7) {
        if (hu7 == hu7.ON_DESTROY) {
            bc3.contextAwareHelper.b = null;
            if (!bc3.isChangingConfigurations()) {
                bc3.getViewModelStore().a();
            }
            xb3 xb3 = (xb3) bc3.reportFullyDrawnExecutor;
            bc3 bc32 = xb3.o;
            bc32.getWindow().getDecorView().removeCallbacks(xb3);
            bc32.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xb3);
        }
    }

    public static Bundle u(bc3 bc3) {
        Bundle bundle = new Bundle();
        e9 e9Var = bc3.activityResultRegistry;
        e9Var.getClass();
        LinkedHashMap linkedHashMap = e9Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(e9Var.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(e9Var.g));
        return bundle;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ((xb3) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(j79 j79) {
        r69 r69 = this.menuHostHelper;
        r69.b.add(j79);
        r69.a.run();
    }

    public final void addOnConfigurationChangedListener(tk3 tk3) {
        this.onConfigurationChangedListeners.add(tk3);
    }

    public final void addOnContextAvailableListener(kma kma) {
        dw3 dw3 = this.contextAwareHelper;
        Context context = dw3.b;
        if (context != null) {
            kma.a(context);
        }
        dw3.a.add(kma);
    }

    public final void addOnMultiWindowModeChangedListener(tk3 tk3) {
        this.onMultiWindowModeChangedListeners.add(tk3);
    }

    public final void addOnNewIntentListener(tk3 tk3) {
        this.onNewIntentListeners.add(tk3);
    }

    public final void addOnPictureInPictureModeChangedListener(tk3 tk3) {
        this.onPictureInPictureModeChangedListeners.add(tk3);
    }

    public final void addOnTrimMemoryListener(tk3 tk3) {
        this.onTrimMemoryListeners.add(tk3);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final e9 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public y34 getDefaultViewModelCreationExtras() {
        zy9 zy9 = new zy9(0);
        if (getApplication() != null) {
            zy9.a(cbg.d, getApplication());
        }
        zy9.a(b59.o, this);
        zy9.a(b59.p, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            zy9.a(b59.q, extras);
        }
        return zy9;
    }

    public dbg getDefaultViewModelProviderFactory() {
        return (dbg) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public xi6 getFullyDrawnReporter() {
        return (xi6) this.fullyDrawnReporter$delegate.getValue();
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        vb3 vb3 = (vb3) getLastNonConfigurationInstance();
        if (vb3 != null) {
            return vb3.a;
        }
        return null;
    }

    public ju7 getLifecycle() {
        return super.getLifecycle();
    }

    public final fma getOnBackPressedDispatcher() {
        return (fma) this.onBackPressedDispatcher$delegate.getValue();
    }

    public final mdd getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    public gbg getViewModelStore() {
        if (getApplication() != null) {
            if (this._viewModelStore == null) {
                vb3 vb3 = (vb3) getLastNonConfigurationInstance();
                if (vb3 != null) {
                    this._viewModelStore = vb3.b;
                }
                if (this._viewModelStore == null) {
                    this._viewModelStore = new gbg();
                }
            }
            return this._viewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
    }

    public void initializeViewTreeOwners() {
        q8.M(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(sic.view_tree_view_model_store_owner, this);
        iq.V(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(wic.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(wic.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.activityResultRegistry.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        getOnBackPressedDispatcher().d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<tk3> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        dw3 dw3 = this.contextAwareHelper;
        dw3.b = this;
        Iterator it = dw3.a.iterator();
        while (it.hasNext()) {
            ((kma) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = o2d.a;
        ryg.D(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        r69 r69 = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = r69.b.iterator();
        while (it.hasNext()) {
            ((vc6) ((j79) it.next())).a.k(menu, menuInflater);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.a(menuItem);
        }
        return false;
    }

    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        if (!this.dispatchingOnMultiWindowModeChanged) {
            Iterator<tk3> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new jx9(z));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<tk3> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((vc6) ((j79) it.next())).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        if (!this.dispatchingOnPictureInPictureModeChanged) {
            Iterator<tk3> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new xkb(z));
            }
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((vc6) ((j79) it.next())).a.t(menu);
        }
        return true;
    }

    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [vb3, java.lang.Object] */
    public final Object onRetainNonConfigurationInstance() {
        vb3 vb3;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        gbg gbg = this._viewModelStore;
        if (gbg == null && (vb3 = (vb3) getLastNonConfigurationInstance()) != null) {
            gbg = vb3.b;
        }
        if (gbg == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ? obj = new Object();
        obj.a = onRetainCustomNonConfigurationInstance;
        obj.b = gbg;
        return obj;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (getLifecycle() instanceof lv7) {
            lv7 lv7 = (lv7) getLifecycle();
            iu7 iu7 = iu7.c;
            lv7.d("setCurrentState");
            lv7.f(iu7);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<tk3> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> y8 registerForActivityResult(w8 w8Var, e9 e9Var, v8 v8Var) {
        return e9Var.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, w8Var, v8Var);
    }

    public void removeMenuProvider(j79 j79) {
        this.menuHostHelper.b(j79);
    }

    public final void removeOnConfigurationChangedListener(tk3 tk3) {
        this.onConfigurationChangedListeners.remove(tk3);
    }

    public final void removeOnContextAvailableListener(kma kma) {
        this.contextAwareHelper.a.remove(kma);
    }

    public final void removeOnMultiWindowModeChangedListener(tk3 tk3) {
        this.onMultiWindowModeChangedListeners.remove(tk3);
    }

    public final void removeOnNewIntentListener(tk3 tk3) {
        this.onNewIntentListeners.remove(tk3);
    }

    public final void removeOnPictureInPictureModeChangedListener(tk3 tk3) {
        this.onPictureInPictureModeChangedListeners.remove(tk3);
    }

    public final void removeOnTrimMemoryListener(tk3 tk3) {
        this.onTrimMemoryListeners.remove(tk3);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.remove(runnable);
    }

    public void reportFullyDrawn() {
        try {
            if (hof.a()) {
                Trace.beginSection(ld9.T("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            xi6 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.c) {
                fullyDrawnReporter.d = true;
                Iterator it = fullyDrawnReporter.e.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                fullyDrawnReporter.e.clear();
                Unit unit = Unit.INSTANCE;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i) {
        initializeViewTreeOwners();
        ((xb3) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final <I, O> y8 registerForActivityResult(w8 w8Var, v8 v8Var) {
        return registerForActivityResult(w8Var, this.activityResultRegistry, v8Var);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<tk3> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new jx9(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<tk3> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new xkb(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public void setContentView(View view) {
        initializeViewTreeOwners();
        ((xb3) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(j79 j79, jv7 jv7) {
        r69 r69 = this.menuHostHelper;
        r69.b.add(j79);
        r69.a.run();
        ju7 lifecycle = jv7.getLifecycle();
        HashMap hashMap = r69.c;
        q69 q69 = (q69) hashMap.remove(j79);
        if (q69 != null) {
            q69.a.b(q69.b);
            q69.b = null;
        }
        hashMap.put(j79, new q69(lifecycle, new rb3(2, r69, j79)));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ((xb3) this.reportFullyDrawnExecutor).a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(j79 j79, jv7 jv7, iu7 iu7) {
        r69 r69 = this.menuHostHelper;
        r69.getClass();
        ju7 lifecycle = jv7.getLifecycle();
        HashMap hashMap = r69.c;
        q69 q69 = (q69) hashMap.remove(j79);
        if (q69 != null) {
            q69.a.b(q69.b);
            q69.b = null;
        }
        hashMap.put(j79, new q69(lifecycle, new p69(r69, iu7, j79)));
    }
}

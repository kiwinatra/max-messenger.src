package defpackage;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;

/* renamed from: o81  reason: default package */
public final class o81 implements al1 {
    public Drawable X;
    public boolean Y;
    public final Lazy Z;
    public final dp1 a;
    public final yg5 b;
    public final m01 c;
    public final dq1 o;
    public final Lazy v;
    public final Lazy v0;
    public final Lazy w;
    public final wx3 w0 = new wx3(2, (Object) this);
    public Activity x;
    public final Lazy y;
    public final Lazy z;

    public o81(dp1 dp1, yg5 yg5, m01 m01, dq1 dq1, Lazy lazy, Lazy lazy2) {
        this.a = dp1;
        this.b = yg5;
        this.c = m01;
        this.o = dq1;
        this.v = lazy2;
        v11 v11 = new v11(9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = LazyKt.lazy(lazyThreadSafetyMode, v11);
        this.y = lazy;
        Lazy lazy3 = LazyKt.lazy(lazyThreadSafetyMode, new v11(10));
        this.z = lazy3;
        this.X = (ColorDrawable) lazy3.getValue();
        this.Z = LazyKt.lazy(lazyThreadSafetyMode, new i81(this, 0));
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new i81(this, 1));
    }

    public static e9d c() {
        return qra.a.z().e().x();
    }

    public static void e(o81 o81) {
        o81.Y = false;
        ((ng5) o81.b).d(50);
        o81.w0.f(false);
    }

    public static boolean g(zx3 zx3) {
        return (zx3 instanceof CallScreen) || (zx3 instanceof PipScreen) || (zx3 instanceof CallIncomingScreen) || (zx3 instanceof CallOpponentsListWidget);
    }

    public final boolean a() {
        return ((mp1) this.a).o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0054, code lost:
        if (r5 != null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.PictureInPictureParams d() {
        /*
            r9 = this;
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            m01 r2 = r9.c
            r3 = r2
            o01 r3 = (defpackage.o01) r3
            boolean r3 = r3.d()
            java.lang.Class<y91> r4 = defpackage.y91.class
            r5 = 0
            java.lang.String r6 = "Required value was null."
            if (r3 == 0) goto L_0x005a
            android.app.Activity r9 = r9.x
            if (r9 == 0) goto L_0x0054
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.pqa.I
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.sqa.F
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            qra r7 = defpackage.qra.a
            q4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.g(r4)
            y91 r4 = (defpackage.y91) r4
            o01 r2 = (defpackage.o01) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L_0x004a
            r5.<init>(r3, r8, r9, r2)
            goto L_0x0054
        L_0x004a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L_0x0054:
            if (r5 == 0) goto L_0x0098
        L_0x0056:
            r1.add(r5)
            goto L_0x0098
        L_0x005a:
            android.app.Activity r9 = r9.x
            if (r9 == 0) goto L_0x0095
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r3 = defpackage.pqa.J
            android.graphics.drawable.Icon r3 = android.graphics.drawable.Icon.createWithResource(r9, r3)
            int r7 = defpackage.sqa.E
            java.lang.String r8 = r9.getString(r7)
            java.lang.String r9 = r9.getString(r7)
            qra r7 = defpackage.qra.a
            q4 r7 = r7.getAccessor()
            java.lang.Object r4 = r7.g(r4)
            y91 r4 = (defpackage.y91) r4
            o01 r2 = (defpackage.o01) r2
            r2.d()
            android.app.PendingIntent r2 = r4.d()
            if (r2 == 0) goto L_0x008b
            r5.<init>(r3, r8, r9, r2)
            goto L_0x0095
        L_0x008b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.toString()
            r9.<init>(r0)
            throw r9
        L_0x0095:
            if (r5 == 0) goto L_0x0098
            goto L_0x0056
        L_0x0098:
            java.util.List r9 = kotlin.collections.CollectionsKt.build(r1)
            android.app.PictureInPictureParams$Builder r9 = r0.setActions(r9)
            java.lang.String r0 = "2:3"
            android.util.Rational r0 = android.util.Rational.parseRational(r0)
            android.app.PictureInPictureParams$Builder r9 = r9.setAspectRatio(r0)
            android.app.PictureInPictureParams r9 = r9.build()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o81.d():android.app.PictureInPictureParams");
    }

    public final void f(boolean z2) {
        Activity activity = this.x;
        if (activity != null) {
            boolean w2 = qra.a.z().e().w(z2);
            z68.c("PipAppController", "try to hide call indicator hasCall=" + a(), new Object[0]);
            if (w2) {
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                boolean z3 = false;
                View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
                if (childAt != null) {
                    String name = fu4.k.e(childAt.getContext()).f().getName();
                    l2b l2b = l2b.a;
                    if (Intrinsics.areEqual((Object) name, (Object) "one.me.sdk.design.OneMeThemeDark")) {
                        z3 = true;
                    }
                }
                kne.k(activity, z3);
            }
        }
    }

    public final void h(boolean z2) {
        Activity activity = this.x;
        if (activity != null) {
            boolean a2 = a();
            i9d i9d = (i9d) CollectionsKt.lastOrNull(c().e());
            zx3 zx3 = i9d != null ? i9d.a : null;
            boolean z3 = !(g(zx3) || zx3 == null);
            z68.c("PipAppController", "try to show call indicator hasCall=" + a2 + " canShow=" + z3 + ".", new Object[0]);
            if (z3 && a2 && qra.a.z().e().b(new CallIndicatorWidget(), z2)) {
                kne.k(activity, true);
            }
            if (!a2) {
                z68.c("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
                f(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r8 = this;
            android.app.Activity r0 = r8.x
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r1 = "keyguard"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.KeyguardManager r1 = (android.app.KeyguardManager) r1
            boolean r1 = r1.isDeviceLocked()
            java.lang.String r2 = "PipAppController"
            if (r1 == 0) goto L_0x001b
            java.lang.String r8 = "can't show global pip due to device is locked"
            defpackage.z68.c(r2, r8, new java.lang.Object[0])
            return
        L_0x001b:
            android.app.Activity r1 = r8.x
            r3 = 0
            if (r1 != 0) goto L_0x0022
            r1 = r3
            goto L_0x002c
        L_0x0022:
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r4 = "android.software.picture_in_picture"
            boolean r1 = r1.hasSystemFeature(r4)
        L_0x002c:
            if (r1 != 0) goto L_0x0034
            java.lang.String r8 = "pip mode doesn't supported on current device"
            defpackage.z68.c(r2, r8, new java.lang.Object[0])
            return
        L_0x0034:
            android.app.Activity r1 = r8.x
            r4 = 1
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r1 = r3
            goto L_0x005b
        L_0x003b:
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            java.lang.Object r5 = r1.getSystemService(r5)     // Catch:{ SecurityException -> 0x0055 }
            android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r6 = "android:picture_in_picture"
            int r7 = android.os.Process.myUid()     // Catch:{ SecurityException -> 0x0055 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ SecurityException -> 0x0055 }
            int r1 = r5.unsafeCheckOp(r6, r7, r1)     // Catch:{ SecurityException -> 0x0055 }
            if (r1 != 0) goto L_0x0039
            r1 = r4
            goto L_0x005b
        L_0x0055:
            java.lang.String r1 = "Can't check pip permission state in settings."
            defpackage.z68.c(r2, r1, new java.lang.Object[0])
            goto L_0x0039
        L_0x005b:
            if (r1 != 0) goto L_0x0063
            java.lang.String r8 = "doesn't have PIP permission."
            defpackage.z68.c(r2, r8, new java.lang.Object[0])
            return
        L_0x0063:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            java.util.List r5 = r1.getAppTasks()
            int r5 = r5.size()
            if (r5 != r4) goto L_0x0089
            java.util.List r1 = r1.getAppTasks()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)
            android.app.ActivityManager$AppTask r1 = (android.app.ActivityManager.AppTask) r1
            android.app.ActivityManager$RecentTaskInfo r1 = r1.getTaskInfo()
            int r1 = r1.numActivities
            if (r1 != r4) goto L_0x0089
            r1 = r4
            goto L_0x008a
        L_0x0089:
            r1 = r3
        L_0x008a:
            e9d r5 = c()
            java.util.ArrayList r5 = r5.e()
            java.lang.Object r5 = kotlin.collections.CollectionsKt.lastOrNull(r5)
            i9d r5 = (defpackage.i9d) r5
            r6 = 0
            if (r5 == 0) goto L_0x009e
            zx3 r5 = r5.a
            goto L_0x009f
        L_0x009e:
            r5 = r6
        L_0x009f:
            boolean r7 = g(r5)
            if (r7 != 0) goto L_0x00aa
            if (r5 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r5 = r3
            goto L_0x00ab
        L_0x00aa:
            r5 = r4
        L_0x00ab:
            dp1 r7 = r8.a
            if (r5 == 0) goto L_0x00c9
            kotlin.Lazy r5 = r8.w
            java.lang.Object r5 = r5.getValue()
            ki1 r5 = (defpackage.ki1) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L_0x00c7
            r5 = r7
            mp1 r5 = (defpackage.mp1) r5
            boolean r5 = r5.p()
            if (r5 == 0) goto L_0x00c7
            r3 = r4
        L_0x00c7:
            r8.Y = r3
        L_0x00c9:
            if (r1 == 0) goto L_0x0138
            boolean r3 = r8.Y
            if (r3 == 0) goto L_0x0138
            java.lang.String r1 = "start show global pip"
            defpackage.z68.c(r2, r1, new java.lang.Object[0])
            r8.j(r4)
            e9d r1 = c()
            java.util.ArrayList r1 = r1.e()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.lastOrNull(r1)
            i9d r1 = (defpackage.i9d) r1
            if (r1 == 0) goto L_0x00f6
            zx3 r1 = r1.a
            if (r1 == 0) goto L_0x00f6
            zx3 r1 = r1.getParentController()
            if (r1 == 0) goto L_0x00f6
            e9d r1 = r1.getRouter()
            goto L_0x00f7
        L_0x00f6:
            r1 = r6
        L_0x00f7:
            if (r1 == 0) goto L_0x0108
            java.util.ArrayList r1 = r1.e()
            java.lang.Object r1 = kotlin.collections.CollectionsKt.lastOrNull(r1)
            i9d r1 = (defpackage.i9d) r1
            if (r1 == 0) goto L_0x0108
            zx3 r1 = r1.a
            goto L_0x0109
        L_0x0108:
            r1 = r6
        L_0x0109:
            boolean r3 = r1 instanceof one.me.sdk.bottomsheet.BottomSheetWidget
            if (r3 == 0) goto L_0x0110
            one.me.sdk.bottomsheet.BottomSheetWidget r1 = (one.me.sdk.bottomsheet.BottomSheetWidget) r1
            goto L_0x0111
        L_0x0110:
            r1 = r6
        L_0x0111:
            if (r1 == 0) goto L_0x011b
            java.lang.String r3 = "hide last bottom sheet dialog before pip mode"
            defpackage.z68.c(r2, r3, new java.lang.Object[0])
            r1.i0(r4)
        L_0x011b:
            e9d r1 = c()
            java.lang.String r2 = ":call-pip"
            zx3 r1 = r1.g(r2)
            if (r1 != 0) goto L_0x0130
            zb8 r1 = defpackage.zb8.b
            ta4 r1 = r1.W0()
            r1.b(r2, r6)
        L_0x0130:
            android.app.PictureInPictureParams r8 = r8.d()
            r0.enterPictureInPictureMode(r8)
            goto L_0x0161
        L_0x0138:
            boolean r8 = r8.Y
            mp1 r7 = (defpackage.mp1) r7
            boolean r0 = r7.p()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "can't show global pip isMainTask="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " isPipAvailable="
            r3.append(r1)
            r3.append(r8)
            java.lang.String r8 = " isCallAvailable="
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            defpackage.z68.p(r2, r8)
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o81.i():void");
    }

    public final void j(boolean z2) {
        Activity activity = this.x;
        if (activity != null) {
            if (z2) {
                this.X = activity.getWindow().getDecorView().getBackground();
                activity.getWindow().setBackgroundDrawable((ColorDrawable) this.z.getValue());
                return;
            }
            activity.getWindow().setBackgroundDrawable(this.X);
        }
    }

    public final void k() {
        Activity activity = this.x;
        if (activity != null) {
            i9d i9d = (i9d) CollectionsKt.lastOrNull(c().e());
            ghd ghd = null;
            boolean g = g(i9d != null ? i9d.a : null);
            i9d i9d2 = (i9d) CollectionsKt.lastOrNull(c().e());
            zx3 zx3 = i9d2 != null ? i9d2.a : null;
            if (zx3 instanceof ghd) {
                ghd = (ghd) zx3;
            }
            boolean z2 = ghd != null && ((ChatMediaViewerScreen) ghd).X;
            if (g) {
                kne.k(activity, true);
                kne.j(activity, true);
            } else if (!g && !a() && !z2) {
                kne.k(activity, false);
                kne.j(activity, false);
            } else if (a()) {
                kne.k(activity, true);
                kne.j(activity, false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        this.w0.f(false);
        ConversationEndReason reason = conversationDestroyedInfo.getReason();
        if ((reason instanceof ConversationEndReason.Hangup) || (reason instanceof ConversationEndReason.EndedForAll)) {
            Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new SuspendLambda(2, (Continuation<Object>) null));
        }
    }

    public final void onParticipantsChanged(List list) {
        Activity activity = this.x;
        if (activity != null) {
            if (activity != null ? activity.isInPictureInPictureMode() : false) {
                activity.setPictureInPictureParams(d());
            }
        }
    }
}

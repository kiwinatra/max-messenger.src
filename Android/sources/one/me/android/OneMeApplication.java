package one.me.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u0002"}, d2 = {"Lone/me/android/OneMeApplication;", "Landroid/app/Application;", "Lte3;", "Ldh;", "Ly9f;", "Lhd3;", "Lvw6;", "Lww6;", "<init>", "()V", "Lkof;", "tracer", "Lpof;", "report", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nOneMeApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneMeApplication.kt\none/me/android/OneMeApplication\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 3 Log.kt\nru/ok/tamtam/logger/Log\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,780:1\n5#2:781\n5#2:808\n32#3,4:782\n32#3,4:804\n32#3,4:809\n32#3,4:817\n32#3,4:821\n1#4:786\n1755#5,3:787\n1485#5:790\n1510#5,3:791\n1513#5,3:801\n1053#5:825\n381#6,7:794\n46#7,4:813\n*S KotlinDebug\n*F\n+ 1 OneMeApplication.kt\none/me/android/OneMeApplication\n*L\n144#1:781\n450#1:808\n152#1:782,4\n379#1:804,4\n455#1:809,4\n551#1:817,4\n580#1:821,4\n703#1:787,3\n740#1:790\n740#1:791,3\n740#1:801,3\n743#1:825\n740#1:794,7\n487#1:813,4\n*E\n"})
public final class OneMeApplication extends Application implements te3, dh, y9f, hd3, vw6, ww6 {
    public static final /* synthetic */ int X = 0;
    public final Lazy a = LazyKt.lazy(new h49(20));
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new h49(21));
    public final wp c = wp.a;
    public final ArrayList o = new ArrayList();
    public final Lazy v = LazyKt.lazy(new h49(22));
    public final Lazy w = LazyKt.lazy(new h49(23));
    public final long x = SystemClock.elapsedRealtime();
    public final String y;
    public final Lazy z;

    public OneMeApplication() {
        String name = OneMeApplication.class.getName();
        this.y = name;
        Looper.getMainLooper();
        new oc8();
        ybb ybb = ybb.APP_INIT;
        wp.b.k(ybb, new xbb(ybb, SystemClock.elapsedRealtime()));
        z68.b = new qua();
        Lazy lazy = rxe.a;
        ForkJoinPool.commonPool();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, name, "AppVersion 25.6.4(6355)--1", (Throwable) null);
        }
        this.z = LazyKt.lazy(new ona(this, 4));
    }

    public final z9f a() {
        return sjd.a;
    }

    public final void attachBaseContext(Context context) {
        int i = b0h.g;
        if (!cvg.A("ru")) {
            Locale locale = new Locale("ru");
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.fontScale = c44.DEFAULT_ASPECT_RATIO;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
        if (!ProcessPhoenix.a(this)) {
            yna yna = new yna(context, this);
            f6e.c = f6e.w(yna);
            udf h = h();
            z96 z96 = (z96) h;
            w96 b2 = z96.b("Tracer", CollectionsKt.emptyList(), new j35(28, (Object) yna, (Object) this));
            ArrayList arrayList = this.o;
            arrayList.add(b2);
            w96 b3 = ((z96) h()).b("Scout", CollectionsKt.listOf(b2), new vn4(this, yna));
            arrayList.add(b3);
            arrayList.add(((z96) h()).b("Protobuf", CollectionsKt.listOf(b2), new h49(13)));
            w96 unused = e(h(), "LibraryUpgrade", CollectionsKt.emptyList(), new ona(this, 0));
            ((z96) h()).b("Account", CollectionsKt.listOf(b3), new h49(16));
            w96 unused2 = e(h(), "AnrWatcher", CollectionsKt.emptyList(), new ona(this, 1));
            w96 unused3 = ((z96) h()).b("SetupRx", CollectionsKt.emptyList(), new h49(17));
            w96 unused4 = ((z96) h()).b("RxJavaPlugins.setErrorHandler", CollectionsKt.emptyList(), new ona(this, 2));
            w96 a2 = ((z96) h()).b("Chroma.init", CollectionsKt.emptyList(), new ona(this, 3));
            w96 unused5 = e(h(), "AppTracerCrashService", CollectionsKt.emptyList(), new h49(18));
            e(h(), "IoPoolSize", CollectionsKt.listOf(e(h(), "Logger", CollectionsKt.emptyList(), new h49(19))), new h49(24));
            w96 unused6 = e(h(), "Fresco", CollectionsKt.emptyList(), new pna(0));
            w96 unused7 = e(h(), "Theme background warmup", CollectionsKt.emptyList(), new ona(this, 17));
            e(h(), "Chroma.dynamicChange", CollectionsKt.listOf(a2), new ona(this, 25));
            w96 unused8 = e(h(), "DynamicFont", CollectionsKt.emptyList(), new ona(this, 27));
            w96 unused9 = e(h(), "rlottie", CollectionsKt.emptyList(), new pna(14));
            w96 unused10 = e(h(), "EmojiProvider", CollectionsKt.emptyList(), new pna(15));
            w96 unused11 = e(h(), "Animoji warmup", CollectionsKt.emptyList(), new pna(16));
            w96 unused12 = e(h(), "VisibilityController", CollectionsKt.emptyList(), new h49(11));
            w96 unused13 = e(h(), "ProxyChangeListener", CollectionsKt.emptyList(), new h49(12));
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            w96 f = e(h(), "InitialDataStorage.Banners", CollectionsKt.emptyList(), new c28(18, atomicBoolean));
            AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
            e(h(), "LegacyChats", CollectionsKt.listOf(e(h(), "InitialDataStorage.Chats&Folders", CollectionsKt.listOf(f), new nz3(atomicReference, 1)), f), new sz0((Object) this, (Object) atomicBoolean, (Object) atomicReference, 5));
            w96 unused14 = e(h(), "RemoveAccountIfNeed", CollectionsKt.emptyList(), new h49(14));
            w96 unused15 = e(h(), "Folders Warmup", CollectionsKt.emptyList(), new h49(15));
        }
    }

    public final id3 b() {
        return g().b();
    }

    public final ve3 c() {
        return (ve3) qra.a.getAccessor().g(ve3.class);
    }

    public final ch d() {
        return (ch) this.a.getValue();
    }

    public final w96 e(udf udf, String str, Iterable iterable, Function0 function0) {
        ArrayList arrayList = this.o;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((Object) ((w96) it.next()).a, (Object) str)) {
                    throw new IllegalStateException(("Task " + str + " is root").toString());
                }
            }
        }
        return ((z96) udf).b(str, CollectionsKt.plus(arrayList, iterable), function0);
    }

    public final ym g() {
        return (ym) this.v.getValue();
    }

    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        v6e v6e = (v6e) this.z.getValue();
        return (SharedPreferences) ((ConcurrentHashMap) v6e.b.getValue()).computeIfAbsent(str, new yi(17, new ued(5, v6e, str)));
    }

    public final udf h() {
        return (udf) this.b.getValue();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        le3 le3 = (le3) this.w.getValue();
        le3.getClass();
        boolean z2 = (configuration.uiMode & 48) == 32;
        Boolean bool = le3.b;
        q13 q13 = le3.a;
        if (bool == null) {
            le3.b = Boolean.valueOf(z2);
            le3.c = Float.valueOf(configuration.fontScale);
            ((tcf) ((Lazy) q13.c).getValue()).b(true);
            return;
        }
        if (bool.booleanValue() != z2) {
            z68.c("le3", "onConfigurationChanged: system night mode changed to " + z2, new Object[0]);
            le3.b = Boolean.valueOf(z2);
            ((tcf) ((Lazy) q13.c).getValue()).b(true);
        }
        if (le3.c.floatValue() != configuration.fontScale) {
            z68.c("le3", "onConfigurationChanged: fontScale changed from " + le3.c + " to " + configuration.fontScale, new Object[0]);
            le3.c = Float.valueOf(configuration.fontScale);
            Context context = (Context) ((q4) q13.b).g(Context.class);
            ro4.b().c();
            ((esb) ((Lazy) q13.o).getValue()).a();
            ((km3) ((Lazy) q13.v).getValue()).i();
            ((r62) ((Lazy) q13.w).getValue()).w();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x021b, code lost:
        if (r13 < r2[2]) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x021f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x022b, code lost:
        if (r13 < r2[1]) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0232, code lost:
        if (r13 < r2[0]) goto L_0x021d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r22 = this;
            r1 = r22
            r3 = 1
            r4 = 12
            r5 = 10
            r6 = 9
            r7 = 8
            r8 = 29
            r9 = 28
            r10 = 26
            r11 = 7
            r12 = 4
            r13 = 11
            r14 = 5
            r15 = 2
            java.lang.String r0 = r1.y
            java.lang.String r2 = "onCreate"
            defpackage.z68.c(r0, r2, new java.lang.Object[0])
            super.onCreate()
            boolean r0 = com.jakewharton.processphoenix.ProcessPhoenix.a(r22)
            if (r0 == 0) goto L_0x0028
            return
        L_0x0028:
            udf r0 = r22.h()
            ona r2 = new ona
            r2.<init>(r1, r14)
            java.lang.String r14 = "DevicePerformanceClass"
            defpackage.w96 unused = r1.e(r0, r14, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r0 = r22.h()
            ona r2 = new ona
            r2.<init>(r1, r13)
            java.lang.String r14 = "Legacy.AppOnCreate"
            w96 r0 = r1.e(r0, r14, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r2 = r22.h()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            ona r14 = new ona
            r13 = 18
            r14.<init>(r1, r13)
            java.lang.String r13 = "Legacy.CompositionRoot"
            w96 r0 = r1.e(r2, r13, r0, r14)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            udf r2 = r22.h()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            ona r13 = new ona
            r14 = 19
            r13.<init>(r1, r14)
            java.lang.String r14 = "Legacy.Stickers"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r14 = 20
            r13.<init>(r1, r14)
            java.lang.String r14 = "Legacy.Animoji"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r14 = 21
            r13.<init>(r1, r14)
            java.lang.String r14 = "Legacy.TamContextAndroid"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            pna r13 = new pna
            r13.<init>(r12)
            java.lang.String r14 = "ForceUpdateLogic.clearForceUpdateVersionIfNeed"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r14 = 22
            r13.<init>(r1, r14)
            java.lang.String r14 = "ServiceTaskCheckProcessingTasks"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r14 = 23
            r13.<init>(r1, r14)
            java.lang.String r14 = "Legacy.ContactsLoader"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r14 = 24
            r13.<init>(r1, r14)
            java.lang.String r14 = "Legacy.CallsHistoryLoader"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r14 = 6
            r13.<init>(r1, r14)
            java.lang.String r14 = "Legacy.MessageControllerConsumer"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r13.<init>(r1, r11)
            java.lang.String r14 = "Legacy.ActivityLifecycleCallbacks"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            h49 r13 = new h49
            r14 = 25
            r13.<init>(r14)
            java.lang.String r14 = "RestoreMessageUploads"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            h49 r13 = new h49
            r13.<init>(r10)
            java.lang.String r14 = "Legacy.Drafts"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            h49 r13 = new h49
            r14 = 27
            r13.<init>(r14)
            java.lang.String r14 = "Legacy.Phonebook"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            h49 r13 = new h49
            r13.<init>(r9)
            java.lang.String r14 = "Legacy.SystemServicesManager"
            defpackage.w96 unused = r1.e(r2, r14, kotlin.collections.CollectionsKt.emptyList(), r13)
            udf r2 = r22.h()
            h49 r13 = new h49
            r13.<init>(r8)
            java.lang.String r14 = "Legacy.ShortcutsHelper"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r13.<init>(r1, r7)
            java.lang.String r14 = "Legacy.Permissions"
            defpackage.w96 unused = r1.e(r2, r14, kotlin.collections.CollectionsKt.emptyList(), r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r13.<init>(r1, r6)
            java.lang.String r14 = "PermissionStats"
            defpackage.w96 unused = r1.e(r2, r14, kotlin.collections.CollectionsKt.emptyList(), r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r13.<init>(r1, r5)
            java.lang.String r14 = "Legacy.PhoneNumberUtil"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r13.<init>(r1, r4)
            java.lang.String r14 = "Legacy.CallLinksLoader"
            r1.e(r2, r14, r0, r13)
            udf r2 = r22.h()
            ona r13 = new ona
            r14 = 13
            r13.<init>(r1, r14)
            java.lang.String r14 = "Legacy.StartupListeners"
            r1.e(r2, r14, r0, r13)
            udf r0 = r22.h()
            pna r2 = new pna
            r2.<init>(r3)
            java.lang.String r13 = "Shortcuts and badge warmup"
            defpackage.w96 unused = r1.e(r0, r13, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r0 = r22.h()
            ona r2 = new ona
            r13 = 14
            r2.<init>(r1, r13)
            java.lang.String r13 = "InAppReviewUncaughtExceptionHandler"
            defpackage.w96 unused = r1.e(r0, r13, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r0 = r22.h()
            pna r2 = new pna
            r2.<init>(r15)
            java.lang.String r13 = "HeartbeatScheduler"
            defpackage.w96 unused = r1.e(r0, r13, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r0 = r22.h()
            ona r2 = new ona
            r13 = 15
            r2.<init>(r1, r13)
            java.lang.String r13 = "Db.NotMainThreadListener"
            defpackage.w96 unused = r1.e(r0, r13, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r0 = r22.h()
            ona r2 = new ona
            r13 = 16
            r2.<init>(r1, r13)
            java.lang.String r13 = "Mytracker"
            defpackage.w96 unused = r1.e(r0, r13, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r0 = r22.h()
            pna r2 = new pna
            r13 = 3
            r2.<init>(r13)
            java.lang.String r13 = "NewToolbar"
            defpackage.w96 unused = r1.e(r0, r13, kotlin.collections.CollectionsKt.emptyList(), r2)
            udf r0 = r22.h()
            r2 = r0
            z96 r2 = (defpackage.z96) r2
            r2.getClass()
            java.util.ArrayList r0 = r2.c     // Catch:{ all -> 0x045b }
            java.util.concurrent.ForkJoinTask.invokeAll(r0)     // Catch:{ all -> 0x045b }
            java.util.ArrayList r0 = r2.c
            r0.clear()
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.x
            long r13 = r13 - r4
            ccb r0 = defpackage.o5a.v(r22)
            qra r2 = defpackage.qra.a
            ltb r2 = r2.y()
            cud r2 = r2.b
            r2.getClass()
            long[] r2 = defpackage.bud.c
            int r4 = r2.length
            r5 = 3
            if (r4 != r5) goto L_0x044f
            kn4 r0 = r0.a
            int r0 = r0.ordinal()
            r4 = 0
            if (r0 == 0) goto L_0x022e
            if (r0 == r3) goto L_0x0227
            if (r0 != r15) goto L_0x0221
            r16 = r2[r15]
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x021f
        L_0x021d:
            r0 = r3
            goto L_0x0235
        L_0x021f:
            r0 = r4
            goto L_0x0235
        L_0x0221:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0227:
            r16 = r2[r3]
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x021f
            goto L_0x021d
        L_0x022e:
            r16 = r2[r4]
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x021f
            goto L_0x021d
        L_0x0235:
            r0 = r0 ^ r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r5 = "ms from start!\n"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "Total tasks durations: "
            r2.append(r3)
            udf r3 = r22.h()
            r3.getClass()
            z96 r3 = (defpackage.z96) r3
            y96 r3 = r3.b
            java.lang.Object r3 = r3.b
            java.util.concurrent.ConcurrentSkipListSet r3 = (java.util.concurrent.ConcurrentSkipListSet) r3
            java.util.Iterator r3 = r3.iterator()
            r16 = 0
            r6 = r16
        L_0x026b:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x0289
            java.lang.Object r16 = r3.next()
            r5 = r16
            zi8 r5 = (defpackage.zi8) r5
            java.util.concurrent.TimeUnit r8 = r5.o
            long r9 = r5.c
            long r8 = r8.toMillis(r9)
            long r6 = r6 + r8
            r8 = 29
            r9 = 28
            r10 = 26
            goto L_0x026b
        L_0x0289:
            r2.append(r6)
            java.lang.String r3 = "ms \nTopmost by durations:\n"
            r2.append(r3)
            udf r3 = r22.h()
            z96 r3 = (defpackage.z96) r3
            y96 r3 = r3.b
            java.util.Comparator r5 = java.util.Comparator.reverseOrder()
            java.util.SortedSet r16 = kotlin.collections.CollectionsKt.toSortedSet(r3, r5)
            oo9 r3 = new oo9
            r3.<init>(r12)
            java.lang.String r18 = "\n"
            r21 = 44
            r19 = 5
            r17 = r2
            r20 = r3
            java.lang.Appendable unused = kotlin.collections.CollectionsKt___CollectionsKt.joinTo$default(r16, r17, r18, (java.lang.CharSequence) null, (java.lang.CharSequence) null, r19, (java.lang.CharSequence) null, r20, r21, (java.lang.Object) null)
            java.lang.String r3 = "\nTopmost by waiting:\n"
            r2.append(r3)
            udf r3 = r22.h()
            z96 r3 = (defpackage.z96) r3
            y96 r3 = r3.b
            aoa r5 = defpackage.aoa.a
            qna r6 = new qna
            r6.<init>(r5)
            java.util.Comparator r5 = java.util.Comparator.comparingLong(r6)
            java.util.Comparator r5 = r5.reversed()
            java.util.SortedSet r16 = kotlin.collections.CollectionsKt.toSortedSet(r3, r5)
            oo9 r3 = new oo9
            r5 = 5
            r3.<init>(r5)
            java.lang.String r18 = "\n"
            r21 = 44
            r19 = 5
            r17 = r2
            r20 = r3
            java.lang.Appendable unused = kotlin.collections.CollectionsKt___CollectionsKt.joinTo$default(r16, r17, r18, (java.lang.CharSequence) null, (java.lang.CharSequence) null, r19, (java.lang.CharSequence) null, r20, r21, (java.lang.Object) null)
            java.lang.String r3 = "\nThreads info:\n"
            r2.append(r3)
            udf r3 = r22.h()
            z96 r3 = (defpackage.z96) r3
            y96 r3 = r3.b
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.lang.Object r3 = r3.b
            java.util.concurrent.ConcurrentSkipListSet r3 = (java.util.concurrent.ConcurrentSkipListSet) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0300:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0323
            java.lang.Object r6 = r3.next()
            r7 = r6
            zi8 r7 = (defpackage.zi8) r7
            java.lang.String r7 = r7.v
            java.lang.Object r8 = r5.get(r7)
            if (r8 != 0) goto L_0x031d
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5.put(r7, r8)
        L_0x031d:
            java.util.List r8 = (java.util.List) r8
            r8.add(r6)
            goto L_0x0300
        L_0x0323:
            r6 r3 = new r6
            r6 = 15
            r3.<init>(r6, r2)
            z23 r6 = new z23
            r6.<init>(r15, r3)
            r5.forEach(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = r1.y
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            h2g r3 = defpackage.h2g.a
            e24 r5 = r3.d()
            w78 r6 = defpackage.w78.c
            lq r5 = (defpackage.lq) r5
            r5.getClass()
            pof r5 = defpackage.lq.d()
            if (r5 == 0) goto L_0x0351
            defpackage.pof.a(r2)
        L_0x0351:
            if (r0 == 0) goto L_0x038d
            e24 r0 = r3.d()
            ccb r2 = defpackage.o5a.v(r22)
            qra r3 = defpackage.qra.a
            doa r3 = r3.j()
            boolean r3 = r3.e()
            one.me.android.perfomance.ApplicationCreationOvertimeException r5 = new one.me.android.perfomance.ApplicationCreationOvertimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "isLoggedIn="
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = " creationTime="
            r6.append(r3)
            r6.append(r13)
            java.lang.String r3 = " perfClass="
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.<init>(r2)
            java.lang.String r2 = "ONEME-1862"
            r0.a(r2, r5)
        L_0x038d:
            kotlin.Pair[] r0 = new kotlin.Pair[r4]
            java.lang.String r2 = "app_creation_duration"
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch:{ all -> 0x03ac }
            fpf r3 = defpackage.fpf.a     // Catch:{ all -> 0x03ac }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x03ac }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x03ac }
            long r5 = r5.toNanos(r13)     // Catch:{ all -> 0x03ac }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch:{ all -> 0x03ac }
            kotlin.Pair[] r0 = (kotlin.Pair[]) r0     // Catch:{ all -> 0x03ac }
            defpackage.fpf.a(r2, r5, r3, r0)     // Catch:{ all -> 0x03ac }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x03ac }
            kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x03ac }
            goto L_0x03b6
        L_0x03ac:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m23constructorimpl(r0)
        L_0x03b6:
            udf r0 = r22.h()
            pna r2 = new pna
            r2.<init>(r11)
            java.lang.String r3 = "Legacy.GalleryPrefetch"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            ona r2 = new ona
            r3 = 26
            r2.<init>(r1, r3)
            java.lang.String r3 = "Legacy.TimeChangeReceiver"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            ona r2 = new ona
            r3 = 28
            r2.<init>(r1, r3)
            java.lang.String r3 = "Legacy.Theme.ScheduleNightModeCheckIfNeed"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            pna r2 = new pna
            r3 = 8
            r2.<init>(r3)
            java.lang.String r3 = "Legacy.SendUnsentCrashReports"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            ona r2 = new ona
            r3 = 29
            r2.<init>(r1, r3)
            java.lang.String r3 = "Legacy.SendInstallInfo"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            pna r2 = new pna
            r3 = 9
            r2.<init>(r3)
            java.lang.String r3 = "Legacy.DailyAnalytics"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            pna r2 = new pna
            r3 = 10
            r2.<init>(r3)
            java.lang.String r3 = "NotificationTrackerCleanupScheduler"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            pna r2 = new pna
            r3 = 11
            r2.<init>(r3)
            java.lang.String r3 = "Stickers warmup"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            pna r2 = new pna
            r3 = 12
            r2.<init>(r3)
            java.lang.String r3 = "QrCodeGenerator"
            defpackage.w96 unused = ((defpackage.z96) r0).b(r3, kotlin.collections.CollectionsKt.emptyList(), r2)
            wp r0 = r1.c
            r0.getClass()
            ybb r0 = defpackage.ybb.APP_INIT
            qz9 r1 = defpackage.wp.b
            java.lang.Object r2 = r1.c(r0)
            xbb r2 = (defpackage.xbb) r2
            if (r2 == 0) goto L_0x044e
            long r2 = r2.e
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x044e
            java.lang.Object r0 = r1.c(r0)
            xbb r0 = (defpackage.xbb) r0
            if (r0 == 0) goto L_0x044e
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.b
            long r1 = r1 - r3
            r0.e = r1
        L_0x044e:
            return
        L_0x044f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x045b:
            r0 = move-exception
            java.util.ArrayList r1 = r2.c     // Catch:{ all -> 0x0478 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0478 }
            r4 = r0
        L_0x0463:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0478 }
            if (r5 == 0) goto L_0x048d
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0478 }
            x96 r5 = (defpackage.x96) r5     // Catch:{ all -> 0x0478 }
            java.lang.Throwable r6 = r5.o     // Catch:{ all -> 0x0478 }
            if (r6 == 0) goto L_0x047a
            java.lang.Class r7 = r6.getClass()     // Catch:{ all -> 0x0478 }
            goto L_0x047b
        L_0x0478:
            r0 = move-exception
            goto L_0x048e
        L_0x047a:
            r7 = 0
        L_0x047b:
            java.lang.Class r8 = r0.getClass()     // Catch:{ all -> 0x0478 }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ all -> 0x0478 }
            if (r7 == 0) goto L_0x0486
            r4 = r6
        L_0x0486:
            r5.cancel(r3)     // Catch:{ all -> 0x0478 }
            r5.completeExceptionally(r0)     // Catch:{ all -> 0x0478 }
            goto L_0x0463
        L_0x048d:
            throw r4     // Catch:{ all -> 0x0478 }
        L_0x048e:
            java.util.ArrayList r1 = r2.c
            r1.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.OneMeApplication.onCreate():void");
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 40 && !ProcessPhoenix.a(this)) {
            z68.c(this.y, "onTrimMemory: TRIM_MEMORY_BACKGROUND", new Object[0]);
            b97 b97 = (b97) qra.a.getAccessor().g(b97.class);
            ((aua) b97.d.getValue()).a().execute(new y86(15, (Object) b97));
            LruCache lruCache = qhf.a;
            z68.c("ThemeBackgroundCache", "clear cache of themes.", new Object[0]);
            qhf.a.evictAll();
        }
    }
}

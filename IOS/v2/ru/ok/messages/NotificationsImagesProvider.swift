package ru.ok.messages;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/NotificationsImagesProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNotificationsImagesProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsImagesProvider.kt\nru/ok/messages/NotificationsImagesProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,173:1\n1#2:174\n351#3,11:175\n*S KotlinDebug\n*F\n+ 1 NotificationsImagesProvider.kt\nru/ok/messages/NotificationsImagesProvider\n*L\n123#1:175,11\n*E\n"})
public final class NotificationsImagesProvider extends ContentProvider {
    public static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("one.me.android.notifications", "message_image/*/*", 1);
        a = uriMatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(ru.ok.messages.NotificationsImagesProvider r7, defpackage.uae r8, defpackage.d14 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.hfa
            if (r0 == 0) goto L_0x0016
            r0 = r10
            hfa r0 = (defpackage.hfa) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x001b
        L_0x0016:
            hfa r0 = new hfa
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            d14 r7 = r0.c
            qx0 r8 = r0.b
            ru.ok.messages.NotificationsImagesProvider r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x0040
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r10)
        L_0x0040:
            boolean r10 = defpackage.e14.f(r9)
            if (r10 == 0) goto L_0x0068
            r7.getClass()
            java.io.File r10 = b(r8)
            if (r10 == 0) goto L_0x0057
            boolean r2 = r10.exists()
            if (r2 == 0) goto L_0x0057
            r1 = r10
            goto L_0x0069
        L_0x0057:
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.w = r3
            r4 = 100
            java.lang.Object r10 = defpackage.xk4.b(r4, r0)
            if (r10 != r1) goto L_0x0040
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.NotificationsImagesProvider.a(ru.ok.messages.NotificationsImagesProvider, uae, d14, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static File b(qx0 qx0) {
        ml5 c = ((up4) ((nl5) ((rp4) ea7.g().d.get()).a.getValue())).c(qx0);
        if (!(c instanceof ml5)) {
            c = null;
        }
        if (c != null) {
            return c.a;
        }
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        if (!StringsKt__StringsJVMKt.startsWith$default(str, "*/", false, 2, (Object) null) && !StringsKt__StringsJVMKt.startsWith$default(str, "image/", false, 2, (Object) null)) {
            return null;
        }
        o9a o9a = sq9.b;
        return new String[]{"image/jpeg", "image/png", "image/webp"};
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        Collection pathSegments;
        Object obj;
        if (!Intrinsics.areEqual((Object) "r", (Object) str)) {
            throw new SecurityException("Only read mode is supported");
        } else if (a.match(uri) != 1 || (pathSegments = uri.getPathSegments()) == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("Wrong uri");
        } else {
            List<String> pathSegments2 = uri.getPathSegments();
            String str2 = pathSegments2.get(1);
            if (str2 == null) {
                str2 = null;
            }
            if (str2 == null || str2.length() == 0) {
                throw new FileNotFoundException("Failed");
            }
            String str3 = pathSegments2.get(2);
            if (str3 != null) {
                boolean parseBoolean = Boolean.parseBoolean(str3);
                Uri x = o5a.x(str2);
                if (!o5a.L(x, getContext(), ((qra) ym.e()).o())) {
                    ra7 d = ra7.d(x);
                    d.b = pa7.DISK_CACHE;
                    qa7 a2 = d.a();
                    cd4 h = cd4.h();
                    h.getClass();
                    uae g = h.g(a2.b);
                    File b = b(g);
                    if (!cjf.o(b) && parseBoolean) {
                        try {
                            Result.Companion companion = Result.Companion;
                            obj = Result.m23constructorimpl((File) ev0.C(EmptyCoroutineContext.INSTANCE, new jfa(this, x, g, (Continuation) null)));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
                        }
                        Throwable r7 = Result.m26exceptionOrNullimpl(obj);
                        if (r7 == null) {
                            b = (File) obj;
                        } else {
                            z68.f("ru.ok.messages.NotificationsImagesProvider", "fetchUriOnDiskSync: failed", r7);
                            throw new FileNotFoundException("Download failed");
                        }
                    }
                    if (b != null) {
                        return ParcelFileDescriptor.open(b, 268435456);
                    }
                    z68.c("ru.ok.messages.NotificationsImagesProvider", "openFile: no image in cache, loadFromNetwork=" + parseBoolean, new Object[0]);
                    throw new FileNotFoundException("Failed");
                }
                z68.f("ru.ok.messages.NotificationsImagesProvider", "openFile: failed, internal uri=" + uri, (Throwable) null);
                throw new SecurityException("Internal uri detected");
            }
            throw new FileNotFoundException("Failed");
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

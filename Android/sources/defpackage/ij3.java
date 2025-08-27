package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: ij3  reason: default package */
public final class ij3 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ ij3(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v25, types: [qpg, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: type inference failed for: r2v43 */
    /* JADX WARNING: type inference failed for: r2v44 */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0258, code lost:
        r1 = (defpackage.bx6) r8.o;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0240 A[SYNTHETIC, Splitter:B:79:0x0240] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0249 A[SYNTHETIC, Splitter:B:84:0x0249] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            r3 = 0
            int r4 = r8.a
            switch(r4) {
                case 0: goto L_0x02a7;
                case 1: goto L_0x0290;
                case 2: goto L_0x0252;
                case 3: goto L_0x01f9;
                case 4: goto L_0x01df;
                case 5: goto L_0x01c2;
                case 6: goto L_0x01b2;
                case 7: goto L_0x01a0;
                case 8: goto L_0x0160;
                case 9: goto L_0x0091;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r8.b
            b43 r0 = (defpackage.b43) r0
            java.lang.String r4 = "google.message_id"
            android.content.Intent r5 = r0.a
            java.lang.String r4 = r5.getStringExtra(r4)
            if (r4 != 0) goto L_0x001d
            java.lang.String r4 = "message_id"
            java.lang.String r4 = r5.getStringExtra(r4)
        L_0x001d:
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0028
            s7h r0 = defpackage.hsg.o(r2)
            goto L_0x007d
        L_0x0028:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "google.message_id"
            android.content.Intent r6 = r0.a
            java.lang.String r5 = r6.getStringExtra(r5)
            if (r5 != 0) goto L_0x003d
            java.lang.String r5 = "message_id"
            java.lang.String r5 = r6.getStringExtra(r5)
        L_0x003d:
            java.lang.String r6 = "google.message_id"
            r4.putString(r6, r5)
            android.content.Intent r0 = r0.a
            java.lang.String r5 = "google.product_id"
            boolean r6 = r0.hasExtra(r5)
            if (r6 == 0) goto L_0x0054
            int r0 = r0.getIntExtra(r5, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0054:
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = "google.product_id"
            int r2 = r2.intValue()
            r4.putInt(r0, r2)
        L_0x005f:
            java.lang.String r0 = "supports_message_handled"
            r4.putBoolean(r0, r1)
            java.lang.Object r0 = r8.c
            android.content.Context r0 = (android.content.Context) r0
            m7h r0 = defpackage.m7h.g(r0)
            w6h r2 = new w6h
            monitor-enter(r0)
            int r5 = r0.c     // Catch:{ all -> 0x008e }
            int r1 = r1 + r5
            r0.c = r1     // Catch:{ all -> 0x008e }
            monitor-exit(r0)
            r1 = 2
            r2.<init>(r5, r1, r4, r3)
            s7h r0 = r0.h(r2)
        L_0x007d:
            ep4 r1 = defpackage.ep4.c
            ykb r2 = new ykb
            java.lang.Object r8 = r8.o
            java.util.concurrent.CountDownLatch r8 = (java.util.concurrent.CountDownLatch) r8
            r3 = 15
            r2.<init>(r3, r8)
            r0.b(r1, r2)
            return
        L_0x008e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r8
        L_0x0091:
            qpg r0 = new qpg
            java.lang.Object r4 = r8.c
            android.content.Context r4 = (android.content.Context) r4
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>(r2)
            r0.c = r5
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r0.o = r2
            r0.b = r4
            java.lang.Object r2 = r8.b
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
            nrg r4 = new nrg
            r4.<init>(r8)
            java.lang.String r8 = "\\"
            java.lang.String r5 = "\\\\"
            java.lang.String r8 = r2.replace(r8, r5)
            java.lang.String r2 = "'"
            java.lang.String r5 = "\\'"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "</"
            java.lang.String r5 = "<\\/"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "\n"
            java.lang.String r5 = "\\n"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "\r"
            java.lang.String r5 = "\\r"
            java.lang.String r8 = r8.replace(r2, r5)
            java.lang.String r2 = "evgeniiJsEvaluator.returnResultToJava(eval('try{"
            java.lang.String r5 = "}catch(e){\"evgeniiJsEvaluatorException\"+e}'));"
            java.lang.String r8 = defpackage.wj6.k(r2, r8, r5)
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            r2.set(r4)
            java.lang.Object r2 = r0.a
            bpa r2 = (defpackage.bpa) r2
            if (r2 != 0) goto L_0x0121
            bpa r2 = new bpa
            r4 = 14
            r2.<init>((int) r4)
            android.webkit.WebView r4 = new android.webkit.WebView
            java.lang.Object r5 = r0.b
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5)
            r2.b = r4
            r4.setWillNotDraw(r1)
            android.webkit.WebSettings r5 = r4.getSettings()
            r5.setJavaScriptEnabled(r1)
            java.lang.String r1 = "utf-8"
            r5.setDefaultTextEncodingName(r1)
            ru.ok.messages.video.fetcher.youtube.js.JavaScriptInterface r1 = new ru.ok.messages.video.fetcher.youtube.js.JavaScriptInterface
            r1.<init>(r0)
            java.lang.String r5 = "evgeniiJsEvaluator"
            r4.addJavascriptInterface(r1, r5)
            r0.a = r2
        L_0x0121:
            java.lang.Object r0 = r0.a
            bpa r0 = (defpackage.bpa) r0
            r0.getClass()
            java.lang.String r1 = "data:text/html;charset=utf-8;base64,"
            java.lang.String r2 = "<script>"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x015b }
            r4.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            r4.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            java.lang.String r8 = "</script>"
            r4.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            java.lang.String r8 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x015b }
            java.lang.String r2 = "UTF-8"
            byte[] r8 = r8.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r3)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            java.lang.Object r0 = r0.b     // Catch:{ UnsupportedEncodingException -> 0x015b }
            android.webkit.WebView r0 = (android.webkit.WebView) r0     // Catch:{ UnsupportedEncodingException -> 0x015b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x015b }
            r2.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            r2.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            java.lang.String r8 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x015b }
            r0.loadUrl(r8)     // Catch:{ UnsupportedEncodingException -> 0x015b }
            goto L_0x015f
        L_0x015b:
            r8 = move-exception
            r8.printStackTrace()
        L_0x015f:
            return
        L_0x0160:
            java.lang.Object r0 = r8.b
            kw1 r0 = (defpackage.kw1) r0
            boolean r1 = r0.isActive()     // Catch:{ all -> 0x017c }
            if (r1 == 0) goto L_0x019f
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x017c }
            java.lang.Object r1 = r8.c     // Catch:{ all -> 0x017c }
            zz7 r1 = (defpackage.zz7) r1     // Catch:{ all -> 0x017c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x017c }
            java.lang.Object r1 = kotlin.Result.m23constructorimpl(r1)     // Catch:{ all -> 0x017c }
            r0.resumeWith(r1)     // Catch:{ all -> 0x017c }
            goto L_0x019f
        L_0x017c:
            r1 = move-exception
            java.lang.Object r8 = r8.o
            y6g r8 = (defpackage.y6g) r8
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r2 = r1.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            defpackage.z68.h(r8, r1, r2, r3)
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r8 = kotlin.Result.m23constructorimpl(r8)
            r0.resumeWith(r8)
        L_0x019f:
            return
        L_0x01a0:
            java.lang.Object r0 = r8.b
            dpg r0 = (defpackage.dpg) r0
            rvb r0 = r0.f
            java.lang.Object r1 = r8.c
            bme r1 = (defpackage.bme) r1
            java.lang.Object r8 = r8.o
            aqg r8 = (defpackage.aqg) r8
            r0.h(r1, r8)
            return
        L_0x01b2:
            java.lang.Object r1 = r8.o
            ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator r1 = (ru.ok.messages.calls.views.indicator.ScrollingPagerIndicator) r1
            r1.w0 = r0
            java.lang.Object r0 = r8.c
            sb0 r0 = (defpackage.sb0) r0
            java.lang.Object r8 = r8.b
            r1.b(r8, r0)
            return
        L_0x01c2:
            java.lang.Object r0 = r8.b     // Catch:{ Exception -> 0x01ca }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x01ca }
            java.lang.Object r2 = r0.call()     // Catch:{ Exception -> 0x01ca }
        L_0x01ca:
            uj6 r0 = new uj6
            java.lang.Object r1 = r8.c
            tk3 r1 = (defpackage.tk3) r1
            ez4 r1 = (defpackage.ez4) r1
            r3 = 19
            r0.<init>(r3, r1, r2)
            java.lang.Object r8 = r8.o
            android.os.Handler r8 = (android.os.Handler) r8
            r8.post(r0)
            return
        L_0x01df:
            java.lang.Object r0 = r8.o     // Catch:{ InterruptedException | ExecutionException -> 0x01ed }
            zz7 r0 = (defpackage.zz7) r0     // Catch:{ InterruptedException | ExecutionException -> 0x01ed }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x01ed }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ InterruptedException | ExecutionException -> 0x01ed }
            boolean r1 = r0.booleanValue()     // Catch:{ InterruptedException | ExecutionException -> 0x01ed }
        L_0x01ed:
            java.lang.Object r0 = r8.b
            u95 r0 = (defpackage.u95) r0
            java.lang.Object r8 = r8.c
            wog r8 = (defpackage.wog) r8
            r0.b(r8, r1)
            return
        L_0x01f9:
            java.lang.Object r1 = r8.b
            p57 r1 = (defpackage.p57) r1
            java.lang.Object r3 = r8.c
            p7d r3 = (defpackage.p7d) r3
            java.lang.Object r8 = r8.o
            q57 r8 = (defpackage.q57) r8
            r8.getClass()
            yvb r4 = r1.b     // Catch:{ IOException -> 0x0239, all -> 0x0236 }
            ik0 r4 = (defpackage.ik0) r4     // Catch:{ IOException -> 0x0239, all -> 0x0236 }
            qa7 r4 = r4.a     // Catch:{ IOException -> 0x0239, all -> 0x0236 }
            android.net.Uri r4 = r4.b     // Catch:{ IOException -> 0x0239, all -> 0x0236 }
            r5 = 5
            java.net.HttpURLConnection r4 = r8.U(r4, r5)     // Catch:{ IOException -> 0x0239, all -> 0x0236 }
            ys9 r8 = r8.q     // Catch:{ IOException -> 0x0229 }
            long r5 = r8.now()     // Catch:{ IOException -> 0x0229 }
            r1.e = r5     // Catch:{ IOException -> 0x0229 }
            if (r4 == 0) goto L_0x022b
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ IOException -> 0x0229 }
            r3.B(r2, r0)     // Catch:{ IOException -> 0x0229 }
            goto L_0x022b
        L_0x0227:
            r8 = move-exception
            goto L_0x0247
        L_0x0229:
            r8 = move-exception
            goto L_0x023b
        L_0x022b:
            if (r2 == 0) goto L_0x0230
            r2.close()     // Catch:{ IOException -> 0x0230 }
        L_0x0230:
            if (r4 == 0) goto L_0x0246
        L_0x0232:
            r4.disconnect()
            goto L_0x0246
        L_0x0236:
            r8 = move-exception
            r4 = r2
            goto L_0x0247
        L_0x0239:
            r8 = move-exception
            r4 = r2
        L_0x023b:
            r3.g(r8)     // Catch:{ all -> 0x0227 }
            if (r2 == 0) goto L_0x0243
            r2.close()     // Catch:{ IOException -> 0x0243 }
        L_0x0243:
            if (r4 == 0) goto L_0x0246
            goto L_0x0232
        L_0x0246:
            return
        L_0x0247:
            if (r2 == 0) goto L_0x024c
            r2.close()     // Catch:{ IOException -> 0x024c }
        L_0x024c:
            if (r4 == 0) goto L_0x0251
            r4.disconnect()
        L_0x0251:
            throw r8
        L_0x0252:
            java.lang.Object r0 = r8.c
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x028f
            java.lang.Object r1 = r8.o
            bx6 r1 = (defpackage.bx6) r1
            android.widget.OverScroller r2 = r1.d
            if (r2 == 0) goto L_0x028f
            boolean r2 = r2.computeScrollOffset()
            java.lang.Object r3 = r8.b
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            if (r2 == 0) goto L_0x0279
            android.widget.OverScroller r2 = r1.d
            int r2 = r2.getCurrY()
            r1.B(r3, r0, r2)
            java.util.WeakHashMap r1 = defpackage.gag.a
            r0.postOnAnimation(r8)
            goto L_0x028f
        L_0x0279:
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r1 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r1
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            r1.K(r3, r0)
            boolean r8 = r0.x0
            if (r8 == 0) goto L_0x028f
            android.view.View r8 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(r3)
            boolean r8 = r0.h(r8)
            r0.g(r8)
        L_0x028f:
            return
        L_0x0290:
            java.lang.Object r0 = r8.o
            ca5 r0 = (defpackage.ca5) r0
            java.lang.Object r1 = r8.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            mq4 r0 = r0.a(r1)
            java.lang.Object r8 = r8.b
            mw1 r8 = (defpackage.mw1) r8
            r8.getClass()
            defpackage.qq4.c(r8, r0)
            return
        L_0x02a7:
            java.lang.Object r0 = r8.o
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            java.lang.Object r1 = r8.c
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r8.b
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r2 = "Updating proxies: (BatteryNotLowProxy ("
            java.lang.String r4 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            boolean r4 = r8.getBooleanExtra(r4, r3)     // Catch:{ all -> 0x0317 }
            java.lang.String r5 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            boolean r5 = r8.getBooleanExtra(r5, r3)     // Catch:{ all -> 0x0317 }
            java.lang.String r6 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            boolean r6 = r8.getBooleanExtra(r6, r3)     // Catch:{ all -> 0x0317 }
            java.lang.String r7 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            boolean r8 = r8.getBooleanExtra(r7, r3)     // Catch:{ all -> 0x0317 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0317 }
            r3.<init>(r2)     // Catch:{ all -> 0x0317 }
            r3.append(r4)     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = "), BatteryChargingProxy ("
            r3.append(r2)     // Catch:{ all -> 0x0317 }
            r3.append(r5)     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = "), StorageNotLowProxy ("
            r3.append(r2)     // Catch:{ all -> 0x0317 }
            r3.append(r6)     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = "), NetworkStateProxy ("
            r3.append(r2)     // Catch:{ all -> 0x0317 }
            r3.append(r8)     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = "), "
            r3.append(r2)     // Catch:{ all -> 0x0317 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0317 }
            h88 r3 = defpackage.h88.x()     // Catch:{ all -> 0x0317 }
            java.lang.String r7 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.a     // Catch:{ all -> 0x0317 }
            r3.p(r7, r2)     // Catch:{ all -> 0x0317 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy.class
            defpackage.a7b.a(r1, r2, r4)     // Catch:{ all -> 0x0317 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy.class
            defpackage.a7b.a(r1, r2, r5)     // Catch:{ all -> 0x0317 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy.class
            defpackage.a7b.a(r1, r2, r6)     // Catch:{ all -> 0x0317 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy.class
            defpackage.a7b.a(r1, r2, r8)     // Catch:{ all -> 0x0317 }
            r0.finish()
            return
        L_0x0317:
            r8 = move-exception
            r0.finish()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij3.run():void");
    }

    public /* synthetic */ ij3(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ ij3(Context context, b43 b43, CountDownLatch countDownLatch) {
        this.a = 10;
        this.c = context;
        this.b = b43;
        this.o = countDownLatch;
    }

    public /* synthetic */ ij3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public ij3(org org2, Context context, StringBuilder sb) {
        this.a = 9;
        this.o = org2;
        this.c = context;
        this.b = sb;
    }
}

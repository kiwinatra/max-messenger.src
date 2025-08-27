package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hq7  reason: default package */
public final /* synthetic */ class hq7 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7() {
        super(1, e89.a, e89.class, "convert", "convert$message_list_release(Lru/ok/tamtam/messages/MessageAction;)Lone/me/sdk/contextmenu/ContextMenuAction;", 0);
        this.a = 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x084b, code lost:
        if (((defpackage.gpe) r2).b == ((defpackage.qve) r4.getValue()).a) goto L_0x08b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0868, code lost:
        if (r6.a == ((defpackage.qve) r4.getValue()).a) goto L_0x08b7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = -1
            r2 = 0
            java.lang.String r4 = "CallSessionRoomsManager"
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            int r10 = r0.a
            switch(r10) {
                case 0: goto L_0x08ba;
                case 1: goto L_0x0823;
                case 2: goto L_0x0796;
                case 3: goto L_0x0774;
                case 4: goto L_0x0726;
                case 5: goto L_0x06e2;
                case 6: goto L_0x0692;
                case 7: goto L_0x04d0;
                case 8: goto L_0x04ad;
                case 9: goto L_0x0483;
                case 10: goto L_0x0460;
                case 11: goto L_0x044a;
                case 12: goto L_0x0434;
                case 13: goto L_0x041c;
                case 14: goto L_0x03f3;
                case 15: goto L_0x03bc;
                case 16: goto L_0x03af;
                case 17: goto L_0x036c;
                case 18: goto L_0x014a;
                case 19: goto L_0x0134;
                case 20: goto L_0x00ec;
                case 21: goto L_0x00d8;
                case 22: goto L_0x00c4;
                case 23: goto L_0x00b2;
                case 24: goto L_0x00a4;
                case 25: goto L_0x0092;
                default: goto L_0x0011;
            }
        L_0x0011:
            r1 = r17
            ld1 r1 = (defpackage.ld1) r1
            java.lang.Object r0 = r0.receiver
            nd1 r0 = (defpackage.nd1) r0
            cf r2 = r0.c
            btg r3 = r1.k
            r3.removeCallbacks(r2)
            java.lang.String r2 = "Statistics report task cancelled"
            voc r3 = r0.a
            java.lang.String r4 = r0.d
            r3.log(r4, r2)
            java.util.ArrayList r2 = r0.i
            int r5 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Will now release "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " registered drawers"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3.log(r4, r5)
            java.util.Iterator r5 = r2.iterator()
        L_0x0049:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0060
            java.lang.Object r6 = r5.next()
            md1 r6 = (defpackage.md1) r6
            android.opengl.EGLSurface r7 = r6.a
            r6.a = r9
            r1.e(r7)
            r6.a()
            goto L_0x0049
        L_0x0060:
            int r1 = r2.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = " drawers were released"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r3.log(r4, r1)
            r2.clear()
            org.webrtc.GlRectDrawer r1 = r0.h
            r1.release()
            java.lang.String r1 = "Shared holder released"
            r3.log(r4, r1)
            org.webrtc.VideoFrameDrawer r0 = r0.g
            r0.release()
            java.lang.String r0 = "Frame drawer released"
            r3.log(r4, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0092:
            r1 = r17
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            yj1 r0 = (defpackage.yj1) r0
            voc r0 = r0.a
            java.lang.String r2 = "All rooms load error"
            r0.logException(r4, r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00a4:
            r1 = r17
            fae r1 = (defpackage.fae) r1
            java.lang.Object r0 = r0.receiver
            yj1 r0 = (defpackage.yj1) r0
            r0.e(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00b2:
            r1 = r17
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            yj1 r0 = (defpackage.yj1) r0
            voc r0 = r0.a
            java.lang.String r2 = "All participants load error"
            r0.logException(r4, r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00c4:
            r1 = r17
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            b8g r0 = (defpackage.b8g) r0
            java.lang.Object r0 = r0.c
            voc r0 = (defpackage.voc) r0
            java.lang.String r2 = "VideoRecord_BufferTransform"
            r0.log(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d8:
            r1 = r17
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            ld1 r0 = (defpackage.ld1) r0
            voc r2 = r0.a
            java.lang.String r0 = r0.j
            java.lang.String r3 = "Unexpected error during media processing"
            r2.reportException(r0, r3, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00ec:
            r1 = r17
            g8 r1 = (defpackage.g8) r1
            java.lang.Object r0 = r0.receiver
            h8 r0 = (defpackage.h8) r0
            r0.getClass()
            java.lang.String r4 = r1.b
            ru.ok.android.externcalls.analytics.events.EventItemValue r4 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r4)
            aqg r1 = r1.a
            java.lang.Object r1 = r1.c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0107
            java.lang.String r1 = "NULL"
        L_0x0107:
            ru.ok.android.externcalls.analytics.events.EventItemValue r1 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r1)
            ru.ok.android.externcalls.analytics.events.EventItemValue r2 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((long) r2)
            ru.ok.android.externcalls.analytics.events.EventItemsMap r3 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            java.lang.String r5 = "codec_implementation"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r5, r4)
            java.lang.String r5 = "string_value"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r5, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r4, r1}
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            r3.<init>(r1)
            c51 r0 = r0.a
            d51 r0 = (defpackage.d51) r0
            java.lang.String r1 = "codec_usage"
            r0.c(r1, r2, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0134:
            r1 = r17
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            x23 r0 = (defpackage.x23) r0
            a33 r0 = (defpackage.a33) r0
            java.lang.String r2 = "app.toggle.webapp_fullscreen"
            r0.i(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x014a:
            r1 = r17
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            java.lang.Object r0 = r0.receiver
            a6f r0 = (defpackage.a6f) r0
            kotlin.jvm.functions.Function0 r2 = r0.a
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0162
            goto L_0x0367
        L_0x0162:
            int r2 = r1.getPointerCount()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = r0.l
            int r9 = r0.k
            android.view.View r10 = r0.b
            if (r2 <= r8) goto L_0x0192
            boolean r2 = r0.f
            if (r2 == 0) goto L_0x0192
            r0.f = r7
            r0.g = r3
            r0.h = r3
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x0187
            float r1 = r10.getTranslationX()
            float r2 = (float) r9
        L_0x0185:
            float r1 = r1 / r2
            goto L_0x018d
        L_0x0187:
            float r1 = r10.getTranslationY()
            float r2 = (float) r4
            goto L_0x0185
        L_0x018d:
            r0.b(r1)
            goto L_0x0367
        L_0x0192:
            r3d r2 = r0.o
            java.lang.Object r11 = r2.getValue()
            android.view.VelocityTracker r11 = (android.view.VelocityTracker) r11
            r11.addMovement(r1)
            int r11 = r1.getAction()
            r12 = 0
            if (r11 == r8) goto L_0x0295
            int r11 = r1.getAction()
            if (r11 != r5) goto L_0x01ac
            goto L_0x0295
        L_0x01ac:
            boolean r2 = r0.f
            if (r2 == 0) goto L_0x0208
            if (r2 != 0) goto L_0x01b4
            goto L_0x0365
        L_0x01b4:
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x01bd
            float r2 = r0.g
            goto L_0x01bf
        L_0x01bd:
            float r2 = r0.h
        L_0x01bf:
            int r3 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0365
            boolean r3 = r0.a()
            if (r3 == 0) goto L_0x01cf
            float r3 = r1.getRawX()
        L_0x01cd:
            float r2 = r2 - r3
            goto L_0x01d4
        L_0x01cf:
            float r3 = r1.getRawY()
            goto L_0x01cd
        L_0x01d4:
            boolean r3 = r0.a()
            if (r3 == 0) goto L_0x01e6
            float r3 = r10.getTranslationX()
            float r3 = r3 - r2
            float r2 = kotlin.ranges.RangesKt.coerceAtLeast((float) r3, (float) r12)
            float r3 = (float) r9
            float r2 = r2 / r3
            goto L_0x01ee
        L_0x01e6:
            float r3 = r10.getTranslationY()
            float r3 = r3 - r2
            float r2 = (float) r4
            float r2 = r3 / r2
        L_0x01ee:
            r0.c(r2)
            u5f r2 = r0.q
            if (r2 == 0) goto L_0x01fa
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r2 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r2
            r2.e0()
        L_0x01fa:
            float r2 = r1.getRawX()
            r0.g = r2
            float r1 = r1.getRawY()
            r0.h = r1
            goto L_0x0365
        L_0x0208:
            float r2 = r0.g
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x027b
            float r2 = r0.h
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x027b
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x0226
            float r2 = r0.i
            float r3 = r1.getRawX()
        L_0x0220:
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            goto L_0x022d
        L_0x0226:
            float r2 = r0.j
            float r3 = r1.getRawY()
            goto L_0x0220
        L_0x022d:
            boolean r3 = r0.a()
            if (r3 == 0) goto L_0x023f
            float r3 = r0.j
            float r4 = r1.getRawY()
        L_0x0239:
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            goto L_0x0246
        L_0x023f:
            float r3 = r0.i
            float r4 = r1.getRawX()
            goto L_0x0239
        L_0x0246:
            kotlin.Lazy r4 = r0.p
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0287
            float r4 = (float) r6
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0287
            r0.f = r8
            android.view.ViewParent r2 = r10.getParent()
            r2.requestDisallowInterceptTouchEvent(r8)
            d7 r2 = r0.n
            android.view.ViewGroup r3 = r0.c
            int r4 = r3.indexOfChild(r10)
            r3.addView(r2, r4)
            u5f r2 = r0.q
            if (r2 == 0) goto L_0x0287
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r2 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r2
            r2.f0()
            goto L_0x0287
        L_0x027b:
            float r2 = r1.getRawX()
            r0.i = r2
            float r2 = r1.getRawY()
            r0.j = r2
        L_0x0287:
            float r2 = r1.getRawX()
            r0.g = r2
            float r1 = r1.getRawY()
            r0.h = r1
            goto L_0x0365
        L_0x0295:
            boolean r5 = r0.f
            if (r5 != 0) goto L_0x029b
            goto L_0x0365
        L_0x029b:
            java.lang.Object r5 = r2.getValue()
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            r5.computeCurrentVelocity(r8)
            boolean r5 = r0.a()
            if (r5 == 0) goto L_0x02bd
            java.lang.Object r5 = r2.getValue()
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            int r11 = r1.getActionIndex()
            int r1 = r1.getPointerId(r11)
            float r1 = r5.getXVelocity(r1)
            goto L_0x02cf
        L_0x02bd:
            java.lang.Object r5 = r2.getValue()
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            int r11 = r1.getActionIndex()
            int r1 = r1.getPointerId(r11)
            float r1 = r5.getYVelocity(r1)
        L_0x02cf:
            java.lang.Object r5 = r2.getValue()
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            r5.recycle()
            v9a r5 = defpackage.v9a.x
            r2.b = r5
            float r1 = java.lang.Math.abs(r1)
            boolean r2 = r0.a()
            if (r2 == 0) goto L_0x02eb
            float r2 = r10.getTranslationX()
            goto L_0x02ef
        L_0x02eb:
            float r2 = r10.getTranslationY()
        L_0x02ef:
            boolean r5 = r0.a()
            if (r5 == 0) goto L_0x02fc
            float r5 = r10.getTranslationX()
            float r10 = (float) r9
        L_0x02fa:
            float r5 = r5 / r10
            goto L_0x0302
        L_0x02fc:
            float r5 = r10.getTranslationY()
            float r10 = (float) r4
            goto L_0x02fa
        L_0x0302:
            r10 = 1069547520(0x3fc00000, float:1.5)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x032b
            boolean r1 = r0.a()
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            if (r1 == 0) goto L_0x031c
            float r1 = (float) r9
            float r2 = r2 / r1
            float r1 = java.lang.Math.abs(r2)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0327
            goto L_0x032b
        L_0x031c:
            float r1 = (float) r4
            float r2 = r2 / r1
            float r1 = java.lang.Math.abs(r2)
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0327
            goto L_0x032b
        L_0x0327:
            r0.b(r5)
            goto L_0x035f
        L_0x032b:
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 >= 0) goto L_0x0333
            r1 = r3
            goto L_0x0334
        L_0x0333:
            r1 = r2
        L_0x0334:
            float[] r4 = new float[r6]
            r4[r7] = r5
            r4[r8] = r1
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r4)
            float r4 = java.lang.Math.abs(r5)
            float r2 = r2 - r4
            r9 = 200(0xc8, double:9.9E-322)
            float r4 = (float) r9
            float r2 = r2 * r4
            long r9 = (long) r2
            android.animation.ValueAnimator r1 = r1.setDuration(r9)
            x5f r2 = new x5f
            r2.<init>(r0, r8)
            r1.addUpdateListener(r2)
            z5f r2 = new z5f
            r2.<init>(r0, r5, r8)
            r1.addListener(r2)
            r1.start()
        L_0x035f:
            r0.f = r7
            r0.g = r3
            r0.h = r3
        L_0x0365:
            boolean r7 = r0.f
        L_0x0367:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x036c:
            r1 = r17
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.receiver
            one.me.stickerssettings.stickersscreen.StickersScreen r0 = (one.me.stickerssettings.stickersscreen.StickersScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickerssettings.stickersscreen.StickersScreen.Y
            gwe r2 = r0.e0()
            etc r2 = r2.y0
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            sve r2 = (defpackage.sve) r2
            if (r2 == 0) goto L_0x0388
            java.util.List r9 = r2.d
        L_0x0388:
            java.util.Collection r9 = (java.util.Collection) r9
            if (r9 == 0) goto L_0x03ac
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L_0x0393
            goto L_0x03ac
        L_0x0393:
            ix3 r2 = defpackage.ix3.a
            lw3 r2 = defpackage.m58.b(r2)
            lw3 r2 = r2.h(r9)
            lw3 r1 = r2.o(r1)
            lw3 r1 = r1.d()
            mw3 r1 = r1.build()
            r1.o(r0)
        L_0x03ac:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03af:
            r1 = r17
            vdf r1 = (defpackage.vdf) r1
            java.lang.Object r0 = r0.receiver
            q7d r0 = (defpackage.q7d) r0
            tdf r0 = r0.f(r1)
            return r0
        L_0x03bc:
            r1 = r17
            cuc r1 = (defpackage.cuc) r1
            java.lang.Object r0 = r0.receiver
            gu2 r0 = (defpackage.gu2) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.chats.search.ChatsListSearchScreen.F0
            one.me.chats.search.ChatsListSearchScreen r0 = r0.a
            defpackage.kr7.z(r0)
            ov2 r0 = r0.d0()
            r0.getClass()
            boolean r2 = r1.x
            if (r2 == 0) goto L_0x03eb
            ox2 r1 = defpackage.ox2.b
            r1.getClass()
            pa4 r1 = new pa4
            java.lang.String r2 = ":saved-messages"
            r1.<init>(r2)
            s85 r0 = r0.F0
            defpackage.xag.h(r0, r1)
            goto L_0x03f0
        L_0x03eb:
            long r1 = r1.a
            r0.m(r1)
        L_0x03f0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03f3:
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            a4c r0 = (defpackage.a4c) r0
            one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen r0 = (one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen) r0
            q4c r0 = r0.c0()
            qn7 r3 = r0.z0
            boolean r3 = r3.isActive()
            if (r3 == 0) goto L_0x040e
            goto L_0x0419
        L_0x040e:
            h4c r3 = new h4c
            r3.<init>(r1, r0, r9)
            aje r1 = defpackage.xag.g(r0, r9, r9, r3, r5)
            r0.z0 = r1
        L_0x0419:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x041c:
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            zxb r0 = (defpackage.zxb) r0
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            syb r0 = r0.e0()
            r0.n(r1, r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0434:
            r1 = r17
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            x23 r0 = (defpackage.x23) r0
            a33 r0 = (defpackage.a33) r0
            java.lang.String r2 = "app.toggle.new_toolbar"
            r0.i(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x044a:
            r1 = r17
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            x23 r0 = (defpackage.x23) r0
            a33 r0 = (defpackage.a33) r0
            java.lang.String r2 = "app.debug.profile.info.enabled"
            r0.i(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0460:
            r1 = r17
            q7a r1 = (defpackage.q7a) r1
            java.lang.Object r0 = r0.receiver
            x8a r0 = (defpackage.x8a) r0
            r0.getClass()
            if (r1 == 0) goto L_0x0480
            int r1 = r1.c
            int r2 = r0.x
            if (r1 != r2) goto L_0x0474
            goto L_0x0480
        L_0x0474:
            r0.x = r1
            n6e r0 = r0.Z
            r7a r2 = new r7a
            r2.<init>(r1, r9)
            r0.d(r2)
        L_0x0480:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0483:
            r1 = r17
            q7a r1 = (defpackage.q7a) r1
            java.lang.Object r0 = r0.receiver
            g8a r0 = (defpackage.g8a) r0
            x8a r0 = r0.a
            r0.getClass()
            if (r1 == 0) goto L_0x0497
            q7a r1 = defpackage.q7a.w(r1, r8)
            goto L_0x0498
        L_0x0497:
            r1 = r9
        L_0x0498:
            if (r1 == 0) goto L_0x04a5
            dqd r9 = new dqd
            int r2 = r1.c
            java.lang.String r3 = r1.b
            long r4 = r1.a
            r9.<init>(r2, r3, r4)
        L_0x04a5:
            frd r0 = r0.o
            r0.a(r9)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04ad:
            r1 = r17
            ui9 r1 = (defpackage.ui9) r1
            java.lang.Object r0 = r0.receiver
            en9 r0 = (defpackage.en9) r0
            jx3 r2 = r0.a
            f14 r3 = defpackage.f14.b
            nl9 r4 = new nl9
            r4.<init>(r0, r1, r9)
            q04 r1 = r0.A0
            aje r1 = defpackage.ev0.u(r2, r1, r3, r4)
            kotlin.reflect.KProperty[] r2 = defpackage.en9.A1
            r2 = r2[r5]
            wie r3 = r0.g1
            r3.setValue(r0, r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04d0:
            r1 = r17
            c89 r1 = (defpackage.c89) r1
            java.lang.Object r0 = r0.receiver
            e89 r0 = (defpackage.e89) r0
            r0.getClass()
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L_0x0675;
                case 1: goto L_0x0658;
                case 2: goto L_0x063b;
                case 3: goto L_0x061e;
                case 4: goto L_0x0600;
                case 5: goto L_0x05dd;
                case 6: goto L_0x05ba;
                case 7: goto L_0x059c;
                case 8: goto L_0x057e;
                case 9: goto L_0x0560;
                case 10: goto L_0x0542;
                case 11: goto L_0x0524;
                case 12: goto L_0x0506;
                case 13: goto L_0x04e8;
                default: goto L_0x04e2;
            }
        L_0x04e2:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04e8:
            ow3 r0 = new ow3
            int r2 = defpackage.chc.messages_list_context_action_share_externally
            int r1 = defpackage.qlc.chat_screen_action_share_externally
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.lya.A
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.ngf) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0691
        L_0x0506:
            ow3 r0 = new ow3
            int r8 = defpackage.cwa.r
            int r1 = defpackage.ewa.f
            igf r9 = new igf
            r9.<init>(r1)
            int r1 = defpackage.cad.v
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.ngf) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0691
        L_0x0524:
            ow3 r0 = new ow3
            int r2 = defpackage.cwa.A
            int r1 = defpackage.ewa.q
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.cad.E
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.ngf) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0691
        L_0x0542:
            ow3 r0 = new ow3
            int r8 = defpackage.cwa.u
            int r1 = defpackage.ewa.k
            igf r9 = new igf
            r9.<init>(r1)
            int r1 = defpackage.cad.G
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.ngf) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0691
        L_0x0560:
            ow3 r0 = new ow3
            int r2 = defpackage.cwa.B
            int r1 = defpackage.ewa.r
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.cad.m
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.ngf) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0691
        L_0x057e:
            ow3 r0 = new ow3
            int r8 = defpackage.cwa.C
            int r1 = defpackage.ewa.s
            igf r9 = new igf
            r9.<init>(r1)
            int r1 = defpackage.cad.C1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.ngf) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0691
        L_0x059c:
            ow3 r0 = new ow3
            int r2 = defpackage.cwa.x
            int r1 = defpackage.ewa.n
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.cad.E1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.ngf) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0691
        L_0x05ba:
            ow3 r0 = new ow3
            int r8 = defpackage.cwa.t
            int r1 = defpackage.ewa.j
            igf r9 = new igf
            r9.<init>(r1)
            int r1 = defpackage.jya.I
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.cad.y
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.E
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r7 = r0
            r7.<init>((int) r8, (defpackage.ngf) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.Integer) r12)
            goto L_0x0691
        L_0x05dd:
            ow3 r0 = new ow3
            int r2 = defpackage.cwa.s
            int r1 = defpackage.ewa.i
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.jya.I
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.cad.y
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.E
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r1 = r0
            r1.<init>((int) r2, (defpackage.ngf) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6)
            goto L_0x0691
        L_0x0600:
            ow3 r0 = new ow3
            int r8 = defpackage.cwa.y
            int r1 = defpackage.ewa.o
            igf r9 = new igf
            r9.<init>(r1)
            int r1 = defpackage.cad.R1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.ngf) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0691
        L_0x061e:
            ow3 r0 = new ow3
            int r2 = defpackage.cwa.w
            int r1 = defpackage.ewa.m
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.cad.o1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.ngf) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0691
        L_0x063b:
            ow3 r0 = new ow3
            int r8 = defpackage.cwa.z
            int r1 = defpackage.ewa.p
            igf r9 = new igf
            r9.<init>(r1)
            int r1 = defpackage.cad.S1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.ngf) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
            goto L_0x0691
        L_0x0658:
            ow3 r0 = new ow3
            int r2 = defpackage.cwa.q
            int r1 = defpackage.ewa.e
            igf r3 = new igf
            r3.<init>(r1)
            int r1 = defpackage.cad.v
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r6 = 4
            r1 = r0
            r1.<init>((int) r2, (defpackage.ngf) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (int) r6)
            goto L_0x0691
        L_0x0675:
            ow3 r0 = new ow3
            int r8 = defpackage.cwa.v
            int r1 = defpackage.ewa.l
            igf r9 = new igf
            r9.<init>(r1)
            int r1 = defpackage.cad.Z1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            int r1 = defpackage.jya.G
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r12 = 4
            r7 = r0
            r7.<init>((int) r8, (defpackage.ngf) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (int) r12)
        L_0x0691:
            return r0
        L_0x0692:
            r1 = r17
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            java.lang.Object r0 = r0.receiver
            one.me.sdk.messagewrite.MessageWriteWidget r0 = (one.me.sdk.messagewrite.MessageWriteWidget) r0
            kotlin.reflect.KProperty[] r2 = one.me.sdk.messagewrite.MessageWriteWidget.C0
            android.view.View r2 = r0.getView()
            if (r2 != 0) goto L_0x06a3
            goto L_0x06df
        L_0x06a3:
            dc9 r2 = r0.d0()
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L_0x06b3
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L_0x06df
        L_0x06b3:
            dc9 r2 = r0.d0()
            zb9 r2 = r2.getSendActionState()
            boolean r2 = r2 instanceof defpackage.vb9
            if (r2 == 0) goto L_0x06df
            dc9 r2 = r0.d0()
            tb9 r2 = r2.getEmojiExpandableState()
            tb9 r3 = defpackage.tb9.a
            if (r2 == r3) goto L_0x06cc
            goto L_0x06df
        L_0x06cc:
            mh9 r0 = r0.h0()
            r0.getClass()
            wg9 r2 = new wg9
            qvc r3 = defpackage.qvc.b
            r2.<init>(r3, r1)
            s85 r0 = r0.I0
            defpackage.xag.h(r0, r2)
        L_0x06df:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x06e2:
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            x59 r0 = (defpackage.x59) r0
            java.lang.String r3 = r0.H0
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x06f5
            goto L_0x0706
        L_0x06f5:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0706
            w78 r5 = defpackage.w78.o
            java.lang.String r6 = "process click on member: "
            java.lang.String r6 = defpackage.wj6.i(r1, r6)
            r4.d(r5, r3, r6, r9)
        L_0x0706:
            s85 r0 = r0.F0
            fk9 r3 = defpackage.fk9.b
            r3.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ":profile?id="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "&type=contact"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            defpackage.a81.r(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0726:
            r1 = r17
            gc9 r1 = (defpackage.gc9) r1
            java.lang.Object r0 = r0.receiver
            t89 r0 = (defpackage.t89) r0
            pn9 r0 = (defpackage.pn9) r0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.ec9
            one.me.messages.list.ui.MessagesListWidget r0 = r0.a
            if (r2 == 0) goto L_0x075a
            kotlin.reflect.KProperty[] r2 = one.me.messages.list.ui.MessagesListWidget.R0
            en9 r11 = r0.k0()
            ec9 r1 = (defpackage.ec9) r1
            long r12 = r1.a
            jx3 r0 = r11.a
            gaf r2 = r11.w
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            kl9 r3 = new kl9
            r15 = 0
            java.lang.String r14 = r1.b
            r10 = r3
            r10.<init>(r11, r12, r14, r15)
            defpackage.ev0.v(r0, r2, r9, r3, r6)
            goto L_0x076b
        L_0x075a:
            boolean r2 = r1 instanceof defpackage.fc9
            if (r2 == 0) goto L_0x076e
            kotlin.reflect.KProperty[] r2 = one.me.messages.list.ui.MessagesListWidget.R0
            en9 r0 = r0.k0()
            fc9 r1 = (defpackage.fc9) r1
            long r1 = r1.a
            r0.z(r1)
        L_0x076b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x076e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0774:
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.receiver
            v29 r0 = (defpackage.v29) r0
            one.me.members.list.MembersListWidget r0 = (one.me.members.list.MembersListWidget) r0
            i49 r0 = r0.e0()
            r0.getClass()
            d49 r2 = new d49
            r2.<init>(r1)
            s85 r0 = r0.v
            defpackage.xag.h(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0796:
            r1 = r17
            x19 r1 = (defpackage.x19) r1
            java.lang.Object r0 = r0.receiver
            r19 r0 = (defpackage.r19) r0
            r0.getClass()
            u19 r4 = defpackage.u19.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            if (r4 != 0) goto L_0x0820
            w19 r4 = defpackage.w19.a
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)
            s85 r5 = r0.w
            if (r4 == 0) goto L_0x07e6
            kotlin.Lazy r1 = r0.x
            java.lang.Object r1 = r1.getValue()
            bud r1 = (defpackage.bud) r1
            akd r1 = (defpackage.akd) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f81moneytransferbotid
            long r1 = r1.r(r4, r2)
            wn2 r3 = defpackage.wn2.b
            r3.getClass()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ":webapp:root?bot_id="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "&entry_point=money_button&chat_id="
            r3.append(r1)
            long r0 = r0.c
            java.lang.String r2 = "&request_code=1010"
            java.lang.String r0 = defpackage.wj6.m(r3, r0, r2)
            defpackage.a81.r(r0, r5)
            goto L_0x0820
        L_0x07e6:
            v19 r0 = defpackage.v19.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x07f4
            i19 r0 = defpackage.i19.b
            defpackage.xag.h(r5, r0)
            goto L_0x0820
        L_0x07f4:
            s19 r0 = defpackage.s19.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x080c
            wn2 r0 = defpackage.wn2.b
            r0.getClass()
            pa4 r0 = new pa4
            java.lang.String r1 = ":contacts-picker?request_code=372"
            r0.<init>(r1)
            defpackage.xag.h(r5, r0)
            goto L_0x0820
        L_0x080c:
            t19 r0 = defpackage.t19.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x081a
            j19 r0 = defpackage.j19.b
            defpackage.xag.h(r5, r0)
            goto L_0x0820
        L_0x081a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0820:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0823:
            r2 = r17
            lz7 r2 = (defpackage.lz7) r2
            java.lang.Object r0 = r0.receiver
            hwe r0 = (defpackage.hwe) r0
            r0.getClass()
            if (r2 == 0) goto L_0x08b7
            boolean r3 = r2 instanceof defpackage.gpe
            if (r3 != 0) goto L_0x0838
            boolean r4 = r2 instanceof defpackage.mqe
            if (r4 == 0) goto L_0x08b7
        L_0x0838:
            xme r4 = r0.Z
            if (r3 == 0) goto L_0x084f
            r5 = r2
            gpe r5 = (defpackage.gpe) r5
            java.lang.Object r6 = r4.getValue()
            qve r6 = (defpackage.qve) r6
            long r10 = r6.a
            long r5 = r5.b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x084f
            goto L_0x08b7
        L_0x084f:
            boolean r5 = r2 instanceof defpackage.mqe
            if (r5 == 0) goto L_0x086b
            r6 = r2
            mqe r6 = (defpackage.mqe) r6
            lqe r10 = defpackage.lqe.v
            lqe r11 = r6.w
            if (r11 != r10) goto L_0x08b7
            java.lang.Object r10 = r4.getValue()
            qve r10 = (defpackage.qve) r10
            long r10 = r10.a
            long r12 = r6.a
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x086b
            goto L_0x08b7
        L_0x086b:
            if (r5 == 0) goto L_0x0872
            mqe r2 = (defpackage.mqe) r2
            long r2 = r2.a
            goto L_0x087c
        L_0x0872:
            if (r3 == 0) goto L_0x0877
            gpe r2 = (defpackage.gpe) r2
            goto L_0x0878
        L_0x0877:
            r2 = r9
        L_0x0878:
            if (r2 == 0) goto L_0x08b7
            long r2 = r2.b
        L_0x087c:
            etc r5 = r0.X
            ome r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            rve r5 = (defpackage.rve) r5
            java.util.List r5 = r5.a
            java.util.Iterator r5 = r5.iterator()
        L_0x088c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x08a4
            java.lang.Object r6 = r5.next()
            wx1 r6 = (defpackage.wx1) r6
            mqe r6 = r6.b
            long r10 = r6.a
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x08a2
            r12 = r7
            goto L_0x08a5
        L_0x08a2:
            int r7 = r7 + r8
            goto L_0x088c
        L_0x08a4:
            r12 = r1
        L_0x08a5:
            qve r1 = new qve
            r11 = 0
            r13 = 2
            r10 = r1
            r14 = r2
            r10.<init>(r11, r12, r13, r14)
            r4.getClass()
            r4.m(r9, r1)
            r0.m(r2, r9)
        L_0x08b7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x08ba:
            r2 = r17
            lz7 r2 = (defpackage.lz7) r2
            java.lang.Object r0 = r0.receiver
            i45 r0 = (defpackage.i45) r0
            r0.getClass()
            if (r2 == 0) goto L_0x090c
            boolean r3 = r2 instanceof defpackage.n25
            if (r3 == 0) goto L_0x090c
            n25 r2 = (defpackage.n25) r2
            xme r3 = r0.w
            java.lang.Object r4 = r3.getValue()
            g45 r4 = (defpackage.g45) r4
            int r4 = r4.a
            int r2 = r2.a
            if (r2 != r4) goto L_0x08dc
            goto L_0x090c
        L_0x08dc:
            etc r4 = r0.X
            ome r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            f45 r4 = (defpackage.f45) r4
            java.util.List r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
            r5 = r7
        L_0x08ed:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0901
            java.lang.Object r10 = r4.next()
            vx1 r10 = (defpackage.vx1) r10
            int r10 = r10.a
            if (r10 != r2) goto L_0x08ff
            r1 = r5
            goto L_0x0901
        L_0x08ff:
            int r5 = r5 + r8
            goto L_0x08ed
        L_0x0901:
            g45 r4 = new g45
            r4.<init>(r2, r7, r1, r6)
            r3.m(r9, r4)
            r0.k(r2, r9)
        L_0x090c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq7.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(int i, Object obj) {
        super(1, obj, v29.class, "onMemberListActionClick", "onMemberListActionClick(I)V", 0);
        this.a = i;
        switch (i) {
            case 4:
                super(1, obj, t89.class, "onForwardClick", "onForwardClick(Lone/me/messages/list/loader/MessageLink$ForwardModel;)V", 0);
                return;
            case 6:
                super(1, obj, MessageWriteWidget.class, "onTouch", "onTouch(Landroid/view/MotionEvent;)V", 0);
                return;
            case 9:
                super(1, obj, g8a.class, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0);
                return;
            case 13:
                super(1, obj, zxb.class, "onDisabledClick", "onDisabledClick(J)V", 0);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                super(1, obj, a4c.class, "onDisabledClick", "onDisabledClick(J)V", 0);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                super(1, obj, gu2.class, "onRecentContactClick", "onRecentContactClick(Lone/me/chats/search/models/RecentContactModel;)V", 0);
                return;
            case 16:
                super(1, obj, q7d.class, "taskDbFromEntity", "taskDbFromEntity(Lone/me/sdk/tasks/db/TaskEntity;)Lone/me/sdk/tasks/db/TaskDb;", 0);
                return;
            case LangUtils.HASH_SEED /*17*/:
                super(1, obj, StickersScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0);
                return;
            case 20:
                super(1, obj, h8.class, "onAudioCodec", "onAudioCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;)V", 0);
                return;
            case 21:
                super(1, obj, ld1.class, "processError", "processError(Ljava/lang/Throwable;)V", 0);
                return;
            case 22:
                super(1, obj, b8g.class, "logBufferTransform", "logBufferTransform(Ljava/lang/String;)V", 0);
                return;
            case 23:
                super(1, obj, yj1.class, "onAllParticipantsLoadError", "onAllParticipantsLoadError(Ljava/lang/Throwable;)V", 0);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                super(1, obj, yj1.class, "onAllRoomsLoaded", "onAllRoomsLoaded(Lru/ok/android/webrtc/signaling/sessionroom/event/SignalingSessionRooms;)V", 0);
                return;
            case 25:
                super(1, obj, yj1.class, "onAllRoomsLoadError", "onAllRoomsLoadError(Ljava/lang/Throwable;)V", 0);
                return;
            case 26:
                super(1, obj, nd1.class, "onReleaseContext", "onReleaseContext(Lru/ok/android/webrtc/opengl/CallOpenGLContext;)V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(x23 x23, int i) {
        super(1, x23, x23.class, "setDebugProfileInfoEnabled", "setDebugProfileInfoEnabled(Z)V", 0);
        this.a = i;
        switch (i) {
            case 12:
                super(1, x23, x23.class, "setNewToolbarEnable", "setNewToolbarEnable(Z)V", 0);
                return;
            case 19:
                super(1, x23, x23.class, "setWebAppFullscreen", "setWebAppFullscreen(Z)V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(i45 i45) {
        super(1, i45, i45.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0);
        this.a = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(r19 r19) {
        super(1, r19, r19.class, "onButtonClicked", "onButtonClicked(Lone/me/chatscreen/mediabar/mediatypepicker/MediaTypePickerViewState$Button;)V", 0);
        this.a = 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(x59 x59) {
        super(1, x59, x59.class, "onMemberClicked", "onMemberClicked$message_list_release(J)V", 0);
        this.a = 5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(en9 en9) {
        super(1, en9, en9.class, "onAttachClickAction", "onAttachClickAction(Lone/me/messages/list/ui/view/MessagesAttachAction;)V", 0);
        this.a = 8;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(x8a x8a) {
        super(1, x8a, x8a.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0);
        this.a = 10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(hwe hwe) {
        super(1, hwe, hwe.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0);
        this.a = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq7(a6f a6f) {
        super(1, a6f, a6f.class, "onTouchEvent", "onTouchEvent(Landroid/view/MotionEvent;)Z", 0);
        this.a = 18;
    }
}

package defpackage;

import java.util.List;

/* renamed from: kh1  reason: default package */
public final /* synthetic */ class kh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ kh1(l66 l66, int i, int i2, List list) {
        this.a = 9;
        this.c = l66;
        this.b = i2;
        this.o = list;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [v8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = 1
            int r4 = r7.b
            java.lang.Object r5 = r7.o
            java.lang.Object r6 = r7.c
            int r7 = r7.a
            switch(r7) {
                case 0: goto L_0x01f7;
                case 1: goto L_0x01ef;
                case 2: goto L_0x01e7;
                case 3: goto L_0x01ab;
                case 4: goto L_0x0192;
                case 5: goto L_0x0162;
                case 6: goto L_0x0156;
                case 7: goto L_0x0144;
                case 8: goto L_0x0132;
                case 9: goto L_0x0112;
                case 10: goto L_0x0109;
                case 11: goto L_0x00e4;
                case 12: goto L_0x00bb;
                case 13: goto L_0x007a;
                case 14: goto L_0x005e;
                case 15: goto L_0x0034;
                default: goto L_0x000f;
            }
        L_0x000f:
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r5 = (java.lang.String) r5
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r5, r4)     // Catch:{ Exception -> 0x001b }
            r7.show()     // Catch:{ Exception -> 0x001b }
            goto L_0x0033
        L_0x001b:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onError failed: "
            r0.<init>(r1)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "hi7"
            defpackage.z68.c(r0, r7, new java.lang.Object[0])
        L_0x0033:
            return
        L_0x0034:
            byte[] r5 = (byte[]) r5
            n09 r6 = (defpackage.n09) r6
            java.lang.Object r7 = r6.a
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0040:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r7.next()
            u9d r0 = (defpackage.u9d) r0
            r0.a(r4, r5)     // Catch:{ all -> 0x0050 }
            goto L_0x0040
        L_0x0050:
            r0 = move-exception
            java.lang.Object r1 = r6.c
            voc r1 = (defpackage.voc) r1
            java.lang.String r2 = "RtcNotificationReceiver"
            java.lang.String r3 = "rtc.notification.handle.datareceived"
            r1.reportException(r2, r3, r0)
            goto L_0x0040
        L_0x005d:
            return
        L_0x005e:
            wsb r6 = (defpackage.wsb) r6
            java.lang.Object r7 = r6.b
            j09 r7 = (defpackage.j09) r7
            java.lang.Object r7 = r7.j
            wb4 r7 = (defpackage.wb4) r7
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r0 = r5.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r1 = r5.second
            nz8 r1 = (defpackage.nz8) r1
            r7.y(r0, r1, r4)
            return
        L_0x007a:
            zz7 r5 = (defpackage.zz7) r5
            np8 r6 = (defpackage.np8) r6
            r6.getClass()
            java.lang.Object r7 = r5.get()     // Catch:{ CancellationException -> 0x008f, InterruptedException | ExecutionException -> 0x008d }
            swd r7 = (defpackage.swd) r7     // Catch:{ CancellationException -> 0x008f, InterruptedException | ExecutionException -> 0x008d }
            java.lang.String r0 = "SessionResult must not be null"
            defpackage.n79.k(r7, r0)     // Catch:{ CancellationException -> 0x008f, InterruptedException | ExecutionException -> 0x008d }
            goto L_0x00a6
        L_0x008d:
            r7 = move-exception
            goto L_0x0091
        L_0x008f:
            r7 = move-exception
            goto L_0x009c
        L_0x0091:
            java.lang.String r0 = "Session operation failed"
            defpackage.i8b.W(r0, r7)
            swd r7 = new swd
            r7.<init>(r2)
            goto L_0x00a6
        L_0x009c:
            java.lang.String r0 = "Session operation cancelled"
            defpackage.i8b.W(r0, r7)
            swd r7 = new swd
            r7.<init>(r3)
        L_0x00a6:
            i67 r0 = r6.w
            if (r0 != 0) goto L_0x00ab
            goto L_0x00ba
        L_0x00ab:
            wp8 r1 = r6.c     // Catch:{ RemoteException -> 0x00b5 }
            android.os.Bundle r7 = r7.b()     // Catch:{ RemoteException -> 0x00b5 }
            r0.c(r1, r4, r7)     // Catch:{ RemoteException -> 0x00b5 }
            goto L_0x00ba
        L_0x00b5:
            java.lang.String r7 = "Error in sending"
            defpackage.i8b.V(r7)
        L_0x00ba:
            return
        L_0x00bb:
            java.util.concurrent.CopyOnWriteArraySet r6 = (java.util.concurrent.CopyOnWriteArraySet) r6
            java.util.Iterator r7 = r6.iterator()
        L_0x00c1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r7.next()
            m08 r0 = (defpackage.m08) r0
            boolean r1 = r0.d
            if (r1 != 0) goto L_0x00c1
            if (r4 == r2) goto L_0x00d8
            vq5 r1 = r0.b
            r1.a(r4)
        L_0x00d8:
            r0.c = r3
            java.lang.Object r0 = r0.a
            r1 = r5
            i08 r1 = (defpackage.i08) r1
            r1.invoke(r0)
            goto L_0x00c1
        L_0x00e3:
            return
        L_0x00e4:
            java.util.concurrent.CopyOnWriteArraySet r6 = (java.util.concurrent.CopyOnWriteArraySet) r6
            java.util.Iterator r7 = r6.iterator()
        L_0x00ea:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r7.next()
            l08 r0 = (defpackage.l08) r0
            if (r4 == r2) goto L_0x00fd
            vq5 r1 = r0.b
            r1.a(r4)
        L_0x00fd:
            r0.c = r3
            java.lang.Object r0 = r0.a
            r1 = r5
            h08 r1 = (defpackage.h08) r1
            r1.invoke(r0)
            goto L_0x00ea
        L_0x0108:
            return
        L_0x0109:
            int r4 = r4 + r3
            xd6 r6 = (defpackage.xd6) r6
            org.webrtc.Size r5 = (org.webrtc.Size) r5
            r6.b(r5, r4)
            return
        L_0x0112:
            l66 r6 = (defpackage.l66) r6
            e4 r7 = r6.x
            java.lang.Object r7 = r7.b
            one.me.folders.list.FoldersListScreen r7 = (one.me.folders.list.FoldersListScreen) r7
            w66 r7 = r7.c0()
            r7.getClass()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r5.get(r4)
            g0g r0 = (defpackage.g0g) r0
            zx5 r0 = r0.a
            if (r0 == 0) goto L_0x012f
            java.lang.String r1 = r0.a
        L_0x012f:
            r7.y = r1
            return
        L_0x0132:
            fw4 r6 = (defpackage.fw4) r6
            r6.getClass()
            hw4 r5 = (defpackage.hw4) r5
            r5.getClass()
            int r7 = r6.a
            mz8 r0 = r6.b
            r5.w(r7, r0, r4)
            return
        L_0x0144:
            gw4 r6 = (defpackage.gw4) r6
            r6.getClass()
            iw4 r5 = (defpackage.iw4) r5
            r5.getClass()
            int r7 = r6.a
            nz8 r0 = r6.b
            r5.y(r7, r0, r4)
            return
        L_0x0156:
            cy3 r6 = (defpackage.cy3) r6
            java.lang.Object r7 = r6.c
            y1c r7 = (defpackage.y1c) r7
            java.io.Serializable r5 = (java.io.Serializable) r5
            r7.a(r4, r5)
            return
        L_0x0162:
            fa4 r6 = (defpackage.fa4) r6
            java.util.concurrent.atomic.AtomicInteger r7 = r6.X
            r7.decrementAndGet()
            org.webrtc.EncodedImage r5 = (org.webrtc.EncodedImage) r5
            java.nio.ByteBuffer r7 = r5.buffer
            java.util.concurrent.atomic.AtomicInteger r0 = r6.Z
            int r0 = r0.get()
            if (r4 <= r0) goto L_0x017a
            org.webrtc.VpxDecoderWrapper r0 = r6.a
            r0.decode(r7)
        L_0x017a:
            bug r0 = r6.x0
            java.util.concurrent.atomic.AtomicInteger r1 = r0.y
            r1.decrementAndGet()
            r7.rewind()
            java.util.concurrent.atomic.AtomicInteger r0 = r0.z
            int r1 = r7.capacity()
            int r1 = -r1
            r0.addAndGet(r1)
            org.webrtc.JniCommon.nativeFreeByteBuffer(r7)
            return
        L_0x0192:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r1 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
            android.content.Intent r7 = r7.setAction(r1)
            java.lang.String r1 = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"
            android.content.IntentSender$SendIntentException r5 = (android.content.IntentSender.SendIntentException) r5
            android.content.Intent r7 = r7.putExtra(r1, r5)
            yb3 r6 = (defpackage.yb3) r6
            r6.a(r4, r0, r7)
            return
        L_0x01ab:
            xv1 r5 = (defpackage.xv1) r5
            java.lang.Object r7 = r5.b
            yb3 r6 = (defpackage.yb3) r6
            java.util.LinkedHashMap r0 = r6.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x01c0
            goto L_0x01e6
        L_0x01c0:
            java.util.LinkedHashMap r2 = r6.e
            java.lang.Object r2 = r2.get(r0)
            a9 r2 = (defpackage.a9) r2
            if (r2 == 0) goto L_0x01cc
            v8 r1 = r2.a
        L_0x01cc:
            if (r1 != 0) goto L_0x01d9
            android.os.Bundle r1 = r6.g
            r1.remove(r0)
            java.util.LinkedHashMap r1 = r6.f
            r1.put(r0, r7)
            goto L_0x01e6
        L_0x01d9:
            v8 r1 = r2.a
            java.util.ArrayList r2 = r6.d
            boolean r0 = r2.remove(r0)
            if (r0 == 0) goto L_0x01e6
            r1.onActivityResult(r7)
        L_0x01e6:
            return
        L_0x01e7:
            bt1 r6 = (defpackage.bt1) r6
            it1 r5 = (defpackage.it1) r5
            r6.b(r4, r5)
            return
        L_0x01ef:
            bt1 r6 = (defpackage.bt1) r6
            dbe r5 = (defpackage.dbe) r5
            r6.c(r4, r5)
            return
        L_0x01f7:
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref.BooleanRef) r6
            boolean r7 = r6.element
            if (r7 == 0) goto L_0x0206
            java.lang.String r7 = "submitList"
            one.me.calls.ui.ui.call.CallScreen r5 = (one.me.calls.ui.ui.call.CallScreen) r5
            one.me.calls.ui.ui.call.CallScreen.c0(r5, r4, r7)
            r6.element = r0
        L_0x0206:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh1.run():void");
    }

    public /* synthetic */ kh1(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.o = obj2;
    }

    public /* synthetic */ kh1(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }
}

package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: ao  reason: default package */
public final class ao extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ao() {
        this.a = 16;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x016a A[Catch:{ RuntimeException -> 0x0177 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x016e A[Catch:{ RuntimeException -> 0x0177 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r4 = "android.media.AUDIO_BECOMING_NOISY"
            java.lang.String r5 = "phone"
            r6 = 31
            r7 = 29
            r9 = 4
            r10 = 9
            java.lang.String r11 = "connectivity"
            r14 = 6
            r15 = 5
            r8 = 0
            r12 = 1
            r13 = 0
            int r3 = r0.a
            switch(r3) {
                case 0: goto L_0x03c7;
                case 1: goto L_0x03ad;
                case 2: goto L_0x037b;
                case 3: goto L_0x0373;
                case 4: goto L_0x031e;
                case 5: goto L_0x0316;
                case 6: goto L_0x020d;
                case 7: goto L_0x01da;
                case 8: goto L_0x01b0;
                case 9: goto L_0x017b;
                case 10: goto L_0x010a;
                case 11: goto L_0x0099;
                case 12: goto L_0x0091;
                case 13: goto L_0x0083;
                case 14: goto L_0x005c;
                case 15: goto L_0x004b;
                default: goto L_0x001d;
            }
        L_0x001d:
            java.lang.Object r1 = r0.b
            nme r1 = (defpackage.nme) r1
            if (r1 != 0) goto L_0x0024
            goto L_0x004a
        L_0x0024:
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x002b
            goto L_0x004a
        L_0x002b:
            java.lang.Object r1 = r0.b
            nme r1 = (defpackage.nme) r1
            java.lang.Object r2 = r1.o
            com.google.firebase.messaging.FirebaseMessaging r2 = (com.google.firebase.messaging.FirebaseMessaging) r2
            r2.getClass()
            r2 = 0
            com.google.firebase.messaging.FirebaseMessaging.b(r2, r1)
            java.lang.Object r1 = r0.b
            nme r1 = (defpackage.nme) r1
            java.lang.Object r1 = r1.o
            com.google.firebase.messaging.FirebaseMessaging r1 = (com.google.firebase.messaging.FirebaseMessaging) r1
            android.content.Context r1 = r1.b
            r1.unregisterReceiver(r0)
            r0.b = r8
        L_0x004a:
            return
        L_0x004b:
            java.lang.Object r0 = r0.b
            nxe r0 = (defpackage.nxe) r0
            android.os.Handler r1 = r0.a
            mgd r2 = new mgd
            r3 = 16
            r2.<init>(r3, r0)
            r1.post(r2)
            return
        L_0x005c:
            java.lang.String r1 = r18.getAction()
            if (r1 != 0) goto L_0x0063
            goto L_0x0082
        L_0x0063:
            java.lang.String r2 = "android.intent.action.SCREEN_ON"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            if (r2 == 0) goto L_0x0075
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.invoke(r1)
            goto L_0x0082
        L_0x0075:
            java.lang.String r2 = "android.intent.action.SCREEN_OFF"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0082
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.invoke(r1)
        L_0x0082:
            return
        L_0x0083:
            boolean r1 = r16.isInitialStickyBroadcast()
            if (r1 != 0) goto L_0x0090
            java.lang.Object r0 = r0.b
            sb0 r0 = (defpackage.sb0) r0
            r0.b()
        L_0x0090:
            return
        L_0x0091:
            java.lang.Object r0 = r0.b
            cy3 r0 = (defpackage.cy3) r0
            r0.q()
            return
        L_0x0099:
            java.lang.Object r2 = r1.getSystemService(r11)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto L_0x00a3
        L_0x00a1:
            r8 = r13
            goto L_0x00df
        L_0x00a3:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x00a1 }
            if (r2 == 0) goto L_0x00de
            boolean r3 = r2.isConnected()
            if (r3 != 0) goto L_0x00b0
            goto L_0x00de
        L_0x00b0:
            int r3 = r2.getType()
            if (r3 == 0) goto L_0x00c9
            if (r3 == r12) goto L_0x00c7
            if (r3 == r9) goto L_0x00c9
            if (r3 == r15) goto L_0x00c9
            if (r3 == r14) goto L_0x00c5
            if (r3 == r10) goto L_0x00c3
            r8 = 8
            goto L_0x00df
        L_0x00c3:
            r8 = 7
            goto L_0x00df
        L_0x00c5:
            r8 = r15
            goto L_0x00df
        L_0x00c7:
            r8 = 2
            goto L_0x00df
        L_0x00c9:
            int r2 = r2.getSubtype()
            switch(r2) {
                case 1: goto L_0x00dc;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00da;
                case 4: goto L_0x00da;
                case 5: goto L_0x00da;
                case 6: goto L_0x00da;
                case 7: goto L_0x00da;
                case 8: goto L_0x00da;
                case 9: goto L_0x00da;
                case 10: goto L_0x00da;
                case 11: goto L_0x00da;
                case 12: goto L_0x00da;
                case 13: goto L_0x00c5;
                case 14: goto L_0x00da;
                case 15: goto L_0x00da;
                case 16: goto L_0x00d0;
                case 17: goto L_0x00da;
                case 18: goto L_0x00c7;
                case 19: goto L_0x00d0;
                case 20: goto L_0x00d2;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            r8 = r14
            goto L_0x00df
        L_0x00d2:
            int r2 = defpackage.v0g.a
            if (r2 < r7) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r10 = r13
        L_0x00d8:
            r8 = r10
            goto L_0x00df
        L_0x00da:
            r8 = r9
            goto L_0x00df
        L_0x00dc:
            r8 = 3
            goto L_0x00df
        L_0x00de:
            r8 = r12
        L_0x00df:
            int r2 = defpackage.v0g.a
            java.lang.Object r0 = r0.b
            g7a r0 = (defpackage.g7a) r0
            if (r2 < r6) goto L_0x0106
            if (r8 != r15) goto L_0x0106
            java.lang.Object r2 = r1.getSystemService(r5)     // Catch:{ RuntimeException -> 0x0102 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ RuntimeException -> 0x0102 }
            r2.getClass()     // Catch:{ RuntimeException -> 0x0102 }
            d7a r3 = new d7a     // Catch:{ RuntimeException -> 0x0102 }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x0102 }
            java.util.concurrent.Executor r1 = r17.getMainExecutor()     // Catch:{ RuntimeException -> 0x0102 }
            r2.registerTelephonyCallback(r1, r3)     // Catch:{ RuntimeException -> 0x0102 }
            r2.unregisterTelephonyCallback(r3)     // Catch:{ RuntimeException -> 0x0102 }
            goto L_0x0109
        L_0x0102:
            defpackage.g7a.a(r15, r0)
            goto L_0x0109
        L_0x0106:
            defpackage.g7a.a(r8, r0)
        L_0x0109:
            return
        L_0x010a:
            java.lang.Object r2 = r1.getSystemService(r11)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto L_0x0114
        L_0x0112:
            r8 = r13
            goto L_0x0150
        L_0x0114:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0112 }
            if (r2 == 0) goto L_0x014f
            boolean r3 = r2.isConnected()
            if (r3 != 0) goto L_0x0121
            goto L_0x014f
        L_0x0121:
            int r3 = r2.getType()
            if (r3 == 0) goto L_0x013a
            if (r3 == r12) goto L_0x0138
            if (r3 == r9) goto L_0x013a
            if (r3 == r15) goto L_0x013a
            if (r3 == r14) goto L_0x0136
            if (r3 == r10) goto L_0x0134
            r8 = 8
            goto L_0x0150
        L_0x0134:
            r8 = 7
            goto L_0x0150
        L_0x0136:
            r8 = r15
            goto L_0x0150
        L_0x0138:
            r8 = 2
            goto L_0x0150
        L_0x013a:
            int r2 = r2.getSubtype()
            switch(r2) {
                case 1: goto L_0x014d;
                case 2: goto L_0x014d;
                case 3: goto L_0x014b;
                case 4: goto L_0x014b;
                case 5: goto L_0x014b;
                case 6: goto L_0x014b;
                case 7: goto L_0x014b;
                case 8: goto L_0x014b;
                case 9: goto L_0x014b;
                case 10: goto L_0x014b;
                case 11: goto L_0x014b;
                case 12: goto L_0x014b;
                case 13: goto L_0x0136;
                case 14: goto L_0x014b;
                case 15: goto L_0x014b;
                case 16: goto L_0x0141;
                case 17: goto L_0x014b;
                case 18: goto L_0x0138;
                case 19: goto L_0x0141;
                case 20: goto L_0x0143;
                default: goto L_0x0141;
            }
        L_0x0141:
            r8 = r14
            goto L_0x0150
        L_0x0143:
            int r2 = defpackage.t0g.a
            if (r2 < r7) goto L_0x0148
            goto L_0x0149
        L_0x0148:
            r10 = r13
        L_0x0149:
            r8 = r10
            goto L_0x0150
        L_0x014b:
            r8 = r9
            goto L_0x0150
        L_0x014d:
            r8 = 3
            goto L_0x0150
        L_0x014f:
            r8 = r12
        L_0x0150:
            int r2 = defpackage.t0g.a
            java.lang.Object r0 = r0.b
            f7a r0 = (defpackage.f7a) r0
            if (r2 < r7) goto L_0x0177
            if (r8 != r15) goto L_0x0177
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch:{ RuntimeException -> 0x0177 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ RuntimeException -> 0x0177 }
            r1.getClass()     // Catch:{ RuntimeException -> 0x0177 }
            e7a r3 = new e7a     // Catch:{ RuntimeException -> 0x0177 }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x0177 }
            if (r2 >= r6) goto L_0x016e
            r1.listen(r3, r12)     // Catch:{ RuntimeException -> 0x0177 }
            goto L_0x0173
        L_0x016e:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1.listen(r3, r2)     // Catch:{ RuntimeException -> 0x0177 }
        L_0x0173:
            r1.listen(r3, r13)     // Catch:{ RuntimeException -> 0x0177 }
            goto L_0x017a
        L_0x0177:
            defpackage.f7a.b(r0, r8)
        L_0x017a:
            return
        L_0x017b:
            java.lang.String r1 = r18.getAction()
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            boolean r1 = defpackage.v0g.a(r1, r3)
            if (r1 != 0) goto L_0x0188
            goto L_0x01af
        L_0x0188:
            android.net.Uri r1 = r18.getData()
            boolean r1 = defpackage.v0g.a(r1, r1)
            if (r1 != 0) goto L_0x0193
            goto L_0x01af
        L_0x0193:
            java.lang.String r1 = "android.intent.extra.KEY_EVENT"
            android.os.Parcelable r1 = r2.getParcelableExtra(r1)
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            if (r1 != 0) goto L_0x019e
            goto L_0x01af
        L_0x019e:
            java.lang.Object r0 = r0.b
            iy8 r0 = (defpackage.iy8) r0
            px8 r0 = r0.X
            xe8 r0 = r0.b
            java.lang.Object r0 = r0.b
            uo8 r0 = (defpackage.uo8) r0
            android.media.session.MediaController r0 = r0.a
            r0.dispatchMediaButtonEvent(r1)
        L_0x01af:
            return
        L_0x01b0:
            java.lang.String r1 = r18.getAction()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x01d9
            java.lang.Object r0 = r0.b
            sb5 r0 = (defpackage.sb5) r0
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x01d9
            zae r1 = r0.a
            float r1 = r1.b()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x01d9
            java.lang.String r1 = "sb5"
            java.lang.String r2 = "onReceive ACTION_AUDIO_BECOMING_NOISY. Pause player"
            defpackage.z68.a(r1, r2)
            r0.pause()
        L_0x01d9:
            return
        L_0x01da:
            java.lang.Object r1 = r0.b
            xh3 r1 = (defpackage.xh3) r1
            java.lang.String r1 = r1.l
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x01e5
            goto L_0x01f2
        L_0x01e5:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01f2
            w78 r3 = defpackage.w78.o
            java.lang.String r4 = "onBackgroundDataEnabledChange"
            r2.d(r3, r1, r4, r8)
        L_0x01f2:
            java.lang.Object r0 = r0.b
            xh3 r0 = (defpackage.xh3) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.i
            java.util.Iterator r0 = r0.iterator()
        L_0x01fc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x020c
            java.lang.Object r1 = r0.next()
            qh3 r1 = (defpackage.qh3) r1
            r1.a()
            goto L_0x01fc
        L_0x020c:
            return
        L_0x020d:
            java.lang.Object r1 = r0.b
            to1 r1 = (defpackage.to1) r1
            int r3 = r1.e
            if (r3 != r12) goto L_0x0217
            goto L_0x0315
        L_0x0217:
            java.lang.String r3 = r18.getAction()
            java.lang.String r4 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
            boolean r4 = r3.equals(r4)
            java.lang.String r5 = "to1"
            java.lang.String r6 = ", BT state: "
            java.lang.String r7 = ", sb="
            java.lang.String r9 = "android.bluetooth.profile.extra.STATE"
            if (r4 == 0) goto L_0x0277
            int r2 = r2.getIntExtra(r9, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_CONNECTION_STATE_CHANGED, s="
            r3.<init>(r4)
            java.lang.String r4 = defpackage.to1.a(r2)
            r3.append(r4)
            r3.append(r7)
            boolean r0 = r16.isInitialStickyBroadcast()
            r3.append(r0)
            r3.append(r6)
            int r0 = r1.e
            java.lang.String r0 = defpackage.a81.y(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            r0 = 2
            if (r2 != r0) goto L_0x0264
            r1.d = r13
            r1.c()
            goto L_0x0306
        L_0x0264:
            if (r2 != r12) goto L_0x0268
            goto L_0x0306
        L_0x0268:
            r0 = 3
            if (r2 != r0) goto L_0x026d
            goto L_0x0306
        L_0x026d:
            if (r2 != 0) goto L_0x0306
            r1.b()
            r1.c()
            goto L_0x0306
        L_0x0277:
            java.lang.String r4 = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0306
            r3 = 10
            int r2 = r2.getIntExtra(r9, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "BluetoothHeadsetBroadcastReceiver.onReceive: a=ACTION_AUDIO_STATE_CHANGED, s="
            r4.<init>(r9)
            java.lang.String r9 = defpackage.to1.a(r2)
            r4.append(r9)
            r4.append(r7)
            boolean r7 = r16.isInitialStickyBroadcast()
            r4.append(r7)
            r4.append(r6)
            int r6 = r1.e
            java.lang.String r6 = defpackage.a81.y(r6)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            defpackage.z68.c(r5, r4, new java.lang.Object[0])
            r4 = 12
            if (r2 != r4) goto L_0x02e1
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            java.lang.String r0 = "cancelTimer"
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            android.os.Handler r0 = r1.c
            b r2 = r1.f
            r0.removeCallbacks(r2)
            int r0 = r1.e
            if (r0 != r14) goto L_0x02d5
            java.lang.String r0 = "+++ Bluetooth audio SCO is now connected"
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            r0 = 7
            r1.e = r0
            r1.d = r13
            r1.c()
            goto L_0x0306
        L_0x02d5:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r2 = "Unexpected state BluetoothHeadset.STATE_AUDIO_CONNECTED"
            defpackage.z68.n(r5, r8, r2, r0)
            goto L_0x0306
        L_0x02e1:
            r4 = 11
            if (r2 != r4) goto L_0x02ed
            java.lang.String r0 = "+++ Bluetooth audio SCO is now connecting..."
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            r1.e = r14
            goto L_0x0306
        L_0x02ed:
            if (r2 != r3) goto L_0x0306
            java.lang.String r2 = "+++ Bluetooth audio SCO is now disconnected"
            defpackage.z68.c(r5, r2, new java.lang.Object[0])
            boolean r0 = r16.isInitialStickyBroadcast()
            if (r0 == 0) goto L_0x0300
            java.lang.String r0 = "Ignore STATE_AUDIO_DISCONNECTED initial sticky broadcast."
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
            goto L_0x0315
        L_0x0300:
            r0 = 3
            r1.e = r0
            r1.c()
        L_0x0306:
            int r0 = r1.e
            java.lang.String r0 = defpackage.a81.y(r0)
            java.lang.String r1 = "onReceive done: BT state="
            java.lang.String r0 = r1.concat(r0)
            defpackage.z68.c(r5, r0, new java.lang.Object[0])
        L_0x0315:
            return
        L_0x0316:
            java.lang.Object r1 = r0.b
            ko1 r1 = (defpackage.ko1) r1
            r1.f(r0, r2)
            return
        L_0x031e:
            java.lang.Object r0 = r0.b
            zc4 r0 = (defpackage.zc4) r0
            java.lang.Object r1 = r0.o
            e4 r1 = (defpackage.e4) r1
            if (r1 == 0) goto L_0x0372
            r0.getClass()
            java.lang.String r3 = "level"
            int r3 = r2.getIntExtra(r3, r13)
            java.lang.Object r0 = r0.c
            rjf r0 = (defpackage.rjf) r0
            sjf r0 = (defpackage.sjf) r0
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = "status"
            r6 = -1
            int r0 = r2.getIntExtra(r0, r6)
            r2 = 2
            if (r0 == r2) goto L_0x034c
            if (r0 != r15) goto L_0x034b
            goto L_0x034c
        L_0x034b:
            r12 = r13
        L_0x034c:
            p01 r0 = new p01
            r0.<init>((int) r3, (long) r4, (boolean) r12)
            java.lang.Object r1 = r1.b
            q01 r1 = (defpackage.q01) r1
            if (r12 == 0) goto L_0x0359
            r1.a = r13
        L_0x0359:
            java.lang.Object r2 = r1.e
            p01 r2 = (defpackage.p01) r2
            if (r2 != 0) goto L_0x0362
            r1.e = r0
            goto L_0x0372
        L_0x0362:
            java.lang.Object r4 = r1.f
            p01 r4 = (defpackage.p01) r4
            if (r4 != 0) goto L_0x0370
            int r2 = r2.b
            if (r2 != r3) goto L_0x036d
            goto L_0x0372
        L_0x036d:
            r1.f = r0
            goto L_0x0372
        L_0x0370:
            r1.g = r0
        L_0x0372:
            return
        L_0x0373:
            java.lang.Object r0 = r0.b
            jm0 r0 = (defpackage.jm0) r0
            r0.v(r2)
            return
        L_0x037b:
            java.lang.String r1 = r18.getAction()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x03ac
            java.lang.Object r0 = r0.b
            q40 r0 = (defpackage.q40) r0
            java.lang.Object r1 = r0.b
            p40 r1 = (defpackage.p40) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x03ac
            java.lang.Object r1 = r0.b
            p40 r1 = (defpackage.p40) r1
            float r2 = r1.b()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x03ac
            java.lang.String r2 = "Player. Audio Focus. Receiver: ACTION_AUDIO_BECOMING_NOISY. Pause player"
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            defpackage.z68.c(r0, r2, new java.lang.Object[0])
            r1.pause()
        L_0x03ac:
            return
        L_0x03ad:
            boolean r3 = r16.isInitialStickyBroadcast()
            if (r3 != 0) goto L_0x03c6
            java.lang.Object r0 = r0.b
            y30 r0 = (defpackage.y30) r0
            java.lang.Object r3 = r0.j
            i30 r3 = (defpackage.i30) r3
            java.lang.Object r4 = r0.i
            g40 r4 = (defpackage.g40) r4
            u30 r1 = defpackage.u30.c(r1, r2, r3, r4)
            r0.a(r1)
        L_0x03c6:
            return
        L_0x03c7:
            java.lang.Object r0 = r0.b
            fbf r0 = (defpackage.fbf) r0
            r0.W()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.onReceive(android.content.Context, android.content.Intent):void");
    }

    public /* synthetic */ ao(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ao(jkb jkb) {
        this.a = 14;
        this.b = jkb;
    }
}

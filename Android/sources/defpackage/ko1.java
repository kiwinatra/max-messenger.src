package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.PowerManager;
import android.view.KeyEvent;
import java.util.LinkedHashSet;
import java.util.Set;
import org.webrtc.MediaStreamTrack;
import org.webrtc.ThreadUtils;

/* renamed from: ko1  reason: default package */
public final class ko1 implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnErrorListener, jsd {
    public n70 X;
    public final Context a;
    public final g6d b;
    public final to1 c;
    public AudioManager o;
    public boolean v;
    public Boolean w;
    public LinkedHashSet x = new LinkedHashSet(2);
    public jo1 y;
    public jo1 z;

    public ko1(Context context, w21 w21, nd ndVar) {
        new IntentFilter("android.intent.action.HEADSET_PLUG");
        new ao(5, this);
        jo1 jo1 = jo1.v;
        this.y = jo1;
        this.z = jo1;
        this.a = context;
        this.b = new g6d(context);
        z68.c("to1", "create", new Object[0]);
        this.c = new to1(context, this);
    }

    public final jo1 c(boolean z2) {
        z68.c("CallsAudioManager", "getPrefferedAudioDevice: current = %s, selected = %s, respectBluetooth = %s", this.y, this.z, Boolean.valueOf(z2));
        return this.v ? jo1.b : d() ? jo1.c : jo1.a;
    }

    public final boolean d() {
        if (this.w == null) {
            this.w = Boolean.valueOf(this.a.getPackageManager().hasSystemFeature("android.hardware.telephony"));
        }
        return this.w.booleanValue();
    }

    public final void e() {
    }

    public final void f(BroadcastReceiver broadcastReceiver, Intent intent) {
        KeyEvent keyEvent;
        boolean z2 = true;
        if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("state", -1);
            String stringExtra = intent.getStringExtra("name");
            int intExtra2 = intent.getIntExtra("microphone", -1);
            boolean z3 = false;
            if (intExtra == 0) {
                z68.c("CallsAudioManager", "audio headset unplugged. name=%s, microphone=%b", stringExtra, Boolean.valueOf(intExtra2 == 1));
                this.v = false;
                k();
                i(c(true));
            } else if (intExtra != 1) {
                if (intExtra2 != 1) {
                    z2 = false;
                }
                z68.c("CallsAudioManager", "unknown headset state received. name=%s, microphone=%b", stringExtra, Boolean.valueOf(z2));
            } else {
                if (intExtra2 == 1) {
                    z3 = true;
                }
                z68.c("CallsAudioManager", "audio headset plugged in. name=%s, microphone=%b", stringExtra, Boolean.valueOf(z3));
                this.v = true;
                k();
                z68.c("CallsAudioManager", "set speaker enabled=false", new Object[0]);
                jo1 jo1 = jo1.a;
                if (this.v) {
                    jo1 = jo1.b;
                } else if (d()) {
                    jo1 = jo1.c;
                }
                i(jo1);
            }
        } else if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 1) {
            z68.c("CallsAudioManager", "onReceiveBroadcast ACTION_MEDIA_BUTTON: key up event for keycode = " + KeyEvent.keyCodeToString(keyEvent.getKeyCode()), new Object[0]);
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 5 || keyCode == 6 || keyCode == 79 || keyCode == 126 || keyCode == 127) {
                try {
                    broadcastReceiver.abortBroadcast();
                } catch (Exception e) {
                    z68.f("CallsAudioManager", "onReceiveBroadcast: failed to abort broadcast, e: " + e.toString(), (Throwable) null);
                }
                z68.c("CallsAudioManager", "notifyRemoteAudioButtonClicked", new Object[0]);
            }
        }
    }

    public final void h() {
    }

    public final void i(jo1 jo1) {
        z68.c("CallsAudioManager", "select audio device " + jo1, new Object[0]);
        ThreadUtils.checkIsOnMainThread();
        if (!this.x.contains(jo1)) {
            z68.f("CallsAudioManager", "can't select " + jo1 + " from available " + this.x, (Throwable) null);
        }
        this.z = jo1;
        k();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [n70, java.lang.Object] */
    public final void j(boolean z2) {
        jq5 jq5;
        PowerManager.WakeLock t;
        Sensor sensor;
        z68.c("CallsAudioManager", "set speaker enabled internal=" + z2, new Object[0]);
        if (this.o == null) {
            this.o = (AudioManager) this.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
        AudioManager audioManager = this.o;
        if (audioManager.isSpeakerphoneOn() != z2) {
            audioManager.setSpeakerphoneOn(z2);
        }
        n70 n70 = this.X;
        if (n70 == null) {
            jq5 = new jq5();
        } else {
            jq5 jq52 = new jq5();
            jq52.b = n70.a;
            boolean z3 = n70.b;
            boolean z4 = n70.c;
            jq5 = jq52;
        }
        int i = jq5.b;
        ? obj = new Object();
        obj.a = i;
        obj.b = z2;
        obj.c = false;
        this.X = obj;
        z68.c("CallsAudioManager", "update proximity tracking state. speakerEnabled=%b", Boolean.valueOf(z2));
        jo1 jo1 = this.y;
        jo1 jo12 = jo1.o;
        g6d g6d = this.b;
        if (jo1 != jo12 && !this.v && !z2) {
            z68.c("CallsAudioManager", "startTrackingProximity", new Object[0]);
            ksd ksd = (ksd) g6d.c;
            Set set = ksd.d;
            if (set.add(this) && set.size() == 1 && (sensor = ksd.b) != null && !ksd.a.registerListener(ksd, sensor, 3)) {
                z68.e("ksd", "Failed to register listener for proximitySensor");
            }
            PowerManager.WakeLock t2 = g6d.t();
            if (t2 != null && !t2.isHeld()) {
                t2.acquire();
                return;
            }
            return;
        }
        z68.c("CallsAudioManager", "stopTrackingProximity", new Object[0]);
        ksd ksd2 = (ksd) g6d.c;
        Set set2 = ksd2.d;
        if (set2.remove(this) && set2.size() == 0 && ksd2.b != null) {
            ksd2.a.unregisterListener(ksd2);
        }
        if (((PowerManager.WakeLock) g6d.o) != null && (t = g6d.t()) != null && t.isHeld()) {
            t.release();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (r2.e == 6) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (r2.e == 4) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r16 = this;
            r0 = r16
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "updateAudioDeviceState: wired headset="
            r1.<init>(r2)
            boolean r2 = r0.v
            r1.append(r2)
            java.lang.String r2 = ", BT state="
            r1.append(r2)
            to1 r2 = r0.c
            r2.getClass()
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r3 = r2.e
            java.lang.String r3 = defpackage.a81.y(r3)
            r1.append(r3)
            java.lang.String r3 = "\nDevice status: available="
            r1.append(r3)
            java.util.LinkedHashSet r3 = r0.x
            r1.append(r3)
            java.lang.String r3 = ", selected="
            r1.append(r3)
            jo1 r4 = r0.z
            r1.append(r4)
            java.lang.String r4 = ", current audio device="
            r1.append(r4)
            jo1 r4 = r0.y
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "CallsAudioManager"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r1 = r2.e
            r5 = 3
            r6 = 4
            if (r1 == r6) goto L_0x0064
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r1 = r2.e
            if (r1 == r5) goto L_0x0064
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r1 = r2.e
            r7 = 5
        L_0x0064:
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r1 = r2.e
            jo1 r7 = defpackage.jo1.o
            r8 = 0
            if (r1 != r5) goto L_0x0078
            jo1 r1 = r0.y
            if (r1 != r7) goto L_0x0078
            jo1 r1 = r0.c(r8)
            r0.z = r1
        L_0x0078:
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            jo1 r1 = defpackage.jo1.b
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r9 = r2.e
            r10 = 1
            if (r9 != r6) goto L_0x008b
            jo1 r9 = r0.z
            if (r9 != r7) goto L_0x008b
            r9 = r10
            goto L_0x008c
        L_0x008b:
            r9 = r8
        L_0x008c:
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r11 = r2.e
            r12 = 7
            r13 = 6
            if (r11 == r12) goto L_0x009c
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r11 = r2.e
            if (r11 != r13) goto L_0x00a6
        L_0x009c:
            jo1 r11 = r0.z
            jo1 r14 = defpackage.jo1.v
            if (r11 == r14) goto L_0x00a6
            if (r11 == r7) goto L_0x00a6
            r11 = r10
            goto L_0x00a7
        L_0x00a6:
            r11 = r8
        L_0x00a7:
            if (r11 == 0) goto L_0x00b1
            java.lang.String r14 = "stop bluetooth audio"
            defpackage.z68.c(r4, r14, new java.lang.Object[0])
            r2.b()
        L_0x00b1:
            java.lang.String r14 = "update available audio devices"
            defpackage.z68.c(r4, r14, new java.lang.Object[0])
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            java.util.LinkedHashSet r15 = r0.x
            int r15 = r15.size()
            r14.<init>(r15)
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r15 = r2.e
            if (r15 == r12) goto L_0x00d6
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r15 = r2.e
            if (r15 == r13) goto L_0x00d6
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r15 = r2.e
            if (r15 != r6) goto L_0x00d9
        L_0x00d6:
            r14.add(r7)
        L_0x00d9:
            boolean r15 = r0.v
            if (r15 == 0) goto L_0x00e0
            r14.add(r1)
        L_0x00e0:
            boolean r1 = r16.d()
            if (r1 == 0) goto L_0x00eb
            jo1 r1 = defpackage.jo1.c
            r14.add(r1)
        L_0x00eb:
            jo1 r1 = defpackage.jo1.a
            r14.add(r1)
            java.util.LinkedHashSet r1 = r0.x
            boolean r1 = r1.equals(r14)
            r1 = r1 ^ r10
            r0.x = r14
            r14 = 0
            if (r9 == 0) goto L_0x01c4
            if (r11 != 0) goto L_0x01c4
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            int r9 = r2.e
            java.lang.String r9 = defpackage.a81.y(r9)
            java.lang.String r11 = "start bluetooth audio. current bt state = "
            java.lang.String r9 = r11.concat(r9)
            defpackage.z68.c(r4, r9, new java.lang.Object[0])
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "startSco: BT state="
            r9.<init>(r11)
            int r11 = r2.e
            java.lang.String r11 = defpackage.a81.y(r11)
            r9.append(r11)
            java.lang.String r11 = ", attempts: "
            r9.append(r11)
            int r11 = r2.d
            r9.append(r11)
            java.lang.String r11 = ", SCO is on: "
            r9.append(r11)
            android.media.AudioManager r15 = r2.b
            boolean r5 = r15.isBluetoothScoOn()
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            java.lang.String r9 = "to1"
            defpackage.z68.c(r9, r5, new java.lang.Object[0])
            int r5 = r2.d
            if (r5 < r12) goto L_0x014e
            java.lang.String r1 = "BT SCO connection fails - no more attempts"
            defpackage.z68.f(r9, r1, r14)
            goto L_0x0157
        L_0x014e:
            int r5 = r2.e
            if (r5 == r6) goto L_0x0180
            java.lang.String r1 = "BT SCO connection fails - no headset available"
            defpackage.z68.f(r9, r1, r14)
        L_0x0157:
            java.lang.String r1 = "failed to start bluetooth audio"
            defpackage.z68.f(r4, r1, r14)
            java.util.LinkedHashSet r1 = r0.x
            r1.remove(r7)
            jo1 r1 = r0.z
            if (r1 != r7) goto L_0x017e
            jo1 r1 = r0.c(r8)
            r0.z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to start bluetooth, so selected other preferred device: "
            r1.<init>(r2)
            jo1 r2 = r0.z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.z68.f(r4, r1, r14)
        L_0x017e:
            r1 = r10
            goto L_0x01c4
        L_0x0180:
            java.lang.String r5 = "Starting Bluetooth SCO and waits for ACTION_AUDIO_STATE_CHANGED..."
            defpackage.z68.c(r9, r5, new java.lang.Object[0])
            r2.e = r13
            r15.startBluetoothSco()
            r15.setBluetoothScoOn(r10)
            int r5 = r2.d
            int r5 = r5 + r10
            r2.d = r5
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            java.lang.String r5 = "startTimer"
            defpackage.z68.c(r9, r5, new java.lang.Object[0])
            android.os.Handler r5 = r2.c
            b r6 = r2.f
            r12 = 4000(0xfa0, double:1.9763E-320)
            r5.postDelayed(r6, r12)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "startScoAudio done: BT state="
            r5.<init>(r6)
            int r2 = r2.e
            java.lang.String r2 = defpackage.a81.y(r2)
            r5.append(r2)
            r5.append(r11)
            boolean r2 = r15.isBluetoothScoOn()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            defpackage.z68.c(r9, r2, new java.lang.Object[0])
        L_0x01c4:
            jo1 r2 = r0.y
            jo1 r5 = r0.z
            java.lang.String r6 = "New device status: available="
            if (r2 == r5) goto L_0x0214
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "setAudioDeviceInternal: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            r0.y = r5
            int r1 = r5.ordinal()
            if (r1 == 0) goto L_0x01f7
            if (r1 == r10) goto L_0x01f3
            r2 = 2
            if (r1 == r2) goto L_0x01f3
            r2 = 3
            if (r1 == r2) goto L_0x01f3
            java.lang.String r1 = "Invalid audio device selection"
            defpackage.z68.f(r4, r1, r14)
            goto L_0x01fa
        L_0x01f3:
            r0.j(r8)
            goto L_0x01fa
        L_0x01f7:
            r0.j(r10)
        L_0x01fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            java.util.LinkedHashSet r2 = r0.x
            r1.append(r2)
            r1.append(r3)
            jo1 r0 = r0.z
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
            goto L_0x022f
        L_0x0214:
            if (r1 == 0) goto L_0x022f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            java.util.LinkedHashSet r2 = r0.x
            r1.append(r2)
            r1.append(r3)
            jo1 r0 = r0.z
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
        L_0x022f:
            java.lang.String r0 = "updateAudioDeviceState done"
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko1.k():void");
    }

    public final void onAudioFocusChange(int i) {
        if (i == -3) {
            z68.a("CallsAudioManager", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        } else if (i == -2) {
            z68.a("CallsAudioManager", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT");
        } else if (i == -1) {
            z68.a("CallsAudioManager", "onAudioFocusChange: AUDIOFOCUS_LOSS");
        } else if (i == 1) {
            try {
                z68.a("CallsAudioManager", "onAudioFocusChange: AUDIOFOCUS_GAIN");
            } catch (Exception e) {
                StringBuilder o2 = wj6.o(i, "error in onAudioFocusChange: ", ". e: ");
                o2.append(e.toString());
                z68.e("CallsAudioManager", o2.toString());
            }
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        z68.e("CallsAudioManager", "Media player error. what=" + i + ", extra=" + i2);
        return false;
    }
}

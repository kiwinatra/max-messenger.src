package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: jm0  reason: default package */
public final class jm0 extends qj3 {
    public final ao w = new ao(3, this);
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jm0(Context context, g6d g6d, int i) {
        super(context, g6d);
        this.x = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r4.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i() {
        /*
            r4 = this;
            int r0 = r4.x
            switch(r0) {
                case 0: goto L_0x008e;
                case 1: goto L_0x0047;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.IntentFilter r0 = r4.u()
            java.lang.Object r4 = r4.b
            android.content.Context r4 = (android.content.Context) r4
            r1 = 0
            android.content.Intent r4 = r4.registerReceiver(r1, r0)
            r0 = 1
            if (r4 == 0) goto L_0x0042
            java.lang.String r1 = r4.getAction()
            if (r1 != 0) goto L_0x001c
            goto L_0x0042
        L_0x001c:
            java.lang.String r4 = r4.getAction()
            r1 = 0
            if (r4 == 0) goto L_0x0041
            int r2 = r4.hashCode()
            r3 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r2 == r3) goto L_0x003b
            r3 = -730838620(0xffffffffd47049a4, float:-4.12811054E12)
            if (r2 == r3) goto L_0x0032
            goto L_0x0041
        L_0x0032:
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0042
            goto L_0x0041
        L_0x003b:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r4 = r4.equals(r0)
        L_0x0041:
            r0 = r1
        L_0x0042:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0047:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r4 = r4.b
            android.content.Context r4 = (android.content.Context) r4
            android.content.Intent r4 = r4.registerReceiver(r1, r0)
            if (r4 != 0) goto L_0x0067
            h88 r4 = defpackage.h88.x()
            java.lang.String r0 = defpackage.lm0.a
            java.lang.String r1 = "getInitialState - null intent received"
            r4.t(r0, r1)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L_0x008d
        L_0x0067:
            java.lang.String r0 = "status"
            r1 = -1
            int r0 = r4.getIntExtra(r0, r1)
            java.lang.String r2 = "level"
            int r2 = r4.getIntExtra(r2, r1)
            java.lang.String r3 = "scale"
            int r4 = r4.getIntExtra(r3, r1)
            float r1 = (float) r2
            float r4 = (float) r4
            float r1 = r1 / r4
            r4 = 1
            if (r0 == r4) goto L_0x0089
            r0 = 1041865114(0x3e19999a, float:0.15)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r4 = 0
        L_0x0089:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x008d:
            return r4
        L_0x008e:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r4 = r4.b
            android.content.Context r4 = (android.content.Context) r4
            android.content.Intent r4 = r4.registerReceiver(r1, r0)
            if (r4 != 0) goto L_0x00ae
            h88 r4 = defpackage.h88.x()
            java.lang.String r0 = defpackage.km0.a
            java.lang.String r1 = "getInitialState - null intent received"
            r4.t(r0, r1)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L_0x00c3
        L_0x00ae:
            java.lang.String r0 = "status"
            r1 = -1
            int r4 = r4.getIntExtra(r0, r1)
            r0 = 2
            if (r4 == r0) goto L_0x00be
            r0 = 5
            if (r4 != r0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r4 = 0
            goto L_0x00bf
        L_0x00be:
            r4 = 1
        L_0x00bf:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x00c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm0.i():java.lang.Object");
    }

    public final void r() {
        h88.x().p(ms0.a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.b).registerReceiver(this.w, u());
    }

    public final void s() {
        h88.x().p(ms0.a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.b).unregisterReceiver(this.w);
    }

    public final IntentFilter u() {
        switch (this.x) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    public final void v(Intent intent) {
        switch (this.x) {
            case 0:
                String action = intent.getAction();
                if (action != null) {
                    h88.x().p(km0.a, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                q(Boolean.FALSE);
                                return;
                            }
                            return;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                q(Boolean.FALSE);
                                return;
                            }
                            return;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                q(Boolean.TRUE);
                                return;
                            }
                            return;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                q(Boolean.TRUE);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } else {
                    return;
                }
            case 1:
                if (intent.getAction() != null) {
                    h88 x2 = h88.x();
                    String str = lm0.a;
                    x2.p(str, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int hashCode = action2.hashCode();
                        if (hashCode != -1980154005) {
                            if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                q(Boolean.FALSE);
                                return;
                            }
                            return;
                        } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                            q(Boolean.TRUE);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (intent.getAction() != null) {
                    h88 x3 = h88.x();
                    String str2 = axe.a;
                    x3.p(str2, "Received " + intent.getAction());
                    String action3 = intent.getAction();
                    if (action3 != null) {
                        int hashCode2 = action3.hashCode();
                        if (hashCode2 != -1181163412) {
                            if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                q(Boolean.TRUE);
                                return;
                            }
                            return;
                        } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                            q(Boolean.FALSE);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}

package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: f51  reason: default package */
public final /* synthetic */ class f51 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Lazy b;
    public final /* synthetic */ Lazy c;
    public final /* synthetic */ Lazy o;
    public final /* synthetic */ Lazy v;
    public final /* synthetic */ Lazy w;
    public final /* synthetic */ Object x;

    public /* synthetic */ f51(j51 j51, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.x = j51;
        this.b = lazy;
        this.c = lazy2;
        this.o = lazy3;
        this.v = lazy4;
        this.w = lazy5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: voc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: voc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: voc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.a
            switch(r0) {
                case 0: goto L_0x001d;
                default: goto L_0x0007;
            }
        L_0x0007:
            zq9 r0 = new zq9
            kotlin.Lazy r2 = r1.b
            kotlin.Lazy r3 = r1.c
            kotlin.Lazy r4 = r1.o
            kotlin.Lazy r5 = r1.v
            kotlin.Lazy r6 = r1.w
            java.lang.Object r1 = r1.x
            r7 = r1
            kotlin.Lazy r7 = (kotlin.Lazy) r7
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x001d:
            ru.ok.android.externcalls.sdk.ConversationFactory r2 = new ru.ok.android.externcalls.sdk.ConversationFactory
            java.lang.Object r0 = r1.x
            j51 r0 = (defpackage.j51) r0
            nla r0 = r0.a
            kotlin.Lazy r3 = r1.b
            java.lang.Object r4 = r3.getValue()
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r5 = "ONE_ME"
            r2.<init>(r0, r4, r5)
            kotlin.Lazy r4 = r1.c
            java.lang.Object r0 = r4.getValue()
            vpa r0 = (defpackage.vpa) r0
            r0.getClass()
            kotlin.Lazy r0 = r1.o
            java.lang.Object r5 = r0.getValue()
            bud r5 = (defpackage.bud) r5
            akd r5 = (defpackage.akd) r5
            int r5 = r5.n()
            r6 = 3
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0052
            r5 = r8
            goto L_0x0053
        L_0x0052:
            r5 = r7
        L_0x0053:
            r6 = 0
            if (r5 == 0) goto L_0x005c
            h51 r5 = new h51
            r5.<init>()
            goto L_0x005d
        L_0x005c:
            r5 = r6
        L_0x005d:
            i51 r9 = new i51
            kotlin.Lazy r10 = r1.v
            r9.<init>(r10)
            ig0 r10 = defpackage.ig0.c
            r2.setBadNetworkIndicatorConfig(r10)
            r2.setScreenCapturePermissionProvider(r9)
            r2.setDeviceAudioShareEnabled(r8)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder r9 = new ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder
            r9.<init>()
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder r8 = r9.setOpusDREDEnabled(r8)
            java.lang.Object r0 = r0.getValue()
            bud r0 = (defpackage.bud) r0
            akd r0 = (defpackage.akd) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f16callssdkaudiodynamicredundancy
            java.lang.String r0 = r0.z(r9, r6)
            if (r0 == 0) goto L_0x010e
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c0 }
            r9.<init>((java.lang.String) r0)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r0 = "off"
            java.lang.Boolean r0 = defpackage.iq.A(r9, r0)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x00c0 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r10)     // Catch:{ JSONException -> 0x00c0 }
            if (r0 == 0) goto L_0x00a0
            goto L_0x010e
        L_0x00a0:
            java.lang.String r0 = "mab"
            boolean r10 = r9.has(r0)     // Catch:{ JSONException -> 0x00c0 }
            if (r10 == 0) goto L_0x00b1
            int r0 = r9.getInt(r0)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x00c0 }
            goto L_0x00b2
        L_0x00b1:
            r0 = r6
        L_0x00b2:
            if (r0 == 0) goto L_0x00c2
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x00c0 }
            int r0 = r0 * 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x00c0 }
            r12 = r0
            goto L_0x00c3
        L_0x00c0:
            r0 = move-exception
            goto L_0x0107
        L_0x00c2:
            r12 = r6
        L_0x00c3:
            java.lang.String r0 = "dsb"
            boolean r10 = r9.has(r0)     // Catch:{ JSONException -> 0x00c0 }
            if (r10 == 0) goto L_0x00d4
            int r0 = r9.getInt(r0)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x00c0 }
            goto L_0x00d5
        L_0x00d4:
            r0 = r6
        L_0x00d5:
            if (r0 == 0) goto L_0x00e3
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x00c0 }
            int r0 = r0 * 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x00c0 }
            r13 = r0
            goto L_0x00e4
        L_0x00e3:
            r13 = r6
        L_0x00e4:
            java.lang.String r0 = "nl"
            java.lang.Boolean r14 = defpackage.iq.A(r9, r0)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r0 = "df"
            java.lang.Boolean r15 = defpackage.iq.A(r9, r0)     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r0 = "dlb"
            java.lang.Boolean r16 = defpackage.iq.A(r9, r0)     // Catch:{ JSONException -> 0x00c0 }
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters r0 = new ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$DynamicRedundancyParameters     // Catch:{ JSONException -> 0x00c0 }
            r18 = 0
            r19 = 192(0xc0, float:2.69E-43)
            r20 = 0
            r11 = 1
            r17 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ JSONException -> 0x00c0 }
            r6 = r0
            goto L_0x010e
        L_0x0107:
            java.lang.String r9 = "CallsSdk"
            java.lang.String r10 = "Calls SDK audio redundancy parameters are expected to look like valid JSON string"
            defpackage.z68.f(r9, r10, r0)
        L_0x010e:
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection$Builder r0 = r8.setDynamicRedundancyParameters(r6)
            if (r5 == 0) goto L_0x012b
            kotlin.Lazy r1 = r1.w
            java.lang.Object r1 = r1.getValue()
            x23 r1 = (defpackage.x23) r1
            a33 r1 = (defpackage.a33) r1
            ls7 r1 = r1.g
            java.lang.String r6 = "app.calls_sdk.logging.webrtc"
            boolean r1 = r1.getBoolean(r6, r7)
            if (r1 == 0) goto L_0x012b
            r0.setLogger(r5)
        L_0x012b:
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$PeerConnection r0 = r0.build()
            r2.setLogger(r5)
            g51 r1 = new g51
            r1.<init>(r4)
            r2.setLogConfiguration(r1)
            ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender r1 = r2.getAnalyticsSender()
            ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfiguration r1 = r1.getConfiguration()
            fm0 r4 = new fm0
            r5 = 7
            r4.<init>(r5)
            r1.setApplicationNameProvider(r4)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$Builder r1 = new ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$Builder
            java.lang.Object r3 = r3.getValue()
            android.content.Context r3 = (android.content.Context) r3
            r1.<init>(r3)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams$Builder r0 = r1.setPeerConnection(r0)
            ru.ok.android.externcalls.sdk.ConversationFactoryInitParams r0 = r0.build()
            ru.ok.android.externcalls.sdk.ConversationFactory.init((ru.ok.android.externcalls.sdk.ConversationFactoryInitParams) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f51.invoke():java.lang.Object");
    }

    public /* synthetic */ f51(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.b = lazy;
        this.c = lazy2;
        this.o = lazy3;
        this.v = lazy4;
        this.w = lazy5;
        this.x = lazy6;
    }
}

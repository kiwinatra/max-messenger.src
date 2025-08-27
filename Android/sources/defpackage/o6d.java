package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.media.projection.MediaProjection;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.media3.transformer.ExportException;
import com.android.billingclient.api.BillingResult;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.m0;
import com.my.tracker.obfuscated.n0;
import com.my.tracker.obfuscated.y0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: o6d  reason: default package */
public final /* synthetic */ class o6d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ o6d(int i, Object obj, Object obj2, List list) {
        this.a = i;
        this.b = obj;
        this.o = obj2;
        this.c = list;
    }

    private final void a() {
        ((m0) this.b).b((BillingResult) this.o, (List) this.c);
    }

    private final void b() {
        ((n0) this.c).a((String) this.b, (String) this.o);
    }

    public final void run() {
        d7d d7d;
        String str;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        boolean z3;
        int i9;
        int i10 = 6;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                for (ha9 ha9 : (List) this.c) {
                    ((z6d) this.b).d().n(ha9.b, (oa9) this.o);
                }
                return;
            case 1:
                z6d z6d = (z6d) this.b;
                aj9 d = z6d.d();
                d.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM messages WHERE media_type in (");
                Set<Integer> set = (Set) this.c;
                int size = set.size();
                n79.c(sb, size);
                sb.append(")");
                d7d a2 = d7d.a(size, sb.toString());
                int i11 = 1;
                for (Integer num : set) {
                    if (num == null) {
                        a2.X(i11);
                    } else {
                        a2.k(i11, (long) num.intValue());
                    }
                    i11++;
                }
                i6d i6d = d.a;
                i6d.b();
                Cursor o2 = i6d.o(a2, (CancellationSignal) null);
                try {
                    int u = kne.u(o2, "id");
                    int u2 = kne.u(o2, "server_id");
                    int u3 = kne.u(o2, "time");
                    int u4 = kne.u(o2, "update_time");
                    int u5 = kne.u(o2, "sender");
                    int u6 = kne.u(o2, "cid");
                    int u7 = kne.u(o2, "text");
                    int u8 = kne.u(o2, "delivery_status");
                    int u9 = kne.u(o2, "status");
                    int u10 = kne.u(o2, "time_local");
                    int u11 = kne.u(o2, "error");
                    z6d z6d2 = z6d;
                    int u12 = kne.u(o2, "localized_error");
                    int u13 = kne.u(o2, "attaches");
                    d7d = a2;
                    try {
                        int u14 = kne.u(o2, "media_type");
                        int u15 = kne.u(o2, "detect_share");
                        int u16 = kne.u(o2, "msg_link_type");
                        int u17 = kne.u(o2, "msg_link_id");
                        int u18 = kne.u(o2, "inserted_from_msg_link");
                        int u19 = kne.u(o2, "msg_link_chat_id");
                        int u20 = kne.u(o2, "msg_link_chat_name");
                        int u21 = kne.u(o2, "msg_link_chat_link");
                        int u22 = kne.u(o2, "msg_link_out_chat_id");
                        int u23 = kne.u(o2, "msg_link_out_msg_id");
                        int u24 = kne.u(o2, "type");
                        int u25 = kne.u(o2, "chat_id");
                        int u26 = kne.u(o2, "ttl");
                        int u27 = kne.u(o2, "channel_views");
                        int u28 = kne.u(o2, "channel_forwards");
                        int u29 = kne.u(o2, "view_time");
                        int u30 = kne.u(o2, "zoom");
                        int u31 = kne.u(o2, "options");
                        int u32 = kne.u(o2, "live_until");
                        int u33 = kne.u(o2, "elements");
                        int u34 = kne.u(o2, "reactions");
                        int u35 = kne.u(o2, "delayed_attrs_time_to_fire");
                        int u36 = kne.u(o2, "delayed_attrs_notify_sender");
                        int i12 = u13;
                        ArrayList arrayList = new ArrayList(o2.getCount());
                        while (o2.moveToNext()) {
                            long j = o2.getLong(u);
                            long j2 = o2.getLong(u2);
                            long j3 = o2.getLong(u3);
                            long j4 = o2.getLong(u4);
                            long j5 = o2.getLong(u5);
                            long j6 = o2.getLong(u6);
                            String string = o2.isNull(u7) ? null : o2.getString(u7);
                            int i13 = o2.getInt(u8);
                            d.a().getClass();
                            oa9.b.getClass();
                            oa9 n = cd4.n(i13);
                            int i14 = o2.getInt(u9);
                            d.a().getClass();
                            qe9.b.getClass();
                            qe9 D = sq6.D(i14);
                            long j7 = o2.getLong(u10);
                            String string2 = o2.isNull(u11) ? null : o2.getString(u11);
                            if (o2.isNull(u12)) {
                                i = i12;
                                str = null;
                            } else {
                                str = o2.getString(u12);
                                i = i12;
                            }
                            byte[] blob = o2.isNull(i) ? null : o2.getBlob(i);
                            d.a().getClass();
                            w28 b2 = qe8.b(blob);
                            int i15 = u12;
                            int i16 = u14;
                            int i17 = o2.getInt(i16);
                            u14 = i16;
                            int i18 = u15;
                            if (o2.getInt(i18) != 0) {
                                u15 = i18;
                                i2 = u16;
                                z = true;
                            } else {
                                u15 = i18;
                                i2 = u16;
                                z = false;
                            }
                            int i19 = o2.getInt(i2);
                            u16 = i2;
                            int i20 = u17;
                            long j8 = o2.getLong(i20);
                            u17 = i20;
                            int i21 = u18;
                            if (o2.getInt(i21) != 0) {
                                u18 = i21;
                                i3 = u19;
                                z2 = true;
                            } else {
                                u18 = i21;
                                i3 = u19;
                                z2 = false;
                            }
                            long j9 = o2.getLong(i3);
                            u19 = i3;
                            int i22 = u20;
                            if (o2.isNull(i22)) {
                                u20 = i22;
                                i4 = u21;
                                str2 = null;
                            } else {
                                str2 = o2.getString(i22);
                                u20 = i22;
                                i4 = u21;
                            }
                            if (o2.isNull(i4)) {
                                u21 = i4;
                                i5 = u22;
                                str3 = null;
                            } else {
                                str3 = o2.getString(i4);
                                u21 = i4;
                                i5 = u22;
                            }
                            long j10 = o2.getLong(i5);
                            u22 = i5;
                            int i23 = u23;
                            long j11 = o2.getLong(i23);
                            u23 = i23;
                            int i24 = u24;
                            int i25 = o2.getInt(i24);
                            d.a().getClass();
                            int c2 = wj6.c(i25);
                            u24 = i24;
                            int i26 = u25;
                            long j12 = o2.getLong(i26);
                            u25 = i26;
                            int i27 = u26;
                            int i28 = o2.getInt(i27);
                            u26 = i27;
                            int i29 = u27;
                            int i30 = o2.getInt(i29);
                            u27 = i29;
                            int i31 = u28;
                            int i32 = o2.getInt(i31);
                            u28 = i31;
                            int i33 = u29;
                            long j13 = o2.getLong(i33);
                            u29 = i33;
                            int i34 = u30;
                            int i35 = o2.getInt(i34);
                            u30 = i34;
                            int i36 = u31;
                            int i37 = o2.getInt(i36);
                            u31 = i36;
                            int i38 = u32;
                            long j14 = o2.getLong(i38);
                            u32 = i38;
                            int i39 = u33;
                            byte[] blob2 = o2.isNull(i39) ? null : o2.getBlob(i39);
                            d.a().getClass();
                            List a3 = hp9.a(blob2);
                            u33 = i39;
                            int i40 = u34;
                            if (o2.isNull(i40)) {
                                i6 = i40;
                                i7 = i;
                                bArr = null;
                            } else {
                                i6 = i40;
                                bArr = o2.getBlob(i40);
                                i7 = i;
                            }
                            xd9 b3 = d.a().b(bArr);
                            int i41 = u35;
                            if (o2.isNull(i41)) {
                                i8 = u36;
                                l = null;
                            } else {
                                l = Long.valueOf(o2.getLong(i41));
                                i8 = u36;
                            }
                            Integer valueOf = o2.isNull(i8) ? null : Integer.valueOf(o2.getInt(i8));
                            if (valueOf == null) {
                                u35 = i41;
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(valueOf.intValue() != 0);
                                u35 = i41;
                            }
                            arrayList.add(new ya9(j, j2, j3, j4, j5, j6, string, n, D, j7, string2, str, b2, i17, z, i19, j8, z2, j9, str2, str3, j10, j11, c2, j12, i28, i30, i32, j13, i35, i37, j14, a3, b3, l, bool));
                            u36 = i8;
                            u12 = i15;
                            i12 = i7;
                            u34 = i6;
                        }
                        o2.close();
                        d7d.o();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ya9 ya9 = (ya9) it.next();
                            m20 Q = ya9.m.Q();
                            ((qk3) this.o).accept(Q);
                            w28 c3 = Q.c();
                            z6d2.d().m(new iwf(ya9.a, c3, qe8.c(c3)));
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        o2.close();
                        d7d.o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d7d = a2;
                    o2.close();
                    d7d.o();
                    throw th;
                }
            case 2:
                lhd lhd = (lhd) this.c;
                Intent intent = (Intent) this.o;
                lhd.w.e();
                be6 be6 = lhd.v;
                be6.getClass();
                be6.c.c(new ae6(be6, 0));
                xd6 xd6 = lhd.o;
                xd6.getClass();
                xd6.o.c(new x55((Object) xd6, (Object) intent, (Object) (Size) this.b, 7));
                return;
            case 3:
                t6e t6e = (t6e) this.c;
                EglBase eglBase = (EglBase) this.b;
                voc voc = (voc) this.o;
                t6e.h = eglBase;
                voc.log("SharedPeerConnectionFac", "create");
                t6e.c = "H264";
                voc.log("SharedPeerConnectionFac", "Preferred video codec: " + t6e.c);
                voc.log("SharedPeerConnectionFac", "Create internal peer connection factory ...");
                o60 o60 = new o60(voc);
                npg npg = new npg(21, (Object) o60, (Object) voc);
                JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(ContextUtils.getApplicationContext());
                grg grg = new grg(28);
                t6e.f = grg;
                t6e.g = builder.setAudioRecordSampleHook(grg).setAudioRecordStateCallback(o60).setAudioRecordErrorCallback(npg).setAudioTrackStateCallback(o60).setAudioTrackErrorCallback(o60).setUseSilenceProvider(true).createAudioDeviceModule();
                if (fbb.A().g) {
                    t6e.g.setMicrophoneMute(true);
                }
                ibb A = fbb.A();
                String str4 = "WebRTC-IntelVP8/Enabled/WebRTC-Audio-SendSideBwe/Enabled/WebRTC-SendSideBwe-WithOverhead/Enabled/WebRTC-FeedbackTimeout/Enabled/WebRTC-Bwe-SafeResetOnRouteChange/Enabled/".concat((A.a || A.b) ? "WebRTC-Audio-Red-For-Opus/Enabled-2/" : "WebRTC-Audio-Red-For-Opus/Disabled/") + "WebRTC-SpsPpsIdrIsH264Keyframe/Enabled/";
                String str5 = A.c;
                if (!TextUtils.isEmpty(str5)) {
                    str4 = str4 + "WebRTC-OK-StunCustomAttr/Enabled-" + str5 + "/";
                }
                String str6 = A.d;
                if (!TextUtils.isEmpty(str6)) {
                    str4 = str4 + "WebRTC-OK-TurnChannelDataMark/" + str6 + "/";
                }
                Integer num2 = A.e;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (intValue < 0) {
                        intValue = 1000;
                    }
                    str4 = str4 + "WebRTC-RttMult/Enabled-1.0," + intValue + "/";
                }
                String str7 = str4 + "WebRTC-Bwe-LossBasedBweV2/Enabled:true,CandidateFactors:1.02|1.0|0.95,DelayBasedCandidate:true,HigherBwBiasFactor:0.0002,HigherLogBwBiasFactor:0.02,ObservationDurationLowerBound:250ms,InstantUpperBoundBwBalance:75kbps,BwRampupUpperBoundFactor:1000000.0,InstantUpperBoundTemporalWeightFactor:0.9,TemporalWeightFactor:0.9,MaxIncreaseFactor:1.3,NewtonStepSize:0.75,InherentLossUpperBoundBwBalance:75kbps,LossThresholdOfHighBandwidthPreference:0.15,NotIncreaseIfInherentLossLessThanAverageLoss:true,_20230522/";
                if (A.f) {
                    str7 = str7 + "CallsSDK-Audio-EarlyStartPlayout/Enabled/";
                }
                if (A.g) {
                    str7 = str7 + "CallsSDK-Audio-EarlyStartRecording/Enabled/";
                }
                if (A.h) {
                    str7 = str7 + "WebRTC-IceFieldTrials/skip_relay_to_non_relay_connections:true/";
                }
                hbb hbb = A.j;
                if (hbb == null || !hbb.a) {
                    z3 = false;
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.areEqual((Object) hbb.c, (Object) bool2)) {
                        str7 = str7 + "CallsSDK-Audio-OpusFECWithDRED/Enabled/";
                    }
                    if (Intrinsics.areEqual((Object) hbb.b, (Object) bool2)) {
                        str7 = str7 + "CallsSDK-Audio-OpusNOLACE/Enabled/";
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Integer num3 = hbb.f;
                    if (num3 != null) {
                        str7 = str7 + "CallsSDK-Audio-OpusDREDByBitrate/Enabled:" + num3 + "/";
                    }
                    Integer num4 = hbb.e;
                    if (num4 != null) {
                        str7 = str7 + "CallsSDK-Audio-OpusAdapterMinBitrate/Enabled:" + num4 + "/";
                    }
                    if (Intrinsics.areEqual((Object) hbb.d, (Object) bool2)) {
                        str7 = str7 + ibb.a(z3);
                        z4 = true;
                    }
                }
                gbb b4 = A.b();
                Integer num5 = b4.b;
                int intValue2 = num5 != null ? num5.intValue() : 6;
                Integer num6 = b4.a;
                if (num6 != null) {
                    i10 = num6.intValue();
                }
                Boolean bool3 = b4.c;
                String str8 = str7 + "WebRTC-Audio-AdaptivePtime/enabled:true,min_payload_bitrate:" + intValue2 + "kbps,min_encoder_bitrate:" + i10 + "kbps,use_slow_adaptation:" + (bool3 != null ? bool3.booleanValue() : true) + "/";
                if (A.k && !z4) {
                    str8 = str8 + ibb.a(z3);
                }
                String str9 = A.l;
                if (!(str9 == null || str9.length() == 0)) {
                    str8 = str8 + str9;
                }
                voc.log("SharedPeerConnectionFac", "Field trials: " + str8);
                PeerConnectionFactory.initializeFieldTrials(str8);
                t6e.d = PeerConnectionFactory.builder().setVideoDecoderFactory(t6e.e).setVideoEncoderFactory(t6e.j).setAudioDeviceModule(t6e.g).createPeerConnectionFactory();
                if (t6e.d != null) {
                    voc.log("SharedPeerConnectionFac", ur9.c(t6e.d) + " was created");
                    boolean z5 = ur9.a ^ true;
                    voc.log("SharedPeerConnectionFac", "Is VIDEO HW acceleration enabled? ".concat(z5 ? "yes" : "no"));
                    if (z5 && eglBase != null) {
                        voc.log("SharedPeerConnectionFac", "Enable video hardware acceleration options for " + ur9.c(t6e.d));
                        return;
                    }
                    return;
                }
                throw new IllegalStateException();
            case 4:
                t6e t6e2 = (t6e) this.c;
                MediaProjection mediaProjection = (MediaProjection) this.o;
                t6e2.getClass();
                v48 v48 = ((d) this.b).x0;
                if (v48 != null) {
                    v48.j(true);
                }
                t6e2.g.startDeviceAudioShare(mediaProjection);
                return;
            case 5:
                o9e o9e = (o9e) this.c;
                boolean z6 = o9e.p;
                JSONObject jSONObject = (JSONObject) this.b;
                voc voc2 = o9e.b;
                if (!z6) {
                    voc2.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                    return;
                }
                try {
                    Iterator it2 = o9e.l.iterator();
                    while (it2.hasNext()) {
                        ((n9e) it2.next()).k(jSONObject);
                    }
                    return;
                } catch (JSONException e) {
                    voc2.reportException("OKSignaling", (String) this.o, e);
                    return;
                }
            case 6:
                StereoRoomManagerImpl.withInternalId$lambda$12((StereoRoomManagerImpl) this.c, (ParticipantId) this.b, (Function1) this.o);
                return;
            case 7:
                foe foe = ((eoe) this.c).a;
                if (foe.f != null) {
                    String str10 = (String) this.o;
                    boolean A2 = cvg.A(str10);
                    File file = (File) this.b;
                    if (!A2) {
                        po5 po5 = (po5) foe.e;
                        po5.getClass();
                        File y = cjf.y(po5.g(po5.b(), "stickerCache"), o5a.f(str10));
                        if (!y.exists() || !y.canRead()) {
                            try {
                                y.getParentFile().mkdirs();
                                j4b.m(file, y);
                            } catch (IOException unused) {
                            }
                        }
                        file = y;
                    }
                    foe.c(foe.f, file);
                    return;
                }
                return;
            case 8:
                ((g6d) this.c).l((q3f) this.b, (Map.Entry) this.o);
                return;
            case 9:
                c4f c4f = ((d4f) this.c).f;
                z3f z3f = c4f.b;
                if (z3f != null) {
                    Objects.toString(z3f);
                    c4f.b.d();
                }
                boolean z7 = c4f.x;
                z3f z3f2 = (z3f) this.b;
                if (z7) {
                    c4f.x = false;
                    z3f2.d();
                    z3f2.j.b((Object) null);
                    return;
                }
                c4f.b = z3f2;
                c4f.o = (u00) this.o;
                android.util.Size size2 = z3f2.b;
                c4f.a = size2;
                c4f.w = false;
                if (!c4f.a()) {
                    c4f.y.e.getHolder().setFixedSize(size2.getWidth(), size2.getHeight());
                    return;
                }
                return;
            case 10:
                prf prf = (prf) this.c;
                prf.getClass();
                k0d j15 = ((qb7) this.b).j();
                w28 w28 = prf.d;
                String str11 = (String) w28.c;
                String str12 = (String) w28.o;
                bpa bpa = prf.e;
                bpa.getClass();
                ExportException exportException = (ExportException) this.o;
                int i42 = exportException.a;
                lrf lrf = (lrf) bpa.b;
                if (i42 == 7003 && ((i9 = lrf.v) == 5 || i9 == 6 || i9 == 1 || i9 == 2 || i9 == 3 || i9 == 4)) {
                    lrf.s = null;
                    lrf.r = null;
                    wd5 wd5 = lrf.q;
                    wd5.b();
                    wd5.p = 6;
                    lrf.a(lrf);
                    return;
                }
                lrf.q.a.e(j15);
                wd5 wd52 = lrf.q;
                if (str11 != null) {
                    wd52.g = str11;
                }
                if (str12 != null) {
                    wd52.n = str12;
                }
                wd52.q = exportException;
                lrf.r = null;
                pbb pbb = new pbb(23, lrf, exportException);
                m56 m56 = lrf.f;
                m56.j(-1, pbb);
                m56.h();
                lrf.v = 0;
                return;
            case 11:
                UrlSharingListenerManagerImpl.saveUrlSharing$lambda$0((UrlSharingListenerManagerImpl) this.c, (gae) this.b, (zwd) this.o);
                return;
            case 12:
                zz7 zz7 = (zz7) this.c;
                byd byd = (byd) this.b;
                try {
                    try {
                        byd.n(((uu) this.o).apply(o5a.p(zz7)));
                        return;
                    } catch (Throwable th3) {
                        byd.m(th3);
                        return;
                    }
                } catch (CancellationException unused2) {
                    byd.cancel(false);
                    return;
                } catch (ExecutionException e2) {
                    Throwable th4 = e2;
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        th4 = cause;
                    }
                    byd.m(th4);
                    return;
                } catch (Error | RuntimeException e3) {
                    byd.m(e3);
                    return;
                }
            case 13:
                byd byd2 = (byd) this.c;
                Runnable runnable = (Runnable) this.b;
                Object obj = this.o;
                try {
                    if (!(byd2.a instanceof t0)) {
                        runnable.run();
                        byd2.l(obj);
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    byd2.m(th5);
                    return;
                }
            case Protos.Attaches.Attach.LOCATION /*14*/:
                bs0.r("Surface update cancellation should only occur on main thread.", ev0.s());
                ((AtomicBoolean) this.c).set(true);
                bwd bwd = (bwd) this.b;
                bt1 bt1 = (bt1) this.o;
                ((ArrayList) bwd.b.d).remove(bt1);
                bwd.e.remove(bt1);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((VideoFileRenderer) this.c).lambda$renderFrameOnRenderThread$1((VideoFrame.I420Buffer) this.b, (VideoFrame) this.o);
                return;
            case 16:
                m8g m8g = (m8g) this.c;
                m8g.getClass();
                int i43 = v0g.a;
                tc5 tc5 = ((nc5) m8g.b).a;
                tc5.getClass();
                wb4 wb4 = tc5.A0;
                td J = wb4.J();
                wb4.K(J, 1017, new lb4(J, (ea6) this.b, (ea4) this.o, 0));
                return;
            case LangUtils.HASH_SEED /*17*/:
                npg npg2 = (npg) this.c;
                npg2.getClass();
                int i44 = t0g.a;
                mc5 mc5 = (mc5) npg2.c;
                mc5.getClass();
                sc5 sc5 = mc5.a;
                sc5.getClass();
                vb4 vb4 = sc5.z0;
                sd P = vb4.P();
                vb4.Q(P, 1017, new db4(P, (ca6) this.b, (da4) this.o));
                return;
            case 18:
                n9d n9d = (n9d) this.b;
                w9d w9d = (w9d) this.o;
                o5h o5h = (o5h) this.c;
                Iterator it3 = ((CopyOnWriteArrayList) o5h.b).iterator();
                while (it3.hasNext()) {
                    r9d r9d = (r9d) it3.next();
                    try {
                        Long l2 = (Long) r9d.d.get(n9d);
                        if (l2 != null) {
                            r9d.b.log(r9d.a, "<- [" + l2 + "]: " + w9d);
                        }
                    } catch (Throwable th6) {
                        ((voc) o5h.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsuccess", th6);
                    }
                }
                return;
            case 19:
                n9d n9d2 = (n9d) this.b;
                Throwable th7 = (Throwable) this.o;
                o5h o5h2 = (o5h) this.c;
                Iterator it4 = ((CopyOnWriteArrayList) o5h2.b).iterator();
                while (it4.hasNext()) {
                    r9d r9d2 = (r9d) it4.next();
                    try {
                        Long l3 = (Long) r9d2.d.get(n9d2);
                        if (l3 != null) {
                            r9d2.b.log(r9d2.a, "<- [" + l3 + "]: " + th7);
                        }
                    } catch (Throwable th8) {
                        ((voc) o5h2.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th8);
                    }
                }
                return;
            case 20:
                ((d) this.b).a((Exception) this.o, (List) this.c);
                return;
            case 21:
                ((e0) this.b).a((e0.c) this.o, (List) this.c);
                return;
            case 22:
                ((e0) this.b).a((e0.a) this.o, (List) this.c);
                return;
            case 23:
                a();
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                b();
                return;
            default:
                ((y0) this.c).b((String) this.b, (MyTrackerConfig.OkHttpClientProvider) this.o);
                return;
        }
    }

    public /* synthetic */ o6d(z6d z6d, HashSet hashSet, p79 p79) {
        this.a = 1;
        this.b = z6d;
        this.c = hashSet;
        this.o = p79;
    }

    public /* synthetic */ o6d(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.o = obj3;
    }

    public /* synthetic */ o6d(List list, z6d z6d) {
        this.a = 0;
        oa9 oa9 = oa9.READ;
        this.c = list;
        this.b = z6d;
        this.o = oa9;
    }
}

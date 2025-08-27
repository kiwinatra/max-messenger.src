package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.SystemClock;
import com.android.installreferrer.api.ReferrerDetails;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.obfuscated.a;
import com.my.tracker.obfuscated.a1;
import com.my.tracker.obfuscated.b3;
import com.my.tracker.obfuscated.d;
import com.my.tracker.obfuscated.e0;
import com.my.tracker.obfuscated.n;
import com.my.tracker.obfuscated.n0;
import com.my.tracker.obfuscated.n1;
import com.my.tracker.obfuscated.p0;
import com.my.tracker.obfuscated.w2;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.util.LangUtils;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.tamtam.nano.Protos;

/* renamed from: l8g  reason: default package */
public final /* synthetic */ class l8g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        fa4 fa4;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i2;
        fa4 fa42;
        int i3 = 0;
        int i4 = 1;
        switch (this.a) {
            case 0:
                m8g m8g = (m8g) this.b;
                m8g.getClass();
                int i5 = v0g.a;
                wb4 wb4 = ((nc5) m8g.b).a.A0;
                td J = wb4.J();
                wb4.K(J, 1019, new gb4(J, (String) this.c, 1));
                return;
            case 1:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                return;
            case 2:
                WatchTogetherListenerManagerImpl.sendActualState$lambda$5((WatchTogetherListenerManagerImpl) this.b, (WatchTogetherListener) this.c);
                return;
            case 3:
                uog uog = (uog) this.b;
                cyd cyd = (cyd) this.c;
                if (!(uog.a.a instanceof u0)) {
                    cyd.l(uog.o.getForegroundInfoAsync());
                    return;
                } else {
                    cyd.cancel(true);
                    return;
                }
            case 4:
                ((ipg) this.b).i((apg) this.c);
                return;
            case 5:
                ((ipg) this.b).a((hqg) this.c, false);
                return;
            case 6:
                zz7 zz7 = (zz7) this.c;
                if (((mqg) this.b).z0.a instanceof u0) {
                    zz7.cancel(true);
                    return;
                }
                return;
            case 7:
                l8g.super.invalidateDrawable((Drawable) this.c);
                return;
            case 8:
                ((ZoomableDraweeView) ((j5) this.b).c).o((k97) this.c);
                return;
            case 9:
                ((ZoomableDraweeView) ((j5) this.b).c).n((Throwable) this.c);
                return;
            case 10:
                ((a) this.b).a((Activity) this.c);
                return;
            case 11:
                Object obj = this.c;
                lsg lsg = (lsg) this.b;
                lsg.getClass();
                try {
                    s9d s9d = lsg.d.c;
                    if (s9d != null) {
                        s9d.a(lsg.c, (w9d) obj);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    lsg.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsuccess", th);
                    return;
                }
            case 12:
                Throwable th2 = (Throwable) this.c;
                lsg lsg2 = (lsg) this.b;
                lsg2.getClass();
                try {
                    jo4 jo4 = lsg2.d.d;
                    if (jo4 != null) {
                        jo4.b(lsg2.c, th2);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    lsg2.a.reportException("ProtocolInfo", "rtc.command.handle.command.onerror", th3);
                    return;
                }
            case 13:
                ((a1) this.b).a((String) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Throwable th4 = (Throwable) this.c;
                o5h o5h = (o5h) this.b;
                Iterator it = ((CopyOnWriteArrayList) o5h.b).iterator();
                while (it.hasNext()) {
                    r9d r9d = (r9d) it.next();
                    try {
                        r9d.getClass();
                        r9d.b.log(r9d.a, "<- [?]: " + th4);
                    } catch (Throwable th5) {
                        ((voc) o5h.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommanderror", th5);
                    }
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((d) this.b).b((Intent) this.c);
                return;
            case 16:
                bug bug = (bug) this.b;
                osg osg = (osg) this.c;
                bug.l.incrementAndGet();
                bug.u.a();
                int i6 = osg.b;
                long j = bug.h;
                if (((long) i6) == 1 + j || j == -1 || i6 == 0) {
                    if ((osg.a & 1) != 0) {
                        fx fxVar = bug.A;
                        ((sjf) ((rjf) fxVar.b)).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Long l = (Long) fxVar.c;
                        if (l != null) {
                            long longValue = elapsedRealtime - l.longValue();
                            if (longValue > 1000) {
                                hf6 hf6 = (hf6) fxVar.o;
                                fxVar.o = new hf6(hf6.a + 1, hf6.b + longValue);
                            }
                        }
                        fxVar.c = Long.valueOf(elapsedRealtime);
                        if (bug.f != null) {
                            bug.a.log("DecoderWrapper", "received start @ seq " + osg.b + " queue: " + bug.f.c);
                            bug.n.incrementAndGet();
                        }
                        bug.m.incrementAndGet();
                        bug.b();
                        bug.f = new jla(bug, osg);
                    } else {
                        jla jla = bug.f;
                        if (jla != null) {
                            jla.d |= (osg.a & 4) != 0;
                            while (true) {
                                int min = Math.min(osg.e.remaining(), ((bug) jla.f).c.length);
                                if (min == 0) {
                                    jla.c++;
                                } else {
                                    osg.e.get(((bug) jla.f).c, 0, min);
                                    ((ByteArrayOutputStream) jla.e).write(((bug) jla.f).c, 0, min);
                                }
                            }
                        }
                    }
                    if ((osg.a & 2) != 0) {
                        bug.o.incrementAndGet();
                        bug.v.a();
                        jla jla2 = bug.f;
                        if (jla2 == null) {
                            bug.a.log("DecoderWrapper", "unexpected: trying to deliver 0 packets as frame");
                        } else {
                            int i7 = jla2.b;
                            if (i7 != bug.D || (fa42 = bug.g) == null || fa42.y) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                                long j2 = bug.i;
                                if (j2 == 0 || elapsedRealtime2 - j2 >= bug.G) {
                                    bug.i = elapsedRealtime2;
                                    String str = htg.a[tr1.y(i7)] != 1 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                                    int length = codecInfos.length;
                                    int i8 = 0;
                                    MediaCodecInfo mediaCodecInfo = null;
                                    MediaCodecInfo mediaCodecInfo2 = null;
                                    while (i8 < length) {
                                        MediaCodecInfo mediaCodecInfo3 = codecInfos[i8];
                                        if (!mediaCodecInfo3.isEncoder()) {
                                            String[] supportedTypes = mediaCodecInfo3.getSupportedTypes();
                                            int length2 = supportedTypes.length;
                                            while (i3 < length2) {
                                                if (supportedTypes[i3].equalsIgnoreCase(str)) {
                                                    String name = mediaCodecInfo3.getName();
                                                    String[] strArr = bug.F;
                                                    mediaCodecInfoArr = codecInfos;
                                                    int length3 = strArr.length;
                                                    i = length;
                                                    int i9 = 0;
                                                    while (true) {
                                                        if (i9 < length3) {
                                                            int i10 = length3;
                                                            if (name.startsWith(strArr[i9])) {
                                                                i2 = 1;
                                                            } else {
                                                                i9++;
                                                                length3 = i10;
                                                            }
                                                        } else {
                                                            i2 = 1;
                                                            if (mediaCodecInfo == null) {
                                                                mediaCodecInfo = mediaCodecInfo3;
                                                            }
                                                        }
                                                    }
                                                    if (mediaCodecInfo2 == null) {
                                                        mediaCodecInfo2 = mediaCodecInfo3;
                                                    }
                                                } else {
                                                    mediaCodecInfoArr = codecInfos;
                                                    i = length;
                                                    i2 = i4;
                                                }
                                                i3 += i2;
                                                i4 = i2;
                                                codecInfos = mediaCodecInfoArr;
                                                length = i;
                                            }
                                        }
                                        MediaCodecInfo[] mediaCodecInfoArr2 = codecInfos;
                                        int i11 = i4;
                                        i8 += i11;
                                        i4 = i11;
                                        codecInfos = mediaCodecInfoArr2;
                                        length = length;
                                        i3 = 0;
                                    }
                                    if (mediaCodecInfo == null) {
                                        mediaCodecInfo = mediaCodecInfo2;
                                    }
                                    if (mediaCodecInfo != null) {
                                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                        if (!(capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null)) {
                                            bug.a.log("DecoderWrapper", "selecting " + mediaCodecInfo.getName());
                                            Integer upper = videoCapabilities.getSupportedWidths().getUpper();
                                            int upper2 = videoCapabilities.getSupportedHeightsFor(upper.intValue()).getUpper();
                                            if (upper2 == null) {
                                                upper2 = 240;
                                            }
                                            bug.j = upper;
                                            bug.k = upper2;
                                            bug.a.log("DecoderWrapper", "supports up to " + upper + "x" + upper2);
                                        }
                                        fa4 fa43 = bug.g;
                                        if (fa43 != null) {
                                            fa43.a();
                                            bug.g = null;
                                            bug.D = 0;
                                        }
                                        bug.D = i7;
                                        bug.g = new fa4(bug, i7, bug.b, bug.a);
                                    }
                                }
                            }
                            if (bug.g != null) {
                                if (bug.z.get() > 4000000) {
                                    fa4 fa44 = bug.g;
                                    fa44.z = true;
                                    fa44.Z.set(fa44.Y.get());
                                    bug.r.incrementAndGet();
                                    bug.B = true;
                                } else {
                                    jla jla3 = bug.f;
                                    boolean z = jla3.d;
                                    if (!bug.B || z) {
                                        bug.B = false;
                                        byte[] byteArray = ((ByteArrayOutputStream) jla3.e).toByteArray();
                                        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(byteArray.length);
                                        nativeAllocateByteBuffer.limit(byteArray.length);
                                        nativeAllocateByteBuffer.put(byteArray);
                                        nativeAllocateByteBuffer.rewind();
                                        bug.y.incrementAndGet();
                                        bug.z.addAndGet(nativeAllocateByteBuffer.capacity());
                                        EncodedImage createEncodedImage = EncodedImage.builder().setBuffer(nativeAllocateByteBuffer, new gc(13)).setCaptureTimeNs(SystemClock.elapsedRealtimeNanos()).setEncodedWidth(bug.j.intValue()).setEncodedHeight(bug.k.intValue()).setFrameType(z ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta).createEncodedImage();
                                        fa4 fa45 = bug.g;
                                        if (fa45 != null) {
                                            EncodedImage.FrameType frameType = createEncodedImage.frameType;
                                            EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
                                            boolean z2 = frameType == frameType2;
                                            boolean z3 = !z2;
                                            if (!fa45.z || !z3) {
                                                int i12 = fa45.X.get();
                                                if (i12 > 30 || (i12 > 25 && z3)) {
                                                    fa45.x0.r.incrementAndGet();
                                                    bug bug2 = fa45.x0;
                                                    ByteBuffer byteBuffer = createEncodedImage.buffer;
                                                    bug2.y.decrementAndGet();
                                                    byteBuffer.rewind();
                                                    bug2.z.addAndGet(-byteBuffer.capacity());
                                                    JniCommon.nativeFreeByteBuffer(byteBuffer);
                                                    fa45.z = true;
                                                    fa45.Z.set(fa45.Y.get());
                                                } else {
                                                    fa45.z = false;
                                                    if (z2) {
                                                        fa45.Y.incrementAndGet();
                                                    }
                                                    int i13 = fa45.Y.get();
                                                    fa45.X.incrementAndGet();
                                                    fa45.v.post(new kh1((Object) fa45, (Object) createEncodedImage, i13, 5));
                                                }
                                            } else {
                                                fa45.x0.r.incrementAndGet();
                                                bug bug3 = fa45.x0;
                                                ByteBuffer byteBuffer2 = createEncodedImage.buffer;
                                                bug3.y.decrementAndGet();
                                                byteBuffer2.rewind();
                                                bug3.z.addAndGet(-byteBuffer2.capacity());
                                                JniCommon.nativeFreeByteBuffer(byteBuffer2);
                                            }
                                            if (createEncodedImage.frameType == frameType2) {
                                                bug.p.incrementAndGet();
                                            }
                                            if (createEncodedImage.frameType == EncodedImage.FrameType.VideoFrameDelta) {
                                                bug.q.incrementAndGet();
                                            }
                                        } else {
                                            bug.y.decrementAndGet();
                                            nativeAllocateByteBuffer.rewind();
                                            bug.z.addAndGet(-nativeAllocateByteBuffer.capacity());
                                            JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                                            bug.r.incrementAndGet();
                                        }
                                    } else {
                                        bug.r.incrementAndGet();
                                    }
                                }
                            }
                        }
                        bug.b();
                    }
                    if ((osg.a & 8) != 0 && (fa4 = bug.g) != null) {
                        fa4.a();
                        bug.g = null;
                        bug.D = 0;
                        return;
                    }
                    return;
                }
                voc voc = bug.a;
                StringBuilder sb = new StringBuilder("dropping ");
                sb.append(osg.b);
                sb.append(" due to seq (");
                voc.log("DecoderWrapper", wj6.m(sb, bug.h, ")"));
                bug.n.incrementAndGet();
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((e0) this.b).b((e0.a) this.c);
                return;
            case 18:
                ((e0) this.b).b((b3) this.c);
                return;
            case 19:
                ((e0) this.b).a((String) this.c);
                return;
            case 20:
                ((e0) this.b).b((e0.c) this.c);
                return;
            case 21:
                ((e0) this.b).a((Boolean) this.c);
                return;
            case 22:
                n.a((MyTracker.AttributionListener) this.b, (MyTrackerAttribution) this.c);
                return;
            case 23:
                ((n0) this.b).a((List) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                ((n1) this.b).b((List) this.c);
                return;
            case 25:
                ((p0) this.b).b((ReferrerDetails) this.c);
                return;
            default:
                ((w2) this.b).a((Runnable) this.c);
                return;
        }
    }
}

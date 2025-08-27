package defpackage;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlin.uuid.Uuid;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.deeplink.InvalidDeeplinkNamingException;
import one.me.sdk.uikit.common.views.MaxHeightScrollView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.messages.contacts.picker.FrgContactMultiPicker;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: zqd  reason: default package */
public final class zqd implements v2f, ojb, n8b, xra, ima, z59, pi8, ssb, s9f, gce, oie, nj6, dnd, CapturerObserver {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ zqd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static zqd t(yb0 yb0) {
        wa0 wa0 = wa0.c;
        bs0.q(yb0, "quality cannot be null");
        bs0.q(wa0, "fallbackStrategy cannot be null");
        boolean contains = yb0.k.contains(yb0);
        bs0.m("Invalid quality: " + yb0, contains);
        return new zqd(Collections.singletonList(yb0), wa0);
    }

    public static zqd u(List list, wa0 wa0) {
        bs0.q(list, "qualities cannot be null");
        bs0.m("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yb0 yb0 = (yb0) it.next();
            boolean contains = yb0.k.contains(yb0);
            bs0.m("qualities contain invalid quality: " + yb0, contains);
        }
        return new zqd(list, wa0);
    }

    public void A(boolean z) {
        w35 w35 = (w35) ((y15) this.c).a.b;
        if (w35.w != z) {
            if (w35.c != null) {
                s15 a2 = s15.a();
                u35 u35 = w35.c;
                a2.getClass();
                bs0.q(u35, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.b.remove(u35);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            w35.w = z;
            if (z) {
                w35.a(w35.a, s15.a().b());
            }
        }
    }

    public void B(ConversationEndReason conversationEndReason) {
        if (conversationEndReason != null) {
            ConversationEndReason conversationEndReason2 = (ConversationEndReason) this.c;
            voc voc = (voc) this.b;
            if (conversationEndReason2 == null) {
                this.c = conversationEndReason;
                voc.log("CallEndInfoHolder", "set end reason " + conversationEndReason);
                return;
            }
            voc.log("CallEndInfoHolder", "warning: trying to replace end reason from " + conversationEndReason2 + " to " + conversationEndReason);
        }
    }

    public void C(og9 og9) {
        xme xme = (xme) this.b;
        pg9 pg9 = (pg9) xme.getValue();
        if (og9 == og9.o) {
            if ((pg9 != null ? pg9.a : null) != og9.b) {
                return;
            }
        }
        if (og9 == null) {
            og9 og92 = pg9 != null ? pg9.a : null;
            og9 og93 = og9.b;
            og9 = og92 == og93 ? og9.c : og93;
        }
        pg9 pg92 = new pg9(og9);
        xme.getClass();
        xme.m((Object) null, pg92);
    }

    public void a(Object obj) {
        switch (this.a) {
            case 16:
                ((pi8) this.b).a(obj);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ((gce) this.b).a(obj);
                return;
            default:
                bs0.r("Unexpected result from SurfaceRequest. Surface was provided twice.", ((nc0) obj).a != 3);
                ((SurfaceTexture) this.b).release();
                mhf mhf = ((lhf) this.c).a;
                if (mhf.j != null) {
                    mhf.j = null;
                    return;
                }
                return;
        }
    }

    public void b() {
        ((pi8) this.b).b();
    }

    public void c(mq4 mq4) {
        switch (this.a) {
            case 16:
                qq4.e((AtomicReference) this.c, mq4);
                return;
            default:
                ((gce) this.b).c(mq4);
                return;
        }
    }

    public void d(rkf rkf, xf5 xf5, qtf qtf) {
    }

    /* JADX WARNING: type inference failed for: r1v40, types: [ibf, ovc] */
    public void e(ibf ibf) {
        ovc ovc;
        int indexOf;
        int indexOf2;
        ibf ibf2 = ibf;
        b7b b7b = (b7b) this.b;
        short s = b7b.d;
        s9a s9a = x3b.c;
        vvd vvd = (vvd) this.c;
        if (s == 1) {
            ybf ybf = (ybf) vvd.b.r;
            ybf.getClass();
            z68.c("ybf", "onPing", new Object[0]);
            pbf pbf = ybf.r;
            if (pbf != null) {
                ((zbf) ((wbf) pbf).m.getValue()).f();
            }
            xvd.b(vvd.b, new b7b((byte) 1, b7b.c, b7b.d, b7b.h, 0));
        } else if (s == 2) {
            ybf ybf2 = (ybf) vvd.b.r;
            ybf2.getClass();
            ybf2.a(new xbf(11, (Object) ybf2, (Object) (g94) ibf2));
        } else if (s == 20) {
            ybf ybf3 = (ybf) vvd.b.r;
            if (ybf3.r != null) {
                z68.c("ybf", "onLogout", new Object[0]);
                ((ExecutorService) ((wbf) ybf3.r).n.getValue()).execute(new mgd(26, ybf3));
            }
        } else if (s == 3) {
            boolean z = ibf2 == ibf.b;
            fba fba = vvd.b.r;
            if (z) {
                ? ibf3 = new ibf();
                ibf3.o = true;
                ovc = ibf3;
            } else {
                ovc = (ovc) ibf2;
            }
            ybf ybf4 = (ybf) fba;
            ybf4.getClass();
            String str = null;
            z68.c("ybf", "onReconnect: host=%s port=%s", (cvg.A(ovc.c) || (indexOf2 = ovc.c.indexOf(":")) <= 0) ? null : ovc.c.substring(0, indexOf2), ovc.d());
            if (!cvg.A(ovc.c)) {
                ltb ltb = (ltb) ybf4.a;
                a33 a33 = ltb.a;
                if (!cvg.A(ovc.c) && (indexOf = ovc.c.indexOf(":")) > 0) {
                    str = ovc.c.substring(0, indexOf);
                }
                a33.l("server.host", str);
                ltb.a.l("server.port", ovc.d());
                ltb.a.i("server.useTls", ovc.o);
            }
            wbf wbf = (wbf) ybf4.r;
            wbf.getClass();
            z68.c(wbf.q, "restart", new Object[0]);
            xvd xvd = (xvd) ((zbf) wbf.m.getValue()).f.get();
            if (xvd != null) {
                xvd.m(false);
            }
            ((ExecutorService) wbf.o.getValue()).execute(new mgd(25, wbf));
        } else {
            x3b x3b = x3b.NOTIF_MESSAGE;
            if (s == x3b.a) {
                ajd ajd = vvd.b.l;
                ajd.getClass();
                if (!((a33) ((x23) ajd.a.g(x23.class))).C()) {
                    kba kba = (kba) ibf2;
                    xvd xvd2 = vvd.b;
                    jw9 jw9 = new jw9(x3b, 2);
                    jw9.p(kba.c, ApiProtocol.PARAM_CHAT_ID);
                    b89 b89 = kba.v;
                    jw9.p(b89.a, "messageId");
                    if (b89.X == mf9.GROUP) {
                        jw9.t("chatType", "GROUP_CHAT");
                    }
                    xvd.b(xvd2, b7b.a(jw9, (byte) 1, b7b.c));
                    ybf ybf5 = (ybf) vvd.b.r;
                    ybf5.getClass();
                    ybf5.a(new xbf(6, (Object) ybf5, (Object) kba));
                }
            } else if (s == x3b.NOTIF_MARK.a) {
                ybf ybf6 = (ybf) vvd.b.r;
                ybf6.getClass();
                ybf6.a(new xbf(4, (Object) ybf6, (Object) (iba) ibf2));
                ((zbf) ((wbf) ybf6.r).m.getValue()).f();
            } else if (s == x3b.NOTIF_TYPING.a) {
                ybf ybf7 = (ybf) vvd.b.r;
                ybf7.getClass();
                ybf7.a(new xbf(0, (Object) ybf7, (Object) (dca) ibf2));
            } else if (s == x3b.NOTIF_PRESENCE.a) {
                ybf ybf8 = (ybf) vvd.b.r;
                ybf8.getClass();
                ybf8.a(new xbf(8, (Object) ybf8, (Object) (cca) ibf2));
            } else if (s == x3b.NOTIF_CONTACT.a) {
                ybf ybf9 = (ybf) vvd.b.r;
                ybf9.getClass();
                ybf9.a(new p00(25, ybf9, (zaa) ibf2));
            } else if (s == x3b.NOTIF_CONFIG.a) {
                ybf ybf10 = (ybf) vvd.b.r;
                ybf10.getClass();
                ybf10.a(new p00(26, ybf10, (xaa) ibf2));
            } else if (s == x3b.NOTIF_CHAT.a) {
                ybf ybf11 = (ybf) vvd.b.r;
                ybf11.getClass();
                ybf11.a(new p00(29, ybf11, (vaa) ibf2));
            } else if (s == x3b.NOTIF_ATTACH.a) {
                ybf ybf12 = (ybf) vvd.b.r;
                ybf12.getClass();
                ybf12.a(new xbf(5, (Object) ybf12, (Object) (raa) ibf2));
            } else if (s == x3b.NOTIF_CALL_START.a) {
                saa saa = (saa) ibf2;
                ybf ybf13 = (ybf) vvd.b.r;
                if (!((opa) ybf13.l.getValue()).a()) {
                    ybf13.a(new xbf(12, (Object) ybf13, (Object) new sf1(saa.v, saa.w, saa.c, "", "", saa.z == 3, saa.o)));
                }
            } else if (s == x3b.NOTIF_CONTACT_SORT.a) {
                ybf ybf14 = (ybf) vvd.b.r;
                ybf14.getClass();
                ybf14.a(new xbf(1, (Object) ybf14, (Object) (aba) ibf2));
            } else if (s == x3b.NOTIF_MSG_DELETE_RANGE.a) {
                ybf ybf15 = (ybf) vvd.b.r;
                ybf15.getClass();
                ybf15.a(new xbf(13, (Object) ybf15, (Object) (xba) ibf2));
            } else if (s == x3b.NOTIF_MSG_DELETE.a) {
                ybf ybf16 = (ybf) vvd.b.r;
                ybf16.getClass();
                ybf16.a(new p00(27, ybf16, (uba) ibf2));
            } else if (s == x3b.NOTIF_MSG_REACTIONS_CHANGED.a) {
                ybf ybf17 = (ybf) vvd.b.r;
                ybf17.getClass();
                ybf17.a(new xbf(9, (Object) ybf17, (Object) (zba) ibf2));
            } else if (s == x3b.NOTIF_MSG_YOU_REACTED.a) {
                ybf ybf18 = (ybf) vvd.b.r;
                ybf18.getClass();
                ybf18.a(new xbf(2, (Object) ybf18, (Object) (bca) ibf2));
            } else if (s == x3b.NOTIF_CALLBACK_ANSWER.a) {
                ybf ybf19 = (ybf) vvd.b.r;
                ybf19.getClass();
                ybf19.a(new xbf(3, (Object) ybf19, (Object) (taa) ibf2));
            } else if (s == x3b.NOTIF_LOCATION_REQUEST.a) {
                ybf ybf20 = (ybf) vvd.b.r;
                ybf20.getClass();
                ybf20.a(new ivc(6, ybf20));
            } else if (s == x3b.NOTIF_LOCATION.a) {
                ybf ybf21 = (ybf) vvd.b.r;
                ybf21.getClass();
                ybf21.a(new p00(24, ybf21, (gba) ibf2));
            } else if (s == x3b.NOTIF_ASSETS_UPDATE.a) {
                ybf ybf22 = (ybf) vvd.b.r;
                ybf22.getClass();
                ybf22.a(new xbf(7, (Object) ybf22, (Object) (qaa) ibf2));
            } else if (s == x3b.NOTIF_DRAFT.a) {
                ybf ybf23 = (ybf) vvd.b.r;
                ybf23.getClass();
                ybf23.a(new xbf(10, (Object) ybf23, (Object) (cba) ibf2));
            } else if (s == x3b.NOTIF_DRAFT_DISCARD.a) {
                ybf ybf24 = (ybf) vvd.b.r;
                ybf24.getClass();
                ybf24.a(new p00(28, ybf24, (dba) ibf2));
            } else if (s == x3b.NOTIF_MSG_DELAYED.a) {
                ybf ybf25 = (ybf) vvd.b.r;
                ybf25.getClass();
                ybf25.a(new p00(23, ybf25, (oba) ibf2));
            } else {
                x3b.c.getClass();
                String concat = "Illegal state in handleNotif, unknown opcode ".concat(s9a.f(s));
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(concat);
                z68.f(vvd.b.a, concat, illegalArgumentException);
                vvd.b.k(illegalArgumentException);
            }
        }
    }

    public void f(l8b l8b) {
        ntf ntf;
        if (l8b.u() == 0 && (l8b.u() & Uuid.SIZE_BITS) != 0) {
            l8b.H(6);
            int a2 = l8b.a() / 4;
            int i = 0;
            while (true) {
                ntf = (ntf) this.c;
                if (i >= a2) {
                    break;
                }
                ky1 ky1 = (ky1) this.b;
                l8b.e(0, ky1.b, 4);
                ky1.q(0);
                int i2 = ky1.i(16);
                ky1.t(3);
                if (i2 == 0) {
                    ky1.t(13);
                } else {
                    int i3 = ky1.i(13);
                    if (ntf.y.get(i3) == null) {
                        ntf.y.put(i3, new fnd(new mqf(ntf, i3)));
                        ntf.w0++;
                    }
                }
                i++;
            }
            if (ntf.a != 2) {
                ntf.y.remove(0);
            }
        }
    }

    public void g(Throwable th) {
        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
    }

    public y33 get(Object obj) {
        y33 y33 = ((z59) this.b).get(obj);
        b69 b69 = (b69) this.c;
        if (y33 == null) {
            b69.J(obj);
        } else {
            b69.G(obj);
        }
        return y33;
    }

    public int getSizeInBytes() {
        return ((z59) this.b).getSizeInBytes();
    }

    public void h(qaf qaf) {
        IllegalStateException illegalStateException = new IllegalStateException("illegal state in handleNotif, onFail", qaf.v);
        vvd vvd = (vvd) this.c;
        z68.f(vvd.b.a, "illegal state in handleNotif, onFail", illegalStateException);
        vvd.b.k(illegalStateException);
    }

    public void i() {
        ((MaxHeightScrollView) this.b).fullScroll(130);
    }

    public y33 j(Object obj, y33 y33) {
        ((b69) this.c).U(obj);
        return ((z59) this.b).j(obj, y33);
    }

    public bs5 k(long j) {
        Object obj;
        Iterator it = ((Set) ((AtomicReference) ((zc4) this.b).v).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((dkb) obj).a == j) {
                break;
            }
        }
        dkb dkb = (dkb) obj;
        return dkb == null ? s45.a : bs0.L(new on2(bs0.L(new on2(((cp3) ((Lazy) this.c).getValue()).c(), 16), new ct3(dkb, j, (Continuation) null)), 28), new dt3(j, (Continuation) null));
    }

    public boolean l(Preference preference) {
        PreferenceGroup preferenceGroup = (PreferenceGroup) this.b;
        preferenceGroup.c1 = IntCompanionObject.MAX_VALUE;
        ((btb) this.c).I(preference);
        preferenceGroup.getClass();
        return true;
    }

    public long m() {
        return 0;
    }

    public int n(psb psb) {
        return ((z59) this.b).n(psb);
    }

    public long o(long j) {
        ya8 ya8 = (ya8) this.b;
        Long l = (Long) ya8.f(j);
        if (l == null) {
            yl4 yl4 = (yl4) this.c;
            long j2 = yl4.b;
            yl4.b = 1 + j2;
            l = Long.valueOf(j2);
            ya8.i(j, l);
        }
        return l.longValue();
    }

    public void onCapturerStarted(boolean z) {
        b8g b8g = (b8g) this.c;
        ((voc) b8g.c).log("VideoRecord", "Capture started (success=" + z + "), notify listener");
        syc syc = b8g.x;
        if (syc != null) {
            ((v48) syc.b).g.execute(new vug(syc, z, !z));
        }
    }

    public void onCapturerStopped() {
        b8g b8g = (b8g) this.c;
        ((voc) b8g.c).log("VideoRecord", "Capture stopped, notify listener");
        syc syc = b8g.x;
        if (syc != null) {
            ((v48) syc.b).g.execute(new vug(syc, false, false));
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 16:
                ((pi8) this.b).onError(th);
                return;
            default:
                try {
                    ((tbe) this.c).c.accept(th);
                } catch (Throwable th2) {
                    hd8.Z(th2);
                    th = new CompositeException(th, th2);
                }
                ((gce) this.b).onError(th);
                return;
        }
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
    }

    public Uri p() {
        if (StringsKt__StringsJVMKt.startsWith$default((String) this.b, ":", false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.b);
            sb.append('?');
            Iterator it = ((ArrayList) this.c).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(Typography.amp);
            }
            sb.deleteCharAt(StringsKt.getLastIndex(sb));
            return y64.c(sb.toString(), "max", (String) null);
        }
        throw new InvalidDeeplinkNamingException((String) this.b);
    }

    public void q(Task task) {
        boolean h = task.h();
        Continuation continuation = (Continuation) this.c;
        xt6 xt6 = (xt6) this.b;
        if (!h) {
            z68.f(xt6.b, "Fetching FCM registration token failed", task.e());
            continuation.resumeWith(Result.m23constructorimpl((Object) null));
            return;
        }
        Object f = task.f();
        if (f != null) {
            z68.c(xt6.b, "FCM token fetched", new Object[0]);
            continuation.resumeWith(Result.m23constructorimpl((String) f));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tze r(long r19, java.util.ArrayList r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.mtb r25, defpackage.erd r26) {
        /*
            r18 = this;
            r0 = r18
            r1 = r21
            r9 = r23
            int r2 = r21.size()
            if (r2 != 0) goto L_0x0023
            tze r10 = new tze
            sze r3 = defpackage.sze.a
            java.lang.String r6 = ""
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0 = r10
            r1 = r19
            r7 = r24
            r8 = r25
            r9 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r10
        L_0x0023:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = defpackage.cvg.A(r22)
            java.lang.Object r5 = r0.b
            tld r5 = (defpackage.tld) r5
            r6 = 0
            if (r3 != 0) goto L_0x0040
            r3 = r22
            boolean r7 = r5.h(r3, r9)
            if (r7 == 0) goto L_0x0042
            r8 = r3
            goto L_0x0061
        L_0x0040:
            r3 = r22
        L_0x0042:
            java.util.Iterator r7 = r21.iterator()
        L_0x0046:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0060
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r10 = defpackage.cvg.c(r8, r4)
            if (r10 == 0) goto L_0x0059
            goto L_0x0046
        L_0x0059:
            boolean r10 = r5.h(r8, r9)
            if (r10 == 0) goto L_0x0046
            goto L_0x0061
        L_0x0060:
            r8 = r6
        L_0x0061:
            boolean r5 = defpackage.cvg.A(r8)
            r7 = 1
            if (r5 == 0) goto L_0x0095
            boolean r5 = defpackage.cvg.A(r22)
            if (r5 != 0) goto L_0x0070
            r5 = r3
            goto L_0x0096
        L_0x0070:
            java.util.Iterator r5 = r21.iterator()
        L_0x0074:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0091
            java.lang.Object r8 = r5.next()
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x008a }
            boolean r10 = defpackage.cvg.c(r10, r4)     // Catch:{ all -> 0x008a }
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x0074
            r6 = r8
            goto L_0x0091
        L_0x008a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0091:
            java.lang.String r6 = (java.lang.String) r6
            r5 = r6
            goto L_0x0096
        L_0x0095:
            r5 = r8
        L_0x0096:
            boolean r6 = defpackage.cvg.A(r22)
            if (r6 != 0) goto L_0x00a7
            erd r6 = defpackage.erd.a
            r8 = r26
            if (r8 != r6) goto L_0x00a7
            java.lang.String r1 = r22.trim()
            goto L_0x00b1
        L_0x00a7:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.trim()
        L_0x00b1:
            ta9 r2 = new ta9
            sa9 r14 = defpackage.sa9.a
            int r16 = r1.length()
            r13 = 0
            r15 = 0
            r17 = 0
            r10 = r2
            r11 = r19
            r10.<init>(r11, r13, r14, r15, r16, r17)
            boolean r3 = defpackage.cvg.A(r22)
            if (r3 == 0) goto L_0x00dc
            boolean r3 = defpackage.cvg.A(r1)
            if (r3 != 0) goto L_0x00d9
            java.lang.Object r0 = r0.c
            yva r0 = (defpackage.yva) r0
            java.lang.CharSequence r0 = r0.b(r1, r2, r7, r7)
        L_0x00d7:
            r6 = r0
            goto L_0x00dd
        L_0x00d9:
            java.lang.String r0 = ""
            goto L_0x00d7
        L_0x00dc:
            r6 = r1
        L_0x00dd:
            tze r10 = new tze
            sze r3 = defpackage.sze.a
            r0 = r10
            r1 = r19
            r7 = r24
            r8 = r25
            r9 = r23
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqd.r(long, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, mtb, erd):tze");
    }

    public Object s(Uri uri, l74 l74) {
        so5 so5 = (so5) ((n8b) this.b).s(uri, l74);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? so5 : (so5) so5.a(list);
    }

    public String toString() {
        switch (this.a) {
            case 21:
                return "QualitySelector{preferredQualities=" + ((List) this.b) + ", fallbackStrategy=" + ((wa0) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public KeyListener v(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((y15) this.c).a.getClass();
        if (keyListener instanceof j25) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new j25(keyListener);
    }

    /* JADX INFO: finally extract failed */
    public void w(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.b).getContext().obtainStyledAttributes(attributeSet, koc.AppCompatTextView, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(koc.AppCompatTextView_emojiCompatEnabled)) {
                z = obtainStyledAttributes.getBoolean(koc.AppCompatTextView_emojiCompatEnabled, true);
            }
            obtainStyledAttributes.recycle();
            A(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void x(long j) {
        ((FrgContactMultiPicker) this.c).J1.stream().filter(new wg6(j, 1)).findFirst().ifPresent(new xg6(1, this));
    }

    public cae y(JSONObject jSONObject, zwd zwd) {
        w8b w8b;
        try {
            jSONObject.optBoolean("markerFound");
            jSONObject.optInt("countBefore");
            jSONObject.optInt("countAfter");
            JSONArray optJSONArray = jSONObject.optJSONArray("participants");
            if (optJSONArray != null) {
                w8b = ((qpg) this.c).q(optJSONArray, zwd);
            } else {
                List emptyList = CollectionsKt.emptyList();
                SetsKt.emptySet();
                w8b = new w8b(emptyList, CollectionsKt.emptyList());
            }
            return new cae(w8b);
        } catch (JSONException e) {
            ((voc) this.b).logException("ParticipantListChunkParser", "Can't parse participant chunk", e);
            return null;
        }
    }

    public void z(Object obj, String str) {
        ((ArrayList) this.c).add(str + "=" + obj);
    }

    public /* synthetic */ zqd(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ zqd(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ zqd(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public zqd(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = 0;
        this.b = oneMeRoomDatabase;
        this.c = new li(oneMeRoomDatabase, 23);
    }

    public Object get() {
        z90 z90 = (z90) this.b;
        int i = z90.c;
        if (i == -1) {
            i = 5;
        }
        int i2 = z90.b;
        if (i2 == -1) {
            i2 = 2;
        }
        qa0 qa0 = (qa0) this.c;
        int i3 = qa0.e;
        int i4 = z90.e;
        if (i4 != -1) {
            i3 = i4;
        }
        int y = te8.y(z90.d, i3, i2, qa0.d);
        List list = y90.e;
        eud eud = new eud(2);
        eud.b = -1;
        eud.c = -1;
        eud.o = -1;
        eud.v = -1;
        eud.b = Integer.valueOf(i);
        eud.v = Integer.valueOf(i2);
        eud.o = Integer.valueOf(i3);
        eud.c = Integer.valueOf(y);
        return eud.e();
    }

    public zqd(int i) {
        this.a = i;
        switch (i) {
            case 10:
                this.b = new AtomicBoolean(false);
                return;
            case 11:
                xme a2 = f6e.a((Object) null);
                this.b = a2;
                this.c = new etc(a2);
                return;
            default:
                this.b = "";
                this.c = new ArrayList();
                return;
        }
    }

    public zqd(ic3 ic3) {
        this.a = 5;
        Lazy lazy = rjd.r0;
        this.b = ic3;
        this.c = lazy;
    }

    public zqd(ExecutorService executorService) {
        this.a = 22;
        this.c = new qae(0);
        this.b = executorService;
    }

    public zqd(EditText editText) {
        this.a = 2;
        this.b = editText;
        this.c = new y15(editText, false);
    }

    public zqd(yl4 yl4) {
        this.a = 25;
        this.c = yl4;
        this.b = new ya8();
    }

    public zqd(List list, wa0 wa0) {
        this.a = 21;
        bs0.m("No preferred quality and fallback strategy.", !list.isEmpty() || wa0 != wa0.c);
        this.b = Collections.unmodifiableList(new ArrayList(list));
        this.c = wa0;
    }

    public zqd(ntf ntf) {
        this.a = 28;
        this.c = ntf;
        this.b = new ky1(new byte[4], (byte) 0, 4, 2);
    }
}

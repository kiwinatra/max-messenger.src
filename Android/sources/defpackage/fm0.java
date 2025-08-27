package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.messages.calls.views.CallGridView;
import ru.ok.messages.calls.views.CallLinkCreatedView;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: fm0  reason: default package */
public final /* synthetic */ class fm0 implements op7, qk3, yi6, ApplicationNameProvider, g61, zi6, aub, wv9, osb {
    public final /* synthetic */ int a;

    public /* synthetic */ fm0(int i) {
        this.a = i;
    }

    public static Bitmap b(int i, byte[] bArr) {
        try {
            return b0h.p(bArr, i, (BitmapFactory.Options) null);
        } catch (ParserException e) {
            throw new Exception("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i + ")", e);
        } catch (IOException e2) {
            throw new Exception(e2);
        }
    }

    public boolean a(TotalCaptureResult totalCaptureResult) {
        switch (this.a) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return u40.f(totalCaptureResult, false);
            case 16:
                return u40.f(totalCaptureResult, false);
            default:
                return u40.f(totalCaptureResult, true);
        }
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                z68.f("mq0", "Failed to delete all botCommands", (Throwable) obj);
                return;
            case 3:
                z68.f("mq0", "Failed to store botCommands", (Throwable) obj);
                return;
            case 6:
                z68.f("wx0", "onViewCreated: failed", (Throwable) obj);
                return;
            case 9:
                int i = CallGridView.w0;
                z68.f("ru.ok.messages.calls.views.CallGridView", "init: failed to process priorities", (Throwable) obj);
                return;
            case 11:
                int i2 = CallLinkCreatedView.O0;
                z68.f("ru.ok.messages.calls.views.CallLinkCreatedView", "showLoading: failed", (Throwable) obj);
                return;
            case 13:
                z68.f("gc1", "loadInternal: failed", (Throwable) obj);
                return;
            case 21:
                ((w62) obj).L = 0;
                return;
            case 22:
                z68.f("r62", "updateChatLastSearchClickTimeAsync: failed", (Throwable) obj);
                return;
            case 23:
                z68.f("r62", "updateChatWriteTimeAsync: failed", (Throwable) obj);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                z68.f("r62", "error while localRemoveChat", (Throwable) obj);
                return;
            default:
                ((w62) obj).m0 = null;
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                return ((tf5) obj).m().getClass().getSimpleName();
            case 12:
                gb1 gb1 = (gb1) obj;
                return new tp1(new gb1(gb1.c, gb1.a, gb1.b));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Throwable th = (Throwable) obj;
                return lbe.h(Collections.emptyList());
            case 26:
                List list = (List) obj;
                return list.isEmpty() ? uh8.a : nh8.e(list);
            case 27:
                jc2 jc2 = (jc2) obj;
                jc2.getClass();
                return new qa3(2, new fc2(0, jc2));
            case 28:
                List list2 = (List) obj;
                return list2.isEmpty() ? uh8.a : nh8.e(list2);
            default:
                return ((OneMeRoomDatabase) obj).w();
        }
    }

    public void c(z3f z3f) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(z3f.b.getWidth(), z3f.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        z3f.b(surface, ryg.j(), new pv1(0, (Object) surface, (Object) surfaceTexture));
    }

    public String getName() {
        return "";
    }

    public Object m(pf9 pf9) {
        int i;
        String str;
        pf9 pf92 = pf9;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            i = ryg.e0(pf9);
        } catch (Throwable th) {
            Throwable th2 = th;
            z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = ytd.a.iterator();
            while (it.hasNext()) {
                ((xm) it.next()).a(th2);
            }
            xtd.a.getClass();
            int ordinal = xtd.b.ordinal();
            if (ordinal == 0) {
                i = 0;
            } else if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            T t = null;
            try {
                str = ryg.g0(pf9);
            } catch (Throwable th3) {
                z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = ytd.a.iterator();
                while (it2.hasNext()) {
                    ((xm) it2.next()).a(th3);
                }
                xtd.a.getClass();
                int ordinal2 = xtd.b.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                Unit unit2 = Unit.INSTANCE;
                try {
                    int hashCode = str.hashCode();
                    if (hashCode != -1900987004) {
                        if (hashCode != 3355) {
                            if (hashCode != 92902992) {
                                if (hashCode == 1133704324) {
                                    if (str.equals("permissions")) {
                                        i2 = ryg.c0(pf9);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                }
                            } else if (str.equals("alias")) {
                                t = ryg.g0(pf9);
                                objectRef.element = t;
                                Unit unit32 = Unit.INSTANCE;
                            }
                        } else if (str.equals("id")) {
                            j = ryg.d0(pf92, 0);
                            Unit unit322 = Unit.INSTANCE;
                        }
                    } else if (str.equals("inviterId")) {
                        j2 = ryg.d0(pf92, 0);
                        Unit unit3222 = Unit.INSTANCE;
                    }
                    pf9.A();
                } catch (Throwable th4) {
                    z68.o("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = ytd.a.iterator();
                    while (it3.hasNext()) {
                        ((xm) it3.next()).a(th4);
                    }
                    xtd.a.getClass();
                    int ordinal3 = xtd.b.ordinal();
                    if (ordinal3 != 0) {
                        if (ordinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
                Unit unit32222 = Unit.INSTANCE;
            }
        }
        Unit unit4 = Unit.INSTANCE;
        return new cb(i2, j, j2, (String) objectRef.element);
    }

    public Object parse(sp7 sp7) {
        switch (this.a) {
            case 0:
                return BatchInternalIdResponse.parse(sp7);
            default:
                return CallInfo.parse(sp7);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r2.m();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean test(java.lang.Object r2) {
        /*
            r1 = this;
            a32 r2 = (defpackage.a32) r2
            boolean r1 = r2.N()
            r0 = 1
            if (r1 != 0) goto L_0x000a
            goto L_0x0018
        L_0x000a:
            vk3 r1 = r2.m()
            if (r1 == 0) goto L_0x0018
            boolean r1 = r1.w()
            if (r1 != 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fm0.test(java.lang.Object):boolean");
    }
}

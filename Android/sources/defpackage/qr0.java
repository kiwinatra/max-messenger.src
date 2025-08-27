package defpackage;

import androidx.appcompat.widget.ActionMenuView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.Typography;
import org.webrtc.VideoEncoderObserver;

/* renamed from: qr0  reason: default package */
public class qr0 implements qn5, nj6, es6, ds6, w65, zi6, VideoEncoderObserver, h79 {
    public boolean a;
    public Object b;

    public /* synthetic */ qr0(Object obj) {
        this.b = obj;
    }

    public void a(Object obj) {
        List list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        if (this.a) {
            arrayList.removeAll(Collections.singleton((Object) null));
        }
        ((do1) this.b).b(arrayList);
    }

    public boolean a0(m69 m69) {
        ((jmf) this.b).x.onMenuOpened(108, m69);
        return true;
    }

    public Object apply(Object obj) {
        return TuplesKt.to(Long.valueOf(((a32) this.b).b.a), Boolean.valueOf(((Boolean) obj).booleanValue() || this.a));
    }

    public void b(mv4 mv4) {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        cvg.o(size, arrayList.size() + 1);
        arrayList.add(size, mv4);
        if (this.a) {
            mv4.g();
        }
    }

    public mv4 c(int i) {
        return (mv4) ((ArrayList) this.b).get(i);
    }

    public void d(File file) {
        be4 be4;
        zd4 g;
        if (this.a && (g = be4.g(be4, file)) != null) {
            String str = g.b;
            if (str == ".tmp") {
                long lastModified = file.lastModified();
                (be4 = (be4) this.b).e.getClass();
                if (lastModified > System.currentTimeMillis() - be4.f) {
                    return;
                }
            } else {
                cvg.q(str == ".cnt");
                return;
            }
        }
        file.delete();
    }

    public void e() {
        if (!this.a) {
            this.a = true;
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new h7e(i));
            }
            ((kx2) this.b).G(arrayList);
        }
    }

    public void f() {
        if (this.a) {
            this.a = false;
            ((kx2) this.b).G(CollectionsKt.emptyList());
        }
    }

    public void g(Throwable th) {
        boolean z = th instanceof TimeoutException;
        do1 do1 = (do1) this.b;
        if (z) {
            do1.d(th);
        } else {
            do1.b(Collections.emptyList());
        }
    }

    public synchronized void h() {
        if (this.a) {
            ((l15) this.b).h();
        }
    }

    public void i(File file) {
        if (!this.a && file.equals(((be4) this.b).c)) {
            this.a = true;
        }
    }

    public void j(File file) {
        be4 be4 = (be4) this.b;
        if (!be4.a.equals(file) && !this.a) {
            file.delete();
        }
        if (this.a && file.equals(be4.c)) {
            this.a = false;
        }
    }

    public void k() {
        this.a = true;
    }

    public synchronized void l(gs6 gs6, long j) {
        if (this.a) {
            ((l15) this.b).l(gs6, j);
        }
    }

    public void m(m69 m69, boolean z) {
        w7 w7Var;
        if (!this.a) {
            this.a = true;
            jmf jmf = (jmf) this.b;
            ActionMenuView actionMenuView = jmf.w.a.a;
            if (!(actionMenuView == null || (w7Var = actionMenuView.v) == null)) {
                w7Var.b();
                t7 t7Var = w7Var.C0;
                if (t7Var != null && t7Var.b()) {
                    t7Var.j.dismiss();
                }
            }
            jmf.x.onPanelClosed(108, m69);
            this.a = false;
        }
    }

    public void n() {
        this.a = false;
    }

    public void o() {
        this.a = false;
    }

    public void onEncoderChanged(VideoEncoderObserver.EncoderInfo encoderInfo) {
        fbb fbb = (fbb) this.b;
        voc voc = fbb.J0;
        StringBuilder sb = new StringBuilder("Encoder for ");
        boolean z = this.a;
        sb.append(z ? "camera" : "screen share");
        sb.append(" updated: ");
        sb.append(encoderInfo.getEncoderType());
        sb.append(", ");
        sb.append(encoderInfo.getImplementationName());
        sb.append(", isHw: ");
        sb.append(encoderInfo.isHardwareAccelerated());
        voc.log("PCRTCClient", sb.toString());
        if (z) {
            fbb.i("onCameraEncoderInfoChanged", new yug(fbb, new zab(5, this, encoderInfo), 1));
        }
    }

    public void p() {
        if (!this.a) {
            this.a = true;
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) this.b;
                if (i < arrayList.size()) {
                    ((mv4) arrayList.get(i)).g();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void q() {
        if (this.a) {
            int i = 0;
            this.a = false;
            while (true) {
                ArrayList arrayList = (ArrayList) this.b;
                if (i < arrayList.size()) {
                    ((mv4) arrayList.get(i)).h();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void r() {
        if (this.a) {
            ((l15) this.b).r();
        }
    }

    public void release() {
        voc voc = ((fbb) this.b).J0;
        voc.log("PCRTCClient", "Encoder observer released isCamera=(" + this.a + ")");
    }

    public void s(char c) {
        ni0 ni0 = (ni0) this.b;
        ni0.w(ni0.b, 1);
        int i = ni0.b;
        ni0.b = i + 1;
        ((char[]) ni0.c)[i] = c;
    }

    public void t(String str) {
        ((ni0) this.b).U(str);
    }

    public void u(String str) {
        int i;
        int i2;
        ni0 ni0 = (ni0) this.b;
        ni0.getClass();
        ni0.w(ni0.b, str.length() + 2);
        char[] cArr = (char[]) ni0.c;
        int i3 = ni0.b;
        int i4 = i3 + 1;
        cArr[i3] = Typography.quote;
        int length = str.length();
        str.getChars(0, length, cArr, i4);
        int i5 = length + i4;
        int i6 = i4;
        while (i < i5) {
            char c = cArr[i];
            byte[] bArr = aye.b;
            if (c >= bArr.length || bArr[c] == 0) {
                i6 = i + 1;
            } else {
                int length2 = str.length();
                for (int i7 = i - i4; i7 < length2; i7++) {
                    ni0.w(i, 2);
                    char charAt = str.charAt(i7);
                    byte[] bArr2 = aye.b;
                    if (charAt < bArr2.length) {
                        byte b2 = bArr2[charAt];
                        if (b2 == 0) {
                            i2 = i + 1;
                            ((char[]) ni0.c)[i] = (char) charAt;
                        } else {
                            if (b2 == 1) {
                                String str2 = aye.a[charAt];
                                ni0.w(i, str2.length());
                                str2.getChars(0, str2.length(), (char[]) ni0.c, i);
                                int length3 = str2.length() + i;
                                ni0.b = length3;
                                i = length3;
                            } else {
                                char[] cArr2 = (char[]) ni0.c;
                                cArr2[i] = '\\';
                                cArr2[i + 1] = (char) b2;
                                i += 2;
                                ni0.b = i;
                            }
                        }
                    } else {
                        i2 = i + 1;
                        ((char[]) ni0.c)[i] = (char) charAt;
                    }
                    i = i2;
                }
                ni0.w(i, 1);
                ((char[]) ni0.c)[i] = Typography.quote;
                ni0.b = i + 1;
                return;
            }
        }
        cArr[i5] = Typography.quote;
        ni0.b = i5 + 1;
    }

    public void v(gs6 gs6) {
        if (this.a) {
            ((l15) this.b).v(gs6);
        }
    }

    public synchronized void w() {
        if (this.a) {
            ((l15) this.b).w();
        }
    }

    public void x() {
    }

    public void y() {
    }

    public /* synthetic */ qr0(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public qr0(boolean z, gj8 gj8) {
        this.a = z;
        this.b = gj8;
    }

    public qr0(ni0 ni0) {
        this.b = ni0;
        this.a = true;
    }

    public qr0() {
        this.a = false;
        this.b = new ArrayList();
    }
}

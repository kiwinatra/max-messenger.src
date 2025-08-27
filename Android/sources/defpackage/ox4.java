package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.view.Surface;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ox4  reason: default package */
public final /* synthetic */ class ox4 implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ox4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final void accept(Object obj) {
        boolean z;
        f2a f2a;
        f2a f2a2;
        d8b d8b;
        View focusedChild;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (this.a) {
            case 0:
                nc0 nc0 = (nc0) obj;
                px4 px4 = (px4) obj4;
                px4.getClass();
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj2;
                surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                surfaceTexture.release();
                ((Surface) obj3).release();
                px4.v--;
                px4.d();
                return;
            default:
                ((u2a) obj4).getClass();
                u2a.c0((p7b) obj3);
                k0a k0a = ((h1a) obj).c.a;
                i1a i1a = k0a.z;
                f2a f2a3 = i1a.c.a;
                if (f2a3 != null) {
                    Context context = (Context) ((s3a) f2a3).b;
                    if (context instanceof Activity) {
                        hd8.B((Activity) context);
                    }
                }
                i3a i3a = (i3a) i1a.f.a;
                if (i3a.c0() && (focusedChild = i3a.w0.getFocusedChild()) != null) {
                    hd8.C(focusedChild.getContext(), focusedChild);
                }
                f2a f2a4 = i1a.d.a;
                if (!(f2a4 == null || (d8b = ((u2a) f2a4).X) == null)) {
                    d8b.d();
                }
                boe boe = (boe) obj2;
                z68.c("k0a", "sendSticker: stickerId = %d", Long.valueOf(boe.a));
                i1a i1a2 = k0a.z;
                p1a p1a = i1a2.c;
                String a0 = p1a.a0();
                String lowerCase = p1a.a0().toLowerCase();
                Pattern pattern = hhf.a;
                List list = boe.z;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equalsIgnoreCase(lowerCase)) {
                                z = true;
                            }
                        }
                    }
                }
                z = false;
                yva yva = i1a2.b;
                if ((yva.k.f(a0) || (yva.k.a(a0).isEmpty() && z)) && (f2a2 = p1a.a) != null) {
                    s3a s3a = (s3a) f2a2;
                    Editable text = s3a.X.getText();
                    if (!cvg.c(text == null ? null : text.toString(), (CharSequence) null)) {
                        s3a.X.setText((CharSequence) null);
                    }
                }
                a2a a2a = i1a2.e;
                if (a0.toString().equals((a2a.U() ? ((j4a) a2a.a).Z() : "").toString()) && !cvg.A(a0) && a0.trim().split("\\s").length == 1 && (f2a = p1a.a) != null) {
                    s3a s3a2 = (s3a) f2a;
                    Editable text2 = s3a2.X.getText();
                    if (!cvg.c(text2 == null ? null : text2.toString(), (CharSequence) null)) {
                        s3a2.X.setText((CharSequence) null);
                    }
                }
                f2a f2a5 = a2a.a;
                if (f2a5 != null) {
                    ((j4a) f2a5).a0();
                }
                k0a.o.getClass();
                long j = k0a.Z;
                a32 a32 = k0a.X;
                if (a32 != null) {
                    long j2 = a32.a;
                }
                k0a.v.getClass();
                z68.c("p99", "sendToConstructor, constructorId = %d, paramsType = %s", Long.valueOf(j), g63.q(6));
                tr1.y(6);
                return;
        }
    }
}

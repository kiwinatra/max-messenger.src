package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tv8  reason: default package */
public final class tv8 extends tyc {
    public final /* synthetic */ uv8 X;
    public final ArrayList o = new ArrayList();
    public final LayoutInflater v;
    public final Drawable w;
    public final Drawable x;
    public final Drawable y;
    public final Drawable z;

    public tv8(uv8 uv8) {
        this.X = uv8;
        this.v = LayoutInflater.from(uv8.y);
        int i = bdc.mediaRouteDefaultIconDrawable;
        Context context = uv8.y;
        this.w = zw8.e(i, context);
        this.x = zw8.e(bdc.mediaRouteTvIconDrawable, context);
        this.y = zw8.e(bdc.mediaRouteSpeakerIconDrawable, context);
        this.z = zw8.e(bdc.mediaRouteSpeakerGroupIconDrawable, context);
        E();
    }

    public final void E() {
        ArrayList arrayList = this.o;
        arrayList.clear();
        uv8 uv8 = this.X;
        arrayList.add(new rv8(uv8.y.getString(wlc.mr_chooser_title)));
        Iterator it = uv8.X.iterator();
        while (it.hasNext()) {
            arrayList.add(new rv8((rw8) it.next()));
        }
        m();
    }

    public final int j() {
        return this.o.size();
    }

    public final int l(int i) {
        return ((rv8) this.o.get(i)).b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        if (r2 != null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(defpackage.pzc r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.l(r7)
            java.util.ArrayList r5 = r5.o
            java.lang.Object r5 = r5.get(r7)
            rv8 r5 = (defpackage.rv8) r5
            r7 = 1
            if (r0 == r7) goto L_0x0074
            r1 = 2
            if (r0 == r1) goto L_0x0014
            goto L_0x0081
        L_0x0014:
            sv8 r6 = (defpackage.sv8) r6
            java.lang.Object r5 = r5.a
            rw8 r5 = (defpackage.rw8) r5
            r0 = 0
            android.view.View r2 = r6.D0
            r2.setVisibility(r0)
            android.widget.ProgressBar r0 = r6.F0
            r3 = 4
            r0.setVisibility(r3)
            cr r0 = new cr
            r0.<init>(r6, r5)
            r2.setOnClickListener(r0)
            java.lang.String r0 = r5.d
            android.widget.TextView r2 = r6.G0
            r2.setText(r0)
            tv8 r0 = r6.H0
            r0.getClass()
            android.net.Uri r2 = r5.f
            if (r2 == 0) goto L_0x0055
            uv8 r3 = r0.X     // Catch:{ IOException -> 0x0052 }
            android.content.Context r3 = r3.y     // Catch:{ IOException -> 0x0052 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ IOException -> 0x0052 }
            java.io.InputStream r3 = r3.openInputStream(r2)     // Catch:{ IOException -> 0x0052 }
            r4 = 0
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r3, r4)     // Catch:{ IOException -> 0x0052 }
            if (r2 == 0) goto L_0x0055
            goto L_0x006e
        L_0x0052:
            r2.toString()
        L_0x0055:
            int r2 = r5.m
            if (r2 == r7) goto L_0x006b
            if (r2 == r1) goto L_0x0068
            boolean r5 = r5.e()
            if (r5 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r5 = r0.z
        L_0x0063:
            r2 = r5
            goto L_0x006e
        L_0x0065:
            android.graphics.drawable.Drawable r5 = r0.w
            goto L_0x0063
        L_0x0068:
            android.graphics.drawable.Drawable r5 = r0.y
            goto L_0x0063
        L_0x006b:
            android.graphics.drawable.Drawable r5 = r0.x
            goto L_0x0063
        L_0x006e:
            android.widget.ImageView r5 = r6.E0
            r5.setImageDrawable(r2)
            goto L_0x0081
        L_0x0074:
            qv8 r6 = (defpackage.qv8) r6
            java.lang.Object r5 = r5.a
            java.lang.String r5 = r5.toString()
            android.widget.TextView r6 = r6.D0
            r6.setText(r5)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv8.s(pzc, int):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [qv8, pzc] */
    public final pzc u(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.v;
        if (i == 1) {
            View inflate = layoutInflater.inflate(njc.mr_picker_header_item, viewGroup, false);
            ? pzc = new pzc(inflate);
            pzc.D0 = (TextView) inflate.findViewById(ufc.mr_picker_header_name);
            return pzc;
        } else if (i != 2) {
            return null;
        } else {
            return new sv8(this, layoutInflater.inflate(njc.mr_picker_route_item, viewGroup, false));
        }
    }
}

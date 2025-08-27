package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;

/* renamed from: dv8  reason: default package */
public final class dv8 extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable o;
    public final Drawable v;

    public dv8(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{bdc.mediaRouteDefaultIconDrawable, bdc.mediaRouteTvIconDrawable, bdc.mediaRouteSpeakerIconDrawable, bdc.mediaRouteSpeakerGroupIconDrawable});
        this.b = iq.D(context, obtainStyledAttributes.getResourceId(0, 0));
        this.c = iq.D(context, obtainStyledAttributes.getResourceId(1, 0));
        this.o = iq.D(context, obtainStyledAttributes.getResourceId(2, 0));
        this.v = iq.D(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
        if (r0 != null) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L_0x000b
            android.view.LayoutInflater r8 = r6.a
            int r1 = defpackage.njc.mr_chooser_list_item
            android.view.View r8 = r8.inflate(r1, r9, r0)
        L_0x000b:
            java.lang.Object r7 = r6.getItem(r7)
            rw8 r7 = (defpackage.rw8) r7
            int r9 = defpackage.ufc.mr_chooser_route_name
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r1 = defpackage.ufc.mr_chooser_route_desc
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r7.d
            r9.setText(r2)
            java.lang.String r2 = r7.e
            int r3 = r7.h
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L_0x0030
            if (r3 != r4) goto L_0x0042
        L_0x0030:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0042
            r3 = 80
            r9.setGravity(r3)
            r1.setVisibility(r0)
            r1.setText(r2)
            goto L_0x0051
        L_0x0042:
            r0 = 16
            r9.setGravity(r0)
            r9 = 8
            r1.setVisibility(r9)
            java.lang.String r9 = ""
            r1.setText(r9)
        L_0x0051:
            boolean r9 = r7.g
            r8.setEnabled(r9)
            int r9 = defpackage.ufc.mr_chooser_route_icon
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x0097
            android.net.Uri r0 = r7.f
            if (r0 == 0) goto L_0x007b
            android.content.Context r1 = r6.getContext()     // Catch:{ IOException -> 0x0078 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ IOException -> 0x0078 }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x0078 }
            r2 = 0
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2)     // Catch:{ IOException -> 0x0078 }
            if (r0 == 0) goto L_0x007b
            goto L_0x0094
        L_0x0078:
            r0.toString()
        L_0x007b:
            int r0 = r7.m
            if (r0 == r4) goto L_0x0091
            if (r0 == r5) goto L_0x008e
            boolean r7 = r7.e()
            if (r7 == 0) goto L_0x008b
            android.graphics.drawable.Drawable r6 = r6.v
        L_0x0089:
            r0 = r6
            goto L_0x0094
        L_0x008b:
            android.graphics.drawable.Drawable r6 = r6.b
            goto L_0x0089
        L_0x008e:
            android.graphics.drawable.Drawable r6 = r6.o
            goto L_0x0089
        L_0x0091:
            android.graphics.drawable.Drawable r6 = r6.c
            goto L_0x0089
        L_0x0094:
            r9.setImageDrawable(r0)
        L_0x0097:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv8.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean isEnabled(int i) {
        return ((rw8) getItem(i)).g;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        rw8 rw8 = (rw8) getItem(i);
        if (rw8.g) {
            ImageView imageView = (ImageView) view.findViewById(ufc.mr_chooser_route_icon);
            ProgressBar progressBar = (ProgressBar) view.findViewById(ufc.mr_chooser_route_progress_bar);
            if (!(imageView == null || progressBar == null)) {
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
            }
            rw8.l();
        }
    }
}

package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: y44  reason: default package */
public final class y44 extends Filter {
    public x44 a;

    public final CharSequence convertResultToString(Object obj) {
        return ((n0f) this.a).c((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            x44 r3 = r3.a
            n0f r3 = (defpackage.n0f) r3
            if (r4 != 0) goto L_0x0009
            java.lang.String r4 = ""
            goto L_0x0010
        L_0x0009:
            r3.getClass()
            java.lang.String r4 = r4.toString()
        L_0x0010:
            gmd r0 = r3.Y
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto L_0x002c
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x0020
            goto L_0x002c
        L_0x0020:
            android.app.SearchableInfo r0 = r3.Z     // Catch:{ RuntimeException -> 0x002c }
            android.database.Cursor r3 = r3.g(r0, r4)     // Catch:{ RuntimeException -> 0x002c }
            if (r3 == 0) goto L_0x002c
            r3.getCount()     // Catch:{ RuntimeException -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r3 == 0) goto L_0x003d
            int r0 = r3.getCount()
            r4.count = r0
            r4.values = r3
            goto L_0x0042
        L_0x003d:
            r3 = 0
            r4.count = r3
            r4.values = r2
        L_0x0042:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y44.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        x44 x44 = this.a;
        Cursor cursor = ((w44) x44).c;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((n0f) x44).b((Cursor) obj);
        }
    }
}

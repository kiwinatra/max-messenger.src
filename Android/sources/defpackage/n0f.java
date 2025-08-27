package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: n0f  reason: default package */
public final class n0f extends w44 implements View.OnClickListener {
    public static final /* synthetic */ int G0 = 0;
    public int A0 = -1;
    public int B0 = -1;
    public int C0 = -1;
    public int D0 = -1;
    public int E0 = -1;
    public int F0 = -1;
    public final LayoutInflater X;
    public final gmd Y;
    public final SearchableInfo Z;
    public final Context v0;
    public final WeakHashMap w0;
    public final int x0;
    public final int y;
    public int y0 = 1;
    public final int z;
    public ColorStateList z0;

    public n0f(Context context, gmd gmd, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = gmd.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.o = -1;
        this.v = new u44((w44) this);
        this.w = new v44(0, this);
        this.z = suggestionRowLayout;
        this.y = suggestionRowLayout;
        this.X = (LayoutInflater) context.getSystemService("layout_inflater");
        this.Y = gmd;
        this.Z = searchableInfo;
        this.x0 = gmd.getSuggestionCommitIconResId();
        this.v0 = context;
        this.w0 = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r23
            java.lang.Object r0 = r22.getTag()
            r3 = r0
            k0f r3 = (defpackage.k0f) r3
            int r0 = r1.F0
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = r4
        L_0x0018:
            android.widget.TextView r7 = r3.a
            r8 = 8
            if (r7 == 0) goto L_0x0034
            int r0 = r1.A0
            java.lang.String r0 = h(r2, r0)
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0031
            r7.setVisibility(r8)
            goto L_0x0034
        L_0x0031:
            r7.setVisibility(r4)
        L_0x0034:
            r9 = 1
            r10 = 2
            android.content.Context r11 = r1.v0
            android.widget.TextView r0 = r3.b
            if (r0 == 0) goto L_0x00b9
            int r12 = r1.C0
            java.lang.String r12 = h(r2, r12)
            if (r12 == 0) goto L_0x008c
            android.content.res.ColorStateList r13 = r1.z0
            if (r13 != 0) goto L_0x0062
            android.util.TypedValue r13 = new android.util.TypedValue
            r13.<init>()
            android.content.res.Resources$Theme r14 = r11.getTheme()
            int r15 = defpackage.hdc.textColorSearchUrl
            r14.resolveAttribute(r15, r13, r9)
            android.content.res.Resources r14 = r11.getResources()
            int r13 = r13.resourceId
            android.content.res.ColorStateList r13 = r14.getColorStateList(r13)
            r1.z0 = r13
        L_0x0062:
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r12)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            android.content.res.ColorStateList r14 = r1.z0
            r16 = 0
            r19 = 0
            r17 = 0
            r18 = 0
            r20 = r14
            r14 = r15
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            r14.<init>(r15, r16, r17, r18, r19)
            int r12 = r12.length()
            r14 = 33
            r13.setSpan(r5, r4, r12, r14)
            goto L_0x0092
        L_0x008c:
            int r5 = r1.B0
            java.lang.String r13 = h(r2, r5)
        L_0x0092:
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 == 0) goto L_0x00a1
            if (r7 == 0) goto L_0x00a9
            r7.setSingleLine(r4)
            r7.setMaxLines(r10)
            goto L_0x00a9
        L_0x00a1:
            if (r7 == 0) goto L_0x00a9
            r7.setSingleLine(r9)
            r7.setMaxLines(r9)
        L_0x00a9:
            r0.setText(r13)
            boolean r5 = android.text.TextUtils.isEmpty(r13)
            if (r5 == 0) goto L_0x00b6
            r0.setVisibility(r8)
            goto L_0x00b9
        L_0x00b6:
            r0.setVisibility(r4)
        L_0x00b9:
            android.widget.ImageView r12 = r3.c
            if (r12 == 0) goto L_0x0149
            int r0 = r1.D0
            r13 = -1
            if (r0 != r13) goto L_0x00c5
            r0 = 0
            goto L_0x0136
        L_0x00c5:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto L_0x00d1
            goto L_0x0136
        L_0x00d1:
            android.app.SearchableInfo r0 = r1.Z
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r13 = r0.flattenToShortString()
            java.util.WeakHashMap r14 = r1.w0
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x00f6
            java.lang.Object r0 = r14.get(r13)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00ed
            r0 = 0
            goto L_0x012b
        L_0x00ed:
            android.content.res.Resources r13 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r13)
            goto L_0x012b
        L_0x00f6:
            android.content.pm.PackageManager r15 = r11.getPackageManager()
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r5 = r15.getActivityInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x011a }
            int r10 = r5.getIconResource()
            if (r10 != 0) goto L_0x0108
        L_0x0106:
            r0 = 0
            goto L_0x0120
        L_0x0108:
            java.lang.String r8 = r0.getPackageName()
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            android.graphics.drawable.Drawable r5 = r15.getDrawable(r8, r10, r5)
            if (r5 != 0) goto L_0x0118
            r0.flattenToShortString()
            goto L_0x0106
        L_0x0118:
            r0 = r5
            goto L_0x0120
        L_0x011a:
            r0 = move-exception
            r5 = r0
            r5.toString()
            goto L_0x0106
        L_0x0120:
            if (r0 != 0) goto L_0x0124
            r5 = 0
            goto L_0x0128
        L_0x0124:
            android.graphics.drawable.Drawable$ConstantState r5 = r0.getConstantState()
        L_0x0128:
            r14.put(r13, r5)
        L_0x012b:
            if (r0 == 0) goto L_0x012e
            goto L_0x0136
        L_0x012e:
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0136:
            r12.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0140
            r0 = 4
            r12.setVisibility(r0)
            goto L_0x0149
        L_0x0140:
            r12.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r9, r4)
        L_0x0149:
            android.widget.ImageView r0 = r3.d
            if (r0 == 0) goto L_0x0170
            int r5 = r1.E0
            r8 = -1
            if (r5 != r8) goto L_0x0154
            r5 = 0
            goto L_0x015c
        L_0x0154:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r5 = r1.f(r2)
        L_0x015c:
            r0.setImageDrawable(r5)
            if (r5 != 0) goto L_0x0167
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0170
        L_0x0167:
            r0.setVisibility(r4)
            r5.setVisible(r4, r4)
            r5.setVisible(r9, r4)
        L_0x0170:
            int r0 = r1.y0
            android.widget.ImageView r2 = r3.e
            r3 = 2
            if (r0 == r3) goto L_0x0184
            if (r0 != r9) goto L_0x017e
            r0 = r6 & 1
            if (r0 == 0) goto L_0x017e
            goto L_0x0184
        L_0x017e:
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x0191
        L_0x0184:
            r2.setVisibility(r4)
            java.lang.CharSequence r0 = r7.getText()
            r2.setTag(r0)
            r2.setOnClickListener(r1)
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0f.a(android.view.View, android.database.Cursor):void");
    }

    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.A0 = cursor.getColumnIndex("suggest_text_1");
                this.B0 = cursor.getColumnIndex("suggest_text_2");
                this.C0 = cursor.getColumnIndex("suggest_text_2_url");
                this.D0 = cursor.getColumnIndex("suggest_icon_1");
                this.E0 = cursor.getColumnIndex("suggest_icon_2");
                this.F0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    public final String c(Cursor cursor) {
        String h;
        String h2;
        if (cursor == null) {
            return null;
        }
        String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        SearchableInfo searchableInfo = this.Z;
        if (searchableInfo.shouldRewriteQueryFromData() && (h2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    public final View d(ViewGroup viewGroup) {
        View inflate = this.X.inflate(this.y, viewGroup, false);
        inflate.setTag(new k0f(inflate));
        ((ImageView) inflate.findViewById(egc.edit_query)).setImageResource(this.x0);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.v0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:33|34|35) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:45|46|47|48|49|50) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:38|39|40|41|42|43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0092, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0081 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00af */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x00a5=Splitter:B:42:0x00a5, B:30:0x007a=Splitter:B:30:0x007a, B:48:0x00af=Splitter:B:48:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable f(java.lang.String r9) {
        /*
            r8 = this;
            java.util.WeakHashMap r0 = r8.w0
            android.content.Context r1 = r8.v0
            java.lang.String r2 = "android.resource://"
            r3 = 0
            if (r9 == 0) goto L_0x00d4
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x00d4
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x0019
            goto L_0x00d4
        L_0x0019:
            int r4 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            r5.<init>(r2)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            java.lang.String r2 = r1.getPackageName()     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            r5.append(r2)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            r5.append(r4)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            java.lang.String r2 = r5.toString()     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            java.lang.Object r5 = r0.get(r2)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            if (r5 != 0) goto L_0x003f
            r5 = r3
            goto L_0x0043
        L_0x003f:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
        L_0x0043:
            if (r5 == 0) goto L_0x0046
            return r5
        L_0x0046:
            android.graphics.drawable.Drawable r4 = defpackage.ew3.b(r1, r4)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            if (r4 == 0) goto L_0x0053
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
            r0.put(r2, r5)     // Catch:{ NumberFormatException -> 0x0055, NotFoundException -> 0x0054 }
        L_0x0053:
            return r4
        L_0x0054:
            return r3
        L_0x0055:
            java.lang.Object r2 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x005f
            r2 = r3
            goto L_0x0063
        L_0x005f:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0063:
            if (r2 == 0) goto L_0x0066
            return r2
        L_0x0066:
            android.net.Uri r2 = android.net.Uri.parse(r9)
            java.lang.String r4 = "Failed to open "
            java.lang.String r5 = "Resource does not exist: "
            java.lang.String r6 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.String r7 = "android.resource"
            boolean r6 = r7.equals(r6)     // Catch:{ FileNotFoundException -> 0x007f }
            if (r6 == 0) goto L_0x0093
            android.graphics.drawable.Drawable r3 = r8.e(r2)     // Catch:{ NotFoundException -> 0x0081 }
            goto L_0x00cb
        L_0x007f:
            r8 = move-exception
            goto L_0x00c5
        L_0x0081:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x007f }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x007f }
            r1.append(r2)     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x007f }
            r8.<init>(r1)     // Catch:{ FileNotFoundException -> 0x007f }
            throw r8     // Catch:{ FileNotFoundException -> 0x007f }
        L_0x0093:
            android.content.ContentResolver r8 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x007f }
            java.io.InputStream r8 = r8.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x007f }
            if (r8 == 0) goto L_0x00b3
            android.graphics.drawable.Drawable r1 = android.graphics.drawable.Drawable.createFromStream(r8, r3)     // Catch:{ all -> 0x00aa }
            r8.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00a8
        L_0x00a5:
            r2.toString()     // Catch:{ FileNotFoundException -> 0x007f }
        L_0x00a8:
            r3 = r1
            goto L_0x00cb
        L_0x00aa:
            r1 = move-exception
            r8.close()     // Catch:{ IOException -> 0x00af }
            goto L_0x00b2
        L_0x00af:
            r2.toString()     // Catch:{ FileNotFoundException -> 0x007f }
        L_0x00b2:
            throw r1     // Catch:{ FileNotFoundException -> 0x007f }
        L_0x00b3:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x007f }
            r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x007f }
            r1.append(r2)     // Catch:{ FileNotFoundException -> 0x007f }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x007f }
            r8.<init>(r1)     // Catch:{ FileNotFoundException -> 0x007f }
            throw r8     // Catch:{ FileNotFoundException -> 0x007f }
        L_0x00c5:
            java.util.Objects.toString(r2)
            r8.getMessage()
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            android.graphics.drawable.Drawable$ConstantState r8 = r3.getConstantState()
            r0.put(r9, r8)
        L_0x00d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n0f.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.v0.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.X.inflate(this.z, viewGroup, false);
            if (inflate != null) {
                ((k0f) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View d = d(viewGroup);
            ((k0f) d.getTag()).a.setText(e.toString());
            return d;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.Y.onQueryRefine((CharSequence) tag);
        }
    }
}

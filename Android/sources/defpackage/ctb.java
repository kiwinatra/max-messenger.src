package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ctb  reason: default package */
public final class ctb {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final HashMap f = new HashMap();
    public final Context a;
    public final Object[] b = new Object[2];
    public final dtb c;
    public final String[] d;

    public ctb(Context context, dtb dtb) {
        this.a = context;
        this.c = dtb;
        this.d = new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r13 = new android.view.InflateException(r14.getPositionDescription() + ": Error inflating class " + r12);
        r13.initCause(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[ExcHandler: Exception (r11v5 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.Preference a(java.lang.String r12, java.lang.String[] r13, android.util.AttributeSet r14) {
        /*
            r11 = this;
            java.util.HashMap r0 = f
            java.lang.Object r1 = r0.get(r12)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r2 = ": Error inflating class "
            r3 = 1
            if (r1 != 0) goto L_0x006f
            android.content.Context r1 = r11.a     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r4 = 0
            if (r13 == 0) goto L_0x005f
            int r5 = r13.length     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            if (r5 != 0) goto L_0x001a
            goto L_0x005f
        L_0x001a:
            int r5 = r13.length     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r6 = 0
            r7 = r4
            r8 = r6
        L_0x001e:
            if (r7 >= r5) goto L_0x003e
            r9 = r13[r7]     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            r10.append(r9)     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            r10.append(r12)     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            java.lang.String r9 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            java.lang.Class r6 = java.lang.Class.forName(r9, r4, r1)     // Catch:{ ClassNotFoundException -> 0x0038, Exception -> 0x0036 }
            goto L_0x003e
        L_0x0036:
            r11 = move-exception
            goto L_0x007a
        L_0x0038:
            r8 = move-exception
            int r7 = r7 + 1
            goto L_0x001e
        L_0x003c:
            r11 = move-exception
            goto L_0x0099
        L_0x003e:
            if (r6 != 0) goto L_0x0063
            if (r8 != 0) goto L_0x005e
            android.view.InflateException r11 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r13.<init>()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.String r0 = r14.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r13.append(r0)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r13.append(r2)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r13.append(r12)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.String r13 = r13.toString()     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r11.<init>(r13)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            throw r11     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x005e:
            throw r8     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x005f:
            java.lang.Class r6 = java.lang.Class.forName(r12, r4, r1)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x0063:
            java.lang.Class[] r13 = e     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.reflect.Constructor r1 = r6.getConstructor(r13)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r1.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r0.put(r12, r1)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
        L_0x006f:
            java.lang.Object[] r11 = r11.b     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            r11[r3] = r14     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            java.lang.Object r11 = r1.newInstance(r11)     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            androidx.preference.Preference r11 = (androidx.preference.Preference) r11     // Catch:{ ClassNotFoundException -> 0x003c, Exception -> 0x0036 }
            return r11
        L_0x007a:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r14 = r14.getPositionDescription()
            r0.append(r14)
            r0.append(r2)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            r13.initCause(r11)
            throw r13
        L_0x0099:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctb.a(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.d, attributeSet) : a(str, (String[]) null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC, Splitter:B:21:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.PreferenceGroup c(android.content.res.XmlResourceParser r6, androidx.preference.PreferenceGroup r7) {
        /*
            r5 = this;
            java.lang.Object[] r0 = r5.b
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ all -> 0x0031 }
            java.lang.Object[] r2 = r5.b     // Catch:{ all -> 0x0031 }
            android.content.Context r3 = r5.a     // Catch:{ all -> 0x0031 }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0031 }
        L_0x000e:
            int r2 = r6.next()     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            r3 = 2
            if (r2 == r3) goto L_0x0018
            r4 = 1
            if (r2 != r4) goto L_0x000e
        L_0x0018:
            if (r2 != r3) goto L_0x0039
            java.lang.String r2 = r6.getName()     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            androidx.preference.Preference r2 = r5.b(r2, r1)     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            if (r7 != 0) goto L_0x002c
            dtb r7 = r5.c     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            r2.k(r7)     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            r7 = r2
        L_0x002c:
            r5.d(r6, r7, r1)     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r7
        L_0x0031:
            r5 = move-exception
            goto L_0x0087
        L_0x0033:
            r5 = move-exception
            goto L_0x0054
        L_0x0035:
            r5 = move-exception
            goto L_0x0079
        L_0x0037:
            r5 = move-exception
            goto L_0x0086
        L_0x0039:
            android.view.InflateException r5 = new android.view.InflateException     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            r7.<init>()     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            java.lang.String r1 = r6.getPositionDescription()     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            r7.append(r1)     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            java.lang.String r1 = ": No start tag found!"
            r7.append(r1)     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            java.lang.String r7 = r7.toString()     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            r5.<init>(r7)     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
            throw r5     // Catch:{ InflateException -> 0x0037, XmlPullParserException -> 0x0035, IOException -> 0x0033 }
        L_0x0054:
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ all -> 0x0031 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0031 }
            r1.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = r6.getPositionDescription()     // Catch:{ all -> 0x0031 }
            r1.append(r6)     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = ": "
            r1.append(r6)     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = r5.getMessage()     // Catch:{ all -> 0x0031 }
            r1.append(r6)     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x0031 }
            r7.<init>(r6)     // Catch:{ all -> 0x0031 }
            r7.initCause(r5)     // Catch:{ all -> 0x0031 }
            throw r7     // Catch:{ all -> 0x0031 }
        L_0x0079:
            android.view.InflateException r6 = new android.view.InflateException     // Catch:{ all -> 0x0031 }
            java.lang.String r7 = r5.getMessage()     // Catch:{ all -> 0x0031 }
            r6.<init>(r7)     // Catch:{ all -> 0x0031 }
            r6.initCause(r5)     // Catch:{ all -> 0x0031 }
            throw r6     // Catch:{ all -> 0x0031 }
        L_0x0086:
            throw r5     // Catch:{ all -> 0x0031 }
        L_0x0087:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctb.c(android.content.res.XmlResourceParser, androidx.preference.PreferenceGroup):androidx.preference.PreferenceGroup");
    }

    /* JADX INFO: finally extract failed */
    public final void d(XmlResourceParser xmlResourceParser, Preference preference, AttributeSet attributeSet) {
        long j;
        int depth = xmlResourceParser.getDepth();
        while (true) {
            int next = xmlResourceParser.next();
            if ((next == 3 && xmlResourceParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.v0 = Intent.parseIntent(this.a.getResources(), xmlResourceParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.a.getResources();
                    if (preference.x0 == null) {
                        preference.x0 = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.x0);
                    try {
                        int depth2 = xmlResourceParser.getDepth();
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlResourceParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b2 = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.Y0.contains(b2)) {
                        if (b2.Z != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.R0;
                                if (preferenceGroup3 == null) {
                                    break;
                                }
                                preferenceGroup2 = preferenceGroup3;
                            }
                            preferenceGroup2.A(b2.Z);
                        }
                        int i = b2.x;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.Z0) {
                                int i2 = preferenceGroup.a1;
                                preferenceGroup.a1 = i2 + 1;
                                if (i2 != i) {
                                    b2.x = i2;
                                    btb btb = b2.P0;
                                    if (btb != null) {
                                        btb.I(b2);
                                    }
                                }
                            }
                            if (b2 instanceof PreferenceGroup) {
                                ((PreferenceGroup) b2).Z0 = preferenceGroup.Z0;
                            }
                        }
                        int binarySearch = Collections.binarySearch(preferenceGroup.Y0, b2);
                        if (binarySearch < 0) {
                            binarySearch = (binarySearch * -1) - 1;
                        }
                        boolean w = preferenceGroup.w();
                        if (b2.E0 == w) {
                            b2.E0 = !w;
                            b2.i(b2.w());
                            b2.h();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.Y0.add(binarySearch, b2);
                        }
                        dtb dtb = preferenceGroup.b;
                        String str = b2.Z;
                        if (str == null || !preferenceGroup.W0.containsKey(str)) {
                            synchronized (dtb) {
                                j = dtb.b;
                                dtb.b = 1 + j;
                            }
                        } else {
                            j = ((Long) preferenceGroup.W0.get(str)).longValue();
                            preferenceGroup.W0.remove(str);
                        }
                        b2.c = j;
                        b2.o = true;
                        try {
                            b2.k(dtb);
                            b2.o = false;
                            if (b2.R0 == null) {
                                b2.R0 = preferenceGroup;
                                if (preferenceGroup.b1) {
                                    b2.j();
                                }
                                btb btb2 = preferenceGroup.P0;
                                if (btb2 != null) {
                                    btb2.I(preferenceGroup);
                                }
                            } else {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                        } catch (Throwable th) {
                            b2.o = false;
                            throw th;
                        }
                    }
                    d(xmlResourceParser, b2, attributeSet);
                }
            }
        }
        while (true) {
        }
    }
}

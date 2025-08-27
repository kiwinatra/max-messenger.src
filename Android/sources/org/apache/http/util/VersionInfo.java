package org.apache.http.util;

import java.util.ArrayList;
import java.util.Map;

@Deprecated
public class VersionInfo {
    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    public VersionInfo(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.infoPackage = str;
            this.infoModule = str2 == null ? UNAVAILABLE : str2;
            this.infoRelease = str3 == null ? UNAVAILABLE : str3;
            this.infoTimestamp = str4 == null ? UNAVAILABLE : str4;
            this.infoClassloader = str5 == null ? UNAVAILABLE : str5;
            return;
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }

    public static final VersionInfo fromMap(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str != null) {
            String str5 = null;
            if (map != null) {
                String str6 = (String) map.get(PROPERTY_MODULE);
                if (str6 != null && str6.length() < 1) {
                    str6 = null;
                }
                String str7 = (String) map.get(PROPERTY_RELEASE);
                if (str7 != null && (str7.length() < 1 || str7.equals("${pom.version}"))) {
                    str7 = null;
                }
                String str8 = (String) map.get(PROPERTY_TIMESTAMP);
                str2 = (str8 == null || (str8.length() >= 1 && !str8.equals("${mvn.timestamp}"))) ? str8 : null;
                str4 = str6;
                str3 = str7;
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
            }
            if (classLoader != null) {
                str5 = classLoader.toString();
            }
            return new VersionInfo(str, str4, str3, str2, str5);
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }

    public static final VersionInfo[] loadVersionInfo(String[] strArr, ClassLoader classLoader) {
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String loadVersionInfo : strArr) {
                VersionInfo loadVersionInfo2 = loadVersionInfo(loadVersionInfo, classLoader);
                if (loadVersionInfo2 != null) {
                    arrayList.add(loadVersionInfo2);
                }
            }
            return (VersionInfo[]) arrayList.toArray(new VersionInfo[arrayList.size()]);
        }
        throw new IllegalArgumentException("Package identifier list must not be null.");
    }

    public final String getClassloader() {
        return this.infoClassloader;
    }

    public final String getModule() {
        return this.infoModule;
    }

    public final String getPackage() {
        return this.infoPackage;
    }

    public final String getRelease() {
        return this.infoRelease;
    }

    public final String getTimestamp() {
        return this.infoTimestamp;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.infoClassloader.length() + this.infoTimestamp.length() + this.infoRelease.length() + this.infoModule.length() + this.infoPackage.length() + 20);
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.infoPackage);
        stringBuffer.append(':');
        stringBuffer.append(this.infoModule);
        if (!UNAVAILABLE.equals(this.infoRelease)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoRelease);
        }
        if (!UNAVAILABLE.equals(this.infoTimestamp)) {
            stringBuffer.append(':');
            stringBuffer.append(this.infoTimestamp);
        }
        stringBuffer.append(')');
        if (!UNAVAILABLE.equals(this.infoClassloader)) {
            stringBuffer.append('@');
            stringBuffer.append(this.infoClassloader);
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.apache.http.util.VersionInfo loadVersionInfo(java.lang.String r5, java.lang.ClassLoader r6) {
        /*
            java.lang.String r0 = "/version.properties"
            if (r5 == 0) goto L_0x0045
            if (r6 != 0) goto L_0x000e
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r6 = r6.getContextClassLoader()
        L_0x000e:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003d }
            r2.<init>()     // Catch:{ IOException -> 0x003d }
            r3 = 46
            r4 = 47
            java.lang.String r3 = r5.replace(r3, r4)     // Catch:{ IOException -> 0x003d }
            r2.append(r3)     // Catch:{ IOException -> 0x003d }
            r2.append(r0)     // Catch:{ IOException -> 0x003d }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x003d }
            java.io.InputStream r0 = r6.getResourceAsStream(r0)     // Catch:{ IOException -> 0x003d }
            if (r0 == 0) goto L_0x003d
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x0038 }
            r2.<init>()     // Catch:{ all -> 0x0038 }
            r2.load(r0)     // Catch:{ all -> 0x0038 }
            r0.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x003e
        L_0x0038:
            r2 = move-exception
            r0.close()     // Catch:{ IOException -> 0x003d }
            throw r2     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            r2 = r1
        L_0x003e:
            if (r2 == 0) goto L_0x0044
            org.apache.http.util.VersionInfo r1 = fromMap(r5, r2, r6)
        L_0x0044:
            return r1
        L_0x0045:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Package identifier must not be null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.util.VersionInfo.loadVersionInfo(java.lang.String, java.lang.ClassLoader):org.apache.http.util.VersionInfo");
    }
}

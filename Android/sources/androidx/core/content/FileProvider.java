package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.uuid.Uuid;
import org.apache.http.cookie.ClientCookie;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    public static final String[] v = {"_display_name", "_size"};
    public static final File w = new File("/");
    public static final HashMap x = new HashMap();
    public final Object a = new Object();
    public String b;
    public jn5 c;
    public final int o = 0;

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + -1) != '/') ? str : str.substring(0, str.length() - 1);
    }

    public static jn5 c(int i, Context context, String str) {
        jn5 jn5;
        HashMap hashMap = x;
        synchronized (hashMap) {
            try {
                jn5 = (jn5) hashMap.get(str);
                if (jn5 == null) {
                    jn5 = e(i, context, str);
                    hashMap.put(str, jn5);
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
            } catch (XmlPullParserException e2) {
                throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jn5;
    }

    public static Uri d(Context context, File file, String str) {
        jn5 c2 = c(0, context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c2.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (jn5.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                return new Uri.Builder().scheme("content").authority(c2.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(a81.m("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static jn5 e(int i, Context context, String str) {
        jn5 jn5 = new jn5(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, Uuid.SIZE_BITS);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                resolveContentProvider.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return jn5;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue((String) null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, ClientCookie.PATH_ATTR);
                        if ("root-path".equals(name)) {
                            file = w;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs((String) null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] a2 = in5.a(context);
                            if (a2.length > 0) {
                                file = a2[0];
                            }
                        }
                        if (file != null) {
                            String[] strArr = {attributeValue2};
                            for (int i2 = 0; i2 < 1; i2++) {
                                String str2 = strArr[i2];
                                if (str2 != null) {
                                    file = new File(file, str2);
                                }
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    jn5.b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException(a81.m("Couldn't find meta-data for provider with authority ", str));
        }
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            synchronized (this.a) {
                this.b = str;
            }
            HashMap hashMap = x;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public final jn5 b() {
        jn5 jn5;
        synchronized (this.a) {
            try {
                if (this.b != null) {
                    if (this.c == null) {
                        this.c = c(this.o, getContext(), this.b);
                    }
                    jn5 = this.c;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jn5;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r1 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r1.getName().substring(r2 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getType(android.net.Uri r2) {
        /*
            r1 = this;
            jn5 r1 = r1.b()
            java.io.File r1 = r1.b(r2)
            java.lang.String r2 = r1.getName()
            r0 = 46
            int r2 = r2.lastIndexOf(r0)
            if (r2 < 0) goto L_0x0029
            java.lang.String r1 = r1.getName()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r2.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.String r1 = "application/octet-stream"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final boolean onCreate() {
        return true;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File b2 = b().b(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException(a81.m("Invalid mode: ", str));
        }
        return ParcelFileDescriptor.open(b2, i);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File b2 = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = v;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? b2.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b2.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

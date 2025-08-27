package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import org.apache.http.HttpHost;

/* renamed from: mzf  reason: default package */
public abstract class mzf {
    public static final Uri a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static String a(ContentResolver contentResolver, Uri uri) {
        String[] strArr;
        String str;
        Uri uri2;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String str2 = null;
        if ("content".equals(b(uri))) {
            boolean z = type != null && type.startsWith("video/");
            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                documentId.getClass();
                Uri uri3 = z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                uri3.getClass();
                str = "_id=?";
                uri2 = uri3;
                strArr = new String[]{documentId.split(":")[1]};
            } else {
                uri2 = uri;
                str = null;
                strArr = null;
            }
            Cursor query = contentResolver.query(uri2, new String[]{"_data"}, str, strArr, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && (columnIndexOrThrow = query.getColumnIndexOrThrow("_data")) != -1) {
                        str2 = query.getString(columnIndexOrThrow);
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            if (query == null) {
                return str2;
            }
            query.close();
            return str2;
        } else if ("file".equals(b(uri))) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    public static String b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri c(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static boolean d(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean e(Uri uri) {
        String b = b(uri);
        return "https".equals(b) || HttpHost.DEFAULT_SCHEME_NAME.equals(b);
    }
}

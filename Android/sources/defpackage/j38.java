package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.io.ConstantsKt;

/* renamed from: j38  reason: default package */
public final class j38 extends s38 implements bjf {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, ConstantsKt.MINIMUM_BLOCK_SIZE, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public j38(Executor executor, p7d p7d, ContentResolver contentResolver) {
        super(executor, p7d);
        this.c = contentResolver;
    }

    public final boolean b(v3d v3d) {
        Rect rect = f;
        return o54.A(rect.width(), rect.height(), v3d);
    }

    public final j55 d(qa7 qa7) {
        v3d v3d;
        Cursor query;
        j55 f2;
        int i;
        Uri uri = qa7.b;
        if (!mzf.d(uri) || (v3d = qa7.i) == null || (query = this.c.query(uri, d, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (f2 = f(v3d, query.getLong(query.getColumnIndex("_id")))) == null) {
                query.close();
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string = query.getString(columnIndex);
                if (string != null) {
                    i = ev0.o(new ExifInterface(string).getAttributeInt("Orientation", 1));
                    f2.o = i;
                }
                i = 0;
                f2.o = i;
            }
            query.close();
            return f2;
        } catch (IOException e2) {
            if (bg5.a.a(6)) {
                Log.getStackTraceString(e2);
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final j55 f(v3d v3d, long j) {
        int i;
        Cursor queryMiniThumbnail;
        int columnIndex;
        Rect rect = g;
        if (o54.A(rect.width(), rect.height(), v3d)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = o54.A(rect2.width(), rect2.height(), v3d) ? 1 : 0;
        }
        if (i == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst() && (columnIndex = queryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = queryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            queryMiniThumbnail.close();
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }
}

package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: xl5  reason: default package */
public final class xl5 extends dj0 {
    public RandomAccessFile v;
    public Uri w;
    public long x;
    public boolean y;

    public final long G(q74 q74) {
        Uri uri = q74.a;
        long j = q74.f;
        this.w = uri;
        c();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.v = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = q74.g;
                if (j2 == -1) {
                    j2 = this.v.length() - j;
                }
                this.x = j2;
                if (j2 >= 0) {
                    this.y = true;
                    d(q74);
                    return this.x;
                }
                throw new DataSourceException((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                String path2 = uri.getPath();
                String query = uri.getQuery();
                String fragment = uri.getFragment();
                StringBuilder r = rae.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
                r.append(fragment);
                throw new DataSourceException(r.toString(), e2, 1004);
            }
            if (v0g.a < 21 || !tl5.b(e2.getCause())) {
                i = 2005;
            }
            throw new DataSourceException((Throwable) e2, i);
        } catch (SecurityException e3) {
            throw new DataSourceException((Throwable) e3, 2006);
        } catch (RuntimeException e4) {
            throw new DataSourceException((Throwable) e4, 2000);
        }
    }

    public final void close() {
        this.w = null;
        try {
            RandomAccessFile randomAccessFile = this.v;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.v = null;
            if (this.y) {
                this.y = false;
                b();
            }
        } catch (IOException e) {
            throw new DataSourceException((Throwable) e, 2000);
        } catch (Throwable th) {
            this.v = null;
            if (this.y) {
                this.y = false;
                b();
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.w;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.x;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.v;
            int i3 = v0g.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.x -= (long) read;
                a(read);
            }
            return read;
        } catch (IOException e) {
            throw new DataSourceException((Throwable) e, 2000);
        }
    }
}

package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import androidx.media3.datasource.DataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: fv3  reason: default package */
public final class fv3 extends dj0 {
    public boolean X;
    public final ContentResolver v;
    public Uri w;
    public AssetFileDescriptor x;
    public FileInputStream y;
    public long z;

    public fv3(Context context) {
        super(false);
        this.v = context.getContentResolver();
    }

    public final long G(q74 q74) {
        AssetFileDescriptor assetFileDescriptor;
        q74 q742 = q74;
        int i = 2000;
        try {
            Uri normalizeScheme = q742.a.normalizeScheme();
            this.w = normalizeScheme;
            c();
            boolean equals = "content".equals(normalizeScheme.getScheme());
            ContentResolver contentResolver = this.v;
            if (equals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.x = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.y = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                long j = q742.f;
                if (i2 == 0 || j <= length) {
                    long startOffset = assetFileDescriptor.getStartOffset();
                    long j2 = length;
                    long skip = fileInputStream.skip(startOffset + j) - startOffset;
                    if (skip == j) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.z = -1;
                            } else {
                                long position = size - channel.position();
                                this.z = position;
                                if (position < 0) {
                                    throw new DataSourceException((Throwable) null, 2008);
                                }
                            }
                        } else {
                            long j3 = j2 - skip;
                            this.z = j3;
                            if (j3 < 0) {
                                throw new DataSourceException((Throwable) null, 2008);
                            }
                        }
                        long j4 = q742.g;
                        int i3 = (j4 > -1 ? 1 : (j4 == -1 ? 0 : -1));
                        if (i3 != 0) {
                            long j5 = this.z;
                            this.z = j5 == -1 ? j4 : Math.min(j5, j4);
                        }
                        this.X = true;
                        d(q74);
                        return i3 != 0 ? j4 : this.z;
                    }
                    throw new DataSourceException((Throwable) null, 2008);
                }
                throw new DataSourceException((Throwable) null, 2008);
            }
            throw new DataSourceException((Throwable) new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new DataSourceException((Throwable) e2, i);
        }
    }

    public final void close() {
        this.w = null;
        try {
            FileInputStream fileInputStream = this.y;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.y = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.x;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            } catch (Throwable th) {
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, 2000);
        } catch (Throwable th2) {
            this.y = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.x;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
                throw th2;
            } catch (IOException e3) {
                throw new DataSourceException((Throwable) e3, 2000);
            } catch (Throwable th3) {
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
                throw th3;
            }
        }
    }

    public final Uri getUri() {
        return this.w;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.z;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            }
        }
        FileInputStream fileInputStream = this.y;
        int i3 = v0g.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.z;
        if (j2 != -1) {
            this.z = j2 - ((long) read);
        }
        a(read);
        return read;
    }
}

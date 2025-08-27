package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* renamed from: vs8  reason: default package */
public final class vs8 implements Parcelable {
    public static final Parcelable.Creator<vs8> CREATOR = new f27(24);
    public static final ts c;
    public static final String[] o = {MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_WRITER, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_COMPOSER};
    public final Bundle a;
    public MediaMetadata b;

    /* JADX WARNING: type inference failed for: r0v0, types: [qae, ts] */
    static {
        ? qae = new qae();
        c = qae;
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_TITLE, 1, MediaMetadataCompat.METADATA_KEY_ARTIST);
        wj6.q(0, qae, MediaMetadataCompat.METADATA_KEY_DURATION, 1, MediaMetadataCompat.METADATA_KEY_ALBUM);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_AUTHOR, 1, MediaMetadataCompat.METADATA_KEY_WRITER);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_COMPOSER, 1, MediaMetadataCompat.METADATA_KEY_COMPILATION);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_DATE, 0, MediaMetadataCompat.METADATA_KEY_YEAR);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_GENRE, 0, MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER);
        wj6.q(0, qae, MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0, MediaMetadataCompat.METADATA_KEY_DISC_NUMBER);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 2, MediaMetadataCompat.METADATA_KEY_ART);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_ART_URI, 2, MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 3, MediaMetadataCompat.METADATA_KEY_USER_RATING);
        wj6.q(3, qae, MediaMetadataCompat.METADATA_KEY_RATING, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        wj6.q(2, qae, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 1, MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 0, MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        wj6.q(1, qae, MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 0, MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT);
        qae.put(MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
    }

    public vs8(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        px8.a(bundle2);
    }

    public final long a(String str) {
        return this.a.getLong(str, 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public vs8(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(px8.class.getClassLoader());
        readBundle.getClass();
        this.a = readBundle;
    }
}

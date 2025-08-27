package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator<MediaDescriptionCompat>() {
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    };
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    public static class Api21Impl {
        private Api21Impl() {
        }

        public static MediaDescription build(MediaDescription.Builder builder) {
            return builder.build();
        }

        public static MediaDescription.Builder createBuilder() {
            return new MediaDescription.Builder();
        }

        public static CharSequence getDescription(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        public static Bundle getExtras(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        public static Bitmap getIconBitmap(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        public static Uri getIconUri(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        public static String getMediaId(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        public static CharSequence getSubtitle(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        public static CharSequence getTitle(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        public static void setDescription(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void setExtras(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void setIconBitmap(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        public static void setIconUri(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        public static void setMediaId(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        public static void setSubtitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void setTitle(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Uri getMediaUri(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        public static void setMediaUri(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class Builder {
        private CharSequence mDescription;
        private Bundle mExtras;
        private Bitmap mIcon;
        private Uri mIconUri;
        private String mMediaId;
        private Uri mMediaUri;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.mMediaId, this.mTitle, this.mSubtitle, this.mDescription, this.mIcon, this.mIconUri, this.mExtras, this.mMediaUri);
        }

        public Builder setDescription(CharSequence charSequence) {
            this.mDescription = charSequence;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setIconBitmap(Bitmap bitmap) {
            this.mIcon = bitmap;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.mIconUri = uri;
            return this;
        }

        public Builder setMediaId(String str) {
            this.mMediaId = str;
            return this;
        }

        public Builder setMediaUri(Uri uri) {
            this.mMediaUri = uri;
            return this;
        }

        public Builder setSubtitle(CharSequence charSequence) {
            this.mSubtitle = charSequence;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0079
            android.support.v4.media.MediaDescriptionCompat$Builder r1 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r1.<init>()
            android.media.MediaDescription r8 = (android.media.MediaDescription) r8
            java.lang.String r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getMediaId(r8)
            r1.setMediaId(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getTitle(r8)
            r1.setTitle(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getSubtitle(r8)
            r1.setSubtitle(r2)
            java.lang.CharSequence r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getDescription(r8)
            r1.setDescription(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconBitmap(r8)
            r1.setIconBitmap(r2)
            android.net.Uri r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconUri(r8)
            r1.setIconUri(r2)
            android.os.Bundle r2 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getExtras(r8)
            if (r2 == 0) goto L_0x003e
            android.os.Bundle r2 = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(r2)
        L_0x003e:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0049
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x004a
        L_0x0049:
            r4 = r0
        L_0x004a:
            if (r4 == 0) goto L_0x0062
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005c
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0062:
            r0 = r2
        L_0x0063:
            r1.setExtras(r0)
            if (r4 == 0) goto L_0x006c
            r1.setMediaUri(r4)
            goto L_0x0073
        L_0x006c:
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.Api23Impl.getMediaUri(r8)
            r1.setMediaUri(r0)
        L_0x0073:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.build()
            r0.mDescriptionFwk = r8
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.fromMediaDescription(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.mDescription;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Bitmap getIconBitmap() {
        return this.mIcon;
    }

    public Uri getIconUri() {
        return this.mIconUri;
    }

    public Object getMediaDescription() {
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder createBuilder = Api21Impl.createBuilder();
        Api21Impl.setMediaId(createBuilder, this.mMediaId);
        Api21Impl.setTitle(createBuilder, this.mTitle);
        Api21Impl.setSubtitle(createBuilder, this.mSubtitle);
        Api21Impl.setDescription(createBuilder, this.mDescription);
        Api21Impl.setIconBitmap(createBuilder, this.mIcon);
        Api21Impl.setIconUri(createBuilder, this.mIconUri);
        Api21Impl.setExtras(createBuilder, this.mExtras);
        Api23Impl.setMediaUri(createBuilder, this.mMediaUri);
        MediaDescription build = Api21Impl.build(createBuilder);
        this.mDescriptionFwk = build;
        return build;
    }

    public String getMediaId() {
        return this.mMediaId;
    }

    public Uri getMediaUri() {
        return this.mMediaUri;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public String toString() {
        return this.mTitle + ", " + this.mSubtitle + ", " + this.mDescription;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) getMediaDescription()).writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.mMediaId = parcel.readString();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mTitle = (CharSequence) creator.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) creator.createFromParcel(parcel);
        this.mDescription = (CharSequence) creator.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.mIcon = (Bitmap) parcel.readParcelable(classLoader);
        this.mIconUri = (Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.mMediaUri = (Uri) parcel.readParcelable(classLoader);
    }
}

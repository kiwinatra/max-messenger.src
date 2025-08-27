package com.facebook.fresco.middleware;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015J'\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\t\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00062\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/fresco/middleware/HasExtraData;", "", "E", "", "key", "value", "", "putExtra", "(Ljava/lang/String;Ljava/lang/Object;)V", "getExtra", "(Ljava/lang/String;)Ljava/lang/Object;", "valueIfNotFound", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lcom/facebook/fresco/middleware/Extras;", "getExtras", "()Ljava/util/Map;", "extras", "putExtras", "(Ljava/util/Map;)V", "Companion", "uw6", "middleware_release"}, k = 1, mv = {2, 0, 0})
public interface HasExtraData {
    public static final uw6 Companion = uw6.a;
    public static final String KEY_BITMAP_CONFIG = "bitmap_config";
    public static final String KEY_COLOR_SPACE = "image_color_space";
    public static final String KEY_ENCODED_HEIGHT = "encoded_height";
    public static final String KEY_ENCODED_SIZE = "encoded_size";
    public static final String KEY_ENCODED_WIDTH = "encoded_width";
    public static final String KEY_ID = "id";
    public static final String KEY_IMAGE_FORMAT = "image_format";
    public static final String KEY_IMAGE_SOURCE_EXTRAS = "image_source_extras";
    public static final String KEY_IMAGE_SOURCE_TYPE = "image_source_type";
    public static final String KEY_IS_ROUNDED = "is_rounded";
    public static final String KEY_LAST_SCAN_NUMBER = "last_scan_num";
    public static final String KEY_MODIFIED_URL = "modified_url";
    public static final String KEY_MULTIPLEX_BITMAP_COUNT = "multiplex_bmp_cnt";
    public static final String KEY_MULTIPLEX_ENCODED_COUNT = "multiplex_enc_cnt";
    public static final String KEY_NON_FATAL_DECODE_ERROR = "non_fatal_decode_error";
    public static final String KEY_ORIGIN = "origin";
    public static final String KEY_ORIGINAL_URL = "original_url";
    public static final String KEY_ORIGIN_SUBCATEGORY = "origin_sub";
    public static final String KEY_URI_SOURCE = "uri_source";

    <E> E getExtra(String str);

    <E> E getExtra(String str, E e);

    Map<String, Object> getExtras();

    <E> void putExtra(String str, E e);

    void putExtras(Map<String, ? extends Object> map);
}

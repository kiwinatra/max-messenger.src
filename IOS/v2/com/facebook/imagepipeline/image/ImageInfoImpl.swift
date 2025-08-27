package com.facebook.imagepipeline.image;

import java.util.Map;

public class ImageInfoImpl implements k97 {
    private final Map<String, Object> extras;
    private final int height;
    private final tac qualityInfo;
    private final int sizeInBytes;
    private final int width;

    public ImageInfoImpl(int i, int i2, int i3, tac tac, Map<String, Object> map) {
        this.width = i;
        this.height = i2;
        this.sizeInBytes = i3;
        this.qualityInfo = tac;
        this.extras = map;
    }

    public Map<String, Object> getExtras() {
        return this.extras;
    }

    public int getHeight() {
        return this.height;
    }

    public tac getQualityInfo() {
        return this.qualityInfo;
    }

    public int getSizeInBytes() {
        return this.sizeInBytes;
    }

    public int getWidth() {
        return this.width;
    }
}

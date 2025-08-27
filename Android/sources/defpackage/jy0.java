package defpackage;

import android.content.res.XmlResourceParser;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: jy0  reason: default package */
public final class jy0 implements XmlResourceParser {
    public final XmlResourceParser a;

    public jy0(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final void close() {
        this.a.close();
    }

    public final void defineEntityReplacementText(String str, String str2) {
        this.a.defineEntityReplacementText(str, str2);
    }

    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return this.a.getAttributeBooleanValue(i, z);
    }

    public final int getAttributeCount() {
        return this.a.getAttributeCount();
    }

    public final float getAttributeFloatValue(int i, float f) {
        return this.a.getAttributeFloatValue(i, f);
    }

    public final int getAttributeIntValue(int i, int i2) {
        return this.a.getAttributeIntValue(i, i2);
    }

    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return this.a.getAttributeListValue(i, strArr, i2);
    }

    public final String getAttributeName(int i) {
        return this.a.getAttributeName(i);
    }

    public final int getAttributeNameResource(int i) {
        return this.a.getAttributeNameResource(i);
    }

    public final String getAttributeNamespace(int i) {
        return this.a.getAttributeNamespace(i);
    }

    public final String getAttributePrefix(int i) {
        return this.a.getAttributePrefix(i);
    }

    public final int getAttributeResourceValue(int i, int i2) {
        return this.a.getAttributeResourceValue(i, i2);
    }

    public final String getAttributeType(int i) {
        return this.a.getAttributeType(i);
    }

    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return this.a.getAttributeUnsignedIntValue(i, i2);
    }

    public final String getAttributeValue(int i) {
        return this.a.getAttributeValue(i);
    }

    public final String getClassAttribute() {
        return this.a.getClassAttribute();
    }

    public final int getColumnNumber() {
        return this.a.getColumnNumber();
    }

    public final int getDepth() {
        return this.a.getDepth();
    }

    public final int getEventType() {
        return this.a.getEventType();
    }

    public final boolean getFeature(String str) {
        return this.a.getFeature(str);
    }

    public final String getIdAttribute() {
        return this.a.getIdAttribute();
    }

    public final int getIdAttributeResourceValue(int i) {
        return this.a.getIdAttributeResourceValue(i);
    }

    public final String getInputEncoding() {
        return this.a.getInputEncoding();
    }

    public final int getLineNumber() {
        return this.a.getLineNumber();
    }

    public final String getName() {
        return this.a.getName();
    }

    public final String getNamespace() {
        return this.a.getNamespace();
    }

    public final int getNamespaceCount(int i) {
        return this.a.getNamespaceCount(i);
    }

    public final String getNamespacePrefix(int i) {
        return this.a.getNamespacePrefix(i);
    }

    public final String getNamespaceUri(int i) {
        return this.a.getNamespaceUri(i);
    }

    public final String getPositionDescription() {
        return this.a.getPositionDescription();
    }

    public final String getPrefix() {
        return this.a.getPrefix();
    }

    public final Object getProperty(String str) {
        return this.a.getProperty(str);
    }

    public final int getStyleAttribute() {
        return this.a.getStyleAttribute();
    }

    public final String getText() {
        return this.a.getText();
    }

    public final char[] getTextCharacters(int[] iArr) {
        return this.a.getTextCharacters(iArr);
    }

    public final boolean isAttributeDefault(int i) {
        return this.a.isAttributeDefault(i);
    }

    public final boolean isEmptyElementTag() {
        return this.a.isEmptyElementTag();
    }

    public final boolean isWhitespace() {
        return this.a.isWhitespace();
    }

    public final int next() {
        return this.a.next();
    }

    public final int nextTag() {
        return this.a.nextTag();
    }

    public final String nextText() {
        return this.a.nextText();
    }

    public final int nextToken() {
        return this.a.nextToken();
    }

    public final void require(int i, String str, String str2) {
        this.a.require(i, str, str2);
    }

    public final void setFeature(String str, boolean z) {
        this.a.setFeature(str, z);
    }

    public final void setInput(InputStream inputStream, String str) {
        this.a.setInput(inputStream, str);
    }

    public final void setProperty(String str, Object obj) {
        this.a.setProperty(str, obj);
    }

    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        return this.a.getAttributeBooleanValue(str, str2, z);
    }

    public final float getAttributeFloatValue(String str, String str2, float f) {
        return this.a.getAttributeFloatValue(str, str2, f);
    }

    public final int getAttributeIntValue(String str, String str2, int i) {
        return this.a.getAttributeIntValue(str, str2, i);
    }

    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return this.a.getAttributeListValue(str, str2, strArr, i);
    }

    public final int getAttributeResourceValue(String str, String str2, int i) {
        return this.a.getAttributeResourceValue(str, str2, i);
    }

    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        return this.a.getAttributeUnsignedIntValue(str, str2, i);
    }

    public final String getAttributeValue(String str, String str2) {
        return this.a.getAttributeValue(str, str2);
    }

    public final String getNamespace(String str) {
        return this.a.getNamespace(str);
    }

    public final void setInput(Reader reader) {
        this.a.setInput(reader);
    }
}

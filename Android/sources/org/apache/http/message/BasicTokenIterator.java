package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;

@Deprecated
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos;

    public BasicTokenIterator(HeaderIterator headerIterator) {
        if (headerIterator != null) {
            this.headerIt = headerIterator;
            this.searchPos = findNext(-1);
            return;
        }
        throw new IllegalArgumentException("Header iterator must not be null.");
    }

    public String createToken(String str, int i, int i2) {
        return str.substring(i, i2);
    }

    public int findNext(int i) throws ParseException {
        int i2;
        if (i >= 0) {
            i2 = findTokenSeparator(i);
        } else if (!this.headerIt.hasNext()) {
            return -1;
        } else {
            this.currentHeader = this.headerIt.nextHeader().getValue();
            i2 = 0;
        }
        int findTokenStart = findTokenStart(i2);
        if (findTokenStart < 0) {
            this.currentToken = null;
            return -1;
        }
        int findTokenEnd = findTokenEnd(findTokenStart);
        this.currentToken = createToken(this.currentHeader, findTokenStart, findTokenEnd);
        return findTokenEnd;
    }

    public int findTokenEnd(int i) {
        if (i >= 0) {
            int length = this.currentHeader.length();
            do {
                i++;
                if (i >= length || !isTokenChar(this.currentHeader.charAt(i))) {
                    return i;
                }
                i++;
                break;
            } while (!isTokenChar(this.currentHeader.charAt(i)));
            return i;
        }
        throw new IllegalArgumentException(wj6.h(i, "Token start position must not be negative: "));
    }

    public int findTokenSeparator(int i) {
        if (i >= 0) {
            int length = this.currentHeader.length();
            boolean z = false;
            while (!z && i < length) {
                char charAt = this.currentHeader.charAt(i);
                if (isTokenSeparator(charAt)) {
                    z = true;
                } else if (isWhitespace(charAt)) {
                    i++;
                } else if (isTokenChar(charAt)) {
                    StringBuilder o = wj6.o(i, "Tokens without separator (pos ", "): ");
                    o.append(this.currentHeader);
                    throw new ParseException(o.toString());
                } else {
                    StringBuilder o2 = wj6.o(i, "Invalid character after token (pos ", "): ");
                    o2.append(this.currentHeader);
                    throw new ParseException(o2.toString());
                }
            }
            return i;
        }
        throw new IllegalArgumentException(wj6.h(i, "Search position must not be negative: "));
    }

    public int findTokenStart(int i) {
        if (i >= 0) {
            boolean z = false;
            while (!z) {
                String str = this.currentHeader;
                if (str == null) {
                    break;
                }
                int length = str.length();
                while (!z && i < length) {
                    char charAt = this.currentHeader.charAt(i);
                    if (isTokenSeparator(charAt) || isWhitespace(charAt)) {
                        i++;
                    } else if (isTokenChar(this.currentHeader.charAt(i))) {
                        z = true;
                    } else {
                        StringBuilder o = wj6.o(i, "Invalid character before token (pos ", "): ");
                        o.append(this.currentHeader);
                        throw new ParseException(o.toString());
                    }
                }
                if (!z) {
                    if (this.headerIt.hasNext()) {
                        this.currentHeader = this.headerIt.nextHeader().getValue();
                        i = 0;
                    } else {
                        this.currentHeader = null;
                    }
                }
            }
            if (z) {
                return i;
            }
            return -1;
        }
        throw new IllegalArgumentException(wj6.h(i, "Search position must not be negative: "));
    }

    public boolean hasNext() {
        return this.currentToken != null;
    }

    public boolean isHttpSeparator(char c) {
        return HTTP_SEPARATORS.indexOf(c) >= 0;
    }

    public boolean isTokenChar(char c) {
        if (Character.isLetterOrDigit(c)) {
            return true;
        }
        return !Character.isISOControl(c) && !isHttpSeparator(c);
    }

    public boolean isTokenSeparator(char c) {
        return c == ',';
    }

    public boolean isWhitespace(char c) {
        return c == 9 || Character.isSpaceChar(c);
    }

    public final Object next() throws NoSuchElementException, ParseException {
        return nextToken();
    }

    public String nextToken() throws NoSuchElementException, ParseException {
        String str = this.currentToken;
        if (str != null) {
            this.searchPos = findNext(this.searchPos);
            return str;
        }
        throw new NoSuchElementException("Iteration already finished.");
    }

    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}

package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

public enum TextWrapMethod implements EnumGetStr {
    /**
     * 어울림
     */
    SQUARE("SQUARE"),
    TIGHT("TIGHT"),
    THROUGH("THROUGH"),
    /**
     * 자리차지
     */
    TOP_AND_BOTTOM("TOP_AND_BOTTOM"),
    /**
     * 글 뒤로
     */
    BEHIND_TEXT("BEHIND_TEXT"),
    /**
     * 글 앞으로
     */
    IN_FRONT_OF_TEXT("IN_FRONT_OF_TEXT");

    private String str;

    TextWrapMethod(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static TextWrapMethod fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (TextWrapMethod item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}

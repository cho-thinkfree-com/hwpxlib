package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

/**
 * 본문 위치
 */
public enum TextFlowSide implements EnumGetStr {
    /**
     * 양쪽
     */
    BOTH_SIDES("BOTH_SIDES"),
    /**
     * 왼쪽
     */
    LEFT_ONLY("LEFT_ONLY"),
    /**
     * 오른쪽
     */
    RIGHT_ONLY("RIGHT_ONLY"),
    /**
     * 큰쪽
     */
    LARGEST_ONLY("LARGEST_ONLY");

    private String str;

    TextFlowSide(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static TextFlowSide fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (TextFlowSide item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}

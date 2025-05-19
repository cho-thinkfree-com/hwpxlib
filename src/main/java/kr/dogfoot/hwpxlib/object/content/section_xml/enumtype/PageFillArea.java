package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

/**
 * 쪽 채움 영역
 */
public enum PageFillArea implements EnumGetStr {
    /**
     * 종이
     */
    PAPER("PAPER"),
    /**
     * 쪽
     */
    PAGE("PAGE"),
    /**
     * 테두리
     */
    BORDER("BORDER");

    private String str;

    PageFillArea(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static PageFillArea fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (PageFillArea item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}

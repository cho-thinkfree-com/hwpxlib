package kr.dogfoot.hwpxlib.object.content.section_xml.enumtype;

import kr.dogfoot.hwpxlib.object.common.EnumGetStr;

/**
 * 각주 번호매김 방식
 */
public enum FootNoteNumberingType implements EnumGetStr {
    /**
     * 이어서
     */
    CONTINUOUS("CONTINUOUS"),
    /**
     * 구역마다 새번호로
     */
    ON_SECTION("ON_SECTION"),
    /**
     * 페이지마다 새로 시작
     */
    ON_PAGE("ON_PAGE");

    private String str;

    FootNoteNumberingType(String str) {
        this.str = str;
    }

    @Override
    public String str() {
        return str;
    }

    public static FootNoteNumberingType fromString(String str) {
        if (str == null) return null;

        String STR = str.toUpperCase();
        for (FootNoteNumberingType item : values()) {
            if (item.str.equals(STR)) {
                return item;
            }
        }
        return null;
    }
}

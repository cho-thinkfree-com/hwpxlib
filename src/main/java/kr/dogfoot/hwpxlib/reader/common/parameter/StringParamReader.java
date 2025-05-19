package kr.dogfoot.hwpxlib.reader.common.parameter;

import kr.dogfoot.hwpxlib.commonstrings.AttributeNames;
import kr.dogfoot.hwpxlib.object.common.SwitchableObject;
import kr.dogfoot.hwpxlib.object.common.parameter.StringParam;
import kr.dogfoot.hwpxlib.reader.common.ElementReader;
import kr.dogfoot.hwpxlib.reader.common.ElementReaderSort;

public class StringParamReader extends ElementReader {
    private StringParam stringParam;

    @Override
    public ElementReaderSort sort() {
        return ElementReaderSort.StringParam;
    }

    public void stringParam(StringParam stringParam) {
        this.stringParam = stringParam;
    }

    @Override
    protected void setAttribute(String name, String value) {
        switch (name) {
            case AttributeNames.name:
                stringParam.name(value);
                break;
            case AttributeNames.space:
            case AttributeNames.xml_space:
                stringParam.xml_space(value);
                break;
        }
    }

    @Override
    public void text(String text) {
        stringParam.value(text);
    }

    @Override
    public SwitchableObject switchableObject() {
        return null;
    }
}

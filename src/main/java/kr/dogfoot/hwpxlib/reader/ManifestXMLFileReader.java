package kr.dogfoot.hwpxlib.reader;

import kr.dogfoot.hwpxlib.commonstrings.ZipEntryName;
import kr.dogfoot.hwpxlib.object.metainf.ManifestXMLFile;
import kr.dogfoot.hwpxlib.reader.common.ElementReaderManager;
import kr.dogfoot.hwpxlib.reader.common.ElementReaderSort;
import kr.dogfoot.hwpxlib.reader.common.XMLFileReader;
import kr.dogfoot.hwpxlib.reader.manifest_xml.ManifestReader;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.zip.ZipFile;

public class ManifestXMLFileReader extends XMLFileReader {
    public ManifestXMLFileReader(ElementReaderManager entryReaderManager) {
        super(entryReaderManager);
    }

    public void read(ManifestXMLFile manifestXMLFile, ZipFile zipFile, boolean xmlNamespaceAware) throws ParserConfigurationException, IOException, SAXException {
        ((ManifestReader) setCurrentElementReader(ElementReaderSort.Manifest))
                .manifestXMLFile(manifestXMLFile);

        read(zipFile, ZipEntryName.Manifest, xmlNamespaceAware);
    }
}
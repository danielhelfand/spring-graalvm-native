package javax.xml.parsers;

import com.oracle.svm.core.annotate.Delete;
import com.oracle.svm.core.annotate.TargetClass;

import org.springframework.graalvm.substitutions.OnlyIfPresent;
import org.springframework.graalvm.substitutions.RemoveXmlSupport;

@TargetClass(className = "javax.xml.parsers.SAXParserFactory", onlyWith = { OnlyIfPresent.class, RemoveXmlSupport.class })
@Delete
final class Target_SAXParserFactory {
}

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;
import static javax.lang.model.SourceVersion.RELEASE_6;


@SupportedAnnotationTypes("CompileTime")
@SupportedSourceVersion(RELEASE_6)
public class CompileTimeProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for (TypeElement t : annotations) {
            Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(t);
            for (Element e : elements) {
                if (e.getSimpleName().toString().contains("Message")){
                    processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, e.toString() + " has Message as method name.");
                }
            }
        }
        return false;
    }
}

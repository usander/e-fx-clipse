package at.bestsolution.efxclipse.tooling.pde.e4.project.media.tpl;

import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Variable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ApplicationXmiTpl implements Generator<DynamicFile> {
  public InputStream generate(final DynamicFile file, final Map<String,Object> data) {
    EList<Variable> _variables = file.getVariables();
    final Function1<Variable,Boolean> _function = new Function1<Variable,Boolean>() {
        public Boolean apply(final Variable e) {
          String _key = e.getKey();
          boolean _equals = _key.equals("rootPackage");
          return Boolean.valueOf(_equals);
        }
      };
    Variable _findFirst = IterableExtensions.<Variable>findFirst(_variables, _function);
    final String rootPackage = _findFirst.getDefaultValue();
    final String bindingContextId = EcoreUtil.generateUUID();
    final String openCommandId = EcoreUtil.generateUUID();
    final String refreshCommandId = EcoreUtil.generateUUID();
    CharSequence _generate = this.generate(rootPackage, bindingContextId, openCommandId, refreshCommandId);
    String _string = _generate.toString();
    byte[] _bytes = _string.getBytes();
    ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
    return _byteArrayInputStream;
  }
  
  public CharSequence generate(final String rootPackage, final String bindingContextId, final String openCommandId, final String refreshCommandId) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<application:Application xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:application=\"http://www.eclipse.org/ui/2010/UIModel/application\" xmlns:basic=\"http://www.eclipse.org/ui/2010/UIModel/application/ui/basic\" xmlns:menu=\"http://www.eclipse.org/ui/2010/UIModel/application/ui/menu\" xmi:id=\"");
    String _generateUUID = EcoreUtil.generateUUID();
    _builder.append(_generateUUID, "");
    _builder.append("\" elementId=\"org.efxclipse.e4.application\" bindingContexts=\"");
    _builder.append(bindingContextId, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<children xsi:type=\"basic:TrimmedWindow\" xmi:id=\"");
    String _generateUUID_1 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_1, "  ");
    _builder.append("\" elementId=\"org.efxclipse.e4.mainWindow\" label=\"Media Application\" x=\"30\" y=\"30\" width=\"1024\" height=\"768\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<persistedState key=\"fx.stage.decoration\" value=\"platform:/plugin/");
    _builder.append(rootPackage, "    ");
    _builder.append("/");
    String _replace = rootPackage.replace(".", "/");
    _builder.append(_replace, "    ");
    _builder.append("/decoration/TopArea.fxml\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<children xsi:type=\"basic:PartSashContainer\" xmi:id=\"");
    String _generateUUID_2 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_2, "    ");
    _builder.append("\" horizontal=\"true\">");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("<children xsi:type=\"basic:Part\" xmi:id=\"");
    String _generateUUID_3 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_3, "      ");
    _builder.append("\" containerData=\"0.3\" contributionURI=\"bundleclass://");
    _builder.append(rootPackage, "      ");
    _builder.append("/");
    _builder.append(rootPackage, "      ");
    _builder.append(".parts.MediaListPart\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("<children xsi:type=\"basic:PartStack\" xmi:id=\"");
    String _generateUUID_4 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_4, "      ");
    _builder.append("\" elementId=\"content.stack\" containerData=\"0.7\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<trimBars xmi:id=\"");
    String _generateUUID_5 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_5, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("<children xsi:type=\"menu:ToolBar\" xmi:id=\"");
    String _generateUUID_6 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_6, "      ");
    _builder.append("\" elementId=\"org.efxclipse.e4.maintoolbar\">");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<children xsi:type=\"menu:HandledToolItem\" xmi:id=\"");
    String _generateUUID_7 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_7, "        ");
    _builder.append("\" elementId=\"org.efxclipse.e4.toolitem.open\" iconURI=\"platform:/plugin/");
    _builder.append(rootPackage, "        ");
    _builder.append("/icons/edit-image-face-show.png\" command=\"");
    _builder.append(openCommandId, "        ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("<children xsi:type=\"menu:HandledToolItem\" xmi:id=\"");
    String _generateUUID_8 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_8, "        ");
    _builder.append("\" elementId=\"org.efxclipse.e4.toolitem.save\" iconURI=\"platform:/plugin/");
    _builder.append(rootPackage, "        ");
    _builder.append("/icons/system-reboot.png\" command=\"");
    _builder.append(refreshCommandId, "        ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("      ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</trimBars>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<handlers xmi:id=\"");
    String _generateUUID_9 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_9, "  ");
    _builder.append("\" contributionURI=\"bundleclass://");
    _builder.append(rootPackage, "  ");
    _builder.append("/");
    _builder.append(rootPackage, "  ");
    _builder.append(".handlers.OpenHandler\" command=\"");
    _builder.append(openCommandId, "  ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<handlers xmi:id=\"");
    String _generateUUID_10 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_10, "  ");
    _builder.append("\" contributionURI=\"bundleclass://");
    _builder.append(rootPackage, "  ");
    _builder.append("/");
    _builder.append(rootPackage, "  ");
    _builder.append(".handlers.RefreshHandler\" command=\"");
    _builder.append(refreshCommandId, "  ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<bindingTables xmi:id=\"");
    String _generateUUID_11 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_11, "  ");
    _builder.append("\" bindingContext=\"");
    _builder.append(bindingContextId, "  ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<bindings xmi:id=\"");
    String _generateUUID_12 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_12, "    ");
    _builder.append("\" keySequence=\"M1+O\" command=\"");
    _builder.append(openCommandId, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<bindings xmi:id=\"");
    String _generateUUID_13 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_13, "    ");
    _builder.append("\" keySequence=\"M1+R\" command=\"");
    _builder.append(refreshCommandId, "    ");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</bindingTables>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<rootContext xmi:id=\"");
    _builder.append(bindingContextId, "  ");
    _builder.append("\" elementId=\"org.eclipse.ui.contexts.dialogAndWindow\" name=\"In Dialog and Windows\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<children xmi:id=\"");
    String _generateUUID_14 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_14, "    ");
    _builder.append("\" elementId=\"org.eclipse.ui.contexts.window\" name=\"In Windows\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<children xmi:id=\"");
    String _generateUUID_15 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_15, "    ");
    _builder.append("\" elementId=\"org.eclipse.ui.contexts.dialog\" name=\"In Dialogs\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("</rootContext>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<commands xmi:id=\"");
    _builder.append(openCommandId, "  ");
    _builder.append("\" elementId=\"media.open\" commandName=\"openMedia\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<commands xmi:id=\"");
    _builder.append(refreshCommandId, "  ");
    _builder.append("\" elementId=\"media.refresh\" commandName=\"refreshMedia\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<addons xmi:id=\"");
    String _generateUUID_16 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_16, "  ");
    _builder.append("\" elementId=\"org.eclipse.e4.core.commands.service\" contributionURI=\"bundleclass://org.eclipse.e4.core.commands/org.eclipse.e4.core.commands.CommandServiceAddon\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<addons xmi:id=\"");
    String _generateUUID_17 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_17, "  ");
    _builder.append("\" elementId=\"org.eclipse.e4.ui.contexts.service\" contributionURI=\"bundleclass://org.eclipse.e4.ui.services/org.eclipse.e4.ui.services.ContextServiceAddon\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<addons xmi:id=\"");
    String _generateUUID_18 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_18, "  ");
    _builder.append("\" elementId=\"at.bestsolution.efxclipse.runtime.bindings.e4.service\" contributionURI=\"bundleclass://at.bestsolution.efxclipse.runtime.bindings.e4/at.bestsolution.efxclipse.runtime.bindings.e4.BindingServiceAddon\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<addons xmi:id=\"");
    String _generateUUID_19 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_19, "  ");
    _builder.append("\" elementId=\"org.eclipse.e4.ui.workbench.commands.model\" contributionURI=\"bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.CommandProcessingAddon\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<addons xmi:id=\"");
    String _generateUUID_20 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_20, "  ");
    _builder.append("\" elementId=\"org.eclipse.e4.ui.workbench.contexts.model\" contributionURI=\"bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.ContextProcessingAddon\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<addons xmi:id=\"");
    String _generateUUID_21 = EcoreUtil.generateUUID();
    _builder.append(_generateUUID_21, "  ");
    _builder.append("\" elementId=\"at.bestsolution.efxclipse.runtime.bindings.e4.model\" contributionURI=\"bundleclass://at.bestsolution.efxclipse.runtime.bindings.e4/at.bestsolution.efxclipse.runtime.bindings.e4.BindingProcessingAddon\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("</application:Application>");
    _builder.newLine();
    return _builder;
  }
}

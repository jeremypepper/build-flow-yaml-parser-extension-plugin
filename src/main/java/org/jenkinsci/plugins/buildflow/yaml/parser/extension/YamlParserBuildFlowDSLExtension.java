package org.jenkinsci.plugins.buildflow.yaml.parser.extension;

import com.cloudbees.plugins.flow.BuildFlowDSLExtension;
import com.cloudbees.plugins.flow.FlowDelegate;
import hudson.Extension;
import org.jenkinsci.plugins.buildflow.yaml.parser.extension.YamlParserBuildFlowDSL;

/**
 * Created by jniesen on 4/4/14.
 */

@Extension
public class YamlParserBuildFlowDSLExtension extends BuildFlowDSLExtension {

    public static final String EXTENSION_NAME = "build-flow-yaml-parser-extension";

    @Override
    public Object createExtension(String extensionName, FlowDelegate flowDelegate) {
        if(EXTENSION_NAME.equals(extensionName)) {
            return new YamlParserBuildFlowDSL(flowDelegate);
        }

        return null;
    }
}

package org.jenkinsci.plugins.buildflow.yaml.parser.extension

import org.yaml.snakeyaml.Yaml
import com.cloudbees.plugins.flow.FlowDelegate

class YamlParserBuildFlowDSL {
  def FlowDelegate flowDelegate;
  def Yaml yamlParser = new Yaml();

  def YamlParserBuildFlowDSL(FlowDelegate flowDelegate) {
    this.flowDelegate = flowDelegate;
  }

  def Object parseYamlText(String yamlString) {
    return this.yamlParser.load(yamlString);
  }
}

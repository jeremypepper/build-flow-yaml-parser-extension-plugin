# Build Flow YAML Parser Extension

This plugin provides DSL extensions to the BuildFlow plugin to allow parsing YAML objects.

Usage in a Build Flow DSL:

```groovy
def parser = extension."build-flow-yaml-parser-extension"
def document = parser.parseText("n- Hesperiidae\n- Papilionidae\n- Apatelodidae\n- Epiplemidae")
out.println(document) 
```

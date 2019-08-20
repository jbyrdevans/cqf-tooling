package org.opencds.cqf.modelinfo;

import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class ClassInfoSettings {
    public boolean useCQLPrimitives = false;
    public boolean createExtensionElements = false;
    public boolean createReferenceElements = false;

    public Set<String> codeableTypes = new HashSet<String>();
    public Map<String, String> primitiveTypeMappings = new HashMap<String, String>();
    public Map<String, String> cqlTypeMappings = new HashMap<String, String>();
    public Map<String, String> primaryCodePath = new HashMap<String, String>();

    public Map<String, String> urlToModel =  new HashMap<String, String>() {
        { 
            put("urn:hl7-org:elm-types:r1", "System");
            put("http://hl7.org/fhir", "FHIR");
            put("http://hl7.org/fhir/us/core", "USCore");
            put("http://hl7.org/fhir/us/qicore", "QICore");
        }
    };
}
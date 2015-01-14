package org.blueprint.model;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 模型元素的基类
 * 
 * @author jblueprint@163.com
 *
 */
public class ModelItem implements Serializable {

    private static final long serialVersionUID = 3199860165141951157L;

    @JSONField(ordinal = 100)
    private Map<String, Object> attributes;

    @JSONField(ordinal = 2)
    private String displayName;

    @JSONField(ordinal = 1)
    private String name;

    public ModelItem() {
    }

    public ModelItem(String name, String displayName) {
        this(name, displayName, null);
    }

    public ModelItem(String name, String displayName,
            Map<String, Object> attributes) {
        this.name = name;
        this.displayName = displayName;
        this.attributes = attributes;
    }

    public void cleanAttributes() {
        if (attributes != null)
            this.attributes.clear();
    }

    public Object getAttribute(String name) {
        return attributes.get(name);
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public void setAttribute(String name, Object value) {
        if (attributes == null)
            attributes = new ConcurrentHashMap<String, Object>();

        attributes.put(name, value);
    }

    public void setAttributes(Map<String, Object> attributes) {
        if (attributes == null)
            this.attributes = attributes;
        else
            this.attributes.putAll(attributes);
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setName(String name) {
        this.name = name;
    }

}

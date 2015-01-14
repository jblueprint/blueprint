package org.blueprint.model;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 类型，包含基本类型、实体、值对象等
 * 
 * @author jblueprint@163.com
 *
 */
public class Type extends ModelItem {

    private static final long serialVersionUID = -740443512171901267L;

    public final static Type STRING = new Type("String", "字符串");
    public final static Type INT = new Type("Int", "整型");
    public final static Type LONG = new Type("Long", "长整型");
    public final static Type FLOAT = new Type("Float", "浮点型");
    public final static Type DOUBLE = new Type("Double", "双精度");

    @JSONField(ordinal = 10)
    private List<Property> properties;

    public Type() {
    }

    public Type(String name, String displayName) {
        super(name, displayName);
    }

    @JSONField(serialize = false, deserialize = false)
    public String getFullName() {
        return getName();
    }

    public void addProperty(Property property) {
        this.getProperties().add(property);
    }

    public List<Property> getProperties() {
        if (properties == null)
            properties = new ArrayList<Property>();
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

}

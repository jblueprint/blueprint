package org.blueprint.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 属性
 * 
 * @author jblueprint@163.com
 *
 */
public class Property extends ModelItem {

    private static final long serialVersionUID = 6213394971105627132L;

    private Type type;

    @JSONField(name = "type", ordinal = 10)
    private String typeName;

    @JSONField(serialize = false, deserialize = false)
    public Type getType() {
        if (type == null) {
            // FIXME
        }
        return type;
    }

    public String getTypeName() {
        return typeName;
    }

    @JSONField(serialize = false, deserialize = false)
    public void setType(Type type) {
        this.type = type;
        this.typeName = type.getFullName();
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}

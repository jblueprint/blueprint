package org.blueprint.model;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 实体模型
 * 
 * @author jblueprint@163.com
 *
 */
public class Entity extends Type {

    private static final long serialVersionUID = -392966354622467757L;

    @JSONField(serialize = false, deserialize = false)
    private String modelName;

    @JSONField(serialize = false, deserialize = false)
    public String getFullName() {
        if (StringUtils.isNotBlank(modelName)) {
            return modelName + ":" + getName();
        } else {
            return getName();
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

}
